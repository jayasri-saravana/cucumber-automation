# Test Automation using Cucumber and Serenity BDD


## Pre-requisites
* JAVA
* Cucumber
* JUnit
* Maven

### The project directory structure
Project can build using Maven. 
```Gherkin
src
  + main
  + test
    + java                        Test runners and test scripts
    + resources
      + features                  Feature files
          login.feature
```

### The sample scenario

```Gherkin
Feature: Login to HotelApp

  @regression
  Scenario: Login with valid credentials
    Given user is on the home page
    When user logins to the portal with username "username" and password "password"
    Then hotel search page should be displayed
```

### Test Execution Configurations
To change driver, base url `serenity.properties` file is used.
```json
webdriver.base.url=http://www.adactinhotelapp.com/
webdriver.driver=chrome
headless.mode = false
```

### Password for tests
To protect the password, please use following environment variables:
`password` for valid password; `invalidpassword` for invalid password.
This is only for password and not for username. Please use valid username in the Gherkin step.

```Gherkin
    When user logins to the portal with username "username" and password "password"
```

Environment variables can be used directly in gherkin step.

### Executing the tests
To run the test cases, you can either just run the `CucumberTestSuite` test runner class, or run `mvn verify` from the command line.

```json
$ mvn clean verify 
```

The test results will be recorded in the `target/site/serenity` directory.

Sample Test Report - https://jayasri-saravana.github.io/hotelapp-sample-test-report/index.html
