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

public class DynamicLoadingPage {

    private WebDriver driver;
    private String linkXpath_Format = ".//a[contains(text(), '%s')]";
    private By link_Example1 = By.xpath(String.format(linkXpath_Format, "Example 1"));
    private By link_Example2 = By.xpath(String.format(linkXpath_Format, "Example 2"));

    /**
     * DynamicLoadingPage constructor.
     *
     * @param webDriver
     */
    public DynamicLoadingPage(final WebDriver webDriver) {
        this.driver = webDriver;
    }

    public DynamicLoadingExample1Page clickExample1() {
        driver.findElement(link_Example1).click();
        return new DynamicLoadingExample1Page(driver);
    }

    public DynamicLoadingExample2Page clickExample2() {
        driver.findElement(link_Example2).click();
        return new DynamicLoadingExample2Page(driver);
    }

    public DynamicLoadingExample2Page rightClickOnExample2Link() {
        driver.findElement(link_Example2).sendKeys(Keys.CONTROL, Keys.RETURN);
        return new DynamicLoadingExample2Page(driver);
    }
}