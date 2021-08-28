##
| Full name | Test site
|:----:|:----:
| Savchenko Maxim | [*agoda.com*](https://www.agoda.com/) |
***
## **Main classes/packages:**
* [Hooks.java](src/test/java/hooks/Hooks.java) - class with methods that will be run before / after the start of .feature files
* [CucumberRunner.java](src/test/java/runner/CucumberRunner.java) - the class that runs all tests
* [elements](src/main/java/elements/) - a package with classes that store methods for interacting with Selenide elements
* [enums](https://bitbucket.org/SavMax12/final/src/master/final/src/main/java/enums/) - package containing enumerated types
* [pages](https://bitbucket.org/SavMax12/final/src/master/final/src/main/java/pages/) - a package containing classes that store page elements
* [services](https://bitbucket.org/SavMax12/final/src/master/final/src/main/java/services/) - a package containing classes that store methods for interacting with page elements
* [utils](https://bitbucket.org/SavMax12/final/src/master/final/src/main/java/utils/) - package containing classes for working with logging
* [stepdefs](https://bitbucket.org/SavMax12/final/src/master/final/src/test/java/stepdefs/pages/) - a package containing classes describing the stages of testing
* [features](https://bitbucket.org/SavMax12/final/src/master/final/src/test/resources/features/) - package containing test scripts
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
