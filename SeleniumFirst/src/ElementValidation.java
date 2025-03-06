import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;

public class ElementValidation {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver",
		"C:\\Users\\cgvak\\eclipse-workspace\\SeleniumFirst\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
			driver.get("https://letcode.in/buttons");
		
		//isDisplayed
		driver.get("https://letcode.in/buttons");
		WebElement disp = driver.findElement(By.id("home"));
		boolean isDisp = disp.isDisplayed();
		System.out.println(isDisp); 
		
		
		//isSelected
		driver.get("https://letcode.in/radio");
		WebElement sele = driver.findElement(By.xpath("//input[@type='checkbox']"));
	    boolean isSelec = sele.isSelected();
	    System.out.println(isSelec);   
		
		
        //isEnabled
	    driver.get("https://letcode.in/radio");
	    WebElement enab = driver.findElement(By.xpath("//a[@class='navbar-item']"));
	    boolean isEna = enab.isEnabled();
	    System.out.println(isEna);
	    
	    driver.quit();
	    
	    
	}

}
