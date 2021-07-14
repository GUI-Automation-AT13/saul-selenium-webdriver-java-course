/**
 * Copyright (c) 2021 Fundacion Jala.
 * This software is the confidential and proprietary information of Fundacion Jala
 * ("Confidential Information"). You shall not disclose such Confidential
 * Information and shall use it only in accordance with the terms of the
 * license agreement you entered into with Fundacion Jala
 */

package theinternet.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class KeyPressesPage {

    private WebDriver driver;
    private By inputField = By.id("target");
    private By resultText = By.id("result");

    /**
     * KeyPressesPage constructor.
     *
     * @param webDriver
     */
    public KeyPressesPage(final WebDriver webDriver) {
        this.driver = webDriver;
    }

    /**
     * Enters text on the field.
     * @param text
     */
    public void enterText(final String text) {
        driver.findElement(inputField).sendKeys(text);
    }

    /**
     * Enters pi character with multiple keys.
     */
    public void enterPi() {
        enterText(Keys.chord(Keys.SHIFT, "3") + "=#");
    }

    /**
     * Returns the result text.
     *
     * @return String
     */
    public String getResult() {
        return driver.findElement(resultText).getText();
    }
}
