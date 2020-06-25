package stepDefinitions;

import cucumber.api.java.en.And;
import org.junit.jupiter.api.Assertions;
import webpages.TripDetailsPage;

public class TripDetailsPageStepDefinitions {

    TripDetailsPage tripDetailsPage;

    @And("Trip Details page is opened")
    public void goToTripDetailsTab() {
        tripDetailsPage = new TripDetailsPage(HomePageStepDefinitions.driver);

        Assertions.assertTrue(tripDetailsPage.isAt());
    }
}
