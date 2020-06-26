package stepDefinitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;
import utils.Adults2Children2MultiCityScenarioData;
import webpages.HomePage;
import webpages.WebDriverInitiation;

public class HomePageStepDefinitions {

    protected static WebDriver driver;

    private HomePage homePage;

    @Given("orbitz.com is loaded and the home page is visible")
    public void initializeDriverAndOpenOrbitz() {
        WebDriverInitiation webDriverInitiation = new WebDriverInitiation(driver);
        webDriverInitiation.initialize();
        webDriverInitiation.loadWebPage();

        driver = webDriverInitiation.driver;
        homePage = new HomePage(driver);

        Assertions.assertTrue(homePage.isAt());
    }

    @When("flights button is pressed")
    public void pressFlightsButton() {
        homePage.pressFlightsButton();
    }

    @And("multi-city flights button is pressed")
    public void pressMultiCityFlightsButton() {
            homePage.pressMultiCityFlightsButton();
    }

    @And("DFW is inputted into Flying from tab 1")
    public void inputFlyingFromTab1Value() {
        homePage.inputFlyingFromTab1Value(Adults2Children2MultiCityScenarioData.CITY_A);
    }

    @And("DFW airport is selected")
    public void selectDFWAirport() {
        homePage.selectDFWAirport();
    }

    @And("LAX is inputted into Flying to tab 1")
    public void inputFlyingToTab1Value() {
        homePage.inputFlyingToTab1Value(Adults2Children2MultiCityScenarioData.CITY_B);
    }

    @And("LAX airport is selected")
    public void selectLAXAirport() {
        homePage.selectLAXAirport();
    }

    @And("flight 1 departure date is inputted")
    public void inputFlight1DepartureDate() {
        homePage.inputFlight1DepartureDate(Adults2Children2MultiCityScenarioData.getFlight1Date());
    }

    @And("2 adults flying are selected")
    public void select2AdultsFlying() {
        homePage.selectNumberOfAdults();
    }

    @And("2 children flying are selected")
    public void select2ChildrenFlying() {
        homePage.selectNumberOfChildren();
    }

    @And("age of child 1 is selected")
    public void selectChild1Age() {
        homePage.selectChild1Age();
    }

    @And("age of child 2 is selected")
    public void selectChild2Age() {
        homePage.selectChild2Age();
    }

    @And("LAX is inputted into Flying from tab 2")
    public void inputFlyingFromTab2Value() {
        homePage.inputFlyingFromTab2Value(Adults2Children2MultiCityScenarioData.CITY_B);
    }

    @And("CHI is inputted into Flying to tab 2")
    public void inputFlyingToTab2Value() {
        homePage.inputFlyingToTab2Value(Adults2Children2MultiCityScenarioData.CITY_C);
    }

    @And("CHI airport is selected")
    public void selectCHIAirport() {
        homePage.selectCHIAirport();
    }

    @And("flight 2 departure date is inputted")
    public void inputFlight2DepartureDate() {
        homePage.inputFlight2DepartureDate(Adults2Children2MultiCityScenarioData.getFlight2Date());
    }

    @And("add another flight button is pressed")
    public void pressAddAnotherFlightButton() {
        homePage.pressAddAnotherFlightButton();
    }

    @And("CHI is inputted into Flying from tab 3")
    public void inputFlyingFromTab3Value() {
        homePage.inputFlyingFromTab3Value(Adults2Children2MultiCityScenarioData.CITY_C);
    }

    @And("DFW is inputted into Flying to tab 3")
    public void inputFlyingToTab3Value() {
        homePage.inputFlyingToTab3Value(Adults2Children2MultiCityScenarioData.CITY_A);
    }

    @And("flight 3 departure date is inputted")
    public void inputFlight3DepartureDate() {
        homePage.inputFlight3DepartureDate(Adults2Children2MultiCityScenarioData.getFlight3Date());
    }

    @And("search button is pressed")
    public void searchButtonIsPressed() {
        homePage.pressSearchButton();
    }
}