package pages;
import helpers.SeleniumHelpers;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


public class DashboardPage {
    By automationTestingLink = By.xpath("//a[@href='https://qainterrapt.brainster.xyz/webinars/55']");

    public void clickAutomationTestingLink (){
        WebElement automationTesting = SeleniumHelpers.findElement(automationTestingLink);
        automationTesting.click();
    }
}
