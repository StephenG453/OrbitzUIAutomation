package webpages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class HomePage extends WebDriverInitiation {

//    @FindBy(xpath = "")
//    private WebElement pageheader;

    @FindBy(xpath = "//button[@id='tab-flight-tab-hp']//span[@class='icon icon-flights']")
    private WebElement flightsButton;

    @FindBy(xpath = "//label[@id='flight-type-multi-dest-label-hp-flight']")
    private WebElement multiCityFlightsButton;

    @FindBy(xpath = "//select[@id='flight-adults-hp-flight']")
    private WebElement adultsDropDown;

    @FindBy(xpath = "//select[@id='flight-children-hp-flight']")
    private WebElement childrenDropDown;

    @FindBy(xpath = "//input[@id='flight-origin-hp-flight']")
    private WebElement flyingFromTab1;

    @FindBy(xpath = "//input[@id='flight-destination-hp-flight']")
    private WebElement flyingToTab1;

    @FindBy(xpath = "//input[@id='flight-departing-single-hp-flight']")
    private WebElement flight1DepartureDate;

    @FindBy(xpath = "//input[@id='flight-2-origin-hp-flight']")
    private WebElement flyingFromTab2;

    @FindBy(xpath = "//input[@id='flight-2-destination-hp-flight']")
    private WebElement flyingToTab2;

//    public boolean isAtHomePage() {
//        return pageHeader.isDisplayed();
//    }

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public void pressFlightsButton() {
        flightsButton.click();
    }

    public void pressMultiCityFlightsButton() {
        multiCityFlightsButton.click();
    }

    public void inputFlyingFromTab1Value() {
        flyingFromTab1.sendKeys("DFW");
    }

    public void selectFlyingFromTab1Value() {
        WebElement dfwAirportSelection = driver.findElement(By.xpath("//strong[contains(text(),'Dallas (DFW - Dallas-Fort Worth Intl.)')]"));
        dfwAirportSelection.click();
    }

    public void inputFlyingToTab1Value() {
        flyingToTab1.sendKeys("LAX");
    }

    public void selectFlyingToTab1Value() {
        WebElement laxAirportSelection = driver.findElement(By.xpath("//strong[contains(text(),'Los Angeles (LAX - Los Angeles Intl.)')]"));
        laxAirportSelection.click();
    }
}

// //a[@id='aria-option-1']//div[@class='multiLineDisplay details'] - DFW
// //a[@id='aria-option-2']//div[@class='multiLineDisplay details'] - DAL