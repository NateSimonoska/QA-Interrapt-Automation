package pages;

import helpers.SeleniumHelpers;
import org.openqa.selenium.By;

public class AttendeesPage {
    private By attendeesLink = By.linkText("Attendees");
    private By createButton = By.xpath("//button[@class='inline-flex items-center px-4 py-2 bg-gray-800 border border-transparent rounded-md font-semibold text-xs text-white uppercase tracking-widest hover:bg-gray-700 active:bg-gray-900 focus:outline-none focus:border-gray-900 focus:ring ring-gray-300 disabled:opacity-25 disabled:cursor-not-allowed transition ease-in-out duration-150']");
    private By nameField = By.id("name");
    private By surnameField = By.id("surname");
    private By emailField = By.id("email");
    private By phoneField = By.id("phone");
    private By cityField = By.id("city");
    private By highSchoolField = By.id("high_school");
    private By facultyField = By.id("faculty");
    private By webinarField = By.id("webinar_id");
    private By selectWebinar = By.xpath("//option[@value='39']");
    private By createAttendeesButton = By.xpath("//button[@class='inline-flex items-center px-4 py-2 bg-gray-800 border border-transparent rounded-md font-semibold text-xs text-white uppercase tracking-widest hover:bg-gray-700 active:bg-gray-900 focus:outline-none focus:border-gray-900 focus:ring ring-gray-300 disabled:opacity-25 disabled:cursor-not-allowed transition ease-in-out duration-150 my-5']");
    private By searchField = By.xpath("//input[@style='padding-left: 36px !important;']");
    private By successfullyMessageForCreate = By.id("swal2-title");
    private By actionsEditButton = By.xpath("//a[@href=\"https://qainterrapt.brainster.xyz/attendees/2651/edit\"]");
    private By editButton = By.cssSelector("[wire\\:click='edit()'");
    private By successfullyMessageForEdit = By.id("swal2-title");
    private By successfullyMessageForDelete = By.id("swal2-title");
    private By deleteButton = By.cssSelector("[wire\\:click='delete(2647)']");
    private By yesDeleteItButton = By.xpath("//button[@class='swal2-confirm swal2-styled swal2-default-outline']");
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
    public String getSuccessfullyEditMessage() {
        return SeleniumHelpers.findElement(successfullyMessageForEdit).getText();
    }
    public void clickDeleteButton () {
        SeleniumHelpers.findElement(deleteButton).click();
    }
    public String getSuccessfullyDeletedAttendee() {
       return SeleniumHelpers.findElement(successfullyMessageForDelete).getText();
    }
    public void confirmDeleteButton () {
        SeleniumHelpers.findElement(yesDeleteItButton).click();
    }
}
