package ListAndSet;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandling {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver",
		"C:\\Users\\cgvak\\eclipse-workspace\\SeleniumFirst\\Driver\\chromedriver.exe");
		
	    WebDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    
	    //Get current window handle string
	    driver.get("https://letcode.in/windows");
	    String windowHandle = driver.getWindowHandle();
	    System.out.println("First window: "+ windowHandle);
	    
	    //Get all open tab window handle string
	    driver.findElement(By.id("home")).click();
	    Set<String> windowHandles = driver.getWindowHandles();
	    System.out.println("Opend all window: "+windowHandles);
	    
	    //Get current window url
	    List<String> list = new ArrayList<String>(windowHandles);
	    driver.switchTo().window(list.get(1));
	    System.out.println(driver.getCurrentUrl());
	    
	    //Close the first window 
	    driver.switchTo().window(list.get(0));
	    driver.close();
	    Set <String> windowHandles2 = driver.getWindowHandles();
	    list.clear();
	    list.addAll(windowHandles2);
	    driver.switchTo().window(list.get(0));
	    String currentUrl = driver.getCurrentUrl();
	    System.out.println(currentUrl);
	

	}

}
