package Pages.Dynamic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Ex1Page {
    WebDriver driver;
    WebDriverWait wait;
    public Ex1Page(WebDriver driver){
        this.driver=driver;
        wait=new WebDriverWait(this.driver, Duration.ofSeconds(20));
    }
    By loadingLocator=By.id("loading");
    By startButtonLocator=By.xpath("//button[contains(text(),'Start')]");
    By resultTextLocator=By.xpath("//h4[contains(text(),'Hello World!')]");
    public void clickStart(){
        driver.findElement(startButtonLocator).click();
    }
public String getActualResultText(){
return wait.until(ExpectedConditions.visibilityOf(driver.findElement(resultTextLocator))).getText();
}
public boolean loadingDisplayed(){
        return wait.until(ExpectedConditions.visibilityOf(driver.findElement(loadingLocator))).isDisplayed();
}

}
