package ListAndSet;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SampleListTestCase {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\cgvak\\eclipse-workspace\\SeleniumFirst\\Driver\\chromedriver.exe");
		
		//Launching the web site
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		driver.findElement(By.name("q")).sendKeys("cricket", Keys.ENTER);
		
		//Find size(number) of word in web page using list
		List<WebElement> crickets = driver.findElements(By.xpath("//*[contains(text(), 'cricket') or contains(text(), 'Cricket')]"));
		System.out.println(crickets.size());
		Thread.sleep(10);
		driver.close();
		
	}

}
