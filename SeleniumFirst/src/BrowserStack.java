import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserStack {

	public static void main(String[] args) throws Throwable {
		
		System.setProperty("webdriver.chrome.driver",
		"C:\\Users\\cgvak\\eclipse-workspace\\SeleniumFirst\\Driver\\chromedriver.exe"); 

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		
		driver.get("https://www.browserstack.com/guide/maximize-chrome-window-in-selenium");
		
		driver.findElement(By.linkText("Get Started free")).click();
		Thread.sleep(2500);
		driver.findElement(By.id("accept-cookie-notification")).click();
		Thread.sleep(2500);
		driver.findElement(By.id("user_full_name")).sendKeys("Example");
		Thread.sleep(2500);
		driver.findElement(By.id("user_email_login")).sendKeys("Example123?@gmail.com");
		Thread.sleep(2500);
		driver.findElement(By.id("user_password")).sendKeys("Example123@");
		Thread.sleep(2500);
		driver.findElement(By.id("tnc_checkbox")).click();
		Thread.sleep(2500);
		driver.findElement(By.id("user_submit")).click();
		Thread.sleep(2500);
		
		
		String title = driver.getTitle();
		System.out.println(title);
		
		String source = driver.getPageSource();
		System.out.println(source);
		
		Thread.sleep(2500);
	
		driver.close();
		
		
		
		
	}

}