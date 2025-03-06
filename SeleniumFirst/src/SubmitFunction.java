import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SubmitFunction {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
		"C:\\Users\\cgvak\\eclipse-workspace\\SeleniumFirst\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://www.testyou.in/Login.aspx");

		// driver.navigate().to("https://www.testyou.in/Login.aspx");

		driver.findElement(By.id("ctl00_CPHContainer_txtUserLogin")).sendKeys("hello@gmail.com");
		driver.findElement(By.id("ctl00_CPHContainer_txtPassword")).sendKeys("hello123@");
		driver.findElement(By.id("ctl00_CPHContainer_btnLoginn")).submit();

		// get location
		Point elem = driver.findElement(By.xpath("//*[@id=\"ctl00_CPHHeader_dvTestCategory\"]/div")).getLocation();
		System.out.println("Location of the element: " + elem);

		// get size
		Dimension dime = driver.findElement(By.xpath("//*[@id=\"ctl00_CPHHeader_dvTestCategory\"]/div")).getSize();
		System.out.println("Height of element: " + dime.height);
		System.out.println("Width of element: " + dime.width);

		// get class
		Class<? extends WebDriver> cla = driver.getClass();
		System.out.println("Getting class is: " + cla);

		driver.close();
	}

}
