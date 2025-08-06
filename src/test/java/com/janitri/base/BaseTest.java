package com.janitri.base;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.time.Duration;

public class BaseTest {
    protected WebDriver driver;

    @BeforeMethod
    public void setUp() {
        System.out.println("🔧 Setting up WebDriver...");
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));

        System.out.println("🌐 Opening login page...");
        driver.get("https://dev-dash.janitri.in/");  // ✅ Based on your PDF project
    }

    @AfterMethod
    public void tearDown() {
        System.out.println("🧹 Closing browser...");
        if (driver != null) {
            driver.quit();
        }
    }
}

