Vaadin Platform wrapper for [ApexCharts](https://github.com/apexcharts/apexcharts.js) to build interactive visualizations in Vaadin.

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
