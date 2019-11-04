package com.github.appreciated.apexcharts.examples;

import com.github.appreciated.apexcharts.ApexChartsBuilder;
import com.github.appreciated.apexcharts.examples.areachart.AreaChartExample;
import com.github.appreciated.apexcharts.examples.bar.HorizontalBarChartExample;
import com.github.appreciated.apexcharts.examples.bar.VerticalBarChartExample;
import com.github.appreciated.apexcharts.examples.bubble.BubbleChartExample;
import com.github.appreciated.apexcharts.examples.candlestick.CandleStickChartExample;
import com.github.appreciated.apexcharts.examples.donut.DonutChartExample;
import com.github.appreciated.apexcharts.examples.heatmap.HeatmapChartExample;
import com.github.appreciated.apexcharts.examples.line.LineChartExample;
import com.github.appreciated.apexcharts.examples.mixed.LineAndAreaChartExample;
import com.github.appreciated.apexcharts.examples.mixed.LineAndColumnAndAreaChartExample;
import com.github.appreciated.apexcharts.examples.mixed.LineAndColumnChartExample;
import com.github.appreciated.apexcharts.examples.pie.PieChartExample;
import com.github.appreciated.apexcharts.examples.radar.RadarChartExample;
import com.github.appreciated.apexcharts.examples.radialbar.GradientRadialBarChartExample;
import com.github.appreciated.apexcharts.examples.radialbar.MultiRadialBarChartExample;
import com.github.appreciated.apexcharts.examples.radialbar.RadialBarChartExample;
import com.github.appreciated.apexcharts.examples.scatter.ScatterChartExample;
import com.github.appreciated.apexcharts.examples.timeline.TimeLineChartExample;

import java.util.Arrays;

public class ExampleChartGenerator {
    public static ApexChartsBuilder[] getColoredCharts() {
        return Arrays.stream(getCharts())
                .map(builder -> builder instanceof CandleStickChartExample ? builder : builder.withColors("#008FFB"))
                .toArray(ApexChartsBuilder[]::new);
    }

    public static ApexChartsBuilder[] getCharts() {
        return new ApexChartsBuilder[]{
                new PieChartExample(),
                new DonutChartExample(),
                new LineChartExample(),
                new AreaChartExample(),
                new LineAndAreaChartExample(),
                new LineAndColumnChartExample(),
                new LineAndColumnAndAreaChartExample(),
                new BubbleChartExample(),
                new HorizontalBarChartExample(),
                new TimeLineChartExample(),
                new VerticalBarChartExample(),
                new RadialBarChartExample(),
                new GradientRadialBarChartExample(),
                new MultiRadialBarChartExample(),
                new CandleStickChartExample(),
                new RadarChartExample(),
                new ScatterChartExample(),
                new HeatmapChartExample()
        };
    }
}
