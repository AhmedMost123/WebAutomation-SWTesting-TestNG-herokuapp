package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
WebDriver driver;
public LoginPage(WebDriver driver){
    this.driver=driver;
}
By usernameTextBoxLocator=By.id("username");
By passwordTextBoxLocator=By.id("password");
By loginButtonLocator=By.xpath("//i[@class='fa fa-2x fa-sign-in']");
By actualErrorMessage=By.xpath("//div[@class='flash error']");
String expectedErrorMessage="invalid!";

public void setUsername(String email){
    driver.findElement(usernameTextBoxLocator).sendKeys(email);
}
    public void setPassword(String password){
        driver.findElement(passwordTextBoxLocator).sendKeys(password);
    }
    public SecureAreaPage clickLoginButton(){
    driver.findElement(loginButtonLocator).click();
    return new SecureAreaPage(driver);
    }
    public String GetErrorMessage(){
        return driver.findElement(actualErrorMessage).getText();
    }
    public boolean errorMessageShown(){
    return GetErrorMessage().contains(expectedErrorMessage);
    }

}
