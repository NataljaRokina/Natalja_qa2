
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class NewProjejct {
    @Test
    public void newProjejct() {

        System.setProperty("webdriver.chrome.driver", "c:/chromedriver.exe");
        driver.get("http://delfi.lv");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();


    }
}
