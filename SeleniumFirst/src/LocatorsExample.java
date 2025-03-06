import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LocatorsExample {

	public static void main(String[] args) throws Throwable {

		System.setProperty("webdiver.chrome.driver",
				"C:\\Users\\cgvak\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://www.ebay.com/");

		// id locator

		driver.findElement(By.id("gh-ac")).sendKeys("iphone 14");
		driver.findElement(By.id("gh-btn")).click();

		// name locator

		driver.get(
				"https://www.naukri.com/registration/createAccount?othersrcp=23531&wExp=N&utm_source=google&utm_medium=cpc&utm_campaign=Brand&gad=1&gclid=EAIaIQobChMInL_j0fH5gQMV-aJmAh3MBghiEAAYASAAEgLY2vD_BwE&gclsrc=aw.ds");
		driver.findElement(By.name("email")).sendKeys("hello123@gmail.com");

		// linkText locator

		driver.get("https://www.ebay.com/");
		driver.findElement(By.linkText("Collectibles and Art")).click();

		// partialLinktext locator

		driver.get("https://www.ebay.com/");
		driver.findElement(By.partialLinkText("Collectibles and")).click();

		// className locator

		driver.get("https://www.ebay.com/");
		int count = driver.findElements(By.className("hl-color-block-banner__content")).size();
		System.out.println(count);

		// tagName locator

		driver.get("https://www.ebay.com/");
		int numberOfLink = driver.findElements(By.tagName("a")).size();
		System.out.println(numberOfLink);

		// css selector locator(Tag#id)
		driver.get(
				"https://www.amazon.in/-/hi/ap/signin?openid.pape.max_auth_age=3600&openid.return_to=https%3A%2F%2Fwww.amazon.in%2Fspr%2Freturns%2Fgift&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=amzn_psr_desktop_in&openid.mode=checkid_setup&language=en_IN&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");
		driver.findElement(By.cssSelector("input#ap_email")).sendKeys("123@example.com");

		driver.findElement(By.id("ap_password")).sendKeys("123456");

		// Tag.class
		driver.get(
				"https://www.amazon.in/-/hi/ap/signin?openid.pape.max_auth_age=3600&openid.return_to=https%3A%2F%2Fwww.amazon.in%2Fspr%2Freturns%2Fgift&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=amzn_psr_desktop_in&openid.mode=checkid_setup&language=en_IN&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");
		driver.findElement(By.cssSelector("input.a-button-input")).click();

		// Tag[Attribute=value]

		driver.get("https://accounts.google.com/");
		driver.findElement(By.cssSelector("input[name=identifier]")).sendKeys("example123@gmail.com");

		// xPath locator
		driver.get("https://login.yahoo.com/");
		driver.findElement(By.xpath("//input[@id='login-username']")).sendKeys("example123@yahoomail.com");
		driver.findElement(By.xpath("//input[@id='login-signin']")).click();

		Thread.sleep(5000);

		String title = driver.getTitle();
		System.out.println(title);

		driver.quit();

	}

}
