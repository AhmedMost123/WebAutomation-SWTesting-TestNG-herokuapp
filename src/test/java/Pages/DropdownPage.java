package Pages;

import BaseTest.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class DropdownPage extends BaseTest {
    WebDriver driver;
    By dropdownLocator=By.id("dropdown");
    Select select;
    WebElement dropdownElement;
    public DropdownPage (WebDriver driver){
        this.driver=driver;
        dropdownElement= driver.findElement(dropdownLocator);
        select =new Select(dropdownElement);
    }


    public void selectOptionByText(String option){
        select.selectByVisibleText(option);
    }
    public void selectOptionByIndex(int index){
        select.selectByIndex(index);
    }
    public void selectOptionByValue(String index){
        select.selectByValue(index);
    }
    public boolean optionIsSelected(String option){
        return driver.findElement(By.xpath("//option[contains(text(),'"+option+"')]")).isSelected();
    }
}
