/**
 * Copyright (c) 2021 Fundacion Jala.
 * This software is the confidential and proprietary information of Fundacion Jala
 * ("Confidential Information"). You shall not disclose such Confidential
 * Information and shall use it only in accordance with the terms of the
 * license agreement you entered into with Fundacion Jala
 */

package keys;

import base.BaseTests;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;

public class KeysTests extends BaseTests {

    @Test
    public void testBackspace() {
        var keyPage = homePage.clickKeyPresses();
        keyPage.enterText("A" + Keys.BACK_SPACE);
        Assert.assertEquals(keyPage.getResult(), "You entered: BACK_SPACE");
    }

    @Test
    public void testPi() {
        var keyPage = homePage.clickKeyPresses();
        keyPage.enterPi();
        Assert.assertEquals(keyPage.getResult(), "You entered: 3");
    }
}
