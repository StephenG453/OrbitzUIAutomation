package stepDefinitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import org.junit.jupiter.api.Assertions;
import webpages.SearchResultsPage;

public class SearchResultsPageStepDefinitions {

    private SearchResultsPage searchResultsPage;

    @Then("the results webpage loads")
    public void checkIfResultsPageLoaded() {
        searchResultsPage = new SearchResultsPage(HomePageStepDefinitions.driver);
        Assertions.assertTrue(searchResultsPage.isAt());
    }

    @And("the number of itineraries is outputted")
    public void getNumberOfItinerariesForFirstFlight() {
        searchResultsPage.getNumberOfItineraries();
    }

    @And("the nonstop button is checked")
    public void pressNonstopButton() {
        searchResultsPage.pressNonStopButton();
    }

    @And("the first flight is selected")
    public void selectFirstFlight() {
        searchResultsPage.selectFirstListedFlight();
    }

    @And("select this fare button is clicked")
    public void pressSelectThisFareButton() {
        searchResultsPage.pressSelectThisFareButton();
    }

//    @And("Trip Details tab is opened")
//    public void goToTripDetailsTab() {
//
//    }
}
