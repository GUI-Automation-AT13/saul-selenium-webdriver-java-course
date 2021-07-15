/**
 * Copyright (c) 2021 Fundacion Jala.
 * This software is the confidential and proprietary information of Fundacion Jala
 * ("Confidential Information"). You shall not disclose such Confidential
 * Information and shall use it only in accordance with the terms of the
 * license agreement you entered into with Fundacion Jala
 */

package frames;

import base.BaseTests;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FrameTest extends BaseTests {

    @Test
    public void testWysiwyg() {
        var editorPage = homePage.clickWysiwygEditor();
        editorPage.clearTextArea();
        String text1 = "hello ";
        String text2 = "world";
        editorPage.setTextArea(text1);
        editorPage.decreaseIndentation();
        editorPage.setTextArea(text2);

        Assert.assertEquals(editorPage.getTextFromEditor(), text1 + text2, "Text from editor is incorrect");
    }
}