/**
 * Copyright (c) 2021 Fundacion Jala.
 * This software is the confidential and proprietary information of Fundacion Jala
 * ("Confidential Information"). You shall not disclose such Confidential
 * Information and shall use it only in accordance with the terms of the
 * license agreement you entered into with Fundacion Jala
 */

package javascript;

import base.BaseTests;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.List;

public class JavascriptTest extends BaseTests {

    @Test
    public void testScrollToTable() {
        homePage.clickLargeAndDeepDom().scrollToTable();
    }

    @Test
    public void testScrollToFifthParagraph() {
        homePage.clickInfiniteScroll().scrollToParagraph(5);
    }

    @Test
    public void testAddingMultipleAttributes() {
        var dropDownPage = homePage.clickDropDown();
        dropDownPage.addMultipleAttributesToElement();
        dropDownPage.selectFromDropDown("Option 1");
        dropDownPage.selectFromDropDown("Option 2");
        var selectedOptions = dropDownPage.getSelectedOptions();
        Assert.assertTrue(selectedOptions.get(0).equals("Option 1"));
        Assert.assertTrue(selectedOptions.get(1).equals("Option 2"));
        Assert.assertEquals(selectedOptions.size(), 2);
    }
}
