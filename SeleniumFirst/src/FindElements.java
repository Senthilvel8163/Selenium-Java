import java.time.Duration;
import java.util.List;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElements {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
	    "C:\\Users\\cgvak\\eclipse-workspace\\SeleniumFirst\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://letcode.in/edit");
		List<WebElement> labels = driver.findElements(By.tagName("label"));

		// Get particular element only
		WebElement lastElement = labels.get(labels.size()-1);
		System.out.println("Last element: " + lastElement.getText());
		int size = labels.size();
		if (size == 5) {
			System.out.println("Test case passed");
		}
		else {
			System.out.println("Test case failed");
		}
		for (WebElement data : labels) {
			String text = data.getText();
			System.out.println(text);
			
			driver.close();
			
		}
	}
}
