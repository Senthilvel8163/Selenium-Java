import java.io.File;
import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class TakeScreenshot {

	public static void main(String[] args) throws IOException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\cgvak\\eclipse-workspace\\SeleniumFirst\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		// Screenshot for full page
		driver.get("https://www.youtube.com/");
		File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		File desti = new File("./snaps/img.png");
		FileHandler.copy(scrFile, desti);

		// Screenshot for particular element
		driver.get("https://www.ebay.com/");
		WebElement ele = driver.findElement(By.id("gh-btn"));
		File eleSrc = ((TakesScreenshot) ele).getScreenshotAs(OutputType.FILE);
		File eleDesti = new File("./snaps/img2.png");
		FileHandler.copy(eleSrc, eleDesti);

		// Screenshot for particular section
		driver.get("https://www.ebay.com/b/Fashion/bn_7000259856");
		WebElement info = driver.findElement(By.className("pagecontainer__top"));
		File infSrc = ((TakesScreenshot) info).getScreenshotAs(OutputType.FILE);
		File infDesti = new File("./snaps/img3.png");
		FileHandler.copy(infSrc, infDesti);

	}

}
