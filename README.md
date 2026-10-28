OrangeHRM Automation Framework
A Selenium Test Automation Framework built using Java, TestNG, Maven, and Page Object Model (POM) for testing the OrangeHRM application.

Technologies Used
Java 17
Selenium WebDriver
TestNG
Maven
Page Object Model (POM)
Extent Reports
Git & GitHub
WebDriverManager
Project Structure
src/test/java

├── tests

│ ├── ValidLoginTest

│ ├── InvalidLoginTest

│ ├── AddEmployeeTest

│ ├── SearchEmployeeTest

│ └── DeleteEmployeeTest

├── pages

│ ├── LoginPage

│ ├── DashboardPage

│ └── PIMPage

├── utils

│ ├── BaseClass

│ ├── CommonMethods

│ ├── ConfigsReader

│ ├── ScreenshotUtils

│ └── ExtentManager

├── listeners

│ └── TestListener

└── testng.xml

Implemented Test Scenarios
Login Tests
✅ Valid Login

✅ Invalid Login

Employee Management
✅ Add Employee

✅ Search Employee

✅ Delete Employee

Reporting
The framework generates:

Extent HTML Reports
Test Execution Summary
Pass/Fail Statistics
Execution Timeline
Environment Information