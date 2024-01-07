package tests;

import helpers.SeleniumHelpers;
import org.testng.annotations.*;
import pages.*;

public class BaseTest {
    @BeforeMethod
    public void setUp () {
        SeleniumHelpers.initializeWebDriver();
        SeleniumHelpers.driver.manage().window().maximize();
        SeleniumHelpers.driver.get("https://qainterrapt.brainster.xyz/login");
    }
    @AfterMethod
    public void quitDriver () {
       SeleniumHelpers.driver.quit();
    }
}
