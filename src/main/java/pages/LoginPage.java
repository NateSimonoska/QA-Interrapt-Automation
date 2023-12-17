package pages;
import helpers.SeleniumHelpers;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.sql.Driver;

public class LoginPage {

    By emailField = By.id("email");
    By passwordField = By.id("password");
    By forgotYourPassword = By.xpath("//a[class=\"underline text-sm text-gray-600 hover:text-gray-900\"]");
    By loginButton = By.xpath("//button[@type='submit']");
    By menuButton = By.id("menu-button");
    By logOutButton = By.linkText("Logout");

    public void enterEmail (String email) {
        SeleniumHelpers.findElement(emailField).sendKeys(email);
    }
    public void enterPassword (String setPassword) {
       WebElement password = SeleniumHelpers.findElement(passwordField);
       password.sendKeys(setPassword);
    }
    public void clickLoginButton () {
        WebElement loginWebButton = SeleniumHelpers.findElement(loginButton);
        loginWebButton.click();
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
