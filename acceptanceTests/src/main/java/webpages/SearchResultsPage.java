package webpages;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class SearchResultsPage extends WebDriverInitiation {

    public SearchResultsPage(WebDriver driver) {
        super(driver);
    }

    public boolean isAt() {
        return driver.getCurrentUrl().contains("www.orbitz.com/Flights-Search");
    }

    public void getNumberOfItineraries() {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//ul[@id='flightModuleList']")));

//        WebElement results = driver.findElement(By.xpath("//ul[@id='flightModuleList']"));
//        WebElement results = driver.findElement(By.xpath("//h3[contains(text(),'Result')]"));

        List<WebElement> itineraries = driver.findElements(By.xpath("//h3[contains(text(),'Result')]"));
//
//        for (WebElement itin : itineraries) {
//            System.out.println("itin: " + itin.getText());
//        }

        System.out.println("All itineraries available: " + itineraries.size());
    }

    public void pressNonStopButton() {
//        WebDriverWait wait = new WebDriverWait(driver, 10);
//        WebElement nonstopButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//fieldset[@id='stops']//div[3]//div[1]//label[1]")));
//        nonstopButton.click();

        int attempts = 0;
        while (attempts < 2) {
            try {
                WebDriverWait wait = new WebDriverWait(driver, 10);
                WebElement nonstopButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//fieldset[@id='stops']//div[3]//div[1]//label[1]")));
                nonstopButton.click();
                break;
            } catch (StaleElementReferenceException e) {
                System.out.println("StaleElementReferenceException");
            }
            catch (NoSuchElementException e) {
                System.out.println("No Such Element Found");
            }
            catch (TimeoutException e) {
                System.out.println("Timeout on trying to find the Element");
            }
            attempts++;
        }
    }

    public void selectFirstListedFlight() {
//        WebDriverWait wait = new WebDriverWait(driver, 10);
//        WebElement selectButtonForFirstFlight = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//li[1]//div[1]//div[2]//div[2]//div[1]//div[2]//button[1]")));
//        selectButtonForFirstFlight.click();

        int attempts = 0;
        while (attempts < 2) {
            try {
                WebDriverWait wait = new WebDriverWait(driver, 10);
                WebElement selectButtonForFirstFlight = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//li[1]//div[1]//div[2]//div[2]//div[1]//div[2]//button[1]")));
                selectButtonForFirstFlight.click();
                break;
            } catch (StaleElementReferenceException e) {
                System.out.println("StaleElementReferenceException");
            }
            catch (NoSuchElementException e) {
                System.out.println("No Such Element Found");
            }
            attempts++;
        }
     }

     public void pressSelectThisFareButton() {
//         WebDriverWait wait = new WebDriverWait(driver, 10);
//         WebElement selectThisFareButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//li[1]//div[2]//div[1]//div[1]//div[1]//div[1]//button[1]")));
//         selectThisFareButton.click();

         int attempts = 0;
         while (attempts < 2) {
             try {
                 WebDriverWait wait = new WebDriverWait(driver, 10);
                 WebElement selectThisFareButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//li[1]//div[2]//div[1]//div[1]//div[1]//div[1]//button[1]")));
                 selectThisFareButton.click();
                 break;
             } catch (StaleElementReferenceException e) {
                 System.out.println("StaleElementReferenceException");
             }
             catch (NoSuchElementException e) {
                 System.out.println("No Such Element Found");
             }
             attempts++;
         }
     }
}
