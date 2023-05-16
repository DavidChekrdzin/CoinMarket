package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SpotLightPage {
    private WebDriver driver;
    public String page1text1;
    public String page1text2;
    public String page1text3;
    public String page1text4;
    public String page1text5;
    public String page1text6;
    public String page1text7;
    public String page1text8;
    public String page1text9;
    public String page1text10;
    private By page1table1 = By.xpath("/html/body/div[1]/div/div[1]/div[2]/div/div[2]/div[4]/div[2]/table/tbody/tr[1]/td[2]/a/div/div/p");
    private By page1table2 = By.xpath("/html/body/div[1]/div/div[1]/div[2]/div/div[2]/div[4]/div[2]/table/tbody/tr[2]/td[2]/a/div/div/p");
    private By page1table3 = By.xpath("/html/body/div[1]/div/div[1]/div[2]/div/div[2]/div[4]/div[2]/table/tbody/tr[3]/td[2]/a/div/div/p");
    private By page1table4 = By.xpath("/html/body/div[1]/div/div[1]/div[2]/div/div[2]/div[4]/div[2]/table/tbody/tr[4]/td[2]/a/div/div/p");
    private By page1table5 = By.xpath("/html/body/div[1]/div/div[1]/div[2]/div/div[2]/div[4]/div[2]/table/tbody/tr[5]/td[2]/a/div/div/p");
    private By page1table6 = By.xpath("/html/body/div[1]/div/div[1]/div[2]/div/div[2]/div[4]/div[2]/table/tbody/tr[6]/td[2]/a/div/div/p");
    private By page1table7 = By.xpath("/html/body/div[1]/div/div[1]/div[2]/div/div[2]/div[4]/div[2]/table/tbody/tr[7]/td[2]/a/div/div/p");
    private By page1table8 = By.xpath("/html/body/div[1]/div/div[1]/div[2]/div/div[2]/div[4]/div[2]/table/tbody/tr[8]/td[2]/a/div/div/p");
    private By page1table9 = By.xpath("/html/body/div[1]/div/div[1]/div[2]/div/div[2]/div[4]/div[2]/table/tbody/tr[9]/td[2]/a/div/div/p");
    private By page1table10 = By.xpath("/html/body/div[1]/div/div[1]/div[2]/div/div[2]/div[4]/div[2]/table/tbody/tr[10]/td[2]/a/div/div/p");

    private By seeMoreLink = By.xpath("//*[@class = 'sc-6b1dfb2c-3 liWSOs']/a[@href = '/most-viewed-pages/']");
    public SpotLightPage(WebDriver driver)
    {
        this.driver = driver;
    }
    public SeeMorePage recordDataInMostVisited()
    {
        WebElement table1 = driver.findElement(page1table1);
        page1text1 = table1.getText();//get text from element in the table

        WebElement table2 = driver.findElement(page1table2);
        page1text2 = table2.getText();//get text from element in the table

        WebElement table3 = driver.findElement(page1table3);
        page1text3 = table3.getText();//get text from element in the table

        WebElement table4 = driver.findElement(page1table4);
        page1text4 = table4.getText();//get text from element in the table

        WebElement table5 = driver.findElement(page1table5);
        page1text5 = table5.getText();//get text from element in the table

        WebElement table6 = driver.findElement(page1table6);
        page1text6 = table6.getText();//get text from element in the table

        WebElement table7 = driver.findElement(page1table7);
        page1text7 = table7.getText();//get text from element in the table

        WebElement table8 = driver.findElement(page1table8);
        page1text8 = table8.getText();//get text from element in the table

        WebElement table9 = driver.findElement(page1table9);
        page1text9 = table9.getText();//get text from element in the table

        WebElement table10 = driver.findElement(page1table10);
        page1text10 = table10.getText();//get text from element in the table

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,800)", "");//scroll down
        driver.findElement(seeMoreLink).click();//click see more link

        return new SeeMorePage(driver);
    }
}
