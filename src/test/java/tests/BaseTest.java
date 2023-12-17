package tests;

import helpers.SeleniumHelpers;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseTest {
    @BeforeClass
    public void setUp () {
        SeleniumHelpers.initializationWebDriver();
        SeleniumHelpers.driver.manage().window().maximize();
        SeleniumHelpers.driver.get("https://qainterrapt.brainster.xyz/login");
    }
    @AfterClass
    public void quitDriver () {
       SeleniumHelpers.driver.quit();
    }
}
