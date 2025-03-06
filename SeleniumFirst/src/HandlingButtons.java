import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingButtons {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\cgvak\\eclipse-workspace\\SeleniumFirst\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://www.ebay.com/");

		// Get X and Y Co-ordinates
		WebElement element = driver.findElement(By.id("gh-btn"));
		Point point = element.getLocation();
		int x = point.getX();
		int y = point.getY();
		System.out.println(" x= " + x + " y= " + y);

		// Find color of the button
		WebElement buttonClr = driver.findElement(By.id("gh-btn"));
		String color = buttonClr.getCssValue("background-color");
		System.out.println(color);

		// Find height and width of the button
		WebElement rect = driver.findElement(By.id("gh-btn"));
		System.out.println(rect.getRect().height);
		System.out.println(rect.getRect().width);

		// isEnabled
		driver.get("https://user.mockplus.com/signin");
		boolean isDisabled = driver.findElement(By.id("normal-login")).isEnabled();
		System.out.println(isDisabled);

		driver.quit();

	}

}
