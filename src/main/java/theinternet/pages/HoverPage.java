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

public class HoverPage {

    private WebDriver driver;
    private By figureBox = By.className("figure");
    private By boxCaption = By.className("figcaption");

    /**
     * HoverPage constructor.
     *
     * @param webDriver
     */
    public HoverPage(final WebDriver webDriver) {
        this.driver = webDriver;
    }

    /**
     * Hovers to the specified figure.
     * @param index starts at 1
     * @return FigureCaption
     */
    public FigureCaption hoverOverFigure(final int index) {
        WebElement figure = driver.findElements(figureBox)
                .get(index - 1);
        Actions action = new Actions(driver);
        action.moveToElement(figure).perform();
        return new FigureCaption(figure.findElement(boxCaption));
    }

    /**
     * Inner class FigureCaption.
     */
    public class FigureCaption {

        private WebElement caption;
        private By header = By.tagName("h5");
        private By link = By.tagName("a");

        /**
         * FigureCaption constructor.
         * @param captionElement
         */
        public FigureCaption(final WebElement captionElement) {
            this.caption = captionElement;
        }

        /**
         * Checks if the caption is displayed.
         * @return boolean
         */
        public boolean isCaptionDisplayed() {
            return caption.isDisplayed();
        }

        /**
         * Returns the title.
         * @return String
         */
        public String getTitle() {
            return caption.findElement(header).getText();
        }

        /**
         * Returns the link.
         * @return String
         */
        public String getLink() {
            return caption.findElement(link).getAttribute("href");
        }

        /**
         * Gets the link text.
         * @return String
         */
        public String getLinkText() {
            return caption.findElement(link).getText();
        }
    }
}
