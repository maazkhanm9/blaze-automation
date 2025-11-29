package pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FlightsPage {
	WebDriver driver;
    By flightRows = By.cssSelector("table tbody tr");

    public FlightsPage(WebDriver driver) {
        this.driver = driver;
    }

    public void chooseFlight(int index) {

        List<WebElement> rows = driver.findElements(flightRows);

        if (rows.isEmpty()) {
            throw new RuntimeException("No flights available!");
        }

        if (index < 1 || index > rows.size()) {
            throw new RuntimeException("Invalid flight sequence number!");
        }

        rows.get(index - 1)
            .findElement(By.cssSelector("input[type='submit']")).click();
    }
}

