import {PolymerElement} from '@polymer/polymer/polymer-element.js';
import {html} from '@polymer/polymer/lib/utils/html-tag.js';
import '@polymer/polymer/lib/utils/html-tag.js';
import ApexCharts from 'apexcharts';

class ApexChartsWrapper extends PolymerElement {
    static get template() {
        return html`
           <style include="apex-charts-style">
            ::slotted(div) {
                overflow: hidden;
                }
        </style>
        <slot></slot>
    `;
    }

    static get is() {
        return 'apex-charts-wrapper'
    }

    static get properties() {
        return {
            annotations: {
                type: Object
            }, // ApexAnnotations;
            chart: {
                type: Object
            }, // ApexChart;
            colors: {
                type: Object
            }, // string[];
            dataLabels: {
                type: Object
            }, // ApexDataLabels;
            fill: {
                type: Object
            }, // ApexFill;
            grid: {
                type: Object
            }, // ApexGrid;
            labels: {
                type: Object
            }, // string[];
            legend: {
                type: Object
            }, // ApexLegend;
            markers: {
                type: Object
            }, // ApexMarkers;
            noData: {
                type: Object
            }, // ApexNoData;
            plotOptions: {
                type: Object
            }, // ApexPlotOptions;
            responsive: {
                type: Object
            }, // ApexResponsive[];
            series: {
                type: Object
            }, // ApexAxisChartSeries | ApexNonAxisChartSeries;
            states: {
                type: Object
            }, // ApexStates;
            stroke: {
                type: Object
            }, // ApexStroke;
            subtitle: {
                type: Object
            }, // ApexTitleSubtitle;
            theme: {
                type: Object
            }, // ApexTheme;
            chartTitle: {
                type: Object
            }, // ApexTitleSubtitle;
            tooltip: {
                type: Object
            }, // ApexTooltip;
            xaxis: {
                type: Object
            }, // ApexXAxis;
            yaxis: {
                type: Object
            }, // ApexYAxis | ApexYAxis[];
            width: {
                type: String
            },
            height: {
                type: String
            }
        }
    }

    ready() {
        super.ready();
        this.color = require('onecolor');
        var div = document.createElement('div');
        this.appendChild(div);
        this.updateConfig();
        this.chartComponent = new ApexCharts(div, this.config);
        this.chartComponent.render();
    }

    updateConfig() {
        var primaryColor;
        if (ShadyCSS) {
            primaryColor = ShadyCSS.getComputedStyleValue(this, '--apex-charts-primary-color');
        } else {
            primaryColor = getComputedStyle(this).getPropertyValue('--apex-charts-primary-color');
        }
        var backgroundColor;
        if (ShadyCSS) {
            backgroundColor = ShadyCSS.getComputedStyleValue(this, '--apex-charts-background-color');
        } else {
            backgroundColor = getComputedStyle(this).getPropertyValue('--apex-charts-background-color');
        }
        this.config = {};
        if (this.annotations) {
            this.config.annotations = JSON.parse(this.annotations);
        }
        if (this.chart) {
            this.config.chart = JSON.parse(this.chart);
        }
        if (this.series) {
            this.config.series = JSON.parse(this.series);
        }
        if (this.labels) {
            this.config.labels = this.labels;
        }
        if (this.colors) {
            this.config.colors = JSON.parse(this.colors);
        }
        if (this.dataLabels) {
            this.config.dataLabels = JSON.parse(this.dataLabels);
        }
        if (this.fill) {
            this.config.fill = JSON.parse(this.fill);
        }
        if (this.grid) {
            this.config.grid = JSON.parse(this.grid);
        }
        if (this.legend) {
            this.config.legend = JSON.parse(this.legend);
        }
        if (this.markers) {
            this.config.markers = this.markers;
        }
        if (this.noData) {
            this.config.noData = this.noData;
        }
        if (this.plotOptions) {
            this.config.plotOptions = JSON.parse(this.plotOptions);
        }
        if (this.responsive) {
            this.config.responsive = JSON.parse(this.responsive);
        }
        if (this.states) {
            this.config.states = JSON.parse(this.states);
        }
        if (this.stroke) {
            this.config.stroke = JSON.parse(this.stroke);
        }
        if (this.subtitle) {
            this.config.subtitle = JSON.parse(this.subtitle);
        }
        if (this.theme) {
            this.config.theme = this.theme;
        } else {
            if (backgroundColor && this.color(backgroundColor)) {
                this.config.theme = {
                    mode: ((this.color(backgroundColor).lightness() > 0.5) ? 'light' : 'dark')
                };
            }
            if (!this.colors && primaryColor && this.color(primaryColor)) {
                this.config.theme.monochrome = {
                    enabled: true,
                    color: this.color(primaryColor).hex(),
                    shadeTo: 'light',
                    shadeIntensity: 0.65
                }
            }
        }
        if (this.chartTitle) {
            this.config.title = JSON.parse(this.chartTitle);
        }
        if (this.tooltip) {
            this.config.tooltip = JSON.parse(this.tooltip);
        }
        if (this.xaxis) {
            this.config.xaxis = JSON.parse(this.xaxis);
        }
        if (this.yaxis) {
            this.config.yaxis = JSON.parse(this.yaxis);
        }
        if (!this.config.chart) {
            this.config.chart = {};
        }
        if (this.width) {
            this.config.chart.width = this.width;
        }
        if (this.height) {
            this.config.chart.height = this.height;
        }
        if (!this.config.chart.background && backgroundColor && this.color(backgroundColor)) {
            this.config.chart.background = backgroundColor;
        }
        if (!this.config.stroke) {
            this.config.stroke = {};
        }
        if (this.config.chart && this.config.chart.type === "radar") {
            if (!this.config.plotOptions && backgroundColor && this.color(backgroundColor)) {
                this.config.plotOptions = {
                    radar: {
                        polygons: {
                            fill: {
                                colors: [this.color(backgroundColor).hex()]
                            }
                        }
                    }
                };
            }
        }
    }

    updateData() {
        if (this.chartObj) {
            this.chartObj.updateSeries(JSON.parse(this.series))
        }
    }

    render() {
        if (this.chartComponent) {
            this.updateConfig();
            this.chartComponent.render();
        }
    }
}

customElements.define(ApexChartsWrapper.is, ApexChartsWrapper);
export {ApexChartsWrapper};
