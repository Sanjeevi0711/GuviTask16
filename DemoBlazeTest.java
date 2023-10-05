package guviTask16;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoBlazeTest {
	
	

	
	    public static void main(String[] args) {
	        // Set the path to the ChromeDriver executable
	        System.setProperty("webdriver.chrome.driver", "path_to_chromedriver.exe");

	        // Initialize the ChromeDriver
	        WebDriver driver = (WebDriver) new ChromeDriver();

	        // Navigate to Demoblaze.com
	        driver.get("https://www.demoblaze.com");

	        // Maximize the browser window
	        driver.manage().window().maximize();

	        // Get the title of the page
	        String pageTitle = driver.getTitle();

	        // Check if the title matches "STORE"
	        if (pageTitle.equals("STORE")) {
	            System.out.println("Page landed on correct website");
	        } else {
	            System.out.println("Page not landed on correct website");
	        }

	        // Close the browser
	        driver.quit();
	    }
	


}
