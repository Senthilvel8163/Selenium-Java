import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class NicholsonHeating {

	public static void main(String[] args) throws Throwable {
		
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\cgvak\\eclipse-workspace\\SeleniumFirst\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		
		//Get page title
		driver.get("https://143266926.hs-sites-eu1.com/");
		String title = driver.getTitle();
		System.out.println(title); 
		 
		//Click 'Home' menu
		driver.get("https://143266926.hs-sites-eu1.com/");
		Thread.sleep(3000);
		driver.findElement(By.linkText("Home")).click(); 
		
		//Click 'About' menu
		driver.get("https://143266926.hs-sites-eu1.com/");
		Thread.sleep(3000);
		driver.findElement(By.linkText("About")).click(); 
		
		//Click 'FAQs'
		driver.get("https://143266926.hs-sites-eu1.com/");
		Thread.sleep(3000);
		driver.findElement(By.linkText("FAQs")).click(); 
		
		//Click 'book an online appointment' button
		driver.get("https://143266926.hs-sites-eu1.com/");
	    Thread.sleep(3000);
	    driver.findElement(By.xpath("//*[@id=\"main-menu\"]/ul/li[6]/a")).click();  
		
		//Click 'about us' button
		driver.get("https://143266926.hs-sites-eu1.com/");
	    Thread.sleep(3000);
	    driver.findElement(By.xpath("//*[@id=\"hs_cos_wrapper_dnd_home_banner-module-2\"]"
	    		+ "/div/div/div/div[2]/div/div/div[3]/div/div[2]/a")).click(); 
	    
	    //Hover the mouse on services drop down menu
	    driver.get("https://143266926.hs-sites-eu1.com/");
	   WebElement elet =  driver.findElement(By.linkText("Services"));
	    Actions builder = new Actions(driver);
	    builder.moveToElement(elet).perform(); 
	
	    
	    //Find the color of the button
	    driver.get("https://143266926.hs-sites-eu1.com/");
	    WebElement Actcolor = driver.findElement(By.xpath("//*[@id=\"main-menu\"]/ul/li[6]/a"));
	    String color= Actcolor.getCssValue("background-color");
	    System.out.println(color); 
	    
	    
	    //Find height and width of the button
	    driver.get("https://143266926.hs-sites-eu1.com/");
	    WebElement ele = driver.findElement(By.xpath("//*[@id=\"main-menu\"]/ul/li[6]/a"));
	    System.out.println(ele.getRect().height);
	    System.out.println(ele.getRect().width);    
		
		//Right click on button
		driver.get("https://143266926.hs-sites-eu1.com/");
		WebElement rit = driver.findElement(By.xpath("//*[@id=\"main-menu\"]/ul/li[6]/a"));
		Actions builder1 = new Actions(driver);
		builder1.contextClick(rit).perform(); 
		
		//Get current url
		
		driver.get("https://143266926.hs-sites-eu1.com/");
		String currentUrl = driver.getCurrentUrl();
		
		System.out.println("Home page url is "+ currentUrl);
		
	    Thread.sleep(1500);
		
	    //Get secondary page url
		driver.findElement(By.linkText("Finance")).click();
	    String finUrl = driver.getCurrentUrl();
	    System.out.println("Finance page url is "+ finUrl);
	    
	   //Close the driver
	    driver.quit();

   }
}
