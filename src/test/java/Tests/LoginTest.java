package Tests;
//tomsmith
//SuperSecretPassword!
import BaseTest.BaseTest;
import Pages.HomePage;
import Pages.LoginPage;
import com.beust.ah.A;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


public class LoginTest extends BaseTest {
    @DataProvider(name="loginData")
    public Object[][] dataProvider() {
        return new Object[][] {
                {"tomsmith","SuperSecretPassword!",true},
                {"tomsmith","invalid",false},
                {"invalid","SuperSecretPassword!",false},
                {"invalid","!",false}

        };
    }

    @Test(dataProvider = "loginData")
    public void ensureLoginValidation(String username,String password,boolean valid){
    loginPage=homePage.clickFormAuth();
    loginPage.setUsername(username);
    loginPage.setPassword(password);

     if(valid){
         secureAreaPage=loginPage.clickLoginButton();
        Assert.assertTrue(secureAreaPage.getActualMessage().contains(secureAreaPage.getExpectedMessage()));
        Assert.assertTrue(secureAreaPage.pageTitleIsDisplayed());
    }else {
         loginPage.clickLoginButton();
         Assert.assertTrue(loginPage.errorMessageShown());
     }

    }

}
