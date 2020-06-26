package webpages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import utils.Adults2Children2MultiCityScenarioData;

public class HomePage extends WebDriverInitiation {

    Adults2Children2MultiCityScenarioData scenarioData;

    @FindBy(id = "tab-flight-tab-hp")
    private WebElement flightsButton;

    @FindBy(id = "flight-type-multi-dest-label-hp-flight")
    private WebElement multiCityFlightsButton;

    @FindBy(id = "flight-origin-hp-flight")
    private WebElement flyingFromTab1;

    @FindBy(id = "flight-destination-hp-flight")
    private WebElement flyingToTab1;

    @FindBy(id = "flight-departing-single-hp-flight")
    private WebElement flight1DepartureDate;

    @FindBy(id = "flight-2-origin-hp-flight")
    private WebElement flyingFromTab2;

    @FindBy(id = "flight-2-destination-hp-flight")
    private WebElement flyingToTab2;

    @FindBy(id = "flight-2-departing-hp-flight")
    private WebElement flight2DepartureDate;

    @FindBy(id = "add-flight-leg-hp-flight")
    private WebElement addAnotherFlightButton;

    @FindBy(id = "flight-3-origin-hp-flight")
    private WebElement flyingFromTab3;

    @FindBy(id = "flight-3-destination-hp-flight")
    private WebElement flyingToTab3;

    @FindBy(id = "flight-3-departing-hp-flight")
    private WebElement flight3DepartureDate;

    @FindBy(xpath = "//form[@id='gcw-flights-form-hp-flight']//button[contains(@class,'btn-primary btn-action gcw-submit')]")
    private WebElement searchButton;

    public boolean isAt() {
        return driver.getCurrentUrl().contentEquals("https://www.orbitz.com/");
    }

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public void pressFlightsButton() {
        flightsButton.click();
    }

    public void pressMultiCityFlightsButton() {
        multiCityFlightsButton.click();
    }

    public void inputFlyingFromTab1Value(String input) {
//        flyingFromTab1.sendKeys(Adults2Children2MultiCityScenarioData.CITY_A);
        flyingFromTab1.sendKeys(input);
    }

    public void selectDFWAirport() {
        WebElement dfwAirportSelection = driver.findElement(By.xpath("//strong[contains(text(),'Dallas (DFW - Dallas-Fort Worth Intl.)')]"));
        dfwAirportSelection.click();
    }

    public void inputFlyingToTab1Value(String input) {
//        flyingToTab1.sendKeys(Adults2Children2MultiCityScenarioData.CITY_B);
        flyingToTab1.sendKeys(input);
    }

    public void selectLAXAirport() {
        WebElement laxAirportSelection = driver.findElement(By.xpath("//strong[contains(text(),'Los Angeles (LAX - Los Angeles Intl.)')]"));
        laxAirportSelection.click();
    }

    public void inputFlight1DepartureDate(String input) {
//        flight1DepartureDate.sendKeys((Adults2Children2MultiCityScenarioData.getFlight1Date()));
        flight1DepartureDate.sendKeys(input);
    }

    public void selectNumberOfAdults() {
        Select adultsDropdown = new Select(driver.findElement(By.xpath("//select[@id='flight-adults-hp-flight']")));
        adultsDropdown.selectByIndex(1);
    }

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

    public void inputFlyingFromTab2Value(String input) {
//        flyingFromTab2.sendKeys(Adults2Children2MultiCityScenarioData.CITY_B);
        flyingFromTab2.sendKeys(input);
    }

    public void inputFlyingToTab2Value(String input) {
//        flyingToTab2.sendKeys(Adults2Children2MultiCityScenarioData.CITY_C);
        flyingToTab2.sendKeys(input);
    }

    public void selectCHIAirport() {
        WebElement chiAirportSelection = driver.findElement(By.xpath("//strong[contains(text(),\"Chicago (ORD - O'Hare Intl.)\")]"));
        chiAirportSelection.click();
    }

    public void inputFlight2DepartureDate(String input) {
//        flight2DepartureDate.sendKeys(Adults2Children2MultiCityScenarioData.getFlight2Date());
        flight2DepartureDate.sendKeys(input);
    }

    public void pressAddAnotherFlightButton() {
        addAnotherFlightButton.click();
    }

    public void inputFlyingFromTab3Value(String input) {
//        flyingFromTab3.sendKeys(Adults2Children2MultiCityScenarioData.CITY_C);
        flyingFromTab3.sendKeys(input);
    }

    public void inputFlyingToTab3Value(String input) {
//        flyingToTab3.sendKeys(Adults2Children2MultiCityScenarioData.CITY_A);
        flyingToTab3.sendKeys(input);
    }

    public void inputFlight3DepartureDate(String input) {
//        flight3DepartureDate.sendKeys(Adults2Children2MultiCityScenarioData.getFlight3Date());
        flight3DepartureDate.sendKeys(input);
    }

    public void pressSearchButton() {
        searchButton.click();
    }
}
