package testsuite;

import browserfactory.BaseTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LoginTest extends BaseTest {

    String baseUrl = "https://the-internet.herokuapp.com/login";

    @Before
    public void setUp() {

        openBrowser(baseUrl);
    }
@Test
    public void login(){
        By.className("ico-login").findElement(driver).click();

        String actualText = driver.findElement(By.xpath("/html/body/div[2]/div/div/h2")).getText();
        String ExpectedText = "Login Page";

        Assert.assertEquals(actualText,ExpectedText);
    }
@Test
    public void UserShouldLoginSuccessfullyWithValidCredentials(){
        WebElement loginLink = driver.findElement(By.className("ico-login"));
        loginLink.click();

        WebElement emailLoginField =driver.findElement(By.id("Username"));
        emailLoginField.sendKeys("tomsmith");


        driver.findElement(By.id("Password")).sendKeys("SuperSecretPassword!");
        driver.findElement(By.xpath("//button[contains(text(),'Log in')]")).click();
        String actualErrorMsg = driver.findElement(By.xpath("/html/body/div[2]/div/div/form/button/i")).getText();
        //   String expectedErrorMsg = "Welcome to our store";

    }
    @After
    public void endTest() {
        closeBrowser();
    }
}
