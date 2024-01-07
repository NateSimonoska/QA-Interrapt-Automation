package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LoginPage;
import pages.TagsPage;


public class TagsTest extends BaseTest{
    LoginPage login = new LoginPage();
    TagsPage tags = new TagsPage();

    @Test (priority = 1)
    public void verifyCreateTag () throws InterruptedException {
        login.logIN("natesimonoska@gmail.com", "qabrainster123");
        tags.clickTagsLink();
        tags.clickCreateButton();
        tags.setTitle("Nate");
        tags.clickCreateTagButton();
        Thread.sleep(3000);

        String expectedMessage = "Tag has been created successfully";
        String actualMessage = tags.getSuccessfullyCreateTagMessage();
        Assert.assertEquals(actualMessage, expectedMessage);
    }
    @Test (priority = 2)
    public void verifyEditOfExistTag () throws InterruptedException {
        login.logIN("natesimonoska@gmail.com", "qabrainster123");
        tags.clickTagsLink();
        tags.setSearch("Nate");
        Thread.sleep(2000);
        tags.clickActionEditButton();
        Thread.sleep(3000);
        tags.clearTitleField();
        tags.setTitle("Nate Sims");
        tags.clickEditButton();
        Thread.sleep(3000);

        String expectedMessage = "Tag has been edited successfully";
        String actualMessage = tags.getSuccessfullyEditTagMessage();
        Assert.assertEquals(actualMessage, expectedMessage);
    }
    @Test (priority = 3)
    public void verifyDeleteTag () throws InterruptedException {
        login.logIN("natesimonoska@gmail.com", "qabrainster123");
        tags.clickTagsLink();
        tags.setSearch("Nate Sims");
        Thread.sleep(3000);
        tags.clickDeleteButton();
        Thread.sleep(2000);
        tags.confirmDeletion();
        Thread.sleep(3000);

        String expectedMessage = "Tag has been deleted successfully";
        String actualMessage = tags.getSuccessfullyDeleteTagMessage();
        Assert.assertEquals(actualMessage, expectedMessage);
    }
}
