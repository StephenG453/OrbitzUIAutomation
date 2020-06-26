package webpages;

import org.openqa.selenium.WebDriver;

import java.util.ArrayList;
import java.util.List;

public class TripDetailsPage extends WebDriverInitiation {

    public TripDetailsPage(WebDriver driver) {
        super(driver);
    }

    public boolean isAt() {
        List<String> browserTabs = new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(browserTabs.get(1));

        return driver.getCurrentUrl().contains("www.orbitz.com/Flight-Information");
    }
}