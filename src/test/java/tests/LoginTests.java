package tests;

import helpers.SeleniumHelpers;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LoginPage;

public class LoginTests extends BaseTest{
    LoginPage login = new LoginPage();
    @Test
    public void verifySuccessfulLogin() {
        login.enterEmail("natesimonoska@gmail.com");
        login.enterPassword("qabrainster123");
        login.clickLoginButton();

        String expectedUrl = "https://qainterrapt.brainster.xyz/dashboard";
        String actualUrl = SeleniumHelpers.driver.getCurrentUrl();
        Assert.assertEquals(actualUrl, expectedUrl);
    }
    @Test
    public void verifyUnsuccessfulLogin() {
        login.enterEmail("nate@@gmail.com");
        login.enterPassword("abv");
        login.clickLoginButton();

        String expectedUrl = "https://qainterrapt.brainster.xyz/login";
        String actualUrl = SeleniumHelpers.driver.getCurrentUrl();
        Assert.assertEquals(actualUrl, expectedUrl);
    }
    @Test
    public void verifyLoginWithoutData () {
        login.enterEmail("");
        login.enterPassword("");
        login.clickLoginButton();

        String expectedUrl = "https://qainterrapt.brainster.xyz/login";
        String actualUrl = SeleniumHelpers.driver.getCurrentUrl();
        Assert.assertEquals(actualUrl, expectedUrl);
    }
    @Test
    public void verifySuccessfullyLogOut () throws InterruptedException {
        login.logIN("natesimonoska@gmail.com", "qabrainster123");
        Thread.sleep(3000);
        login.clickMenuButton();
        Thread.sleep(3000);
        login.clickLogOutButton();

        String expectedUrl = "https://qainterrapt.brainster.xyz/login";
        String actualUrl = SeleniumHelpers.driver.getCurrentUrl();
        Assert.assertEquals(expectedUrl,actualUrl);
    }

}
