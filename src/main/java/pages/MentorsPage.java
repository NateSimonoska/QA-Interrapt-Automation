package pages;

import helpers.SeleniumHelpers;
import org.openqa.selenium.By;
import org.openqa.selenium.devtools.v85.css.model.SelectorList;

public class MentorsPage {

    By mentorsLink = By.linkText("Mentors");
    By createButton = By.xpath("//button[@class='inline-flex items-center px-4 py-2 bg-gray-800 border border-transparent rounded-md font-semibold text-xs text-white uppercase tracking-widest hover:bg-gray-700 active:bg-gray-900 focus:outline-none focus:border-gray-900 focus:ring ring-gray-300 disabled:opacity-25 disabled:cursor-not-allowed transition ease-in-out duration-150']");
    By nameField = By.id("name");
    By surnameField = By.id("surname");
    By emailField = By.id("email");
    By bioField = By.id("bio");
    By occupationField = By.id("occupation");
    By createMentorsButton = By.cssSelector("[wire\\:click='create()'");
    By successfullyMessageForCreate = By.id("swal2-title");
    By successfullyMessageForEdit = By.id("swal2-title");
    By successfullyMessageForDelete = By.id("swal2-title");
    By searchField = By.xpath("//input[@style='padding-left: 36px !important;']");
    By actionEditButton = By.xpath("//a[@href=\"https://qainterrapt.brainster.xyz/mentors/824/edit\"]");
    By deleteButton = By.cssSelector("[wire\\:click='delete(820)']");
    By editButton = By.cssSelector("[wire\\:click='edit()'");
    By yesDeleteItButton = By.xpath("//button[@class='swal2-confirm swal2-styled swal2-default-outline']");

    public void clickMentorsLink () {
        SeleniumHelpers.findElement(mentorsLink).click();
    }
    public void clickCreateButton () {
        SeleniumHelpers.findElement(createButton).click();
    }
    public void setName (String name) {
        SeleniumHelpers.findElement(nameField).sendKeys(name);
    }
    public void setSurname (String surname) {
        SeleniumHelpers.findElement(surnameField).sendKeys(surname);
    }
    public void setEmail (String email) {
        SeleniumHelpers.findElement(emailField).sendKeys(email);
    }
    public void setBio (String text) {
        SeleniumHelpers.findElement(bioField).sendKeys(text);
    }
    public void setOccupation (String text) {
        SeleniumHelpers.findElement(occupationField).sendKeys(text);
    }
    public void clickCreateMentorsButton () {
        SeleniumHelpers.findElement(createMentorsButton).click();
    }
    public String successfullyCreateMentorMessage () {
        return SeleniumHelpers.findElement(successfullyMessageForCreate).getText();
    }
    public String successfullyEditMentorMessage () {
        return SeleniumHelpers.findElement(successfullyMessageForEdit).getText();
    }
    public String successfullyDeletedMentorMessage () {
        return SeleniumHelpers.findElement(successfullyMessageForDelete).getText();
    }
    public void clearEmailField () {
        SeleniumHelpers.findElement(emailField).clear();
    }
    public void clearOccupationField () {
        SeleniumHelpers.findElement(occupationField).clear();
    }
    public void clickEditButton () {
        SeleniumHelpers.findElement(editButton).click();
    }
    public void setSearch (String text) {
        SeleniumHelpers.findElement(searchField).sendKeys(text);
    }
    public void clickActionEditButton () {
        SeleniumHelpers.findElement(actionEditButton).click();
    }
    public void clickDeleteButton () {
        SeleniumHelpers.findElement(deleteButton).click();
    }
    public void confirmDeleteButton () {
        SeleniumHelpers.findElement(yesDeleteItButton).click();
    }

}
