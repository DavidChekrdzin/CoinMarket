import Pages.HistoricalDataPage;
import Pages.HomePage;
import Pages.SeeMorePage;
import Pages.SpotLightPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import static org.testng.Assert.assertEquals;

public class FETest3 {
    private WebDriver driver;
    protected HomePage homePage;
    @BeforeTest
    public void setUp(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        homePage = new HomePage(driver);
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        driver.get("https://coinmarketcap.com");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
    }
    @AfterTest
    public void tearDown()
    {
        driver.quit();
    }
    @Test
    public void verifyThat10DifferentCoinsAreTheSameOnBothPages() throws InterruptedException {

        SpotLightPage spotLightPage = homePage.clickSpotLightPage();


        SeeMorePage seeMorePage = spotLightPage.recordDataInMostVisited();


        seeMorePage.recordDataInSeeMorePage();

        //Verify that first 10 Most Visited coins are also displayed in the new tab, in correct order
        assertEquals(spotLightPage.list1,seeMorePage.list2);
    }
}
