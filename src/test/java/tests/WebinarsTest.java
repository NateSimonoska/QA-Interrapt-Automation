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
            Thread.sleep(3000);
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
