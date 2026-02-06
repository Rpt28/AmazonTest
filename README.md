# Amazon Search Automation Framework

This is a simple Selenium automation framework created for automating Amazon search functionality.

The framework is built using:

- Java  
- Selenium WebDriver  
- TestNG  
- Maven  
- Page Object Model (POM)  
- Data Driven Testing using Excel  
- Extent Reports  
- Log4j Logging  
- Screenshot on Failure  
- Multiple Browser Support  

---

## 📌 Framework Features

✔ Page Object Model design pattern  
✔ TestNG based test execution  
✔ Data driven testing using Excel  
✔ Cross browser support (Chrome & Edge)  
✔ HTML Extent Report generation  
✔ Automatic screenshot capture on failure  
✔ Logging using Log4j  
✔ Easy to maintain and reusable structure  

---

## 📁 Project Structure

```

AmazonBasicFramework
│── pom.xml
│── testng.xml
│── log4j2.xml
│── TestData.xlsx
└── src/test/java
└── com.demo
├── base
│   └── BaseTest.java
├── pages
│   └── AmazonHomePage.java
├── tests
│   └── AmazonSearchTest.java
├── utils
│   ├── ExcelUtil.java
│   ├── ExtentReportUtil.java
│   ├── ScreenshotUtil.java
│   └── LogUtil.java
└── listeners
└── TestListener.java

```

---

## 🛠 Technologies Used

| Tool / Library | Purpose |
|----------------|--------|
| Java | Programming Language |
| Selenium | Web Automation |
| TestNG | Test Execution |
| Maven | Build Management |
| Apache POI | Excel Data Reading |
| Extent Reports | Test Reporting |
| Log4j | Logging |
| WebDriverManager | Browser Driver Setup |

---

## ⚙ Prerequisites

- Java 11 or higher  
- Maven installed  
- IntelliJ IDEA or Eclipse  
- Google Chrome or Microsoft Edge browser  

---

## ▶ How to Run Tests

### Option 1 – From IntelliJ

1. Import project as Maven project  
2. Open **testng.xml**  
3. Right click → Run  

---

### Option 2 – From Command Line

Open terminal in project folder and run:

```

mvn clean test

```

---

## 🧪 Test Data

All test data is maintained in:

```

TestData.xlsx

````

You can add or modify search keywords in Excel without changing the code.

---

## 📊 Reports and Logs

After execution:

- **ExtentReport.html** is generated for detailed test results  
- Screenshots are captured automatically for failed tests  
- Logs are printed using Log4j  

---

## 🌐 Browsers Supported

- Google Chrome  
- Microsoft Edge  

Browser can be selected from **testng.xml**

Example:

```xml
<parameter name="browser" value="chrome"/>
````

---

## 📄 Description

This framework demonstrates a basic industry-level automation approach using Selenium and TestNG with POM design pattern.
It is created for learning and interview preparation purposes.

---

## 👤 Author

Created as part of Selenium Automation Practice Project.

```

---
