package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class SeeMorePage {
    private WebDriver driver;
    private String tablept1= "/html/body/div[1]/div/div[1]/div[2]/div/div/div[2]/table/tbody/tr[";
    private String tablept2 = "]/td[3]/a/div/div/p";
    public List<String> list2 = new ArrayList<String>();

    public SeeMorePage(WebDriver driver)
    {
        this.driver = driver;
    }
    public void recordDataInSeeMorePage()
    {
        for(int i=1;i<=10;i++)
        {
            WebElement tableRowContent = driver.findElement(By.xpath(tablept1 + i + tablept2));
            String tableRowContentText = tableRowContent.getText();
            list2.add(tableRowContentText);
            System.out.println(list2);
        }
        System.out.println(list2);
    }
}
