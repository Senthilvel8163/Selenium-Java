import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\cgvak\\eclipse-workspace\\SeleniumFirst\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		// Locate the table
		driver.get("https://letcode.in/table");
		WebElement table = driver.findElement(By.id("simpletable"));

		// Print header title of the table
		List<WebElement> headers = table.findElements(By.tagName("th"));
		for (WebElement header : headers) {

			String text = header.getText();
			System.out.println("text");
		}
		// Find the number of data in column column
		List<WebElement> allRows = table.findElements(By.cssSelector("tbody tr"));
		int size = allRows.size();
		System.out.println("Size of rows: " + size);

		if (size == 3)
			System.out.println("Test case passed");
		else {
			System.out.println("Test case failed");

			// Print 1st,2nd,3rd value in 1st column
			for (WebElement row : allRows) {
				List<WebElement> columns = row.findElements(By.tagName("tr"));
				WebElement firstColumn = columns.get(1);
				System.out.println(firstColumn.getText());
			}

			// Click check box using input element in 3rd column
			for (int i = 0; i < size; i++) {
				List<WebElement> rows = allRows.get(i).findElements(By.tagName("td"));
				WebElement lastname = rows.get(1);
				String text = lastname.getText();
				System.out.println();
				if (text.equals("Chatterjee")) {
					WebElement input = rows.get(3).findElement(By.tagName("input"));
					input.click();
					break;
				}
				driver.quit();
			}

		}
	}
}
