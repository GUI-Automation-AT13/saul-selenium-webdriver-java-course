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
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class ContextMenuPage {

    private WebDriver driver;
    private By contextMenu = By.id("hot-spot");

    /**
     * ContextMenuPage constructor.
     *
     * @param webdriver
     */
    public ContextMenuPage(final WebDriver webdriver) {
        this.driver = webdriver;
    }

    public void ClickOnContextMenu() {
        driver.findElements(contextMenu);
        WebElement cMenu = driver.findElement(contextMenu);
        Actions action = new Actions(driver);
        action.contextClick(cMenu).perform();
    }

    public String getTextFromPopUp() {
        String text = driver.switchTo().alert().getText();
        return text;
    }

    public void clickOkInPopUp() {
        driver.switchTo().alert().accept();
    }
}
