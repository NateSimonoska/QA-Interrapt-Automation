package helpers;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class SeleniumHelpers {
    public static WebDriver driver;
    private static WebDriverWait webDriverWait;


    public static void initializationWebDriver() {
        driver = new ChromeDriver();
        webDriverWait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    public static WebElement findElement(By element) {
        WebElement webElement = driver.findElement(element);
        return webElement;
    }

    public static WebElement waitAndFindElement (By locator) {
        return webDriverWait.until(ExpectedConditions.visibilityOfElementLocated(locator));
    }
}

