package com.github.appreciated.apexcharts;

import com.github.appreciated.apexcharts.examples.bar.HorizontalBarChartExample;
import com.github.appreciated.apexcharts.examples.bar.VerticalBarChartExample;
import com.github.appreciated.apexcharts.examples.candlestick.CandleStickChartExample;
import com.github.appreciated.apexcharts.examples.heatmap.HeatmapChartExample;
import com.github.appreciated.apexcharts.examples.heatmap.areachart.AreaChartExample;
import com.github.appreciated.apexcharts.examples.heatmap.bubble.BubbleChartExample;
import com.github.appreciated.apexcharts.examples.heatmap.donut.DonutChartExample;
import com.github.appreciated.apexcharts.examples.heatmap.line.LineChartExample;
import com.github.appreciated.apexcharts.examples.heatmap.linecolumn.LineColumnChartExample;
import com.github.appreciated.apexcharts.examples.heatmap.linecolumnarea.LineColumnAreaChartExample;
import com.github.appreciated.apexcharts.examples.heatmap.mixed.MixedLineAndAreaChartExample;
import com.github.appreciated.apexcharts.examples.heatmap.pie.PieChartExample;
import com.github.appreciated.apexcharts.examples.heatmap.timeline.TimeLineChartExample;
import com.github.appreciated.apexcharts.examples.radar.RadarChartExample;
import com.github.appreciated.apexcharts.examples.radialbar.GradientRadialBarChartExample;
import com.github.appreciated.apexcharts.examples.radialbar.MultiRadialBarChartExample;
import com.github.appreciated.apexcharts.examples.radialbar.RadialBarChartExample;
import com.github.appreciated.apexcharts.examples.scatter.ScatterChartExample;

public class ExampleChartGenerator {

    static ApexCharts[] getCharts() {
        return new ApexCharts[]{
                new PieChartExample(),
                new DonutChartExample(),
                new LineChartExample(),
                new AreaChartExample(),
                new MixedLineAndAreaChartExample(),
                new LineColumnChartExample(),
                new LineColumnAreaChartExample(),
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
