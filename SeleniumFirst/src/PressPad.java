import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class PressPad {

	public static void main(String[] args) throws Throwable {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\cgvak\\eclipse-workspace\\SeleniumFirst\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		
		//Launching the website
		driver.get("https://26533155.hs-sites-eu1.com/home");
		
			//Click and enter the word in searchbox presenting at header menu
		driver.findElement(By.name("term")).sendKeys("Knowledge", Keys.ENTER); 
		
			//Click and find the color of SIGN UP/ LOG IN button
		driver.findElement(By.className("theme-btn header-cta pink-btn")).click(); 
		String buttonColor = driver.findElement(By.xpath("(//a[contains(@class,'theme-btn header-cta')])[1]"))
		.getCssValue("background");
		System.out.println(buttonColor);  
		
		
			//Click and find the color of DONATE button
		driver.findElement(By.xpath("(//a[contains(@class,'theme-btn header-cta')])[2]")).click();
		String buttonColor2 = driver.findElement(By.xpath("(//a[contains(@class,'theme-btn header-cta')])[2]"))
		.getCssValue("background");
		System.out.println(buttonColor2); 
		
		//Click the Header logo button
		driver.findElement(By.className("hs-image-widget")).click(); 
		
		//Hover the mouse on About-us menu
		WebElement element = driver.findElement(By.xpath("(//a[@class='menu-link'])[1]"));
		Actions builder = new Actions(driver);
		builder.moveToElement(element).perform(); 
		
		//Click on the Other Services menu
		driver.findElement(By.linkText("Other services")).click(); 
		
		//Hover the mouse on Resources drop-down
		WebElement element2 = driver.findElement(By.xpath("//a[contains(text(),'Resources')]"));
		Actions builder1 = new Actions(driver);
		builder.moveToElement(element2).perform(); 
		
		//Click the Support menu
		driver.findElement(By.linkText("Support")).click();  
		
		//Click social media icons in Header menu section
		driver.findElement(By.xpath("//span[@id='hs_cos_wrapper_header_social_icons_']")).click();
		driver.findElement(By.xpath("//span[@id='hs_cos_wrapper_header_social_icons__2']")).click();
		driver.findElement(By.xpath("//span[@id='hs_cos_wrapper_header_social_icons__3']")).click();
		driver.findElement(By.xpath("//span[@id='hs_cos_wrapper_header_social_icons__4']")).click();
		driver.findElement(By.xpath("//span[@id='hs_cos_wrapper_header_social_icons__5']")).click();  
		
		//Get text from banner section
		WebElement text = driver.findElement(By.tagName("h1"));
		String texxt = text.getText();
		System.out.println(texxt);  
		
		//Click and check MEETS OUR HOSTS AND INTERNS button
		driver.findElement(By.linkText("Meet our hosts and interns")).click(); 
		
		//Click and check JOIN OUR MISSION button
		driver.findElement(By.xpath("//a[contains(text(),'Join our mission')]")).clear(); 
		
		//Get attribute for background image in banner section
		WebElement image = driver.findElement(By.xpath("(//div[@class='home-banner-wrapper']//div)[1]"));
		String img = image.getAttribute("style");
		System.out.println(img); 
		
		//What is PressPad section
		//Get image source in What is PressPad section
		WebElement image2 = driver.findElement(By.xpath("(//img[@loading='lazy'])[1]"));
		String img2 = image2.getAttribute("src");
		System.out.println(img2);  
		
		//Get entire text from What is PressPad section
		WebElement  text3 = driver.findElement(By.xpath("(//div[@class='col-6'])[2]"));
		String texts3 = text3.getText();
		System.out.println(texts3);  
		
		//Click Support Us button
		driver.findElement(By.xpath("//a[contains(@class,'theme-btn support-btn')]")).click();  
		
		//Find background color of Why are we needed? section
		String bacColor = driver.findElement(By.xpath("(//div[@class='section-inner-content'])[1]")).getCssValue("color");
		System.out.println(bacColor); 
		
		//Click on FIND OUT MORE button
		driver.findElement(By.xpath("//a[contains(text(),'find out more')]")).click();  
		
		//Print all text in the Join our mission
		WebElement text4 = driver.findElement(By.xpath("//div[@class='banner-bg-color sec-padd-80']"));
		String textt4 = text4.getText();
		System.out.println(textt4); 
		
		//Click on FIND OUT MORE ABOUT ELIGIBILITY button
		driver.findElement(By.xpath("//a[contains(text(),'find out more')]")).click(); 
		
		//To get background color of the Join our mission section
		WebElement colorr = driver.findElement(By.xpath("//div[@class='banner-bg-color sec-padd-80']"));
		String backColor = colorr.getCssValue("background-color");
		System.out.println(backColor);  
		
		//Playing all videos presenting in Meet our hosts and interns
		driver.findElement(By.xpath("(//div[@class='slick-list draggable']//div)[1]")).click();
		driver.findElement(By.xpath("(//div[@class='slick-list draggable']//div)[2]")).click();
		driver.findElement(By.xpath("(//div[@class='slick-list draggable']//div)[3]")).click();  
		
		//Click on YOUR RIGHTS AS AN INTERN (YES, INTERNS HAVE RIGHTS!) post
		driver.findElement(By.partialLinkText("(yes, interns have rights!)")).click();   
		
		//Click four links present in footer section
		driver.findElement(By.linkText("First Link")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.linkText("Second Long Link")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.linkText("Third Link")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.linkText("Fourth Long Link")).click();
		
		driver.quit(); 
		
		
		
		
		
		
		
		
		

	}

}
