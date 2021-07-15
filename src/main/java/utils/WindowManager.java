/**
 * Copyright (c) 2021 Fundacion Jala.
 * This software is the confidential and proprietary information of Fundacion Jala
 * ("Confidential Information"). You shall not disclose such Confidential
 * Information and shall use it only in accordance with the terms of the
 * license agreement you entered into with Fundacion Jala
 */

package utils;

import org.openqa.selenium.WebDriver;

public class WindowManager {

    private WebDriver driver;
    private WebDriver.Navigation navigate;

    /**
     * WindowManager constructor.
     *
     * @param webDriver
     */
    public WindowManager(final WebDriver webDriver) {
        this.driver = webDriver;
        navigate = driver.navigate();
    }

    public void goBack() {
        navigate.back();
    }

    public void goForward() {
        navigate.forward();
    }

    public void refreshPage() {
        navigate.refresh();
    }

    public void goTo(String url) {
        navigate.to(url);
    }

    public void switchToTab(String tabTitle) {
        var windows = driver.getWindowHandles();

        System.out.println("Number of tabs: " + windows.size());

        System.out.println("Window handles:");
        windows.forEach(System.out::println);

        for (String window : windows) {
            System.out.println("Switching to window: " + window);
            driver.switchTo().window(window);

            System.out.println("Current window title: " + driver.getTitle());

            if (tabTitle.equals(driver.getTitle())) {
                break;
            }
        }
    }

    public void switchTab() {
        var windows = driver.getWindowHandles();
        windows.forEach(driver.switchTo()::window);
    }
}
