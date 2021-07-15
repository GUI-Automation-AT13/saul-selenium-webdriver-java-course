/**
 * Copyright (c) 2021 Fundacion Jala.
 * This software is the confidential and proprietary information of Fundacion Jala
 * ("Confidential Information"). You shall not disclose such Confidential
 * Information and shall use it only in accordance with the terms of the
 * license agreement you entered into with Fundacion Jala
 */

package theinternet.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

    private WebDriver driver;
    private By usernameField = By.id("username");
    private By passwordField = By.id("password");
    private By loginButton = By.cssSelector("#login button");

    /**
     * LoginPage constructor.
     *
     * @param webDriver
     */
    public LoginPage(final WebDriver webDriver) {
        this.driver = webDriver;
    }

    /**
     * Sets the username field with the given value.
     *
     * @param username
     */
    public void setUsername(final String username) {
        driver.findElement(usernameField).sendKeys(username);
    }

    /**
     * Sets the password field with the given value.
     *
     * @param password
     */
    public void setPassword(final String password) {
        driver.findElement(passwordField).sendKeys(password);
    }

    /**
     * Clicks the login button.
     *
     * @return SecureAreaPage
     */
    public SecureAreaPage clickLoginButton() {
        driver.findElement(loginButton).click();
        return new SecureAreaPage(driver);
    }
}
