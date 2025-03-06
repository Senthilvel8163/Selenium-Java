import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class KhayeriFlooring {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\cgvak\\eclipse-workspace\\SeleniumFirst\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://0f0d8f-73.myshopify.com/");
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("(//div[@class='newsletter-popup__inner']//button)[1]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[normalize-space(text())='Saved Items']")).click();
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(3000);
		driver.findElement(By.xpath("Thread.sleep(2000);")).click();
		Thread.sleep(1500);
		driver.navigate().back();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[text()='Saved Items']/following-sibling::a")).click();
		Thread.sleep(3000);
		
	}

}
