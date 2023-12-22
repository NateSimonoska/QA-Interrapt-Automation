package tests;

import helpers.SeleniumHelpers;
import org.testng.annotations.*;

public class BaseTest {
    @BeforeMethod
    public void setUp () {
        SeleniumHelpers.initializationWebDriver();
        SeleniumHelpers.driver.manage().window().maximize();
        SeleniumHelpers.driver.get("https://qainterrapt.brainster.xyz/login");
    }
    @AfterMethod
    public void quitDriver () {
       SeleniumHelpers.driver.quit();
    }
}
