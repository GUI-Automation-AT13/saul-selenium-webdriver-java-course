/**
 * Copyright (c) 2021 Fundacion Jala.
 * This software is the confidential and proprietary information of Fundacion Jala
 * ("Confidential Information"). You shall not disclose such Confidential
 * Information and shall use it only in accordance with the terms of the
 * license agreement you entered into with Fundacion Jala
 */

package dropdown;

import base.BaseTests;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DropdownTest extends BaseTests {

    @Test
    public void testSelectOption() {
        var dropDownPage = homePage.clickDropDown();
        String option = "Option 1";
        dropDownPage.selectFromDropDown(option);
        var selectedOption = dropDownPage.getSelectedOptions();
        Assert.assertEquals(selectedOption.size(), 1, "Incorrect number of selections");
        Assert.assertTrue(selectedOption.contains(option));
    }
}
