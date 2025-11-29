package BaseTest;

import Pages.*;
import Pages.Dynamic.Ex1Page;
import Pages.Dynamic.Ex2Page;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest {
    protected WebDriver driver;
    protected HomePage homePage;
    protected LoginPage loginPage;
    protected SecureAreaPage secureAreaPage;
    protected AddRemoveElementsPage addRemoveElementsPage;
    protected CheckboxPage checkboxPage;
    protected JavaScriptAlertsPage javaScriptAlertsPage;
    protected DropdownPage dropdownPage;
    protected Ex1Page ex1Page;
    protected Ex2Page ex2Page;

    @BeforeMethod
    public void setup(){
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://the-internet.herokuapp.com/");
        homePage=new HomePage(driver);
    }
    @AfterMethod
    public void teardown(){
        driver.quit();
    }
}
