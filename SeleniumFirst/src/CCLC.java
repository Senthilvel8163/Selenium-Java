import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CCLC {

	public static void main(String[] args) throws Throwable {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\cgvak\\eclipse-workspace\\SeleniumFirst\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.uscis.gov/file-online");

		Thread.sleep(5000);

		driver.findElement(By.xpath("//a[normalize-space(text())='N-400, Application for Naturalization']")).click();

		Thread.sleep(5000);

		driver.findElement(By.xpath("(//a[contains(@class,'btn btn--anchor')])[1]")).click();

		Thread.sleep(5000);

		driver.close();

	}

}
