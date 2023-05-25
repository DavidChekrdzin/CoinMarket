package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

public class HistoricalDataPage {
    private WebDriver driver;
    private By dateRangeButton = By.xpath("/html/body/div[1]/div/div[1]/div[2]/div/div[3]/div/div/div[1]/div[1]/span");
    private By lastSevenDaysButton = By.xpath("/html/body/div[1]/div/div[1]/div[2]/div/div[3]/div/div/div[1]/div[1]/div/div/div[1]/div/div/div[1]/div[2]/ul/li[1]");
    private By continueButton = By.xpath("/html/body/div[1]/div/div[1]/div[2]/div/div[3]/div/div/div[1]/div[1]/div/div/div[1]/div/div/div[2]/span");
    private int rowCount;

    public HistoricalDataPage(WebDriver driver)
    {
        this.driver = driver;
    }

    public int getRowCount() {
        return rowCount;
    }

    public void setRowCount(int rowCount) {
        this.rowCount = rowCount;
    }

    public void cryptoHistory() throws InterruptedException {
        Thread.sleep(10000);
        Actions actions = new Actions(driver);
        actions.moveToElement(driver.findElement(dateRangeButton));//hover over date range button
        Thread.sleep(3000);
        driver.findElement(dateRangeButton).click();//click the date range button
        Thread.sleep(3000);
        driver.findElement(lastSevenDaysButton).click();//click last seven days button
        Thread.sleep(3000);
        driver.findElement(continueButton).click();//clcik continue button
        Thread.sleep(5000);
        List<WebElement> getRows = driver.findElements(By.xpath("//*[@id=\"__next\"]/div/div[1]/div[2]/div/div[3]/div/div/div[1]/div[2]/table/tbody/tr"));//find the table and get data from rows in table
        rowCount = getRows.size();//get the count of the rows
    }

}
