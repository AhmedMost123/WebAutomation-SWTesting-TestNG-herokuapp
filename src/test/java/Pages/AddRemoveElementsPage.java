package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class AddRemoveElementsPage {
    WebDriver driver;
    public  AddRemoveElementsPage(WebDriver driver){
        this.driver=driver;
    }
    By addRemoveElementLocator=By.xpath("//button[text()='Add Element']");
    By deleteElementLocator = By.xpath("//button[contains(text(),'Delete')]");

    public void clickAddRemoveElement(int times){
        for(int i=0;i<times;i++){
            driver.findElement(addRemoveElementLocator).click();
        }
    }
    public void clickDeleteButton(int times){
List<WebElement> deleteButtons=driver.findElements(deleteElementLocator);
int numDeleteButtons=deleteButtons.size();
if(times<=numDeleteButtons){
for(int i=0;i<times;i++){
    deleteButtons.get(i).click();
}
}
    }
public int getNumberofDeleteButtons(){
List<WebElement> deleteButtons=driver.findElements(deleteElementLocator);
return deleteButtons.size();
    //return driver.findElements(deleteElementLocator).size();
}
    





}
