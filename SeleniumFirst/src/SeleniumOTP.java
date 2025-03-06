import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class SeleniumOTP {
    public static void main(String[] args) {
        // Set up the WebDriver (Make sure to set the correct path to your chromedriver)
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\cgvak\\eclipse-workspace\\SeleniumFirst\\Driver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        
        try {
            // Set up an explicit wait
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

            // Open the professional email login page (Example: Outlook Web Access)
            driver.get("https://outlook.office365.com/");
            
            // Log in to the email account
            WebElement emailField = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("i0116"))); // Wait for email field
            emailField.sendKeys("senthilvel628@gmail.com");
            driver.findElement(By.id("idSIButton9")).click();
            
            driver.findElement(By.id("idA_PWD_SwitchToPassword")).click();
            
            WebElement passwordField = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("i0118"))); // Wait for password field
            //passwordField.sendKeys("RohKarRit123@@");
           // driver.findElement(By.id("idSIButton9")).click();
            
            // Search for the OTP email
            WebElement searchBox = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("input[aria-label='Search']"))); // Wait for search box
            searchBox.sendKeys("subject:Your OTP");
            searchBox.submit();
            
            // Wait for search results and click on the first email
            WebElement firstEmail = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(".lvHighlightAllClass"))); // Wait for the first email to appear
            firstEmail.click();
            
            // Wait for the email content to load
            WebElement emailBody = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".customizable-property-entity-content"))); // Wait for email body
            String emailContent = emailBody.getText();

            // Extract OTP
            String otp = emailContent.replaceAll(".*Your OTP is (\\d{6}).*", "$1");
            System.out.println("Extracted OTP: " + otp);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // Close the browser
            driver.quit();
        }
    }
}
