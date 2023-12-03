package testsuite;
import browserfactory.basetest;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class RegisterTest extends basetest {

    String baseUrl = "https://demo.nopcommerce.com/";

    @Before
    public void setUp(){
        openBrowser(baseUrl);
    }
@Test
public void UserShouldNavigateToRegisterPageSuccessfully(){

    WebElement register = driver.findElement(By.xpath("/html[@class='html-registration-page']/body/div[@class='master-wrapper-page']/div[@class='header']/div[@class='header-upper']/div[@class='header-links-wrapper']/div[@class='header-links']/ul/li[1]/a[@class='ico-register']"));

}
@Test
public void userShouldRegisterAccountSuccessfully(){

    driver.findElement(By.className("ico-register")).click();
    //Gender
    driver.findElement(By.id("First name:")).sendKeys("Parth");
    driver.findElement(By.id("Last Name")).sendKeys("Adhyaru");
//DOB
    driver.findElement(By.id("Email")).sendKeys("parth@Adhyaru.com");
    driver.findElement(By.id("Company Name")).sendKeys("test IT");
    driver.findElement(By.id("Password")).sendKeys("123456");
    driver.findElement(By.id("Confirm Password")).sendKeys("123456");
    driver.findElement(By.xpath("//button[contains(text(),'Register')]")).click();
    String actualErrorMsg = driver.findElement(By.xpath("//div[@class='message-error validation-summary-errors']")).getText();
    String ExpectedText = "Your registration Completed!";
}
    @After
    public void endTest() {
         closeBrowser();
    }
}
