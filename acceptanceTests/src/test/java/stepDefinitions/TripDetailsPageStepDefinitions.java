package stepDefinitions;

import cucumber.api.java.en.And;
import org.junit.jupiter.api.Assertions;
import webpages.TripDetailsPage;
import webpages.WebDriverInitiation;

public class TripDetailsPageStepDefinitions {

    TripDetailsPage tripDetailsPage;

    WebDriverInitiation webDriverInitiation;

    @And("Trip Details page is opened")
    public void goToTripDetailsTab() {
        tripDetailsPage = new TripDetailsPage(HomePageStepDefinitions.driver);

        Assertions.assertTrue(tripDetailsPage.isAt());
    }

    @And("all pages are closed")
    public void cleanUp() {
        webDriverInitiation = new WebDriverInitiation(HomePageStepDefinitions.driver);
        webDriverInitiation.cleanUp();
    }
}
