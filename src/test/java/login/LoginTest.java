/**
 * Copyright (c) 2021 Fundacion Jala.
 * This software is the confidential and proprietary information of Fundacion Jala
 * ("Confidential Information"). You shall not disclose such Confidential
 * Information and shall use it only in accordance with the terms of the
 * license agreement you entered into with Fundacion Jala
 */

package login;

import base.BaseTests;
import org.testng.Assert;
import org.testng.annotations.Test;
import theinternet.pages.LoginPage;
import theinternet.pages.SecureAreaPage;

public class LoginTest extends BaseTests {

    @Test
    public void testSuccessfulLogin() {
        LoginPage loginPage = homePage.clickFormAuthentication();
        loginPage.setUsername("tomsmith");
        loginPage.setPassword("SuperSecretPassword!");
        SecureAreaPage secureAreaPage = loginPage.clickLoginButton();
        secureAreaPage.getAlertText();
        Assert.assertTrue(secureAreaPage.getAlertText().contains("You logged into a secure area!"),
                "Alert text is incorrect");
    }
}
