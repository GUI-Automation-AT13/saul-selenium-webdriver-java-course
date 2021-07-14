/**
 * Copyright (c) 2021 Fundacion Jala.
 * This software is the confidential and proprietary information of Fundacion Jala
 * ("Confidential Information"). You shall not disclose such Confidential
 * Information and shall use it only in accordance with the terms of the
 * license agreement you entered into with Fundacion Jala
 */

package hover;

import base.BaseTests;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HoverTest extends BaseTests {

    @Test
    public void testHoverUser1() {
        var hoverPage = homePage.clickHovers();
        var caption = hoverPage.hoverOverFigure(1);
        Assert.assertTrue(caption.isCaptionDisplayed(),
                "Caption not displayed");
        Assert.assertEquals(caption.getTitle(),
                "name: user1", "Caption title incorrect");
        Assert.assertEquals(caption.getLinkText(),
                "View profile", "Caption link is incorrect");
        Assert.assertTrue(caption.getLink().endsWith("/users/1"), "Link incorrect");
    }
}
