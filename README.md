# Login_Automation_Janitri_Innovations


### 1. 🔐 Login Automation Test Cases

- Automated using **Selenium WebDriver 4.20.0**
- Executed using **TestNG**
- Browser managed via **WebDriverManager**
- Written in **Java 22** using **IntelliJ IDEA**
- 4 Functional Test Cases:
  - Login button enabled by default
  - Invalid credentials show error
  - Password visibility toggle works
  - Valid login redirects successfully

### 2. 🧪 Manual Test Cases

- Excel file: `Manual_Test_Cases_Janitri.xlsx`
- Includes:
  - Functional scenarios
  - Negative test cases
  - UI validations
  - Boundary value checks
  - Actual Result, Status, and Remarks (Post Execution)

---

## 🔧 Tech Stack

| Tool/Tech          | Version     |
|--------------------|-------------|
| Java               | 22          |
| Selenium           | 4.20.0      |
| TestNG             | 7.10.2      |
| Maven              | Yes         |
| WebDriverManager   | 5.8.0       |
| IntelliJ IDEA      | 2025.2      |
---


## 🚀 How to Run

1. Clone the repository
2. Open in IntelliJ IDEA
3. Run `mvn clean test` or run `LoginTest.java` directly
4. View test results in console or TestNG reports


Final output:

🔧 Setting up WebDriver...

Aug 06, 2025 10:58:09 PM org.openqa.selenium.devtools.CdpVersionFinder findNearestMatch

WARNING: Unable to find CDP implementation matching 138

Aug 06, 2025 10:58:09 PM org.openqa.selenium.chromium.ChromiumDriver lambda$new$5

WARNING: Unable to find version of CDP to use for 138.0.7204.184. You may need to include a dependency on a specific version of the CDP using something similar to `org.seleniumhq.selenium:selenium-devtools-v86:4.20.0` where the version ("v86") matches the version of the chromium-based browser you're using and the version number of the artifact is the same as Selenium's.

🌐 Opening login page...

🔐 Attempting invalid login...

⚠️ Error message found: invalid credentials

🧹 Closing browser...

🔧 Setting up WebDriver...

Aug 06, 2025 10:58:13 PM org.openqa.selenium.devtools.CdpVersionFinder findNearestMatch

WARNING: Unable to find CDP implementation matching 138

Aug 06, 2025 10:58:13 PM org.openqa.selenium.chromium.ChromiumDriver lambda$new$5

WARNING: Unable to find version of CDP to use for 138.0.7204.184. You may need to include a dependency on a specific version of the CDP using something similar to `org.seleniumhq.selenium:selenium-devtools-v86:4.20.0` where the version ("v86") matches the version of the chromium-based browser you're using and the version number of the artifact is the same as Selenium's.

🌐 Opening login page...

🔍 Checking if login button is enabled...

🧹 Closing browser...

🔧 Setting up WebDriver...

Aug 06, 2025 10:58:16 PM org.openqa.selenium.devtools.CdpVersionFinder findNearestMatch

WARNING: Unable to find CDP implementation matching 138

Aug 06, 2025 10:58:16 PM org.openqa.selenium.chromium.ChromiumDriver lambda$new$5

WARNING: Unable to find version of CDP to use for 138.0.7204.184. You may need to include a dependency on a specific version of the CDP using something similar to `org.seleniumhq.selenium:selenium-devtools-v86:4.20.0` where the version ("v86") matches the version of the chromium-based browser you're using and the version number of the artifact is the same as Selenium's.

🌐 Opening login page...

👁️ Toggling password visibility...

✅ Password toggle clicked successfully.

✅ Password toggle clicked successfully.

🧹 Closing browser...

🔧 Setting up WebDriver...

Aug 06, 2025 10:58:19 PM org.openqa.selenium.devtools.CdpVersionFinder findNearestMatch

WARNING: Unable to find CDP implementation matching 138

Aug 06, 2025 10:58:19 PM org.openqa.selenium.chromium.ChromiumDriver lambda$new$5

WARNING: Unable to find version of CDP to use for 138.0.7204.184. You may need to include a dependency on a specific version of the CDP using something similar to `org.seleniumhq.selenium:selenium-devtools-v86:4.20.0` where the version ("v86") matches the version of the chromium-based browser you're using and the version number of the artifact is the same as Selenium's.

🌐 Opening login page...

✅ Attempting valid login...

✅ Valid login passed. Current URL: https://dev-dash.janitri.in/

🧹 Closing browser...


===============================================

Default Suite
Total tests run: 4, Passes: 4, Failures: 0, Skips: 0

===============================================


Process finished with exit code 0


