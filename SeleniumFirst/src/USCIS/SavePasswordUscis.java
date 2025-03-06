package USCIS;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class SavePasswordUscis {
	public static void main(String[] args) {
		// Set the path to the ChromeDriver executable
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\cgvak\\eclipse-workspace\\SeleniumFirst\\Driver\\chromedriver.exe");

		// Create ChromeOptions instance
		ChromeOptions options = new ChromeOptions();

		// Disable password saving prompt
		options.addArguments("--disable-save-password-bubble");

		// Initialize WebDriver with ChromeOptions
		WebDriver driver = new ChromeDriver(options);

		try {
			// Navigate to the URL with username and password
			String username = "your_username";
			String password = "your_password";
			String url = "http://" + username + ":" + password + "@example.com";

			driver.get(url);

			// Your further automation steps
			System.out.println("Navigated to URL successfully.");

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			// Close the browser
			driver.quit();
		}
	}
}