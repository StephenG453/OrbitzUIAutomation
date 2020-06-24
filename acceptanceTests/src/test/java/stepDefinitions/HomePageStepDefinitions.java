package stepDefinitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;
import webpages.HomePage;
import webpages.WebDriverInitiation;

public class HomePageStepDefinitions {

    protected static WebDriver driver;

    private WebDriverInitiation webDriverInitiation;
    private HomePage homePage;

    @Given("orbitz.com is loaded and the home page is visible")
    public void initializeDriverAndOpenOrbitz() { //split this... dont have a method do 2 different actions
        webDriverInitiation = new WebDriverInitiation(driver);
        webDriverInitiation.initialize();
        webDriverInitiation.loadWebPage();

        driver = webDriverInitiation.driver;
        homePage = new HomePage(driver);
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
        homePage.inputFlyingFromTab1Value();
    }

    @And("DFW airport is selected")
    public void selectDFWAirport() {
        homePage.selectFlyingFromTab1Value();
    }

    @And("LAX is inputted into Flying to tab 1")
    public void inputFlyingToTab1Value() {
        homePage.inputFlyingToTab1Value();
    }

    @And("LAX airport is selected")
    public void selectLAXAirport() {
        homePage.selectFlyingToTab1Value();
    }
}
