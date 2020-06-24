package webpages;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.BrowserType;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;

public class WebDriverInitiation {

    public WebDriver driver;

    private final String URL = "https://orbitz.com/";

    public WebDriverInitiation(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void initialize() {
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.setCapability(CapabilityType.PLATFORM_NAME, Platform.MAC);
        chromeOptions.setCapability(CapabilityType.BROWSER_NAME, BrowserType.CHROME);
        System.setProperty("webdriver.chrome.driver", "/Users/cbrat62/Desktop/Selenium/chromedriver");

        driver = new ChromeDriver(chromeOptions);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
    }

    public void loadWebPage() {
        driver.get(URL);
    }

    public void cleanUp() {
        driver.close();
        driver.quit();
    }
}
