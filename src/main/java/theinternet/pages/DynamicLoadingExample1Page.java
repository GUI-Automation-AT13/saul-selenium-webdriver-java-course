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
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DynamicLoadingExample1Page {

    private WebDriver driver;
    private By startButton = By.cssSelector("#start button");
    private By loadingIndicator = By.id("loading");
    private By loadedText = By.id("finish");

    /**
     * DynamicLoadingExample1Page constructor.
     *
     * @param webDriver
     */
    public DynamicLoadingExample1Page(final WebDriver webDriver) {
        this.driver = webDriver;
    }

    public void clickStart() {
        driver.findElement(startButton).click();
        WebDriverWait wait = new WebDriverWait(driver, 5);
        wait.until(ExpectedConditions.invisibilityOf(
                driver.findElement(loadingIndicator)));
//        FluentWait wait = new FluentWait(driver)
//                .withTimeout(Duration.ofSeconds(5))
//                .pollingEvery(Duration.ofSeconds(1))
//                .ignoring(NoSuchElementException.class);
//        wait.until(ExpectedConditions.invisibilityOf(
//                driver.findElement(loadingIndicator)));

    }

    public String getLoadedText() {
        return driver.findElement(loadedText).getText();
    }
}