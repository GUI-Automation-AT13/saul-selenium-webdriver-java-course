/**
 * Copyright (c) 2021 Fundacion Jala.
 * This software is the confidential and proprietary information of Fundacion Jala
 * ("Confidential Information"). You shall not disclose such Confidential
 * Information and shall use it only in accordance with the terms of the
 * license agreement you entered into with Fundacion Jala
 */

package keys;

import base.BaseTests;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SliderKeysTest extends BaseTests {

    @Test
    public void testBackspace() {
        var horizontalSliderPage = homePage.clickHorizontalSlider();
        for (int i = 0; i < 8; i++) {
            horizontalSliderPage.sendKeyArrowRight();
        }
        Assert.assertEquals(horizontalSliderPage.getResult(), "4");
    }
}
