package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LoginPage;
import pages.MentorsPage;

public class MentorsTest extends BaseTest {

    LoginPage login = new LoginPage();
    MentorsPage mentors = new MentorsPage();

    @Test (priority = 1)
    public void verifyCreateMentor () throws InterruptedException {
        login.logIN("natesimonoska@gmail.com", "qabrainster123");
        mentors.clickMentorsLink();
        mentors.clickCreateButton();
        mentors.setName("Jana");
        mentors.setSurname("Naumoska");
        mentors.setEmail("jana1@gmail.com");
        Thread.sleep(2000);
        mentors.setBio("Lorem Ipsum is simply dummy text of the printing and typesetting industry.");
        mentors.setOccupation("Software Tester");
        Thread.sleep(2000);
        mentors.clickCreateMentorsButton();
        Thread.sleep(3000);

        String expectedMessage = "Mentor has been created successfully";
        String actualMessage = mentors.successfullyCreateMentorMessage();
        Assert.assertEquals(actualMessage, expectedMessage);
    }

    @Test (priority = 2)
    public void verifyEditOfExistMentor () throws InterruptedException {
        login.logIN("natesimonoska@gmail.com", "qabrainster123");
        mentors.clickMentorsLink();
        mentors.setSearch("jana1@gmail.com");
        Thread.sleep(3000);
        mentors.clickActionEditButton();
        mentors.clearNameField();
        Thread.sleep(2000);
        mentors.setName("Nate");
        mentors.clearOccupationField();
        mentors.setOccupation("QA");
        mentors.clickEditButton();
        Thread.sleep(3000);

        String expectedMessage = "Mentor has been edited successfully";
        String actualMessage = mentors.successfullyEditMentorMessage();
        Assert.assertEquals(actualMessage, expectedMessage);
    }

    @Test (priority = 3)
    public void verifyDeleteMentor () throws InterruptedException {
        login.logIN("natesimonoska@gmail.com", "qabrainster123");
        mentors.clickMentorsLink();
        mentors.setSearch("jana@gmail.com");
        Thread.sleep(3000);
        mentors.clickDeleteButton();
        Thread.sleep(3000);
        mentors.confirmDeleteButton();
        Thread.sleep(3000);

        String actualMessage = "Mentor has been deleted successfully";
        String expectedMessage = mentors.successfullyDeletedMentorMessage();
        Assert.assertEquals(actualMessage, expectedMessage);
    }
}
