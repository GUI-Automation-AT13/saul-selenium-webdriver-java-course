/**
 * Copyright (c) 2021 Fundacion Jala.
 * This software is the confidential and proprietary information of Fundacion Jala
 * ("Confidential Information"). You shall not disclose such Confidential
 * Information and shall use it only in accordance with the terms of the
 * license agreement you entered into with Fundacion Jala
 */


package alerts;

import base.BaseTests;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FileUploadTests extends BaseTests {

    @Test
    public void testFileUpload(){
        var uploadPage = homePage.clickFileUpload();
        uploadPage.uploadFile(System.getProperty("user.dir") + "/resources/chromedriver.exe");
        Assert.assertEquals(uploadPage.getUploadedFiles(), "chromedriver.exe", "Uploaded files incorrect");
    }
}