package pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Homepage {


    WebDriver driver;

    public Homepage(WebDriver driver) {
        this.driver = driver;
    }

    public void selectCities(String from, String to) {

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        WebElement fromElement = wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.name("fromPort")));

        WebElement toElement = wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.name("toPort")));

        Select fromCity = new Select(fromElement);
        Select toCity   = new Select(toElement);

        fromCity.selectByVisibleText(from);
        toCity.selectByVisibleText(to);
    }

    public void clickFindFlights() {
        new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.elementToBeClickable(By.cssSelector("input[type='submit']")))
                .click();
    }
}