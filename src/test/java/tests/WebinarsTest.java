package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LoginPage;
import pages.WebinarsPage;

public class WebinarsTest extends BaseTest {
    LoginPage login = new LoginPage();
    WebinarsPage webinarPage = new WebinarsPage();
    @Test (priority = 1)
    public void verifyCreateWebinar () throws InterruptedException {
        login.logIN("natesimonoska@gmail.com", "qabrainster123");
        webinarPage.clickWebinarsLink();
        webinarPage.clickCreateButton();
        webinarPage.setTitleField("Software Testing");
        webinarPage.setDescriptionField("This webinar is for learning testing");
        webinarPage.clickStartDayField();
        webinarPage.setStartDate();
        Thread.sleep(1000);
        webinarPage.clickEndDate();
        webinarPage.setEndDate();
        webinarPage.setLinkField("https://qainterrapt.brainster.xyz/webinar/43522310");
        webinarPage.addUploadPhoto();
        webinarPage.clickMentorFieldButton();
        Thread.sleep(1000);
        webinarPage.selectMentor();
        webinarPage.clickTagField();
        Thread.sleep(1000);
        webinarPage.selectTag();
        webinarPage.clickCreateWebinarButton();
        Thread.sleep(3000);

        String expectedMessage = "Webinar has been created successfully";
        String actualMessage = webinarPage.successfullyCreatedWebinarMessage();
        Assert.assertEquals(actualMessage, expectedMessage);
    }

    @Test (priority = 2)
    public void verifyEditOfExistingWebinar () throws InterruptedException  {
        login.logIN("natesimonoska@gmail.com", "qabrainster123");
        webinarPage.clickWebinarsLink();
        webinarPage.clickButtonForShowWebinars();
        webinarPage.clickAllWebinarsButton();
        Thread.sleep(3000);
        webinarPage.setSearchField("Software Testing");
        Thread.sleep(5000);
        webinarPage.clickActionButtonForEdit();
        Thread.sleep(2000);
        webinarPage.clearTitleField();
        webinarPage.setTitleField("Software Testing 1");
        webinarPage.clearDescriptionField();
        webinarPage.setDescriptionField("This webinar is for beginners");
        webinarPage.clickEditButton();
        Thread.sleep(2000);

        String expectedMessage = "Webinar has been edited successfully";
        String actualMessage = webinarPage.successfullyEditedWebinarMessage();
        Assert.assertEquals(actualMessage, expectedMessage);
    }

    @Test (priority = 3)
    public void verifyDeleteWebinar () throws InterruptedException {
        login.logIN("natesimonoska@gmail.com", "qabrainster123");
        webinarPage.clickWebinarsLink();
        webinarPage.clickButtonForShowWebinars();
        webinarPage.clickAllWebinarsButton();
        Thread.sleep(3000);
        webinarPage.setSearchField("Software Testing");
        Thread.sleep(6000);
        webinarPage.clickDeleteActionButton();
        Thread.sleep(2000);
        webinarPage.clickYesDeleteItButton();
        Thread.sleep(2000);

        String expectedMessage = "Webinar has been deleted successfully";
        String actualMessage = webinarPage.successfullyDeletedWebinarMessage();
        Assert.assertEquals(actualMessage, expectedMessage);
    }

    @Test (priority = 4)
    public void verifyFinishedWebinar () throws InterruptedException {
            login.logIN("natesimonoska@gmail.com", "qabrainster123");
            webinarPage.clickWebinarsLink();
            webinarPage.clickButtonForShowWebinars();
            webinarPage.show50WebinarButton();
            Thread.sleep(2000);
            webinarPage.clickFinishedButton();
            Thread.sleep(2000);

            String expectedText = "finished";
            String actualText = webinarPage.finishedText();
            Assert.assertEquals(actualText, expectedText);
    }
}
