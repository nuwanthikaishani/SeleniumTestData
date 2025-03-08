# SeleniumTestData

# Selenium Test Data Management with Page Object Model (POM)

This project demonstrates how to manage **test data** using **Apache POI** (Excel) in a **Selenium-based test automation framework** built with the **Page Object Model (POM)**. The project is designed to separate **test data** from test scripts, making it more maintainable, scalable, and reusable for data-driven testing.

## **Project Structure**

This project follows the **Page Object Model (POM)** design pattern, where:
- **Page Object** classes represent the user interface.
- **Test classes** manage the test execution.
- **Utility classes** help with repetitive tasks like reading test data from Excel.

Here’s the folder structure:

SeleniumPOMTestProject/ │── src/ │ ├── main/ │ │ ├── java/ │ │ │ ├── base/ │ │ │ │ ├── BaseTest.java │ │ │ ├── pages/ │ │ │ │ ├── LoginPage.java │ │ │ ├── utils/ │ │ │ │ ├── ExcelReader.java │ │ ├── resources/ │ │ │ ├── config.properties │ │ │ ├── TestData.xlsx │ ├── test/ │ │ ├── java/ │ │ │ ├── tests/ │ │ │ │ ├── LoginTest.java │── pom.xml │── testng.xml │── README.md


## **Key Components**

### **1. BaseTest.java**
The `BaseTest` class initializes the WebDriver, sets the browser configurations, and manages the test setup and teardown. This class is extended by other test classes to avoid code duplication.

### **2. LoginPage.java**
The `LoginPage` class is a Page Object that contains the locators for the login form (username, password, login button) and the methods to interact with the login page.

### **3. ExcelReader.java**
The `ExcelReader` utility class uses **Apache POI** to read test data from an Excel file. It abstracts the logic of reading test data from the Excel sheet so that the test classes can easily fetch data for different test cases.

### **4. LoginTest.java**
The `LoginTest` class is the actual test case that reads data from the Excel file using the `ExcelReader` class and performs the login functionality using the methods from the `LoginPage` class.

### **5. TestData.xlsx**
The `TestData.xlsx` file contains the test data for the login functionality (e.g., valid usernames and passwords). This file is used to perform **data-driven testing**.

### **6. config.properties**
A configuration file used to store **browser settings**, **URLs**, and other configurable parameters.

---

## **Getting Started**

### **1. Clone the Repository**
First, clone this repository to your local machine:

```bash
git clone https://github.com/nuwanthikaishani/SeleniumTestData.git
