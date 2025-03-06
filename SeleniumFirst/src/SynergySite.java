import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SynergySite {

	public static void main(String[] args) throws Throwable {
		
		//Locating Chromedriver
		System.setProperty("webdriver.chrome.driver",
		"C:\\Users\\cgvak\\eclipse-workspace\\SeleniumFirst\\Driver\\chromedriver.exe");

		//Initiating Webdriver
		WebDriver driver = new ChromeDriver();
		
		//Maximize the browser
		driver.manage().window().maximize();
		
		//Launch Synergy Website
		driver.get("http://202.129.196.131:8085/synergy/swipeentry");

		Thread.sleep(5000);

		//Enter Username
		driver.findElement(By.xpath("(//input[@class='form-control'])[1]")).sendKeys("senthilvel");

		Thread.sleep(3000);

		//Enter Password
		driver.findElement(By.xpath("(//input[@class='form-control'])[2]")).sendKeys("");

		Thread.sleep(3000);

		//Clicking the Login button
		driver.findElement(By.xpath("//button[normalize-space(text())='Login']")).click();

		Thread.sleep(3000);

		//Clicking on the Swipe Entry Title
		driver.findElement(By.xpath("//a[normalize-space(text())='Swipe Entry']")).click();

		Thread.sleep(2000);

		//Clicking on the Manual button
		driver.findElement(By.xpath("//button[normalize-space(text())='Manual']")).click();
		
		Thread.sleep(2000);
		
		//Clicking on the Add button
		driver.findElement(By.xpath("(//button[contains(@class,'btn btn-secondary')])[1]")).click();
		
		Thread.sleep(2000);
		
		//Clicking on the time selection Text field
		driver.findElement(By.xpath("//input[contains(@class,'form-control flat_field')]")).click();
		
		Thread.sleep(2000);
		
		//Select Time
		driver.findElement(By.xpath("//div[normalize-space(text())='5:00 PM']")).click();
		
		Thread.sleep(2000);
		
		//Click on Reporting Lead's Dropdown 
		driver.findElement(By.xpath("//select[@class='form-control required']")).click();
		
		Thread.sleep(2000);
		
		//Select Reporting Lead
		driver.findElement(By.xpath("//option[normalize-space(text())='Lalitha']")).click();
		
		Thread.sleep(2000);
		
		//Enter Reason
		driver.findElement(By.xpath("//textarea[@class='form-control required']")).sendKeys("Logout");
		
		Thread.sleep(2000);
		
		//Save the entries(Clicking on the Save button)
		//driver.findElement(By.xpath("(//button[contains(@class,'btn btn-secondary')])[2]")).click();
		
		Thread.sleep(000);
		
		//Entering daily task progress
		
		//Clicking on the Daily Task Progress title
		driver.findElement(By.xpath("//a[normalize-space(text())='Daily Task Progress']")).click();
		
		Thread.sleep(2000);
		
		//Entering task description
		driver.findElement(By.xpath("(//textarea[@class='form-control'])[1]")).sendKeys("Functionality testing for US01 to US06");
		
		Thread.sleep(2000);
		
		//Entering task time 
		driver.findElement(By.xpath("//input[@class='form-control timepicker']")).sendKeys("01.00");
		
		Thread.sleep(2000);
		
		//Clicking on the save button
		//driver.findElement(By.xpath("//button[contains(@class,'btn btn-sm')]")).click();
		
		
	}

}
