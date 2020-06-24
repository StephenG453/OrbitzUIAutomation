package webpages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends WebDriverInitiation {

//    @FindBy(xpath = "")
//    private WebElement pageheader;

    @FindBy(xpath = "//button[@id='tab-flight-tab-hp']//span[@class='icon icon-flights']")
    private WebElement flightsButton;

    @FindBy(xpath = "//label[@id='flight-type-multi-dest-label-hp-flight']")
    private WebElement multiCityFlightsButton;

//    public boolean isAtHomePage() {
//        return pageHeader.isDisplayed();
//    }

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public void pressFlightsButton() {
        flightsButton.click();
    }

    public void presMultiCityFlightsButton() {
        multiCityFlightsButton.click();
    }
}
