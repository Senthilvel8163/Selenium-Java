package ApacheMaven;

import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class ExcelSeleniumTest {
    
    public static String[] getCredentials(String filePath, int rowNumber) throws IOException {
        try (FileInputStream file = new FileInputStream(filePath);
             Workbook workbook = new XSSFWorkbook(file)) {

            Row row = workbook.getSheetAt(0).getRow(rowNumber);
            return new String[]{row.getCell(0).getStringCellValue(), row.getCell(1).getStringCellValue()};
        }
    }

    public static void main(String[] args) throws IOException {
        String filePath = "D:\\data1.xlsx"; 
        String[] credentials = getCredentials(filePath, 0); 

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://practicetestautomation.com/practice-test-login/");

        driver.findElement(By.id("username")).sendKeys(credentials[0]);
        driver.findElement(By.id("password")).sendKeys(credentials[1]);
        driver.findElement(By.id("submit")).click();

        System.out.println(driver.getPageSource().contains("Logged In") ? "Login Successful" : "Login Failed");

        //driver.quit();
    }
}
