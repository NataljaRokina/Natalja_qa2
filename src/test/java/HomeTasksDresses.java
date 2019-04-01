import model.TabDresses;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;


public class HomeTasksDresses {

    private final String URL = "http://automationpractice.com";

    private final By ALLTABS = By.className("submenu-container clearfix first-in-line-xs");
    //private final By DRESSES = By.className("sf-with-ul");

    private WebDriver driver;

    @Test
    public void HomeTasksDressesCheck() {
        System.setProperty("webdriver.chrome.driver", "c:/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(URL);
        driver.manage().window().maximize();

        //1 Find first article title
        //WebElement dressesButton = driver.findElement(DRESSES);
        List<WebElement> alltabs = driver.findElements(ALLTABS);


        //Save to String
        //String dressesTxt = driver.findElement(DRESSES).getText();//peresmotretj

        //Click on article
        //driver.findElement(DRESSES).click();

        //WebElement


    }

    //private TabDresses   //TabDresses getArticle(List<WebElement> elements, int i) {


    @AfterEach
    public void closeBrowser()
    {
    closeBrowser();
    }

}
