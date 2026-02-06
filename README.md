# Amazon Basic Automation Framework

This is a **basic industry-level Selenium Test Automation Framework** built using:

- Java  
- Selenium WebDriver  
- TestNG  
- Maven  
- Page Object Model (POM)  
- Data Driven Testing (Excel)  
- Extent Reports  
- Log4j Logging  
- Screenshot on Failure  
- Multiple Browser Support  

---

## 🚀 Features

✔ Page Object Model Design  
✔ TestNG Framework  
✔ DataProvider with Excel Integration  
✔ Cross Browser Testing (Chrome & Edge)  
✔ HTML Extent Reports  
✔ Automatic Screenshot on Test Failure  
✔ Logging using Log4j  
✔ Easy to maintain and scalable structure  

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

````

---

## 🛠 Technologies Used

| Technology | Purpose |
|-----------|--------|
| Java | Programming Language |
| Selenium | Web Automation |
| TestNG | Test Execution |
| Maven | Build Tool |
| Apache POI | Excel Reading |
| Extent Reports | Reporting |
| Log4j | Logging |
| WebDriverManager | Browser Drivers |

---

## ⚙ Prerequisites

Before running this project, make sure you have:

- Java 11 or above  
- Maven installed  
- IntelliJ IDEA / Eclipse  
- Chrome or Edge browser  

---

## ▶ How to Run Tests

### Option 1 – From IntelliJ

1. Import project as Maven project  
2. Right click on **testng.xml**  
3. Click **Run**

---

### Option 2 – Using Maven Command

Open terminal in project folder and run:

```bash
mvn clean test
````

---

## 🧪 Test Data

Test data is maintained in:

```
TestData.xlsx
```

You can add or modify search keywords directly in Excel without changing code.

---

## 🧾 Reports

After execution the following reports are generated:

* **ExtentReport.html** – Detailed execution report
* **Screenshots** – Captured automatically for failed tests

---

## 🌐 Browsers Supported

* Google Chrome
* Microsoft Edge

Browser can be selected from **testng.xml**

Example:

```xml
<parameter name="browser" value="chrome"/>
```

---

## 🧩 Key Framework Components

### BaseTest

Handles browser setup and teardown.

### POM Classes

Contains page elements and actions.

### Test Classes

Contains actual TestNG test cases.

### Utilities

* Excel reading
* Logging
* Reporting
* Screenshot capture

---

## 📌 Future Enhancements

This framework can be further enhanced by adding:

* Parallel Execution
* Jenkins Integration
* API Automation
* Cucumber BDD
* Allure Reports

---

## 👤 Author

Automation Framework created for learning and interview preparation purposes.

---

## 📄 License

This project is open source and free to use.

```

---

If you want, I can also help you:

👉 Add a **.gitignore file** for Java/Maven  
👉 Create a professional GitHub project description  

Just say:

**“Create .gitignore for this project”** 😊
```
