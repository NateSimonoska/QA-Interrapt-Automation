package pages;

import helpers.SeleniumHelpers;
import org.openqa.selenium.By;

public class AttendeesPage {
    By attendeesLink = By.linkText("Attendees");
    By createButton = By.xpath("//button[@class='inline-flex items-center px-4 py-2 bg-gray-800 border border-transparent rounded-md font-semibold text-xs text-white uppercase tracking-widest hover:bg-gray-700 active:bg-gray-900 focus:outline-none focus:border-gray-900 focus:ring ring-gray-300 disabled:opacity-25 disabled:cursor-not-allowed transition ease-in-out duration-150']");
    By nameField = By.id("name");
    By surnameField = By.id("surname");
    By emailField = By.id("email");
    By phoneField = By.id("phone");
    By cityField = By.id("city");
    By highSchoolField = By.id("high_school");
    By facultyField = By.id("faculty");
    By webinarField = By.id("webinar_id");
    By selectWebinar = By.xpath("//option[@value='39']");
    By createAttendeesButton = By.xpath("//button[@class='inline-flex items-center px-4 py-2 bg-gray-800 border border-transparent rounded-md font-semibold text-xs text-white uppercase tracking-widest hover:bg-gray-700 active:bg-gray-900 focus:outline-none focus:border-gray-900 focus:ring ring-gray-300 disabled:opacity-25 disabled:cursor-not-allowed transition ease-in-out duration-150 my-5']");
    By searchField = By.xpath("//input[@style='padding-left: 36px !important;']");
    By successfullyMessageForCreate = By.id("swal2-title");
    By actionsEditButton = By.xpath("//a[@href=\"https://qainterrapt.brainster.xyz/attendees/2651/edit\"]");
    By editButton = By.cssSelector("[wire\\:click='edit()'");
    By successfullyMessageForEdit = By.id("swal2-title");
    By successfullyMessageForDelete = By.id("swal2-title");
    By deleteButton = By.cssSelector("[wire\\:click='delete(2647)']");
    By yesDeleteItButton = By.xpath("//button[@class='swal2-confirm swal2-styled swal2-default-outline']");
    public void clickAttendeesLink () {
        SeleniumHelpers.findElement(attendeesLink).click();
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
    public void setPhone (String phone) {
        SeleniumHelpers.findElement(phoneField).sendKeys(phone);
    }
    public void setCity (String city) {
        SeleniumHelpers.findElement(cityField).sendKeys(city);
    }
    public void setHighSchool (String highSchool) {
        SeleniumHelpers.findElement(highSchoolField).sendKeys(highSchool);
    }
    public void setFaculty (String faculty) {
        SeleniumHelpers.findElement(facultyField).sendKeys(faculty);
    }
    public void clickOnSelectWebinarButton () {
        SeleniumHelpers.findElement(webinarField).click();
    }
    public void setSelectWebinar () {
        SeleniumHelpers.findElement(selectWebinar).click();
    }
    public void clickCreateAttendeesButton () {
        SeleniumHelpers.findElement(createAttendeesButton).click();
    }
    public String successfullyCreatedAttendeeMessage () {
       return SeleniumHelpers.findElement(successfullyMessageForCreate).getText();
    }
    public void clickActionsEditButton () {
        SeleniumHelpers.findElement(actionsEditButton).click();
    }
    public void clickSearchField (String text) {
        SeleniumHelpers.findElement(searchField).sendKeys(text);
    }
    public void clearPhoneField () {
        SeleniumHelpers.findElement(phoneField).clear();
    }
    public void clearCityField () {
        SeleniumHelpers.findElement(cityField).clear();
    }
    public void clickEditButton () {
        SeleniumHelpers.findElement(editButton).click();
    }
    public String successfullyEditMessage () {
        return SeleniumHelpers.findElement(successfullyMessageForEdit).getText();
    }
    public void clickDeleteButton () {
        SeleniumHelpers.findElement(deleteButton).click();
    }
    public String successfullyDeletedAttendee () {
       return SeleniumHelpers.findElement(successfullyMessageForDelete).getText();
    }
    public void confirmDeleteButton () {
        SeleniumHelpers.findElement(yesDeleteItButton).click();
    }




}
