package guviTask16;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class WikiPediaSearch {
	
	


	    public static void main(String[] args) {
	        // Set the path to the ChromeDriver executable
	        System.setProperty("webdriver.chrome.driver", "path_to_chromedriver.exe");

	        // Create ChromeOptions to maximize the browser window
	        ChromeOptions options = new ChromeOptions();
	        options.addArguments("--start-maximized");

	        // Initialize the ChromeDriver with options
	        WebDriver driver = (WebDriver) new ChromeDriver(options);

	        // Navigate to Wikipedia.org
	        driver.get("https://www.wikipedia.org");

	        // Find the search input field and enter the query "artificial intelligence"
	        WebElement searchInput = driver.findElement(By.id("searchInput"));
	        searchInput.sendKeys("artificial intelligence");
	        searchInput.submit();

	        // Wait for the search results to load (you may need to add explicit waits for robustness)
	        // Assuming we are waiting for a specific element in the search results to appear
	        WebElement searchResult = driver.findElement(By.xpath("//div[@class='mw-search-result-heading']/a"));
	        
	        // Click on the search result link
	        searchResult.click();

	        // Wait for the "History" section to load
	        WebElement historySection = driver.findElement(By.xpath("//span[@id='History']"));

	        // Print the title of the "History" section
	        System.out.println("Title of the 'History' section: " + historySection.getText());

	        // Close the browser
	        driver.quit();
	    }



}
