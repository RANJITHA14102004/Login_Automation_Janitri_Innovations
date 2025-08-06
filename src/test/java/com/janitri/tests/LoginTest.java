package com.janitri.tests;

import com.janitri.base.BaseTest;
import com.janitri.pages.LoginPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {

    @Test
    public void testLoginButtonEnabledByDefault() {
        System.out.println("🔍 Checking if login button is enabled...");
        LoginPage loginPage = new LoginPage(driver);
        boolean isEnabled = loginPage.isLoginButtonEnabled();
        Assert.assertTrue(isEnabled, "❌ Login button should be enabled by default.");
    }

    @Test
    public void testInvalidLoginShowsErrorMessage() {
        System.out.println("🔐 Attempting invalid login...");
        LoginPage loginPage = new LoginPage(driver);
        loginPage.enterEmail("invalid@example.com");
        loginPage.enterPassword("wrongpassword");
        loginPage.clickLogin();

        boolean errorShown = loginPage.isErrorMessageDisplayed();
        Assert.assertTrue(errorShown, "❌ Expected 'Invalid credentials' error message.");
    }

    @Test
    public void testPasswordVisibilityToggle() {
        System.out.println("👁️ Toggling password visibility...");
        LoginPage loginPage = new LoginPage(driver);
        loginPage.enterPassword("samplePassword");
        loginPage.togglePasswordVisibility();  // Just interaction
        System.out.println("✅ Password toggle clicked successfully.");
    }

    @Test
    public void testValidLogin() {
        System.out.println("✅ Attempting valid login...");
        LoginPage loginPage = new LoginPage(driver);

        // Replace these with actual valid credentials
        loginPage.enterEmail("your_actual_working_email@janitri.in");
        loginPage.enterPassword("your_actual_password");
        loginPage.clickLogin();

        // You can validate by checking dashboard URL or a known element
        try {
            Thread.sleep(3000); // Allow page load (can replace with explicit wait)
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        String currentUrl = driver.getCurrentUrl();
        Assert.assertTrue(!currentUrl.contains("login"), "❌ Login may have failed or still on login page.");
        System.out.println("✅ Valid login passed. Current URL: " + currentUrl);
    }
}
