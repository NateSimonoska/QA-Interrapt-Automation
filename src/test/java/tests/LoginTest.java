package tests;

import helpers.SeleniumHelpers;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LoginPage;

public class LoginTest extends BaseTest{
    LoginPage login = new LoginPage();
    @Test (priority = 1)
    public void verifySuccessfulLogin() {
        login.enterEmail("natesimonoska@gmail.com");
        login.enterPassword("qabrainster123");
        login.clickLoginButton();

        String expectedUrl = "https://qainterrapt.brainster.xyz/dashboard";
        String actualUrl = SeleniumHelpers.driver.getCurrentUrl();
        Assert.assertEquals(actualUrl, expectedUrl);
    }
    @Test (priority = 2)
    public void verifyUnsuccessfulLogin() {
        login.enterEmail("nate@@gmail.com");
        login.enterPassword("abv");
        login.clickLoginButton();

        String expectedUrl = "https://qainterrapt.brainster.xyz/login";
        String actualUrl = SeleniumHelpers.driver.getCurrentUrl();
        Assert.assertEquals(actualUrl, expectedUrl);
    }
    @Test (priority = 3)
    public void verifyLoginWithoutData () {
        login.enterEmail("");
        login.enterPassword("");
        login.clickLoginButton();

        String expectedUrl = "https://qainterrapt.brainster.xyz/login";
        String actualUrl = SeleniumHelpers.driver.getCurrentUrl();
        Assert.assertEquals(actualUrl, expectedUrl);
    }
    @Test (priority = 4)
    public void verifySuccessfullyLogOut () throws InterruptedException {
        login.logIN("natesimonoska@gmail.com", "qabrainster123");
        Thread.sleep(2000);
        login.clickMenuButton();
        Thread.sleep(3000);
        login.clickLogOutButton();

        String expectedUrl = "https://qainterrapt.brainster.xyz/login";
        String actualUrl = SeleniumHelpers.driver.getCurrentUrl();
        Assert.assertEquals(expectedUrl,actualUrl);
    }
}
