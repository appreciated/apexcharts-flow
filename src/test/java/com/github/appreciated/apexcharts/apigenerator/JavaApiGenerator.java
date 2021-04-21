package com.github.appreciated.apexcharts.apigenerator;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * Some kind of a TypeScript to Java Transpiler
 */
public class JavaApiGenerator {
    private final ArrayList<API> apis = new ArrayList<>();

    private JavaApiGenerator() {
        // get file as string list
        List<String> file = new BufferedReader(new InputStreamReader(
                this.getClass().getClassLoader().getResourceAsStream("apexcharts.d.ts"),
                StandardCharsets.UTF_8)).lines().collect(Collectors.toList());

        for (int i = 0; i < file.size(); i++) {
            if (file.get(i).contains("\"radialBar\" | \"scatter\" | \"bubble\" | \"heatmap\" | \"candlestick\" | \"radar\";")) {
                file.set(i - 1, file.get(i - 1) + file.get(i));
                file.remove(i);
            }
        }

        // find all types and create a map of it
        file.stream().filter(s -> s.contains("type "))
                .map(s -> s.substring(5, s.length() - 4))
                .forEach(name -> apis.add(new API(name, "class")));

        apis.forEach(api1 -> api1.parse(file));
    }

    public static void main(String[] args) {
        new JavaApiGenerator().print();
    }

    private void print() {
        apis.forEach(api1 -> api1.getClassDefinition().forEach(System.out::println));
    }

    class API {

        final List<API> attributes = new ArrayList<>();
        private final String name;
        private String type;

        API(String name, String type) {
            this.name = name != null ? name.trim().replace(":", "").replace(";", "").replace(" ", "").replace("?", "") : "";
            this.type = type != null ? type.trim().replace(":", "").replace(";", "").replace(",", "").replace(" ", "").replace("?", "") : "";
            if (this.type.contains("|") && (this.type.contains("\"") || this.type.contains("\'"))) {
                Arrays.stream(this.type.split("\\|")).forEach(s -> {
                    attributes.add(new API(s.replace("\"", "").replace("\'", "") + "(" + s.replace("\'", "\"") + ")", ""));
                });
                this.type = "enum";
            }
        }

        void parse(List<String> string) {
            int typeBegin = 0;
            int braceCount = 1;
            int typeEnd = 0;
            for (int i = 0; i < string.size(); i++) {
                if (string.get(i).contains("type " + name)) {
                    typeBegin = i;
                } else {
                    if (string.get(i).contains("{")) {
                        braceCount++;
                    }
                    if (string.get(i).contains("}")) {
                        braceCount--;
                    }
                    if (braceCount == 0) {
                        typeEnd = i + 1;
                        break;
                    }
                }
            }
            System.out.println("--------------------------------------");
            IntStream.range(typeBegin, typeEnd).forEach(value -> System.out.println(string.get(value)));
            System.out.println("--------------------------------------");

            parseClassDefinition(IntStream.range(typeBegin + 1, typeEnd - 1).boxed().map(string::get).collect(Collectors.toList()), this, true);
        }

        void parseClassDefinition(List<String> classDefinition, API api, boolean root) {
            int typeBegin = 0;
            int braceCount = 0;
            int typeEnd;
            String typename = null;
            String type = null;

            for (int i = 0; i < classDefinition.size(); i++) {
                String line = classDefinition.get(i);
                if (classDefinition.get(i).contains("type " + name)) {
                    typeBegin = i;
                } else {
                    if (braceCount == 0 && !line.endsWith("}") && !line.endsWith("{")) {
                        if (line.contains("//")) {
                            line = line.substring(0, line.indexOf("//"));
                        }
                        typeBegin = i;
                        typename = line.substring(0, line.lastIndexOf(":") - 1);
                        type = line.substring(line.lastIndexOf(":"));
                        if (typename == null || type == null) {
                            System.out.println();
                        }
                    }
                    if (braceCount == 0 && classDefinition.get(i).contains("{")) {
                        typeBegin = i;
                        typename = line.substring(0, line.lastIndexOf(":"));
                        type = "class";
                    }
                    if (classDefinition.get(i).contains("{")) {
                        braceCount++;
                    }
                    if (classDefinition.get(i).contains("}")) {
                        braceCount--;
                    }
                    if (braceCount == 0) {
                        typeEnd = i;
                        API attribute = new API(typename, type);
                        api.attributes.add(attribute);
                        if (typeBegin != typeEnd) {
                            parseClassDefinition(IntStream.range(typeBegin + 1, typeEnd).boxed().map(classDefinition::get).collect(Collectors.toList()), attribute, false);
                        }
                    }
                }
            }
        }

        List<String> getClassDefinition() {
            if (type.equals("class")) {
                List<String> definition = new ArrayList<>();
                definition.add("class " + name.substring(0, 1).toUpperCase() + name.substring(1) + " {");
                attributes.stream().filter(api -> !api.name.equals("events")).forEach(api1 -> {
                    if (api1.type.equals("class") || api1.type.equals("enum")) {
                        definition.add(api1.name.substring(0, 1).toUpperCase() + api1.name.substring(1) + " " + api1.name + ";");
                        api1.getClassDefinition().forEach(definition::add);
                    } else {
                        definition.add(api1.type.substring(0, 1).toUpperCase() + api1.type.substring(1) + " " + api1.name + ";");
                    }
                });
                definition.add("}");
                return definition;
            } else if (type.equals("enum")) {
                List<String> definition = new ArrayList<>();
                definition.add("enum " + name.substring(0, 1).toUpperCase() + name.substring(1) + " {");
                attributes.forEach(api1 -> definition.add(api1.type + " " + api1.name + ","));
                definition.set(definition.size() - 1, definition.get(definition.size() - 1).replace(",", ";"));
                definition.add("private String name;");
                definition.add(name.substring(0, 1).toUpperCase() + name.substring(1) + "(String name){");
                definition.add("this.name = name;");
                definition.add("}");
                definition.add("}");
                return definition;
            } else {
                return null;
            }
        }
    }
}