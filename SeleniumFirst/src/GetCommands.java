import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class GetCommands {

	public static void main(String[] args) throws Throwable {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\cgvak\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		// Maximize the window
		driver.manage().window().maximize();

		
		//get URL 
		driver.get("https://accounts.google.com/");

		//getTitle 
		String title = driver.getTitle(); System.out.println(title);

		//getCurrentUrl
		String url = driver.getCurrentUrl(); System.out.println(url);

		//getPageSource 
		String code = driver.getPageSource();
		System.out.println(code);

		//getWindowHandle
		driver.getWindowHandle();
		driver.manage().window().minimize();


		//geWindowHandles 
		driver.getWindowHandles();


		//navigate 
		Thread.sleep(3000); driver.navigate().refresh();

		//swithTo
		driver.navigate().to("https://accounts.google.com/");


		//getAttribute 
		driver.get("https://accounts.google.com/"); 
		String value = driver.findElement(By.id("identifierId")).getAttribute("name");
		System.out.println(value);

		//Pressing enter key driver.get("https://www.flipkart.com/");
		driver.findElement(By.name("q")).sendKeys("iPhone-15",Keys.ENTER);

		//clear text driver.get("https://www.ebay.com/");
		driver.findElement(By.id("gh-ac")).clear();


		// isDisabled
		driver.get(
				"https://user.mockplus.com/signin?next=https%3A%2F%2Fwww.mockplus.com%2Fblog%2Fpost%2Flogin-page-examples&source=web-rp");
		boolean text = driver.findElement(By.id("normal-login")).isEnabled();
		System.out.println(text); 

		//readOnly
		driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml_input_readonly");
		String isReadOnly = driver.findElement(By.xpath("//*[@id=\"country\"]")).getAttribute("readonly");
		System.out.println(isReadOnly);  
        
		Wait<WebDriver> wait1 = new WebDriverWait(driver, Duration.ofSeconds(10));
		
		driver.quit();

	}

}
