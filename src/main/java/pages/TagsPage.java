package pages;

import helpers.SeleniumHelpers;
import org.openqa.selenium.By;

public class TagsPage {
    By tagsLink = By.linkText("Tags");
    By createButton = By.xpath("//button[@class='inline-flex items-center px-4 py-2 bg-gray-800 border border-transparent rounded-md font-semibold text-xs text-white uppercase tracking-widest hover:bg-gray-700 active:bg-gray-900 focus:outline-none focus:border-gray-900 focus:ring ring-gray-300 disabled:opacity-25 disabled:cursor-not-allowed transition ease-in-out duration-150']");
    By titleField = By.id("title");
    By createTagButton = By.cssSelector("[wire\\:click='create()'");
    By searchField = By.xpath("//input[@style='padding-left: 36px !important;']");
    By successfullyMessageForCreate = By.id("swal2-title");
    By successfullyMessageForEdit = By.id("swal2-title");
    By successfullyMessageForDelete = By.id("swal2-title");
    By editButton = By.cssSelector("[wire\\:click='edit()'");
    By yesDeleteItButton = By.xpath("//button[@class='swal2-confirm swal2-styled swal2-default-outline']");
    By actionEditButton = By.xpath("//a[@href='https://qainterrapt.brainster.xyz/tags/952/edit']");
    By deleteButton = By.cssSelector("[wire\\:click='delete(952)']");


    public void clickTagsLink () {
        SeleniumHelpers.findElement(tagsLink).click();
    }
    public void clickCreateButton () {
        SeleniumHelpers.findElement(createButton).click();
    }
    public void setTitle (String title) {
        SeleniumHelpers.findElement(titleField).sendKeys(title);
    }
    public void clickCreateTagButton () {
        SeleniumHelpers.findElement(createTagButton).click();
    }
    public void setSearch (String text) {
        SeleniumHelpers.findElement(searchField).sendKeys(text);
    }
    public String successfullyCreateTagMessage () {
        return SeleniumHelpers.findElement(successfullyMessageForCreate).getText();
    }
    public String successfullyEditTagMessage () {
        return SeleniumHelpers.findElement(successfullyMessageForEdit).getText();
    }
    public String successfullyDeleteTagMessage () {
        return SeleniumHelpers.findElement(successfullyMessageForDelete).getText();
    }
    public void clickEditButton () {
        SeleniumHelpers.findElement(editButton).click();
    }
    public void clickActionEditButton () {
        SeleniumHelpers.findElement(actionEditButton).click();
    }
    public void clickDeleteButton () {
        SeleniumHelpers.findElement(deleteButton).click();
    }
    public void confirmDeletion () {
        SeleniumHelpers.findElement(yesDeleteItButton).click();
    }
    public void clearTitleField () {
        SeleniumHelpers.findElement(titleField).clear();
    }
}
