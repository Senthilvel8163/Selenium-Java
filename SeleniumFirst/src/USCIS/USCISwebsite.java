package USCIS;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class USCISwebsite {

	public static void main(String[] args) throws Throwable {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\cgvak\\eclipse-workspace\\SeleniumFirst\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.uscis.gov/file-online");
		driver.findElement(By.id("gsc-i-id1")).sendKeys("n-400", Keys.ENTER);
		driver.navigate().back();
		String title = driver.getTitle();
		System.out.println(title);

		String url = driver.getCurrentUrl();
		System.out.println(url);
		
		//String source = driver.getPageSource();
		//System.out.println(source);
		
		driver.getWindowHandle();

		Thread.sleep(2000);
		driver.close();

	}

}
