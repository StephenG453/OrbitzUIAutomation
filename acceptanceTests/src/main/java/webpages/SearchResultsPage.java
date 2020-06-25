package webpages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class SearchResultsPage extends WebDriverInitiation {

//    @FindBy(xpath = "//fieldset[@id='stops']//div[3]//div[1]//label[1]")
//    private WebElement nonstopButton;

    public SearchResultsPage(WebDriver driver) {
        super(driver);
    }

    public boolean isAt() {
        return driver.getCurrentUrl().contains("www.orbitz.com/Flights-Search");
    }

    public void getNumberOfItineraries() {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//ul[@id='flightModuleList']")));

        WebElement results = driver.findElement(By.xpath("//ul[@id='flightModuleList']"));
        List<WebElement> itineraries = results.findElements(By.tagName("li"));

        System.out.println("All itineraries available: " + itineraries.size());
    }

    public void pressNonStopButton() {
        WebDriverWait wait = new WebDriverWait(driver, 10);
//        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//fieldset[@id='stops']//div[3]//div[1]//label[1]")));

        WebElement nonstopButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//fieldset[@id='stops']//div[3]//div[1]//label[1]")));
        nonstopButton.click();
    }

    public void selectFirstListedFlight() {
        WebDriverWait wait = new WebDriverWait(driver, 10);
//        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[1]//div[1]//div[2]//div[2]//div[1]//div[2]//button[1]")));

        WebElement selectButtonForFirstFlight = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//li[1]//div[1]//div[2]//div[2]//div[1]//div[2]//button[1]")));
        selectButtonForFirstFlight.click();
     }

     public void pressSelectThisFareButton() {
         WebDriverWait wait = new WebDriverWait(driver, 5);
//         wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[1]//div[2]//div[1]//div[1]//div[1]//div[1]//button[1]")));

         WebElement selectThisFareButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//li[1]//div[2]//div[1]//div[1]//div[1]//div[1]//button[1]")));
         selectThisFareButton.click();
     }

     public void scrollToPageBottom() {
         JavascriptExecutor js = (JavascriptExecutor) driver;
         js.executeScript("window.scrollBy(0,250)");
     }
}
