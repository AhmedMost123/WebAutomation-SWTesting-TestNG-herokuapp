package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class WaitClass {

    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://the-internet.herokuapp.com/");

        //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(20));
        driver.findElement(By.linkText("Dynamic Loading")).click();
        driver.findElement(By.partialLinkText("Example 1")).click();
        driver.findElement(By.xpath("//button[contains(text(),'Start')]")).click();
        String result=wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//h4[contains(text(),'Hello World!')]")))).getText();


        Assert.assertEquals(result,"Hello World!");
driver.quit();
    }}
// implicit wait -> generic across all find element
// explicit wait -> specific for a conditionit wait: specific for a certien condition