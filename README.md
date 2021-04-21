
</p>    

<p align="center">
  <a href="https://vaadin.com/directory/component/apexchartsjs"><img src="https://img.shields.io/badge/Vaadin%20Directory-published-00b4f0.svg"></a>
  <a href="https://vaadin.com/directory/component/apexchartsjs"><img src="https://img.shields.io/vaadin-directory/version/apexchartsjs.svg" /></a>
   <a href="https://vaadin.com/directory/component/apexchartsjs"><img src="https://img.shields.io/vaadin-directory/rating/apexchartsjs.svg" /></a>
   <a href="https://vaadin.com/directory/component/apexchartsjs"><img src="https://img.shields.io/vaadin-directory/release-date/apexchartsjs.svg" /></a>
  </a>
</p>
<p align="center">
   <br>
Vaadin Platform wrapper for <a href="https://github.com/apexcharts/apexcharts.js">ApexCharts</a> to build interactive visualizations in Vaadin.
  <br>
</p>

## [Demo](https://appreciated-collection.herokuapp.com/apexcharts/)

## Development instructions

Starting the test/demo server:
```
mvn jetty:run
```

This deploys demo at http://localhost:8080

To deploy to another port set **jetty.port** and/or **jetty.ssl.port** like
```
mvn jetty:run -Djetty.port=8090 -Djetty.ssl.port=8555
```

### Branching information

* `master` the latest version of the starter, using latest platform snapshot
* `v10` the version for Vaadin 10
* `v11` the version for Vaadin 11
* `v12` the version for Vaadin 12
* `v13` the version for Vaadin 13

### License

ApexCharts for Vaadin is released under Apache 2.0 license.
