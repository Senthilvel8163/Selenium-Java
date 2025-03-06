import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DribbleSite {

	public static void main(String[] args) throws Throwable {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\cgvak\\eclipse-workspace\\SeleniumFirst\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://dribbble.com/");

		// Click the header menu icon and check it is navigate to same page
		WebElement element1 = driver.findElement(By.className("nav-v2-logo"));
		element1.click();

		Thread.sleep(5000);

		WebElement element2 = driver.findElement(By.linkText("Find talent"));
		element2.click();
		String link1 = driver.getCurrentUrl();
		System.out.println(link1);

		Thread.sleep(5000);

		WebElement element3 = driver.findElement(
				By.xpath("//*[@id=\"main\"]/div/div[1]/div" + "[1]/div/div/div/div/div/div[1]/div[2]/p/a"));
		element3.click();
		String link2 = driver.getCurrentUrl();
		System.out.println(link2);

		Thread.sleep(5000);

		Thread.sleep(5000);
		WebElement element4 = driver.findElement(By.xpath("/html/body/div[2]/div[2]/nav/div/ul/li[3]/a"));
		Actions builder = new Actions(driver);
		builder.moveToElement(element4).perform();

		Thread.sleep(5000);

		WebElement element5 = driver.findElement(By.xpath("//*[@id=\"page\"]/div[2]/div[2]/nav/div/ul/li[4]/a"));
		element5.click();
		String link3 = driver.getCurrentUrl();
		System.out.println(link3);

		// Click and print the url of "Go Pro" linktext presenting in header menu
		WebElement element6 = driver.findElement(By.xpath("//*[@id=\"page\"]/div[2]/div[2]/nav/div/ul/li[5]/a"));
		element6.click();
		String link4 = driver.getCurrentUrl();
		System.out.println(link4);

		Thread.sleep(5000);

		// Type "Design" in search box and click enter
		driver.findElement(By.className("nav-v2-search__input")).sendKeys("Design", Keys.ENTER);

		Thread.sleep(5000);

		WebElement element7 = driver.findElement(By.className("nav-v2-dynamic__login"));
		element7.click();
		String link5 = driver.getCurrentUrl();
		System.out.println(link5);

		Thread.sleep(5000);

		WebElement element8 = driver.findElement(By.xpath("//a[@class='btn2 btn2--medium']"));
		String link6 = driver.getCurrentUrl();
		System.out.println(link6);

		Thread.sleep(5000);

		String color = driver.findElement(By.xpath("//a[@class='btn2 btn2--medium']")).getCssValue("background");
		System.out.println(color);

		// Print the color of text box which is presenting above the h6 text in
		WebElement element10 = driver.findElement(By.xpath("//div[text()='Over 3 million ready-to-work creatives!']"));
		String color2 = element10.getCssValue("background-color");
		System.out.println(color2);

		WebElement element9 = driver.findElement(By.xpath("//h1[text()='Work with the world’s top creative talent.']"));
		String bannerText = element9.getText();
		System.out.println(bannerText);

		driver.findElement(By.xpath("//a[contains(text(),'Start hiring today')]")).click();
		String link8 = driver.getCurrentUrl();
		System.out.println(link8);

	}
}
