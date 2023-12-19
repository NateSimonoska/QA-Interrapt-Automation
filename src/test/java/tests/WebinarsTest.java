package tests;

import org.testng.annotations.Test;
import pages.LoginPage;
import pages.WebinarsPage;

public class WebinarsTest extends BaseTest{

    LoginPage login = new LoginPage();
    WebinarsPage webinarPage = new WebinarsPage();

    @Test
    public void verifyCreateWebinar () throws InterruptedException {
        login.logIN("natesimonoska@gmail.com", "qabrainster123");
        webinarPage.clickWebinarsLink();
        Thread.sleep(2000);
        webinarPage.clickCreateButton();
        webinarPage.setTitleField("Software Testing");
        Thread.sleep(2000);
        webinarPage.setDescriptionField("This webinar is for learning testing");
        Thread.sleep(2000);
        webinarPage.clickStartDayField();
        Thread.sleep(2000);
        webinarPage.setStartDate();
        Thread.sleep(1000);
        webinarPage.clickEndDate();
        Thread.sleep(2000);
        webinarPage.setEndDate();
        Thread.sleep(2000);
        webinarPage.setLinkField("https://qainterrapt.brainster.xyz/webinar/43522310");
        Thread.sleep(2000);
        webinarPage.addUploadPhoto();
        webinarPage.clickMentorFieldButton();
        Thread.sleep(2000);
        webinarPage.selectMentor();
        Thread.sleep(2000);
        webinarPage.clickTagField();
        Thread.sleep(2000);
        webinarPage.selectTag();
        Thread.sleep(2000);
        webinarPage.clickCreateWebinarButton();
        Thread.sleep(3000);

        String actualMessage = "Webinar has been created successfully";
        String expectedMessage = webinarPage.successfullyCreatedWebinarMessage();
    }
}
