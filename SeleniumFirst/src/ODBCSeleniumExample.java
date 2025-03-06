import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ODBCSeleniumExample {

    public static void main(String[] args) {

        // Step 1: Set up ODBC connection
        String connectionUrl = "jdbc:odbc:DataSourceName"; // Your ODBC data source name
        
        // Step 2: JDBC connection
        try (Connection conn = DriverManager.getConnection(connectionUrl, "username", "password");
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery("SELECT * FROM your_table")) {

            // Step 3: Process the ResultSet (retrieve data from the database)
            while (rs.next()) {
                String data = rs.getString("your_column");
                System.out.println("Data from database: " + data);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        // Step 4: Set up Selenium WebDriver
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\cgvak\\eclipse-workspace\\SeleniumFirst\\Driver\\chromedriver.exe"); // Adjust path to your chromedriver
        
        WebDriver driver = new ChromeDriver();
        
        // Step 5: Perform Selenium web automation
        driver.get("http://example.com");

        // Your Selenium browser automation logic goes here
        
        //driver.quit();
    }
}
