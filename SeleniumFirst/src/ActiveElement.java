import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;

public class ActiveElement {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver",
		"C:\\Users\\cgvak\\eclipse-workspace\\SeleniumFirst\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		//Gmail sign in page
		driver.get("https://accounts.google.com/");
		WebElement activeEle  = driver.switchTo().activeElement();
		activeEle.sendKeys("auser123@gmail.com", Keys.TAB, Keys.TAB, Keys.TAB,Keys.ENTER); 
		
		
		//Dummy login page exampleS
		driver.get("http://demo.t3-framework.org/joomla30/index.php/en/joomla-pages/sample-page-2/login-page");
		WebElement example2 = driver.switchTo().activeElement();
		example2.sendKeys("user123", Keys.TAB, "user123@", Keys.TAB, Keys.TAB, Keys.ENTER);
		
		String title = driver.getTitle();
		System.out.println(title);
		
		driver.close();	
	}

}