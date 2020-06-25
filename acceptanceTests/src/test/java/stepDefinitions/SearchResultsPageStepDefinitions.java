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

    @And("the number of itineraries for the first flight is outputted")
    public void getNumberOfItinerariesForFirstFlight() {
        searchResultsPage.getNumberOfItineraries();
    }
}
