package stepDefinitions;

import cucumber.api.java.en.Given;
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
}
