[maven]: http://maven.apache.org/
[git]: http://git-scm.com/
[OnlineReport]: http://52.62.238.228:8080/
[Jenkins]: http://52.62.238.228:9090/

## Emblim Automation Test Rest API
### Demo

To View Online Testing Report:  

[http://52.62.238.228:8080/][OnlineReport]


This Demo is started by Continue Integration Tool - Jenkins  

[http://52.62.238.228:9090/][Jenkins]

*Username*: Lillian

*Password*: ****

### Getting Started

To run the example you need to install [maven (3.1.1 or above)][maven] and [git]. 

To generate Allure Report you should perform following steps:

```bash
$ git clone https://github.com/lilliancheng2012/Emblim-AutomationTest-Rest-API.git
$ mvn clean test
$ mvn site
```

To see a report, run `mvn jetty:run` and open `http://localhost:8080` in your browser.

### Generated Report
To View Online Testing Report: 

[http://52.62.238.228:8080/][OnlineReport]

![](https://raw.githubusercontent.com/lilliancheng2012/lilliancheng2012.github.io/master/public/img/posts/22-09-16/Report%20Overview.PNG)

![](https://raw.githubusercontent.com/lilliancheng2012/lilliancheng2012.github.io/master/public/img/posts/22-09-16/Report%20xUnit.PNG)

![](https://raw.githubusercontent.com/lilliancheng2012/lilliancheng2012.github.io/master/public/img/posts/22-09-16/Report%20Behaviors.PNG)

![](https://raw.githubusercontent.com/lilliancheng2012/lilliancheng2012.github.io/master/public/img/posts/22-09-16/Report%20Graph.PNG)