package Tests;

import BaseTest.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AlertTest extends BaseTest {
    @Test
    public void ensureAlertSuccessful(){
    javaScriptAlertsPage= homePage.clickJavaScriptAlertLink();
javaScriptAlertsPage.clickAlert();
        Assert.assertTrue(javaScriptAlertsPage.getActualAlertMessage().contains(javaScriptAlertsPage.getExpectedAlertMessage()));
javaScriptAlertsPage.acceptAlert();
Assert.assertTrue(javaScriptAlertsPage.getActualResult().contains(javaScriptAlertsPage.getExpectedResult()));

    }
    @Test
    public void ensureConfirmSuccessful(){
        javaScriptAlertsPage= homePage.clickJavaScriptAlertLink();
        javaScriptAlertsPage.clickConfirm();
        Assert.assertTrue(javaScriptAlertsPage.getActualAlertMessage().contains(javaScriptAlertsPage.getExpectedConfirmMessage()));
        javaScriptAlertsPage.acceptAlert();
        //System.out.println(javaScriptAlertsPage.getActualResult());
        Assert.assertTrue(javaScriptAlertsPage.getActualResult().contains(javaScriptAlertsPage.getExpeectedResultofConfirm()));
        javaScriptAlertsPage.clickConfirm();
        javaScriptAlertsPage.cancleAlert();
        Assert.assertTrue(javaScriptAlertsPage.getActualResult().contains(javaScriptAlertsPage.getExpeectedResultofCancleConfirm()));
    }

    @Test
    public void ensurePromptSuccessful(){
        javaScriptAlertsPage= homePage.clickJavaScriptAlertLink();
        javaScriptAlertsPage.clickPrompt();
        Assert.assertTrue(javaScriptAlertsPage.getActualAlertMessage().contains(javaScriptAlertsPage.getExpectedPromptMessage()));
        javaScriptAlertsPage.sendPrompt("Hello I'm Ahmed");
        javaScriptAlertsPage.acceptAlert();
        Assert.assertTrue(javaScriptAlertsPage.getActualResult().contains(javaScriptAlertsPage.getExpectedMessagePrompt()));
    }
}
