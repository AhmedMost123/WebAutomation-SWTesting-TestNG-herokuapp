package Pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class JavaScriptAlertsPage {
    WebDriver driver;
    public JavaScriptAlertsPage(WebDriver driver){
        this.driver=driver;
    }
    By JSAlertLocator=By.xpath("//button[@onclick='jsAlert()']");
    By JSConfirmLocator=By.xpath("//button[@onclick='jsConfirm()']");
    By JSPromptLocator=By.xpath("//button[@onclick='jsPrompt()']");
    By actualresultLocator=By.id("result");
    String expectedAlertMessage="I am a JS Alert";
    String expectedResultOfAlert = "You successfully clicked an alert";
    String expeectedResultofOkConfirm="You clicked: Ok";
    String expeectedResultofCancleConfirm="You clicked: Cancel";
    String expeectedResultofPromptOk="You entered: Hello I'm Ahmed";
    String expectedConfirmMessage="I am a JS Confirm";
    String expectedPromptMessage="I am a JS prompt";
    public void clickAlert(){
    driver.findElement(JSAlertLocator).click();

}
public void clickConfirm(){
        driver.findElement(JSConfirmLocator).click();
}
public void clickPrompt(){
        driver.findElement(JSPromptLocator).click();
}
public Alert getAlert(){
        return driver.switchTo().alert();
}

public String getActualAlertMessage(){
        return getAlert().getText();
}
public void acceptAlert(){
        getAlert().accept();
}
public void cancleAlert(){
        getAlert().dismiss();
}
public String getExpectedAlertMessage(){
        return expectedAlertMessage;
}
public String getActualResult(){
        return driver.findElement(actualresultLocator).getText();
}
public String getExpectedResult(){
        return expectedResultOfAlert;
}

public String getExpectedConfirmMessage(){
    return  expectedConfirmMessage;
}
public String getExpeectedResultofConfirm(){
        return expeectedResultofOkConfirm;
}
public String getExpeectedResultofCancleConfirm(){
        return expeectedResultofCancleConfirm;
}
public String getExpectedPromptMessage(){
    return expectedPromptMessage;
}
public void sendPrompt(String prompt){
        getAlert().sendKeys(prompt);
    }
    public String getExpectedMessagePrompt(){
        return expeectedResultofPromptOk;
    }

}
