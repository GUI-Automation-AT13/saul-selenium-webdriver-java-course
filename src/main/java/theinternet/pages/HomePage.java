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

public class HomePage {

    private WebDriver driver;

    /**
     * HomePage constructor.
     *
     * @param webDriver
     */
    public HomePage(final WebDriver webDriver) {
        this.driver = webDriver;
    }

    /**
     * Clicks the option for formAuthentication link.
     *
     * @return LoginPage
     */
    public LoginPage clickFormAuthentication() {
        clickLink("Form Authentication");
        return new LoginPage(driver);
    }

    /**
     * Clicks the dropDown link.
     *
     * @return DropdownPage
     */
    public DropdownPage clickDropDown() {
        clickLink("Dropdown");
        return new DropdownPage(driver);
    }

    /**
     * Clicks on the Hovers link.
     *
     * @return HoverPage
     */
    public HoverPage clickHovers() {
        clickLink("Hovers");
        return new HoverPage(driver);
    }

    /**
     * Clicks on the KeyPresses link.
     *
     * @return KeyPressesPAge
     */
    public KeyPressesPage clickKeyPresses() {
        clickLink("Key Presses");
        return new KeyPressesPage(driver);
    }

    /**
     * Clicks on the horizontal slider link.
     *
     * @return KeyPressesPAge
     */
    public HorizontalSliderPage clickHorizontalSlider() {
        clickLink("Horizontal Slider");
        return new HorizontalSliderPage(driver);
    }

    /**
     * Clicks on the Javascript alerts link.
     *
     * @return AlertsPage
     */
    public AlertsPage clickJavaScriptAlerts() {
        clickLink("JavaScript Alerts");
        return new AlertsPage(driver);
    }

    /**
     * Clicks on the File Upload link.
     *
     * @return FileUpload
     */
    public FileUploadPage clickFileUpload() {
        clickLink("File Upload");
        return new FileUploadPage(driver);
    }

    /**
     * Clicks on the link.
     *
     * @return FileUpload
     */
    public ContextMenuPage clickContextMenu() {
        clickLink("Context Menu");
        return new ContextMenuPage(driver);
    }

    /**
     * Clicks on the link.
     *
     * @return ysiwygEditorPage
     */
    public WysiwygEditorPage clickWysiwygEditor() {
        clickLink("WYSIWYG Editor");
        return new WysiwygEditorPage(driver);
    }

    /**
     * Clicks on the link.
     *
     * @return DynamicLoadingPage
     */
    public DynamicLoadingPage clickDynamicLoading() {
        clickLink("Dynamic Loading");
        return new DynamicLoadingPage(driver);
    }

    /**
     * Clicks on the link.
     *
     * @return LargeAndDeepDomPage
     */
    public LargeAndDeepDomPage clickLargeAndDeepDom() {
        clickLink("Large & Deep DOM");
        return new LargeAndDeepDomPage(driver);
    }

    /**
     * Clicks on the link.
     *
     * @return InfiniteScrollPage
     */
    public InfiniteScrollPage clickInfiniteScroll() {
        clickLink("Infinite Scroll");
        return new InfiniteScrollPage(driver);
    }

    /**
     * clicks on the link.
     *
     * @return MultipleWindowsPage
     */
    public MultipleWindowsPage clickMultipleWindows() {
        clickLink("Multiple Windows");
        return new MultipleWindowsPage(driver);
    }

    /**
     * Clicks a link with the given linktext.
     *
     * @param linkText
     */
    public void clickLink(final String linkText) {
        driver.findElement(By.linkText(linkText)).click();
    }
}
