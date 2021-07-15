/**
 * Copyright (c) 2021 Fundacion Jala.
 * This software is the confidential and proprietary information of Fundacion Jala
 * ("Confidential Information"). You shall not disclose such Confidential
 * Information and shall use it only in accordance with the terms of the
 * license agreement you entered into with Fundacion Jala
 */

package theinternet.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LargeAndDeepDomPage {

    private WebDriver driver;
    private By table = By.id("large-table");

    /**
     * LargeAndDeepDomPage constructor.
     *
     * @param driver
     */
    public LargeAndDeepDomPage(final WebDriver driver) {
        this.driver = driver;
    }

    public void scrollToTable() {
        WebElement tableElement = driver.findElement(table);
        String script = "arguments[0].scrollIntoView();";
        ((JavascriptExecutor) driver).executeScript(script, tableElement);
    }
}
