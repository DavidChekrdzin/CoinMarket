import Pages.HistoricalDataPage;
import Pages.HomePage;
import Pages.SeeMorePage;
import Pages.SpotLightPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class FETest3 {
    private WebDriver driver;
    protected HomePage homePage;
    @Given("I launch the Chrome Browser in fetest3 and open coinmarket page")
    public void setUp(){
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        driver = new ChromeDriver();
        homePage = new HomePage(driver);
        driver.get("https://coinmarketcap.com");
        driver.manage().window().maximize();
    }
    @And("Close The Browser in fetest3")
    public void tearDown()
    {
        driver.quit();
    }
    @Then("I record data from first page and verify that it is in the same order as in most visited coins")
    public void verifyThat10DifferentCoinsAreTheSameOnBothPages() throws InterruptedException {
        Thread.sleep(10000);

        SpotLightPage spotLightPage = homePage.clickSpotLightPage();

        Thread.sleep(5000);

        SeeMorePage seeMorePage = spotLightPage.recordDataInMostVisited();

        Thread.sleep(5000);

        seeMorePage.recordDataInSeeMorePage();

        Thread.sleep(3000);

        //Verify that first 10 Most Visited coins are also displayed in the new tab, in correct order
        assertEquals(spotLightPage.page1text1,seeMorePage.page2text1);
        assertEquals(spotLightPage.page1text2,seeMorePage.page2text2);
        assertEquals(spotLightPage.page1text3,seeMorePage.page2text3);
        assertEquals(spotLightPage.page1text4,seeMorePage.page2text4);
        assertEquals(spotLightPage.page1text5,seeMorePage.page2text5);
        assertEquals(spotLightPage.page1text6,seeMorePage.page2text6);
        assertEquals(spotLightPage.page1text7,seeMorePage.page2text7);
        assertEquals(spotLightPage.page1text8,seeMorePage.page2text8);
        assertEquals(spotLightPage.page1text9,seeMorePage.page2text9);
        assertEquals(spotLightPage.page1text10,seeMorePage.page2text10);
    }
}
