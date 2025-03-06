
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FirstSelenium1 {

	public static void main(String[] args) throws Throwable {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\cgvak\\eclipse-workspace\\SeleniumFirst\\Driver\\chromedriver.exe");

		ChromeOptions options = new ChromeOptions();
		options.setBinary("C:\\Users\\cgvak\\Downloads\\chrome-win64\\chrome-win64\\chrome.exe");
		WebDriver driver = new ChromeDriver(options);

		Thread.sleep(5000);

		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		
		Thread.sleep(3000);
		
		WebElement into = driver.findElement(By.className("_30XB9F"));
		into.click();

		Thread.sleep(3000);

		WebElement search = driver.findElement(By.name("q"));
		search.sendKeys("iPhone 15",Keys.ENTER);

		String title = driver.getTitle();
		System.out.println(title);
		
		//driver.getClass();
		
		Thread.sleep(1000);
		
		WebElement button = driver.findElement(By.className("_2puWtW _3a3qyb"));
		button.click();
		
	}

}
