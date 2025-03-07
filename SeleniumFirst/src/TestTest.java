import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestTest {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\cgvak\\eclipse-workspace\\SeleniumFirst\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.get("http://202.129.196.131:8085/synergy/user/login");

		driver.findElement(By.xpath("(//input[@class='form-control'])[1]")).sendKeys("senthilvel");
		driver.findElement(By.xpath("(//input[@class='form-control'])[2]")).sendKeys("RohKarRit123@");
		driver.findElement(By.xpath("driver.findElement(By.xpath(\"(//input[@class='form-control'])[2]\")).")).click();
		driver.findElement(By.xpath(
				"driver.findElement(By.xpath(\"driver.findElement(By.xpath(\\\"(//input[@class='form-control'])[2]\\\")).\")).click();"))
				.click();

	}
}
