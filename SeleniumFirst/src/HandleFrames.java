import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleFrames {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\cgvak\\eclipse-workspace\\SeleniumFirst\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://letcode.in/frame#google_vignette");
		WebElement myFrame = driver.findElement(By.xpath("//iframe[@src='frameUI']"));
		driver.switchTo().frame(myFrame);
		driver.findElement(By.name("fname")).sendKeys("Senthilvel");
		driver.findElement(By.name("lname")).sendKeys("C");
		driver.switchTo().frame(1);
		driver.findElement(By.name("email")).sendKeys("example123@gmail.com"); 
		
}
}