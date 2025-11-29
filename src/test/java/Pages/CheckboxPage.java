package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckboxPage {
    WebDriver driver;
    public CheckboxPage(WebDriver driver){
        this.driver=driver;
    }
    By checkBoxOneLocator = By.xpath("//input[@type='checkbox'][1]");
    By checkBoxTwoLocator = By.xpath("//input[@type='checkbox'][2]");

    public void clickOnCheckBoxOne(){
        driver.findElement(checkBoxOneLocator).click();
    }

    public void clickOnCheckBoxTwo(){
        driver.findElement(checkBoxTwoLocator).click();
    }

    public boolean checkBoxOneIsSelected(){
        return driver.findElement(checkBoxOneLocator).isSelected();
    }

    public boolean checkBoxTwoIsSelected(){
        return driver.findElement(checkBoxTwoLocator).isSelected();
    }

}
