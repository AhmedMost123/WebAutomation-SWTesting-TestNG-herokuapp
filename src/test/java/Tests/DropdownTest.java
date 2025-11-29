package Tests;

import BaseTest.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DropdownTest extends BaseTest {
    @Test
    public void ensureSelectByText(){
        dropdownPage=homePage.clickDropdownLink();
        dropdownPage.selectOptionByText("Option 1");
        Assert.assertTrue(dropdownPage.optionIsSelected("Option 1"));
    }
    @Test
    public void ensureSelectByindex(){
        dropdownPage=homePage.clickDropdownLink();
        dropdownPage.selectOptionByIndex(1);
        Assert.assertTrue(dropdownPage.optionIsSelected("Option 1"));
    }
    @Test
    public void ensureSelectByValue(){
        dropdownPage=homePage.clickDropdownLink();
        dropdownPage.selectOptionByValue("1");
        Assert.assertTrue(dropdownPage.optionIsSelected("Option 1"));
    }
}
