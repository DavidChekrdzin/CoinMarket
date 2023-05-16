package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class HomePage {
    private WebDriver driver;
    HistoricalDataPage historicalDataPage = new HistoricalDataPage(driver);
    private By cryptoElipsis1 = By.xpath("(//td)[12]");
    private By cryptoElipsis2 = By.xpath("(//td)[24]");
    private By cryptoElipsis3 = By.xpath("(//td)[36]");
    private By cryptoElipsis4 = By.xpath("(//td)[48]");
    private By cryptoElipsis5 = By.xpath("(//td)[60]");
    private By viewHistoricalData = By.linkText("View Historical Data");
    private By cryptoCurrenciesButton = By.xpath("//div[@class = 'sc-d598dd22-1 hiGkfq menu-item-0']");
    private By spotLightButton = By.linkText("Spotlight");
    private Actions actions;
    public HomePage(WebDriver driver)
    {
        this.driver = driver;
        this.actions = new Actions(driver);
    }
    public HistoricalDataPage clickElipsisAndViewHistoricalDataCrypto1() throws InterruptedException {
        Thread.sleep(3000);
        actions.moveToElement(driver.findElement(cryptoElipsis1)).perform();//hover over cryptoellipsis
        Thread.sleep(3000);
        driver.findElement(cryptoElipsis1).click();//click the ellipsis
        Thread.sleep(3000);
        driver.findElement(viewHistoricalData).click();//click historical data
        return new HistoricalDataPage(driver);
    }
    public HistoricalDataPage clickElipsisAndViewHistoricalDataCrypto2() throws InterruptedException {
        Thread.sleep(3000);
        actions.moveToElement(driver.findElement(cryptoElipsis2)).perform();//hover over cryptoellipsis
        Thread.sleep(3000);
        driver.findElement(cryptoElipsis2).click();//click the ellipsis
        Thread.sleep(3000);
        driver.findElement(viewHistoricalData).click();//click historical data
        return new HistoricalDataPage(driver);
    }
    public HistoricalDataPage clickElipsisAndViewHistoricalDataCrypto3() throws InterruptedException {
        Thread.sleep(3000);
        actions.moveToElement(driver.findElement(cryptoElipsis3)).perform();//hover over cryptoellipsis
        Thread.sleep(3000);
        driver.findElement(cryptoElipsis3).click();//click the ellipsis
        Thread.sleep(3000);
        driver.findElement(viewHistoricalData).click();//click historical data
        return new HistoricalDataPage(driver);
    }
    public HistoricalDataPage clickElipsisAndViewHistoricalDataCrypto4() throws InterruptedException {
        Thread.sleep(3000);
        actions.moveToElement(driver.findElement(cryptoElipsis4)).perform();//hover over cryptoellipsis
        Thread.sleep(3000);
        driver.findElement(cryptoElipsis4).click();//click the ellipsis
        Thread.sleep(3000);
        driver.findElement(viewHistoricalData).click();//click historical data
        return new HistoricalDataPage(driver);
    }
    public HistoricalDataPage clickElipsisAndViewHistoricalDataCrypto5() throws InterruptedException {
        Thread.sleep(3000);
        actions.moveToElement(driver.findElement(cryptoElipsis5)).perform();//hover over cryptoellipsis
        Thread.sleep(3000);
        driver.findElement(cryptoElipsis5).click();//click the ellipsis
        Thread.sleep(3000);
        driver.findElement(viewHistoricalData).click();//click historical data
        return new HistoricalDataPage(driver);
    }

    public SpotLightPage clickSpotLightPage() throws InterruptedException {
        Thread.sleep(3000);
        actions.moveToElement(driver.findElement(cryptoCurrenciesButton)).perform();//hover over cryptocurrencies button
        Thread.sleep(3000);
        driver.findElement(spotLightButton).click();//click spotlight button
        Thread.sleep(3000);

        return new SpotLightPage(driver);
    }
}
