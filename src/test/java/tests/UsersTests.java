package tests;

import helpers.SeleniumHelpers;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LoginPage;
import pages.UsersPage;
import static helpers.SeleniumHelpers.driver;

public class UsersTests extends BaseTest {
    UsersPage userPage = new UsersPage();
    LoginPage login = new LoginPage();
    JavascriptExecutor js = (JavascriptExecutor)driver;


    @Test
    public void verifyCreateUser () throws InterruptedException {
        login.logIN("natesimonoska@gmail.com", "qabrainster123");
        Thread.sleep(2000);
        userPage.clickUsersLink();
        userPage.clickCreateButton();
        Thread.sleep(2000);
        userPage.setNameInField("Test123456");
        userPage.setEmailInField("test123456@gmail.com");
        userPage.setPasswordInField("Test123#");
        Thread.sleep(2000);
        userPage.clickConfirmCreateButton();
        Thread.sleep(1000);

        String expectedMessage = "User has been created successfully";
        String actualMessage = userPage.successfulCreateUserMessage();
        Assert.assertEquals(actualMessage, expectedMessage);
    }

    @Test
    public void verifyEditOfExistingUser () throws InterruptedException {
        login.logIN("natesimonoska@gmail.com", "qabrainster123");
        userPage.clickUsersLink();
        userPage.searchField("1082");
        Thread.sleep(3000);
        userPage.clickActionsButton();
        Thread.sleep(3000);
        userPage.clearNameField();
        userPage.setNameInField("Nateee");
        Thread.sleep(3000);
        userPage.clickEditButton();
        Thread.sleep(1000);

        String expectedMessage = "User has been edited successfully";
        String actualMessage = userPage.successfullyEditedUserMessage();
        Assert.assertEquals(actualMessage, expectedMessage);
    }
    @Test
    public void verifyAllUsersShownOnDisplay () throws InterruptedException {
        login.logIN("natesimonoska@gmail.com", "qabrainster123");
        Thread.sleep(3000);
        userPage.clickUsersLink();
        Thread.sleep(3000);
        //js.executeScript()
        userPage.clickButtonForShowUsers();
        userPage.clickAllUsersButton();
        Thread.sleep(1000);
    }
}
