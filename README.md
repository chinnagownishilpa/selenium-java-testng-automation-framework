Selenium Java UI Automation Framework



Project Overview

This project is a Selenium WebDriver based UI automation framework developed using Java, TestNG, and Maven to automate functional and regression testing for a web based application. The framework follows industry standard automation practices used in real time enterprise projects.



It is designed using the Page Object Model (POM) pattern with clear separation of test logic, page interactions, and configuration management, making the framework scalable, maintainable, and CI ready.



Objectives of the Framework

\- Automate critical UI workflows such as login and checkout

\- Reduce manual regression testing effort

\- Demonstrate real world Selenium automation framework design

\- Support structured test execution using TestNG

\- Enable easy integration with CI tools such as Jenkins



Technology Stack

\- Programming Language: Java

\- Automation Tool: Selenium WebDriver

\- Test Framework: TestNG

\- Build Tool: Maven

\- Design Pattern: Page Object Model (POM)

\- Configuration Management: Properties file

\- Version Control: GitHub



Project Structure

UI\_Automation

src/main/java

&nbsp;Driver

&nbsp; DriverFactory.java

&nbsp;pages

&nbsp; LoginPage.java

&nbsp; CheckoutPage.java

&nbsp;utils



src/test/java

&nbsp;base

&nbsp; BaseTest.java

&nbsp;tests

&nbsp; LoginTest.java

&nbsp; CheckoutTest.java



src/test/resources

&nbsp;config.properties



pom.xml

testng.xml

README.md



Configuration

Environment specific details such as application URL, browser type, and credentials are maintained in:

src/test/resources/config.properties



Example configuration:

url=https://www.saucedemo.com

username=standard\_user

password=secret\_sauce

browser=chrome



How to Run Tests



Using Maven

mvn clean test



Using Eclipse

Right click on testng.xml

Run As

TestNG Suite



Reports

TestNG execution reports are generated under:

target/surefire-reports



Extent Report is generated at:

target/ExtentReport.html



CI/CD Readiness

The framework is CI ready and can be integrated with Jenkins or other CI tools to support automated regression execution, build validation, and continuous quality feedback.



Author

Shilpa

QA Automation Engineer

Selenium WebDriver Java TestNG Maven



