package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
WebDriver driver;
public HomePage(WebDriver driver){
    this.driver=driver;
}
    By formAuthLocator=By.linkText("Form Authentication");
    By addRemoveLocator=By.linkText("Add/Remove Elements");
    By checkboxLocator=By.linkText("Checkboxes");
    By javascriptAlertsLocator=By.linkText("JavaScript Alerts");
    By dropdownLocator=By.linkText("Dropdown");
    public LoginPage clickFormAuth(){
        driver.findElement(formAuthLocator).click();
        return new LoginPage(driver);
    }
    public AddRemoveElementsPage clickAddRemoveLink(){
        driver.findElement(addRemoveLocator).click();
        return new AddRemoveElementsPage(driver);
    }
    public CheckboxPage clickCheckboxLink(){
        driver.findElement(checkboxLocator).click();
        return new CheckboxPage(driver);
    }
    public JavaScriptAlertsPage clickJavaScriptAlertLink(){
        driver.findElement(javascriptAlertsLocator).click();
        return new JavaScriptAlertsPage(driver);
    }
 public DropdownPage clickDropdownLink(){
        driver.findElement(dropdownLocator).click();
        return new DropdownPage(driver);
    }


}
