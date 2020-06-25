package webpages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class SearchResultsPage extends WebDriverInitiation {

    public SearchResultsPage(WebDriver driver) {
        super(driver);
    }

    public boolean isAt() {
        return driver.getCurrentUrl().contains("www.orbitz.com/Flights-Search");
    }

    public void getNumberOfItineraries() {
        WebElement results = driver.findElement(By.xpath("//ul[@id='flightModuleList']"));
        List<WebElement> itineraries = results.findElements(By.tagName("li"));

//        for (WebElement itinerary : itineraries) {
//            System.out.println(itinerary.getTagName());
//        }
        System.out.println("All itineraries available: " + itineraries.size());
    }

    public void pressNonStopButton() {

    }
}
