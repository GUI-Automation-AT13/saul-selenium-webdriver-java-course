/**
 * Copyright (c) 2021 Fundacion Jala.
 * This software is the confidential and proprietary information of Fundacion Jala
 * ("Confidential Information"). You shall not disclose such Confidential
 * Information and shall use it only in accordance with the terms of the
 * license agreement you entered into with Fundacion Jala
 */

package windows;

import base.BaseTests;
import org.testng.Assert;
import org.testng.annotations.Test;

public class WindowTest extends BaseTests {

    @Test
    public void testWindowTabs() {
        var buttonPage = homePage.clickDynamicLoading().rightClickOnExample2Link();
        getWindowManager().switchTab();
        Assert.assertFalse(buttonPage.isStartButtonDisplayed(), "Start button is not displayed");
    }
}
