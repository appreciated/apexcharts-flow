package com.github.appreciated.apexcharts.examples;

import com.github.appreciated.apexcharts.ApexCharts;
import com.github.appreciated.apexcharts.examples.bar.HorizontalBarChartExample;
import com.github.appreciated.apexcharts.examples.bar.VerticalBarChartExample;
import com.github.appreciated.apexcharts.examples.candlestick.CandleStickChartExample;
import com.github.appreciated.apexcharts.examples.heatmap.HeatmapChartExample;
import com.github.appreciated.apexcharts.examples.heatmap.areachart.AreaChartExample;
import com.github.appreciated.apexcharts.examples.heatmap.bubble.BubbleChartExample;
import com.github.appreciated.apexcharts.examples.heatmap.donut.DonutChartExample;
import com.github.appreciated.apexcharts.examples.heatmap.line.LineChartExample;
import com.github.appreciated.apexcharts.examples.heatmap.pie.PieChartExample;
import com.github.appreciated.apexcharts.examples.heatmap.timeline.TimeLineChartExample;
import com.github.appreciated.apexcharts.examples.mixed.LineAndAreaChartExample;
import com.github.appreciated.apexcharts.examples.mixed.LineAndColumnAndAreaChartExample;
import com.github.appreciated.apexcharts.examples.mixed.LineAndColumnChartExample;
import com.github.appreciated.apexcharts.examples.radar.RadarChartExample;
import com.github.appreciated.apexcharts.examples.radialbar.GradientRadialBarChartExample;
import com.github.appreciated.apexcharts.examples.radialbar.MultiRadialBarChartExample;
import com.github.appreciated.apexcharts.examples.radialbar.RadialBarChartExample;
import com.github.appreciated.apexcharts.examples.scatter.ScatterChartExample;

public class ExampleChartGenerator {
    public static ApexCharts[] getCharts() {
        return new ApexCharts[]{
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
