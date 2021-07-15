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

public class AlertsPage {

    private WebDriver driver;
    private By triggerAlertButton = By.xpath(".//button[text()='Click for JS Alert']");
    private By triggerConfirmButton = By.xpath(".//button[text()='Click for JS Confirm']");
    private By triggerPromptButton = By.xpath(".//button[text()='Click for JS Prompt']");
    private By results = By.id("result");

    /**
     * AlertsPage constructor.
     *
     * @param driver
     */
    public AlertsPage(final WebDriver driver) {
        this.driver = driver;
    }

    /**
     * Clicks triggerALertButton.
     */
    public void triggerAlert() {
        driver.findElement(triggerAlertButton).click();
    }

    /**
     * Clicks triggerConfirmButton.
     */
    public void triggerConfirm() {
        driver.findElement(triggerConfirmButton).click();
    }

    /**
     * Clicks triggerPromptButton.
     */
    public void triggerPrompt() {
        driver.findElement(triggerPromptButton).click();
    }

    /**
     * Click to accept.
     */
    public void alertClickToAccept() {
        driver.switchTo().alert().accept();
    }

    /**
     * Click to dismoss.
     */
    public void alertClickToDismiss() {
        driver.switchTo().alert().dismiss();
    }

    /**
     * Get alert text.
     * @return
     */
    public String alertGetText() {
        return driver.switchTo().alert().getText();
    }

    /**
     * Sends keys to alert input.
     * @param text
     */
    public void alertSetInput(final String text) {
        driver.switchTo().alert().sendKeys(text);
    }

    /**
     * Gets text of result.
     * @return
     */
    public String getResult() {
        return driver.findElement(results).getText();
    }
}
