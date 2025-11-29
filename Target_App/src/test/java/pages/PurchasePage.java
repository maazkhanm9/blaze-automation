package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.github.javafaker.Faker;

public class PurchasePage {
	  WebDriver driver;
	    Faker faker = new Faker();

	    public PurchasePage(WebDriver driver) {
	        this.driver = driver;
	    }

	    public void fillRandomUserData() {
	        driver.findElement(By.id("inputName")).sendKeys(faker.name().fullName());
	        driver.findElement(By.id("address")).sendKeys(faker.address().streetAddress());
	        driver.findElement(By.id("city")).sendKeys(faker.address().city());
	        driver.findElement(By.id("state")).sendKeys("NY");
	        driver.findElement(By.id("zipCode")).sendKeys("125002");
	        driver.findElement(By.id("creditCardNumber")).sendKeys("5111111111111111");
	        driver.findElement(By.id("creditCardMonth")).clear();
	        driver.findElement(By.id("creditCardMonth")).sendKeys("12");
	        driver.findElement(By.id("creditCardYear")).clear();
	        driver.findElement(By.id("creditCardYear")).sendKeys("2028");
	    }

	    public void purchase() {
	        driver.findElement(By.cssSelector("input[type='submit']")).click();
	    }
	}
