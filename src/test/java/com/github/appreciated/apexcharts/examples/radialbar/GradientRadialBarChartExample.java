package com.github.appreciated.apexcharts.examples.radialbar;

import com.github.appreciated.apexcharts.ApexChartsBuilder;
import com.github.appreciated.apexcharts.config.builder.ChartBuilder;
import com.github.appreciated.apexcharts.config.builder.FillBuilder;
import com.github.appreciated.apexcharts.config.builder.PlotOptionsBuilder;
import com.github.appreciated.apexcharts.config.builder.StrokeBuilder;
import com.github.appreciated.apexcharts.config.chart.Type;
import com.github.appreciated.apexcharts.config.chart.builder.DropShadowBuilder;
import com.github.appreciated.apexcharts.config.chart.builder.ToolbarBuilder;
import com.github.appreciated.apexcharts.config.fill.builder.GradientBuilder;
import com.github.appreciated.apexcharts.config.plotoptions.builder.RadialBarBuilder;
import com.github.appreciated.apexcharts.config.plotoptions.hollow.HollowPosition;
import com.github.appreciated.apexcharts.config.plotoptions.radialbar.builder.*;
import com.github.appreciated.apexcharts.config.stroke.LineCap;

public class GradientRadialBarChartExample extends ApexChartsBuilder {
    public GradientRadialBarChartExample() {
        withChart(ChartBuilder.get()
                .withType(Type.RADIALBAR)
                .withToolbar(ToolbarBuilder.get().withShow(true).build())
                .build())
                .withPlotOptions(PlotOptionsBuilder.get().withRadialBar(RadialBarBuilder.get()
                        .withStartAngle(-135.0)
                        .withEndAngle(225.0)
                        .withHollow(HollowBuilder.get()
                                .withMargin(0.0)
                                .withSize("70%")
                                .withBackground("#fff")
                                .withPosition(HollowPosition.FRONT)
                                .withDropShadow(DropShadowBuilder.get()
                                        .withEnabled(true)
                                        .withTop(3.0)
                                        .withBlur(4.0)
                                        .withOpacity(0.24)
                                        .build())
                                .build())
                        .withTrack(TrackBuilder.get()
                                .withBackground("#fff")
                                .withStrokeWidth("67%")
                                .withDropShadow(DropShadowBuilder.get()
                                        .withTop(-3.0)
                                        .withLeft(0.0)
                                        .withBlur(4.0)
                                        .withOpacity(0.35)
                                        .build())
                                .build())
                        .withDataLabels(RadialBarDataLabelsBuilder.get()
                                .withShow(true)
                                .withName(NameBuilder.get()
                                        .withOffsetY(-10.0)
                                        .withShow(true)
                                        .withColor("#888")
                                        .withFontSize("17px")
                                        .build())
                                .withValue(ValueBuilder
                                        .get()
                                        .withColor("#111")
                                        .withFontSize("36px")
                                        .withShow(true)
                                        .build())
                                .build())
                        .build())
                        .build())
                .withFill(FillBuilder.get()
                        .withType("gradient")
                        .withGradient(GradientBuilder.get()
                                .withShade("dark")
                                .withType("horizontal")
                                .withShadeIntensity(0.5)
                                .withGradientToColors("#ABE5A1")
                                .withInverseColors(true)
                                .withOpacityFrom(1.0)
                                .withOpacityTo(1.0)
                                .withStops(0.0, 100.0)
                                .build())
                        .build())
                .withSeries(75.0)
                .withStroke(StrokeBuilder.get()
                        .withLineCap(LineCap.ROUND)
                        .build())
                .withLabels("Percent");
    }
}
