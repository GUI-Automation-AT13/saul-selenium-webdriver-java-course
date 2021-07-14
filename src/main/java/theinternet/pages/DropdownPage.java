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
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.stream.Collectors;

public class DropdownPage {

    private WebDriver driver;
    private By dropdown = By.id("dropdown");

    /**
     * DropdownPage constructor.
     *
     * @param webDriver
     */
    public DropdownPage(final WebDriver webDriver) {
        this.driver = webDriver;
    }

    /**
     * Selects the dropDown link.
     *
     * @param option
     */
    public void selectFromDropDown(final String option) {
        findDropDownElement().selectByVisibleText(option);
    }

    /**
     * Gets the selected options.
     *
     * @return String
     */
    public List<String> getSelectedOptions() {
        List<WebElement> selectedElements =
                findDropDownElement().getAllSelectedOptions();
        return selectedElements.stream().map(e -> e.getText()).collect(Collectors.toList());
    }

    /**
     * Returns a dropdown element.
     *
     * @return Select
     */
    private Select findDropDownElement() {
        return new Select(driver.findElement(dropdown));
    }

    /**
     * Add multiple attribute to the element.
     */
    public void addMultipleAttributesToElement() {
        String js = "arguments[0].setAttribute('multiple','')";
        var jsExecutor = (JavascriptExecutor) driver;
        jsExecutor.executeScript(js, findDropDownElement());
    }
}
