package tests;

import helpers.SeleniumHelpers;
import org.junit.Assert;
import org.testng.annotations.Test;
import pages.DashboardPage;
import pages.LoginPage;

public class DashboardTest extends BaseTest {
    LoginPage login = new LoginPage();
    DashboardPage dashboard = new DashboardPage();

    @Test
    public void verifyAutomationTestingLink(){
        login.logIN("natesimonoska@gmail.com", "qabrainster123");
        dashboard.clickAutomationTestingLink();

        String expectedUrl = "https://qainterrapt.brainster.xyz/webinars/55";
        String actualUrl = SeleniumHelpers.driver.getCurrentUrl();
        Assert.assertEquals(actualUrl, expectedUrl);
    }
}
