import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;

public class GettextGetattribute {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\cgvak\\eclipse-workspace\\SeleniumFirst\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://letcode.in/edit");
		driver.manage().window().maximize();

		// GetText
		WebElement text1 = driver.findElement(
				By.xpath("/html/body/app-root/app-input/" + "section[1]/div/div/div[1]/div/div/div[3]/label"));
		String text = text1.getText();
		System.out.println(text);

		// GetAttribute
		driver.get("https://letcode.in/edit");
		WebElement text2 = driver.findElement(By.className("label"));
		String att = text2.getAttribute("class");
		System.out.println(att);

		driver.quit();

	}

}
