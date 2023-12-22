package pages;

import helpers.SeleniumHelpers;
import org.openqa.selenium.By;
import java.io.File;

public class WebinarsPage {

    By webinarsLink = By.linkText("Webinars");
    By createButton = By.xpath("//button[@class='inline-flex items-center px-4 py-2 bg-gray-800 border border-transparent rounded-md font-semibold text-xs text-white uppercase tracking-widest hover:bg-gray-700 active:bg-gray-900 focus:outline-none focus:border-gray-900 focus:ring ring-gray-300 disabled:opacity-25 disabled:cursor-not-allowed transition ease-in-out duration-150']");
    By titleField = By.id("title");
    By descriptionField = By.id("description");
    By startDateField = By.id("start_date");
    By chooseStartDate = By.xpath("//span[@class='flatpickr-day today']");

    By endDateField = By.id("end_date");
    By chooseEndDate = By.xpath("//span[@class='flatpickr-day today']");
    By linkField = By.id("link");
    By mentorField = By.xpath("//textarea[@type='search']");
    By createWebinarButton = By.xpath("//button[@class='inline-flex items-center px-4 py-2 bg-gray-800 border border-transparent rounded-md font-semibold text-xs text-white uppercase tracking-widest hover:bg-gray-700 active:bg-gray-900 focus:outline-none focus:border-gray-900 focus:ring ring-gray-300 disabled:opacity-25 disabled:cursor-not-allowed transition ease-in-out duration-150 my-5']");
    By backButton = By.xpath("//button[@class='inline-flex items-center px-4 py-2 bg-gray-800 border border-transparent rounded-md font-semibold text-xs text-white uppercase tracking-widest hover:bg-gray-700 active:bg-gray-900 focus:outline-none focus:border-gray-900 focus:ring ring-gray-300 disabled:opacity-25 disabled:cursor-not-allowed transition ease-in-out duration-150']");
    By successfullyCreatedWebinarMessage = By.id("swal2-title");
    By chooseFileButton = By.xpath("//input[@id='image']");
    By selectMentor = By.xpath("//li[@class='select2-results__option select2-results__option--selectable select2-results__option--highlighted']");
    By tagField = By.xpath("//textarea[@placeholder='Select tags']");
    By selectTag = By.xpath("//li[@class='select2-results__option select2-results__option--selectable select2-results__option--highlighted']");
    By actionButtonForEdit = By.xpath("//div[@class='flex items-center justify-center space-x-4 text-sm']");
    By editButton = By.xpath("//button[@class='inline-flex items-center px-4 py-2 bg-gray-800 border border-transparent rounded-md font-semibold text-xs text-white uppercase tracking-widest hover:bg-gray-700 active:bg-gray-900 focus:outline-none focus:border-gray-900 focus:ring ring-gray-300 disabled:opacity-25 disabled:cursor-not-allowed transition ease-in-out duration-150 my-5']");
    By searchField = By.xpath("//input[@style='padding-left: 36px !important;']");
    By successfullyEditedWebinarMessage = By.id("swal2-title");
    By allWebinarsButton = By.xpath("//option[@value='0']");
    By showWebinarButton = By.xpath("//select[@class='block appearance-none bg-slate-50 border border-slate-300 text-slate-700 py-2 px-3 pr-8 rounded leading-tight focus:outline-none focus:bg-white focus:border-slate-500  dark:bg-slate-600 dark:text-slate-200 dark:placeholder-slate-200 dark:border-slate-500']");
    By deleteActionButton = By.cssSelector("[wire\\:click='delete(1356)']");
    By yesDeleteIt = By.xpath("//button[@class='swal2-confirm swal2-styled swal2-default-outline']");
    By successfullyDeletedWebinarMessage = By.id("swal2-title");
    By show50WebinarButton = By.xpath("//option[@value='50']");
    By showingResultsText = By.xpath("//div[@class='mr-2 leading-5 text-center text-slate-700 text-md dark:text-slate-300 sm:text-right']");
    By itsFinishedButton = By.cssSelector("[wire\\:click='checkAsFinished(104)']");
    By finishedText = By.xpath("//span[@class='text-purple-700 border-purple-700 bg-purple-100 rounded-full px-2 py-1']");

    public void clickWebinarsLink () {
        SeleniumHelpers.findElement(webinarsLink).click();
    }
    public void clickCreateButton () {
        SeleniumHelpers.findElement(createButton).click();
    }
    public void clickBackButton () {
        SeleniumHelpers.findElement(backButton).click();
    }
    public void setTitleField (String title) {
        SeleniumHelpers.findElement(titleField).sendKeys(title);
    }
    public void setDescriptionField (String description) {
        SeleniumHelpers.findElement(descriptionField).sendKeys(description);
    }
    public void clickStartDayField () {
        SeleniumHelpers.findElement(startDateField).click();
    }
    public void setStartDate () {
        SeleniumHelpers.findElement(chooseStartDate).click();
    }
    public void clickEndDate () {
        SeleniumHelpers.findElement(endDateField).click();
    }
    public void setEndDate () {
        SeleniumHelpers.findElement(chooseEndDate).click();
    }
    public void setLinkField (String link) {
        SeleniumHelpers.findElement(linkField).sendKeys(link);
    }
    public String successfullyCreatedWebinarMessage () {
        return SeleniumHelpers.findElement(successfullyCreatedWebinarMessage).getText();
    }
    public void addUploadPhoto() {
        File fileToUpload = new File(System.getProperty("user.dir") + "/upload_files/testing_bug.jpeg");
        SeleniumHelpers.findElement(chooseFileButton).sendKeys(fileToUpload.getAbsolutePath());
    }

    public void clickMentorFieldButton () {
        SeleniumHelpers.findElement(mentorField).click();
    }
    public void selectMentor () {
        SeleniumHelpers.findElement(selectMentor).click();
    }
    public void clickTagField () {
        SeleniumHelpers.findElement(tagField).click();
    }
    public void selectTag () {
        SeleniumHelpers.findElement(selectTag).click();
    }
    public void clickCreateWebinarButton () {
        SeleniumHelpers.findElement(createWebinarButton).click();
    }
    public void clickActionButtonForEdit () {
        SeleniumHelpers.findElement(actionButtonForEdit).click();
    }
    public void clearTitleField () {
        SeleniumHelpers.findElement(titleField).clear();
    }
    public void clearDescriptionField () {

        SeleniumHelpers.findElement(descriptionField).clear();
    }
    public void clickEditButton () {
        SeleniumHelpers.findElement(editButton).click();
    }
    public void setSearchField(String text) {
        SeleniumHelpers.findElement(searchField).sendKeys(text);
    }
    public String successfullyEditedWebinarMessage () {
       return SeleniumHelpers.findElement(successfullyEditedWebinarMessage).getText();
    }
    public void clickButtonForShowWebinars() {
        SeleniumHelpers.findElement(showWebinarButton).click();
    }
    public void clickAllWebinarsButton() {
        SeleniumHelpers.findElement(allWebinarsButton).click();
    }
    public void clickDeleteActionButton() {
        SeleniumHelpers.findElement(deleteActionButton).click();
    }
    public void clickYesDeleteItButton () {
        SeleniumHelpers.findElement(yesDeleteIt).click();
    }
    public String successfullyDeletedWebinarMessage () {
       return SeleniumHelpers.findElement(successfullyDeletedWebinarMessage).getText();
    }
    public void show50WebinarButton() {
        SeleniumHelpers.findElement(show50WebinarButton).click();
    }
    public String showingResultsFromWebinars() {
        return SeleniumHelpers.findElement(showingResultsText).getText();
    }
    public void clickFinishedButton () {
        SeleniumHelpers.findElement(itsFinishedButton).click();
    }
    public String finishedText () {
       return SeleniumHelpers.findElement(finishedText).getText();
    }

}
