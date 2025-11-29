package Pages.Dynamic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DynamicLoadingPage {
    WebDriver driver;
    public DynamicLoadingPage(WebDriver driver){
        this.driver=driver;
    }
By Ex1Locator=By.partialLinkText("Example 1");
By Ex2Locator=By.partialLinkText("Example 2");
    public Ex1Page clickEx1Link(){
        driver.findElement(Ex1Locator).click();
        return new Ex1Page(driver);
    }
}
