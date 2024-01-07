package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LoginPage;
import pages.UsersPage;

public class UsersTests extends BaseTest {
    LoginPage login = new LoginPage();
    UsersPage userPage = new UsersPage();

    @Test (priority = 1)
    public void verifyCreateUser () throws InterruptedException {
        login.logIN("natesimonoska@gmail.com", "qabrainster123");
        userPage.clickUsersLink();
        userPage.clickCreateButton();
        userPage.setNameInField("Test123456");
        userPage.setEmailInField("test324@gmail.com");
        userPage.setPasswordInField("Test123#");
        Thread.sleep(2000);
        userPage.clickConfirmCreateButton();
        Thread.sleep(1000);

        String expectedMessage = "User has been created successfully";
        String actualMessage = userPage.getSuccessfulCreateUserMessage();
        Assert.assertEquals(actualMessage, expectedMessage);
    }

    @Test (priority = 2)
    public void verifyEditOfExistingUser () throws InterruptedException {
        login.logIN("natesimonoska@gmail.com", "qabrainster123");
        userPage.clickUsersLink();
        userPage.searchField("1082");
        Thread.sleep(3000);
        userPage.clickActionsButton();
        Thread.sleep(3000);
        userPage.clearNameField();
        userPage.setNameInField("Nateee");
        userPage.clickEditButton();
        Thread.sleep(1000);

        String expectedMessage = "User has been edited successfully";
        String actualMessage = userPage.getSuccessfullyEditedUserMessage();
        Assert.assertEquals(actualMessage, expectedMessage);
    }
    @Test (priority = 3)
    public void verifyAllUsersShownOnDisplay () throws InterruptedException {
        login.logIN("natesimonoska@gmail.com", "qabrainster123");
        userPage.clickUsersLink();
        Thread.sleep(2000);
        userPage.clickButtonForShowUsers();
        userPage.clickAllUsersButton();
        Thread.sleep(5000);

        String expectedText = "Showing 1 to 1089 of 1089 Results";
        String actualText = userPage.showingResultsFromUsers();
        Assert.assertEquals(actualText, expectedText);
    }
}
