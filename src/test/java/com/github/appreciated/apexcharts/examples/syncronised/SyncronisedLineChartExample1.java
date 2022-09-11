package com.github.appreciated.apexcharts.examples.syncronised;

import com.github.appreciated.apexcharts.ApexChartsBuilder;
import com.github.appreciated.apexcharts.config.builder.ChartBuilder;
import com.github.appreciated.apexcharts.config.builder.GridBuilder;
import com.github.appreciated.apexcharts.config.builder.StrokeBuilder;
import com.github.appreciated.apexcharts.config.builder.XAxisBuilder;
import com.github.appreciated.apexcharts.config.chart.Type;
import com.github.appreciated.apexcharts.config.chart.builder.ZoomBuilder;
import com.github.appreciated.apexcharts.config.grid.builder.RowBuilder;
import com.github.appreciated.apexcharts.config.stroke.Curve;
import com.github.appreciated.apexcharts.helper.Series;

public class SyncronisedLineChartExample1 extends ApexChartsBuilder {
	public SyncronisedLineChartExample1() {
		withChart(ChartBuilder.get()
			.withGroup("test1")
			.withId("test1")
			.withType(Type.LINE)
			.withZoom(ZoomBuilder.get()
				.withEnabled(false)
				.build())
			.build())
			.withStroke(StrokeBuilder.get()
				.withCurve(Curve.STRAIGHT)
				.build())
			.withGrid(GridBuilder.get()
				.withRow(RowBuilder.get()
					.withColors("#f3f3f3", "transparent")
					.withOpacity(0.5).build()
				).build())
			.withXaxis(XAxisBuilder.get()
				.withCategories("Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep")
				.build())
			.withSeries(new Series<>("Desktops", 10.0, 41.0, 35.0, 51.0, 49.0, 62.0, 69.0, 91.0, 148.0));
    }
}
