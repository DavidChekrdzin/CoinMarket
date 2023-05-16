package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SeeMorePage {
    private WebDriver driver;
    public String page2text1;
    public String page2text2;
    public String page2text3;
    public String page2text4;
    public String page2text5;
    public String page2text6;
    public String page2text7;
    public String page2text8;
    public String page2text9;
    public String page2text10;
    private By page2table1 = By.xpath("/html/body/div[1]/div/div[1]/div[2]/div/div/div[2]/table/tbody/tr[1]/td[3]/a/div/div/p");
    private By page2table2 = By.xpath("/html/body/div[1]/div/div[1]/div[2]/div/div/div[2]/table/tbody/tr[2]/td[3]/a/div/div/p");
    private By page2table3 = By.xpath("/html/body/div[1]/div/div[1]/div[2]/div/div/div[2]/table/tbody/tr[3]/td[3]/a/div/div/p");
    private By page2table4 = By.xpath("/html/body/div[1]/div/div[1]/div[2]/div/div/div[2]/table/tbody/tr[4]/td[3]/a/div/div/p");
    private By page2table5 = By.xpath("/html/body/div[1]/div/div[1]/div[2]/div/div/div[2]/table/tbody/tr[5]/td[3]/a/div/div/p");
    private By page2table6 = By.xpath("/html/body/div[1]/div/div[1]/div[2]/div/div/div[2]/table/tbody/tr[6]/td[3]/a/div/div/p");
    private By page2table7 = By.xpath("/html/body/div[1]/div/div[1]/div[2]/div/div/div[2]/table/tbody/tr[7]/td[3]/a/div/div/p");
    private By page2table8 = By.xpath("/html/body/div[1]/div/div[1]/div[2]/div/div/div[2]/table/tbody/tr[8]/td[3]/a/div/div/p");
    private By page2table9 = By.xpath("/html/body/div[1]/div/div[1]/div[2]/div/div/div[2]/table/tbody/tr[9]/td[3]/a/div/div/p");
    private By page2table10 = By.xpath("/html/body/div[1]/div/div[1]/div[2]/div/div/div[2]/table/tbody/tr[10]/td[3]/a/div/div/p");


    public SeeMorePage(WebDriver driver)
    {
        this.driver = driver;
    }
    public void recordDataInSeeMorePage()
    {
        WebElement table1 = driver.findElement(page2table1);
        page2text1 = table1.getText();//get text from element in the table

        WebElement table2 = driver.findElement(page2table2);
        page2text2 = table2.getText();//get text from element in the table

        WebElement table3 = driver.findElement(page2table3);
        page2text3 = table3.getText();//get text from element in the table

        WebElement table4 = driver.findElement(page2table4);
        page2text4 = table4.getText();//get text from element in the table

        WebElement table5 = driver.findElement(page2table5);
        page2text5 = table5.getText();//get text from element in the table

        WebElement table6 = driver.findElement(page2table6);
        page2text6 = table6.getText();//get text from element in the table

        WebElement table7 = driver.findElement(page2table7);
        page2text7 = table7.getText();//get text from element in the table

        WebElement table8 = driver.findElement(page2table8);
        page2text8 = table8.getText();//get text from element in the table

        WebElement table9 = driver.findElement(page2table9);
        page2text9 = table9.getText();//get text from element in the table

        WebElement table10 = driver.findElement(page2table10);
        page2text10 = table10.getText();//get text from element in the table
    }
}
