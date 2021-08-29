##
| Full name | Test site | Requirements | Advised working environment | Building with Maven | Reporting
|:----:|:----:
| Savchenko Maxim | [*agoda.com*](https://www.agoda.com/) | Java JDK 8 | IntelliJ, Maven | mvn clean test | mvn allure:serve |
***
## **Main classes/packages:**
* [Hooks.java](src/test/java/hooks/Hooks.java) - class with methods that will be run before / after the start of .feature files
* [CucumberRunner.java](src/test/java/runner/CucumberRunner.java) - class that runs all tests
* [elements](src/main/java/elements/) - package with classes that store methods for interacting with Selenide elements
* [enums](src/main/java/enums/) - package containing enumerated types
* [pages](src/main/java/pages/) - package containing classes that store page elements
* [services](src/main/java/services/) - package containing classes that store methods for interacting with page elements
* [utils](src/main/java/utils/) - package containing classes for working with logging
* [stepdefs](src/test/java/stepdefs/pages/) - package containing classes describing the stages of testing
* [features](src/test/resources/features/) - package containing test scripts
***
## **Tools:**
* Java
* Maven
* JUnit
* TestNG
* Selenium WebDriver
* Selenide
* Log4j
* Cucumber
* Allure
* Jenkins
***
## Quick intro for developers
**Requirements**
* Java JDK 8

**Advised working environment**
* IntelliJ
* Maven

**Building with Maven**<br/>
The project can be built by executing the following command from project root folder:
<br/>mvn clean test

**Reporting**<br/>
The report can be built by executing the following command from project root folder:
<br/>mvn allure:serve
***
![allure](/Screenshot_164.jpg)
