package pages;
import helpers.SeleniumHelpers;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


public class DashboardPage {
    private By automationTestingLink = By.xpath("//a[@href='https://qainterrapt.brainster.xyz/webinars/55']");

    public void clickAutomationTestingLink (){
        SeleniumHelpers.findElement(automationTestingLink).click();
    }
}
