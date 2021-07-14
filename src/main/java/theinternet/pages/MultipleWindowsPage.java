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

public class MultipleWindowsPage {

    private WebDriver driver;
    private By clickHereLink = By.linkText("Click Here");

    /**
     * MultipleWindowsPage constructor.
     * @param webDriver
     */
    public MultipleWindowsPage(final WebDriver webDriver) {
        this.driver = webDriver;
    }

    public void clickHere() {
        driver.findElement(clickHereLink).click();
    }
}