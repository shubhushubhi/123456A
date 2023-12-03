package testsuite;

import browserfactory.BaseTest;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LoginTest extends BaseTest {
    String baseUrl = "https://opensource-demo.orangehrmlive.com/";

    @Before
    public void setUp() {

        openBrowser(baseUrl);
    }

   @Test

    public void login(){
        driver.findElement(By.className("orangehrm-login-layout")).click();

        String actualText = driver.findElement(By.xpath("//div/input[@name='txtUsername']")).getText();
        String ExpectedText = "Welcome, Please Sign In!";

        Assert.assertEquals(actualText,ExpectedText);
    }


    @Test
    public void userShouldLoginWithValidCredentials(){

       // WebElement loginLink = driver.findElement(By.className("ico-login"));
       // loginLink.click();

        WebElement emailLoginField =driver.findElement(By.id("Username"));
        emailLoginField.sendKeys("Admin");


        driver.findElement(By.id("Password")).sendKeys("admin123");
        driver.findElement(By.xpath("/html/body/div[@id='app']/div[@class='orangehrm-login-layout']/div[@class='orangehrm-login-layout-blob']/div[@class='orangehrm-login-container']/div[@class='orangehrm-login-slot-wrapper']/div[@class='orangehrm-login-slot']/div[@class='orangehrm-login-form']/form[@class='oxd-form']/div[@class='oxd-form-actions orangehrm-login-action']/button[@class='oxd-button oxd-button--medium oxd-button--main orangehrm-login-button']'Login')]")).click();
       // String actualErrorMsg = driver.findElement(By.xpath("//div[@class='topic-block-title']")).getText();
       // String expectedErrorMsg = "Welcome to our store";


    }

}
