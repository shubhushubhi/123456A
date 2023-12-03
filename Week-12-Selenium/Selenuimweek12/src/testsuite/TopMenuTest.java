package testsuite;

import browserfactory.basetest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class TopMenuTest extends basetest {

    String baseUrl = "https://demo.nopcommerce.com/";

    @Before
    public void setUp(){
        openBrowser(baseUrl);

    }
@Test
    public void userShouldNavigateToComputerPageSuccessfully() {
        WebElement computers = driver.findElement(By.xpath("//ul[@class='top-menu notmobile']/li[1]/a"));
    }
@Test
    public void userShouldNavigateToElectronicsPageSuccessfully() {
        WebElement electronics = driver.findElement(By.xpath("/html[@class='html-category-page']/body/div[@class='master-wrapper-page']/div[@class='master-wrapper-content']/div[@class='master-column-wrapper']/div[@class='center-2']/div[@class='page category-page']/div[@class='page-title']/h1"));
    }

@Test

    public void userShouldNavigateToApparelPageSuccessfully(){


    }
@Test
    public void userShouldNavigateToDigitalDownloadsPageSuccessfully(){

    }
@Test

    public void userShouldNavigateToJewelryPageSuccessfully()
    {

    }
@Test
    public void userShouldNavigateToGiftCardsPageSuccessfully(){

    }
    @After
    public void endTest() {
        //  closeBrowser();
        //  closeBrowser();
    }
}

