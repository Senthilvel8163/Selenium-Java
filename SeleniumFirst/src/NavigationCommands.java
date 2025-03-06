import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class NavigationCommands {

	public static void main(String[] args) throws Throwable {
		
		System.setProperty("webdriver.chrome.driver", 
		"C:\\Users\\cgvak\\eclipse-workspace\\SeleniumFirst\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.ebay.com/b/Fashion/bn_7000259856");
		String url = driver.getCurrentUrl();
		System.out.println("fashion page url " +url);
		
		Thread.sleep(3000);
		
		driver.findElement(By.linkText("Affiliates")).click(); 
		
		String hurl = driver.getCurrentUrl();
		System.out.println("affiliate page url " +hurl);
		
		Thread.sleep(3000);
		
		driver.navigate().back();
		Thread.sleep(2000);
		driver.navigate().forward();
		
		System.out.println("Returning page url " + driver.getCurrentUrl());
		
		driver.navigate().refresh();
		driver.navigate().to("https://www.ebay.com/sl/sell");
		
		
		
		
		
		
		
		
		
	
		
		

	}

}
