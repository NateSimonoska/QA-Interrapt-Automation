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

}
