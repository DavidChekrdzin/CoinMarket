package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.ArrayList;
import java.util.List;

public class SpotLightPage {
    private WebDriver driver;
    private String tableRowsText[];
    public List<String> list1 = new ArrayList<String>();

    private String tablept1= "/html/body/div[1]/div/div[1]/div[2]/div/div[2]/div[4]/div[2]/table/tbody/tr[";
    private String tablept2 = "]/td[2]/a/div/div/p";
    //koristi array
    private By seeMoreLink = By.xpath("//*[@class = 'sc-6b1dfb2c-3 liWSOs']/a[@href = '/most-viewed-pages/']");
    public SpotLightPage(WebDriver driver)
    {
        this.driver = driver;
    }
    public SeeMorePage recordDataInMostVisited(){

        for(int i=1;i<=10;i++)
        {
            WebElement tableRowContent = driver.findElement(By.xpath(tablept1 + i + tablept2));
            String tableRowContentText = tableRowContent.getText();
            list1.add(tableRowContentText);
            System.out.println(list1);
        }
        System.out.println(list1);
        WebElement element = driver.findElement(seeMoreLink);
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
        driver.findElement(seeMoreLink).click();//click see more link


        return new SeeMorePage(driver);
    }
}
