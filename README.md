# Scrum Developer (TM) Course demo Project #

## Tools ##
### 1. [Java SE 11](https://docs.oracle.com/en/java/javase/11/docs/api/index.html) ###
### 2. [javalin](https://javalin.io/documentation#getting-started "javalin.io") (minimalist web framework)
### 3. [Gherkin Language](https://cucumber.io/docs/gherkin/reference/)
### 4. [Cucumber](https://cucumber.io/docs/cucumber/) ###

1. [Eclipse plugin](https://marketplace.eclipse.org/content/cucumber-eclipse-plugin#group-details "cucumber-eclipse")

### 5. [Selenium Web Driver](https://selenium.dev/documentation/en/webdriver/) ###
1. [API Docs ](https://selenium.dev/selenium/docs/api/java/)
1. Web Drivers:
	1. [Firefox (aka gecko)](https://github.com/mozilla/geckodriver/releases)
	1. [Chrome](https://chromedriver.chromium.org/downloads)

### 6. [junit 4](https://junit.org/junit4/index.html) ###

## Short demos ##
1. [Cucumber 10 minutes tutorial](https://cucumber.io/docs/guides/10-minute-tutorial/)
1. [Web testing with Selenium + Java](https://www.guru99.com/first-webdriver-script.html)


## Requirements ##

- **Selenium Web Driver for Firefox (Gecko):**
  - Download latest version from Releases of [mozilla/geckodriver @ Github.com](https://github.com/mozilla/geckodriver/releases), be sure to use the correct OS and bitness (32 or 64) version.
  - Unzip-it at your user home (`%UserProfile%` for MS-Windows or `~` for most Linux distributions)
  - Run tests `mvn test` (maven) or `Run As - JUnit Tests` (eclipse) and validate that the UI tests (Browser) pass