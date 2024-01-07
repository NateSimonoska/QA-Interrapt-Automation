package pages;
import helpers.SeleniumHelpers;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.sql.Driver;

public class LoginPage {

    private By emailField = By.id("email");
    private By passwordField = By.id("password");
    private By forgotYourPassword = By.xpath("//a[class=\"underline text-sm text-gray-600 hover:text-gray-900\"]");
    private By loginButton = By.xpath("//button[@type='submit']");
    private By menuButton = By.id("menu-button");
    private By logOutButton = By.linkText("Logout");

    public void enterEmail (String email) {
        SeleniumHelpers.findElement(emailField).sendKeys(email);
    }
    public void enterPassword (String setPassword) {
        SeleniumHelpers.findElement(passwordField).sendKeys(setPassword);
    }
    public void clickLoginButton () {
        SeleniumHelpers.findElement(loginButton).click();
    }
    public void logIN (String email, String password) {
        SeleniumHelpers.findElement(emailField).sendKeys(email);
        SeleniumHelpers.findElement(passwordField).sendKeys(password);
        SeleniumHelpers.findElement(loginButton).click();
    }
    public void clickMenuButton (){
        SeleniumHelpers.findElement(menuButton).click();
    }
    public void clickLogOutButton (){
        SeleniumHelpers.findElement(logOutButton).click();
    }
}
