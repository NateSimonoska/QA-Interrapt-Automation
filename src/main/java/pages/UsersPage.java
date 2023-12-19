package pages;

import helpers.SeleniumHelpers;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;

import static helpers.SeleniumHelpers.driver;

public class UsersPage {


    By usersLink = By.linkText("Users");
    By createButton = By.xpath("//button[@type='submit']");
    By nameField = By.id("user.name");
    By emailField = By.id("user.email");
    By passwordField = By.id("password");
    By backButton = By.linkText("Back");
    By editButton = By.xpath("//button[@class='inline-flex items-center px-4 py-2 bg-gray-800 border border-transparent rounded-md font-semibold text-xs text-white uppercase tracking-widest hover:bg-gray-700 active:bg-gray-900 focus:outline-none focus:border-gray-900 focus:ring ring-gray-300 disabled:opacity-25 disabled:cursor-not-allowed transition ease-in-out duration-150 my-5']");
    By editButton1 = By.xpath("inline-flex items-center px-4 py-2 bg-gray-800 border border-transparent rounded-md font-semibold text-xs text-white uppercase tracking-widest hover:bg-gray-700 active:bg-gray-900 focus:outline-none focus:border-gray-900 focus:ring ring-gray-300 disabled:opacity-25 disabled:cursor-not-allowed transition ease-in-out duration-150 my-5");
    By searchField = By.xpath("//input[@style='padding-left: 36px !important;']");
    By showUsersButton = By.xpath("//select[@class='block appearance-none bg-slate-50 border border-slate-300 text-slate-700 py-2 px-3 pr-8 rounded leading-tight focus:outline-none focus:bg-white focus:border-slate-500  dark:bg-slate-600 dark:text-slate-200 dark:placeholder-slate-200 dark:border-slate-500']");
    By allUsersButton = By.xpath("//option[@value='0']");
    By selectPeriodField = By.id("input_created_at_formatted");
    By selectAllCheckbox = By.xpath("//input[@type='checkbox']");
    By showingResultsText = By.xpath("//div[@class='mr-2 leading-5 text-center text-slate-700 text-md dark:text-slate-300 sm:text-right']");

    By successfulCreatedUserMessage = By.id("swal2-title");
    By successfullyEditedUserMessage = By.id("swal2-title");
    By confirmCreateButton = By.xpath("//button[@class='inline-flex items-center px-4 py-2 bg-gray-800 border border-transparent rounded-md font-semibold text-xs text-white uppercase tracking-widest hover:bg-gray-700 active:bg-gray-900 focus:outline-none focus:border-gray-900 focus:ring ring-gray-300 disabled:opacity-25 disabled:cursor-not-allowed transition ease-in-out duration-150 my-5']");
    By actionButton = By.xpath("//div[@class='flex items-center justify-center space-x-4 text-sm']");

    public void clickUsersLink(){
        SeleniumHelpers.findElement(usersLink).click();
    }
    public void clickCreateButton () {
        SeleniumHelpers.findElement(createButton).click();
    }
    public void setNameInField (String name) {
        SeleniumHelpers.findElement(nameField).sendKeys(name);
    }
    public void setEmailInField (String email) {
        SeleniumHelpers.findElement(emailField).sendKeys(email);
    }
    public void setPasswordInField (String password) {
        SeleniumHelpers.findElement(passwordField).sendKeys(password);
    }
    public void clickBackButton () {
        SeleniumHelpers.findElement(backButton).click();
    }
    public void searchField (String name) {
        SeleniumHelpers.findElement(searchField).sendKeys(name);
    }
    public void clickButtonForShowUsers () {
        SeleniumHelpers.findElement(showUsersButton).click();
    }
    public void clickAllUsersButton () {
        SeleniumHelpers.findElement(allUsersButton).click();
    }
    public String showingResultsFromUsers () {
        return SeleniumHelpers.findElement(showingResultsText).getText();
    }
    public void clickConfirmCreateButton(){
        SeleniumHelpers.findElement(confirmCreateButton).click();
    }
    public void clickActionsButton (){
        SeleniumHelpers.findElement(actionButton).click();
    }
    public void clickEditButton (){
        SeleniumHelpers.findElement(editButton).click();
    }
    public String successfulCreateUserMessage () {
        return SeleniumHelpers.findElement(successfulCreatedUserMessage).getText();
    }
    public void clearNameField(){
        SeleniumHelpers.findElement(nameField).click();
        SeleniumHelpers.findElement(nameField).clear();
    }
    public String successfullyEditedUserMessage (){
        return  SeleniumHelpers.findElement(successfullyEditedUserMessage).getText();
    }

}
