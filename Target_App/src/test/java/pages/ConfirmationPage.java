package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ConfirmationPage {
	WebDriver driver;
    By statusLocator = By.xpath("//td[text()='Status']/following-sibling::td");
    By amountLocator = By.xpath("//td[text()='Amount']/following-sibling::td");

    public ConfirmationPage(WebDriver driver) {
        this.driver = driver;
    }

    public String getStatus() {
        return driver.findElement(statusLocator).getText();
    }

    public double getAmount() {
        String text = driver.findElement(amountLocator).getText();
        text = text.replace("USD", "").replace("$", "").trim();
        return Double.parseDouble(text);
    }
}
