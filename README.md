\# Selenium Java TestNG Automation – SauceDemo



\## Overview

This project is a Selenium automation framework built using Java, TestNG, Maven, and Page Object Model (POM).

It automates login and checkout functionality on the SauceDemo demo web application.



\## Tech Stack

\- Java 8+

\- Selenium WebDriver

\- TestNG

\- Maven

\- Extent Reports

\- Eclipse IDE



\## Project Structure

src/main/java

&nbsp;├── pages

&nbsp;├── utils

&nbsp;└── base

&nbsp;    └── DriverFactory.java



src/test/java

&nbsp;├── base

&nbsp;│   └── BaseTest.java

&nbsp;└── tests

&nbsp;    ├── LoginTest.java

&nbsp;    └── CheckoutTest.java



src/test/resources

&nbsp;└── config.properties



\## Configuration

Configuration is maintained in:

src/test/resources/config.properties



Example:

url=https://www.saucedemo.com

username=standard\_user

password=secret\_sauce

browser=chrome



\## How to Run Tests



\### Using Maven

mvn clean test



\### Using Eclipse

Right click testng.xml

Run As → TestNG Suite



\## Reports



\### TestNG Reports

target/surefire-reports



\### Extent Report

target/ExtentReport.html



\## Author

Shilpa

QA Automation Engineer



