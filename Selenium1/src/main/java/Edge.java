import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;


import java.sql.Driver;

public class Edge {
    public static void main(String[] args) {

        WebDriver driver = new EdgeDriver();
        driver.get("https://high-techit.co.uk/");
        driver.quit();

        //  EdgeOptions options = new EdgeOptions();
      //  driver = new EdgeDriver(options);
    }
}
