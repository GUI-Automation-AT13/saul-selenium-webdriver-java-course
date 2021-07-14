/**
 * Copyright (c) 2021 Fundacion Jala.
 * This software is the confidential and proprietary information of Fundacion Jala
 * ("Confidential Information"). You shall not disclose such Confidential
 * Information and shall use it only in accordance with the terms of the
 * license agreement you entered into with Fundacion Jala
 */

package contextMenu;

import base.BaseTests;
import org.testng.Assert;
import org.testng.annotations.Test;
import theinternet.pages.ContextMenuPage;

public class ContextMenuTest extends BaseTests {

    @Test
    public void testContextMenu() {
        ContextMenuPage contextMenuPage = homePage.clickContextMenu();
        contextMenuPage.ClickOnContextMenu();
        String message = contextMenuPage.getTextFromPopUp();
        contextMenuPage.clickOkInPopUp();
        Assert.assertEquals(message, "You selected a context menu", "Popup message incorrect");
    }
}
