package Tests;

import BaseTest.BaseTest;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AddRemoveTest extends BaseTest {
    private int numDeleteButtons=10;
    private int numClickDelete=6;
    @Test
    public void ensureAddRemoveElement(){
        addRemoveElementsPage=homePage.clickAddRemoveLink();
        addRemoveElementsPage.clickAddRemoveElement(numDeleteButtons);
        Assert.assertEquals(addRemoveElementsPage.getNumberofDeleteButtons(),numDeleteButtons,"does not match");
        addRemoveElementsPage.clickDeleteButton(numClickDelete);
        Assert.assertEquals(addRemoveElementsPage.getNumberofDeleteButtons(),numDeleteButtons-numClickDelete,"does not match");

    }


}
