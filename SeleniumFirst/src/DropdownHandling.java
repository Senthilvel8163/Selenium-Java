import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownHandling {

	public static void main(String[] args) throws Throwable {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\cgvak\\eclipse-workspace\\SeleniumFirst\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		// Select drop down by visible text
		driver.get("https://letcode.in/dropdowns");
		driver.findElement(By.cssSelector("#fruits"));
		WebElement fruits = driver.findElement(By.id("fruits"));
		Select myFruits = new Select(fruits);
		myFruits.selectByVisibleText("Mango");

		Thread.sleep(3000);

		// Select drop down by value
		WebElement country = driver.findElement(By.id("country"));
		Select myCountry = new Select(country);
		myCountry.selectByValue("India");

		Thread.sleep(3000);

		// Select drop down by index
		driver.get("https://letcode.in/dropdowns");
		WebElement ele = driver.findElement(By.id("lang"));
		Select myProgram = new Select(ele);
		myProgram.selectByIndex(1);

		Thread.sleep(3000);

		driver.close();

	}

}
