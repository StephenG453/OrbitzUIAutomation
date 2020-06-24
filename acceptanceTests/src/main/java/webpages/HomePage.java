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

//    public void selectFlyingFromTab1Value() {
//        WebElement dfwAirportSelection = driver.findElement(By.xpath("//strong[contains(text(),'Dallas (DFW - Dallas-Fort Worth Intl.)')]"));
//        dfwAirportSelection.click();
//    }

    public void selectDFWAirport() {
        WebElement dfwAirportSelection = driver.findElement(By.xpath("//strong[contains(text(),'Dallas (DFW - Dallas-Fort Worth Intl.)')]"));
        dfwAirportSelection.click();
    }

    public void inputFlyingToTab1Value() {
        flyingToTab1.sendKeys("LAX");
    }

//    public void selectFlyingToTab1Value() {
//        WebElement laxAirportSelection = driver.findElement(By.xpath("//strong[contains(text(),'Los Angeles (LAX - Los Angeles Intl.)')]"));
//        laxAirportSelection.click();
//    }

    public void selectLAXAirport() {
        WebElement laxAirportSelection = driver.findElement(By.xpath("//strong[contains(text(),'Los Angeles (LAX - Los Angeles Intl.)')]"));
        laxAirportSelection.click();
    }

    public void inputFlight1DepartureDate() {
        flight1DepartureDate.sendKeys("07/01/2020");
    }

    public void selectNumberOfAdults() {
        Select adultsDropdown = new Select(driver.findElement(By.xpath("//select[@id='flight-adults-hp-flight']")));
        adultsDropdown.selectByIndex(1);
    }

    /*
        I know beforehand that we are selecting 2 children... however in a real life scenario we might not know
     */

    public void selectNumberOfChildren() {
        Select childrenDropdown = new Select(driver.findElement(By.xpath("//select[@id='flight-children-hp-flight']")));
        childrenDropdown.selectByIndex(2);
    }

    public void selectChild1Age() {
        Select child1AgeDropdown = new Select(driver.findElement(By.xpath("//select[@id='flight-age-select-1-hp-flight']")));
        child1AgeDropdown.selectByIndex(3);
    }

    public void selectChild2Age() {
        Select child2AgeDropdown = new Select(driver.findElement(By.xpath("//select[@id='flight-age-select-2-hp-flight']")));
        child2AgeDropdown.selectByIndex(5);
    }

    public void inputFlyingFromTab2Value() {
        flyingFromTab2.sendKeys("LAX");
    }

    public void selectFlyingFromTab2Value() {
        WebElement laxAirportSelection = driver.findElement(By.xpath("//strong[contains(text(),'Los Angeles (LAX - Los Angeles Intl.)')]"));
        laxAirportSelection.click();
    }

    public void inputFlyingToTab2Value() {
        flyingToTab2.sendKeys("CHI");
    }

    public void selectCHIAirport() {
        WebElement chiAirportSelection = driver.findElement(By.xpath("//strong[contains(text(),\"Chicago (ORD - O'Hare Intl.)\")]"));
        chiAirportSelection.click();
    }
}
