import Pages.HistoricalDataPage;
import Pages.HomePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.*;
import Pages.HomePage;
import Pages.HistoricalDataPage;


public class FETest2 {
    private WebDriver driver;
    protected HomePage homePage;
    private HistoricalDataPage historicalDataPage;
    private int expectedRows = 6;
    @BeforeTest
    public void setUp(){
        //System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        homePage = new HomePage(driver);
        driver.get("https://coinmarketcap.com");
        driver.manage().window().maximize();
    }
    @AfterTest
    public void tearDown()
    {
        driver.quit();
    }
    @Then("I check that Historical data for the last 7 days are displayed for crypto1")
    public void testCrypto1() throws InterruptedException {
        Thread.sleep(10000);

        HistoricalDataPage historicalDataPage = homePage.clickElipsisAndViewHistoricalDataCrypto1();

        historicalDataPage.cryptoHistory();

        Assert.assertEquals(historicalDataPage.getRowCount(),expectedRows);//get count of rows and then compare it to the expected number or rows(6)
    }
    @Then("I check that Historical data for the last 7 days are displayed for crypto2")
    public void testCrypto2() throws InterruptedException {
        Thread.sleep(10000);

        HistoricalDataPage historicalDataPage = homePage.clickElipsisAndViewHistoricalDataCrypto2();

        historicalDataPage.cryptoHistory();

        Assert.assertEquals(historicalDataPage.getRowCount(),expectedRows);//get count of rows and then compare it to the expected number or rows(6)
    }
    @Then("I check that Historical data for the last 7 days are displayed for crypto3")
    public void testCrypto3() throws InterruptedException {
        Thread.sleep(10000);

        HistoricalDataPage historicalDataPage = homePage.clickElipsisAndViewHistoricalDataCrypto3();

        historicalDataPage.cryptoHistory();

        Assert.assertEquals(historicalDataPage.getRowCount(),expectedRows);//get count of rows and then compare it to the expected number or rows(6)
    }
    @Then("I check that Historical data for the last 7 days are displayed for crypto4")
    public void testCrypto4() throws InterruptedException {
        Thread.sleep(10000);

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,400)", "");

        HistoricalDataPage historicalDataPage = homePage.clickElipsisAndViewHistoricalDataCrypto4();

        historicalDataPage.cryptoHistory();

        Assert.assertEquals(historicalDataPage.getRowCount(),expectedRows);//get count of rows and then compare it to the expected number or rows(6)
    }
    @Then("I check that Historical data for the last 7 days are displayed for crypto5")
    public void testCrypto5() throws InterruptedException {
        Thread.sleep(10000);

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,400)", "");

        HistoricalDataPage historicalDataPage = homePage.clickElipsisAndViewHistoricalDataCrypto5();

        historicalDataPage.cryptoHistory();

        Assert.assertEquals(historicalDataPage.getRowCount(),expectedRows);//get count of rows and then compare it to the expected number or rows(6)
    }
}
