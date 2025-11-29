package workflow;

import java.util.Random;

import org.openqa.selenium.WebDriver;

import pages.ConfirmationPage;
import pages.FlightsPage;
import pages.Homepage;
import pages.PurchasePage;

public class PurchaseWorkflow {

	WebDriver driver;

    public PurchaseWorkflow(WebDriver driver) {
        this.driver = driver;
    }

    public void purchaseEndToEnd(String deptCity, String desCity, Integer flightSeq) {

    	String[] cities = {"Paris", "Boston", "Portland", "San Diego", "Mexico City", "São Paolo","Rome"};

        if (deptCity == null)
            deptCity = cities[new Random().nextInt(cities.length)];

        if (desCity == null)
            desCity = cities[new Random().nextInt(cities.length)];

        if (flightSeq == null)
            flightSeq = new Random().nextInt(3) + 1;

        if (deptCity.equals(desCity))
            throw new RuntimeException("Departure and Destination cannot be same!");

        Homepage home = new Homepage(driver);
        FlightsPage flights = new FlightsPage(driver);
        PurchasePage purchase = new PurchasePage(driver);
        ConfirmationPage confirm = new ConfirmationPage(driver);

        home.selectCities(deptCity, desCity);
        home.clickFindFlights();

        flights.chooseFlight(flightSeq);
        purchase.fillRandomUserData();
        purchase.purchase();

        String status = confirm.getStatus();
        double price = confirm.getAmount();

        assert status.equals("PendingCapture") : "Status validation failed!";
        assert price > 100.0 : "Price is less than expected!";
    }
}

