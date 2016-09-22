[maven]: http://maven.apache.org/
[git]: http://git-scm.com/

## Emblim Automation Test Rest API
### Demo

### Getting Started

To run the example you need to install [maven (3.1.1 or above)][maven] and [git]. 

To generate Allure Report you should perform following steps:

```bash
$ git clone https://github.com/lilliancheng2012/Emblim-AutomationTest-Rest-API.git
$ mvn clean test
$ mvn site
```

To see a report, run `mvn jetty:run` and open `http://localhost:8080` in your browser.

### Test Report

![](https://raw.githubusercontent.com/lilliancheng2012/lilliancheng2012.github.io/master/public/img/posts/22-09-16/Report%20Overview.PNG)

![](https://raw.githubusercontent.com/lilliancheng2012/lilliancheng2012.github.io/master/public/img/posts/22-09-16/Report%20xUnit.PNG)

![](https://raw.githubusercontent.com/lilliancheng2012/lilliancheng2012.github.io/master/public/img/posts/22-09-16/Report%20Behaviors.PNG)

![](https://raw.githubusercontent.com/lilliancheng2012/lilliancheng2012.github.io/master/public/img/posts/22-09-16/Report%20Graph.PNG)