package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AttendeesPage;
import pages.LoginPage;


public class AttendeesTest extends BaseTest {
    LoginPage login = new LoginPage();
    AttendeesPage attendeesPage = new AttendeesPage();

    @Test (priority = 1)
    public void verifyCreateAttendee () throws InterruptedException {
        login.logIN("natesimonoska@gmail.com", "qabrainster123");
        attendeesPage.clickAttendeesLink();
        attendeesPage.clickCreateButton();
        attendeesPage.setName("Ana");
        attendeesPage.setSurname("Ivanoska");
        attendeesPage.setEmail("ana1@gmail.com");
        attendeesPage.setPhone("070232232");
        attendeesPage.setCity("Ohrid");
        attendeesPage.setHighSchool("Sv. Kliment Ohridski");
        attendeesPage.setFaculty("Finki");
        Thread.sleep(1000);
        attendeesPage.clickOnSelectWebinarButton();
        attendeesPage.setSelectWebinar();
        Thread.sleep(2000);
        attendeesPage.clickCreateAttendeesButton();
        Thread.sleep(3000);

        String expectedMessage = "Attendee has been created successfully";
        String actualMessage = attendeesPage.successfullyCreatedAttendeeMessage();
        Assert.assertEquals(actualMessage, expectedMessage);
    }

    @Test (priority = 2)
    public void verifyEditOfExistAttendee () throws InterruptedException {
        login.logIN("natesimonoska@gmail.com", "qabrainster123");
        attendeesPage.clickAttendeesLink();
        attendeesPage.clickSearchField("ana1@gmail.com");
        Thread.sleep(6000);
        attendeesPage.clickActionsEditButton();
        attendeesPage.clearPhoneField();
        attendeesPage.setPhone("078232232");
        attendeesPage.clearCityField();
        attendeesPage.setCity("Skopje");
        attendeesPage.clickEditButton();
        Thread.sleep(3000);

        String expectedMessage = "Attendee has been edited successfully";
        String actualMessage = attendeesPage.getSuccessfullyEditMessage();
        Assert.assertEquals(actualMessage, expectedMessage);
    }

    @Test (priority = 3)
    public void verifyDeleteAttendee () throws InterruptedException {
        login.logIN("natesimonoska@gmail.com", "qabrainster123");
        attendeesPage.clickAttendeesLink();
        attendeesPage.clickSearchField("ana1@gmail.com");
        Thread.sleep(6000);
        attendeesPage.clickDeleteButton();
        Thread.sleep(4000);
        attendeesPage.confirmDeleteButton();
        Thread.sleep(3000);

        String expectedMessage = "Attendee has been deleted successfully";
        String actualMessage = attendeesPage.getSuccessfullyDeletedAttendee();
        Assert.assertEquals(actualMessage, expectedMessage);
    }
}
