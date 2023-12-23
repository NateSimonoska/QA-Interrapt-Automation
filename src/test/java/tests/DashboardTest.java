package tests;

import helpers.SeleniumHelpers;
import org.junit.Assert;
import org.testng.annotations.Test;
import pages.DashboardPage;
import pages.LoginPage;

public class DashboardTest extends BaseTest {
    DashboardPage dashboard = new DashboardPage();
    LoginPage login = new LoginPage();

    @Test
    public void verifyAutomationTestingLink(){
        login.logIN("natesimonoska@gmail.com", "qabrainster123");
        dashboard.clickAutomationTestingLink();

        String expectedUrl = "https://qainterrapt.brainster.xyz/webinars/55";
        String actualUrl = SeleniumHelpers.driver.getCurrentUrl();
        Assert.assertEquals(actualUrl, expectedUrl);
    }
}
