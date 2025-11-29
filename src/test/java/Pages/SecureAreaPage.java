package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SecureAreaPage {
    WebDriver driver;
    public SecureAreaPage(WebDriver driver){
        this.driver=driver;
    }
    By successMessageLocator=By.id("flash");
    String expectedSuccessMessage="You logged into a secure area!";
    String expectedPageTitle="Secure Area";
    By pageTitleLocator=By.tagName("h2");
    public String getActualMessage(){
        return driver.findElement(successMessageLocator).getText();
    }
    public String getExpectedMessage(){
        return expectedSuccessMessage;
    }
    public String getPageTitle(){
        return driver.findElement(pageTitleLocator).getText();
    }
    public boolean pageTitleIsDisplayed(){
        return getPageTitle().contains(expectedPageTitle);
    }

}
