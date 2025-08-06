package com.janitri.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class LoginPage {
    WebDriver driver;
    WebDriverWait wait;

    // ✅ Locators
    private final By emailField = By.id("formEmail");
    private final By passwordField = By.id("formPassword");
    private final By loginButton = By.cssSelector("button.login-button");
    private final By passwordToggle = By.cssSelector("img.passowrd-visible"); // Adjusted based on your page
    private final By errorMessage = By.xpath("//p[@class='normal-text' and contains(text(),'Invalid Credentials')]"); // ✅ Corrected locator

    public LoginPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(30));
    }

    public void enterEmail(String email) {
        WebElement emailInput = wait.until(ExpectedConditions.visibilityOfElementLocated(emailField));
        emailInput.clear();
        emailInput.sendKeys(email);
    }

    public void enterPassword(String password) {
        WebElement passwordInput = wait.until(ExpectedConditions.visibilityOfElementLocated(passwordField));
        passwordInput.clear();
        passwordInput.sendKeys(password);
    }

    public void clickLogin() {
        wait.until(ExpectedConditions.elementToBeClickable(loginButton)).click();
    }

    public boolean isLoginButtonEnabled() {
        WebElement button = wait.until(ExpectedConditions.visibilityOfElementLocated(loginButton));
        return button.isEnabled();
    }

    public void togglePasswordVisibility() {
        try {
            WebElement toggle = wait.until(ExpectedConditions.elementToBeClickable(passwordToggle));
            toggle.click();
            System.out.println("✅ Password toggle clicked successfully.");
        } catch (Exception e) {
            System.out.println("❌ Password toggle icon not clickable: " + e.getMessage());
        }
    }

    public boolean isErrorMessageDisplayed() {
        try {
            WebElement error = wait.until(ExpectedConditions.visibilityOfElementLocated(errorMessage));
            String msg = error.getText().trim().toLowerCase();
            System.out.println("⚠️ Error message found: " + msg);
            return msg.contains("invalid"); // Flexible check
        } catch (Exception e) {
            System.out.println("❌ No error message found: " + e.getMessage());
            return false;
        }
    }
}




