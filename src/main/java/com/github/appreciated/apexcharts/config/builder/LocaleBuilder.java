package com.github.appreciated.apexcharts.config.builder;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.github.appreciated.apexcharts.config.Locale;
import com.github.appreciated.apexcharts.config.locale.Options;

import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;

public class LocaleBuilder {
    String name;
    Options options;

    private LocaleBuilder() {
    }

    public static LocaleBuilder get() {
        return new LocaleBuilder();
    }

    public LocaleBuilder withName(String name) {
    	this.name = name;
    	return this;
    }
    
    public LocaleBuilder withOptions(Options options) {
    	this.options = options;
    	return this;
    	
    }

    public Locale build() {
    	Locale locale = new Locale();
    	locale.setName(name);
    	locale.setOptions(options);
        return locale;
    }
    
    /**
     * 
     * @param localeName the name of the local
     * @return the @Locale object for the given localeName 
     */
    public Locale build(String localeName) {
    	File f = null;
		try {
			f = new File(getClass().getResource("/locales/" + localeName + ".json").toURI());
		} catch (URISyntaxException e1) {
			e1.printStackTrace();
		}
    	if(f==null || !f.exists()) {
    		throw new IllegalArgumentException("Locale [" + localeName + "] is not supported. File [" + f.getName() +"] could not be found.");
    	}
    	Locale locale = null;
    	ObjectMapper mapper = new ObjectMapper();
    	
    	try {
			locale = mapper.readValue(f, Locale.class);
		} catch (IOException e) {
			e.printStackTrace();
		}
    	
    	return locale;
    }
}
