package guviTask16;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirefoxWebDriverExample {
	
	public static void main(String[] args) {
        // Set the path to the GeckoDriver executable (Firefox driver)
        System.setProperty("webdriver.gecko.driver", "path/to/geckodriver");

        // Initialize the Firefox WebDriver
        FirefoxDriver driver = new FirefoxDriver();

        // Maximize the browser window
        ((WebDriver) driver).manage().window().maximize();

        // Navigate to Google.com
        ((WebDriver) driver).get("https://www.google.com");

        // Print the URL of the current page
        String currentUrl = ((WebDriver) driver).getCurrentUrl();
        System.out.println("Current URL: " + currentUrl);

        // Reload the page
        ((WebDriver) driver).navigate().refresh();

        // Wait for a few seconds (you can add explicit or implicit waits here)

        // Close the browser
        ((WebDriver) driver).quit();
    }
}



