import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertHandling {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\cgvak\\eclipse-workspace\\SeleniumFirst\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		// Simple alert
		driver.get("https://nxtgenaiacademy.com/alertandpopup/");
		driver.findElement(By.name("alertbox")).click();
		Alert alert = driver.switchTo().alert();
		String text = alert.getText();
		System.out.println("Simple alert text " + text);
		alert.accept();

		// Confirm alert
		driver.get("https://nxtgenaiacademy.com/alertandpopup/");
		driver.findElement(By.name("confirmalertbox")).click();
		// Alert alert2 = driver.switchTo().alert();
		String text1 = alert.getText();
		System.out.println(text1);
		alert.accept();

		// Prompt alert
		driver.get("https://nxtgenaiacademy.com/alertandpopup/");
		driver.findElement(By.name("promptalertbox1234")).click();

		driver.close();

	}

}
