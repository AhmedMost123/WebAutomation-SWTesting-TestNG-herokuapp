package Tests;

import BaseTest.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CheckBoxTest extends BaseTest {
    @Test
    public void ensureCheckBoxOneIsSelected(){
        checkboxPage = homePage.clickCheckboxLink();
        if (checkboxPage.checkBoxOneIsSelected()){
            System.out.println("CheckBox One is selected");
        }else {
            checkboxPage.clickOnCheckBoxOne();
        }
        Assert.assertTrue(checkboxPage.checkBoxOneIsSelected());
    }
    @Test
    public void ensureCheckboxTwoSelected(){
        checkboxPage=homePage.clickCheckboxLink();
       Assert.assertTrue(checkboxPage.checkBoxTwoIsSelected());
    }
@Test
    public void ensureCheckboxOneNotSelected(){
    checkboxPage=homePage.clickCheckboxLink();
    Assert.assertFalse(checkboxPage.checkBoxOneIsSelected());
}

}
