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

public class HorizontalSliderPage {
    private WebDriver driver;
    private By slider = By.cssSelector("[type=range]");
    private By resultText = By.id("range");

    /**
     * KeyPressesPage constructor.
     *
     * @param webDriver
     */
    public HorizontalSliderPage(final WebDriver webDriver) {
        this.driver = webDriver;
    }

    /**
     * Sends the right arrow key.
     */
    public void sendKeyArrowRight() {
        driver.findElement(slider).sendKeys(Keys.ARROW_RIGHT);
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
