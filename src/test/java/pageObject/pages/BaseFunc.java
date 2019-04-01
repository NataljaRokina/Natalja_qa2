package pageObject.pages;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class BaseFunc {

    private WebDriver driver;

    //constructor dolzhen idti pervim
    public BaseFunc() {
        //dobavljajem na vigaciju na browser
        System.setProperty("webdriver.chrome.driver", "c:/chromedriver.exe");
        // This method returns the System property's previous value(key, value)
        driver = new ChromeDriver();
        driver.manage().window().maximize();

    }

    public void goToUrl(String url) {
        //dlja sravnenija->
        if (!url.startsWith("http://") && !url.startsWith("https://")) {//!oznachajet neraven
            url = "http://" + url;


        }
        driver.get(url);
    }

    public void closeBrowser(){
        Assertions.assertNull(driver,"Something");
        driver.close();
    }
    public List<WebElement> getElements (By locators) {
        return driver.findElement(locators);
    }
}
