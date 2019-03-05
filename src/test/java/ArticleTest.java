import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import javax.print.DocFlavor;

public class ArticleTest {

    private final String URL = "http://delfi.lv";
    private final By TITLE = By.xpath(".//h1[contains(@class, 'headline__title')]");
    private final By ARTICLE_PAGE_TITLE = By.xpath(".//h1[contains(@class, 'd-inline')]");
    private final By COMMENT_COUNT = By.xpath(".//a[contains(@class, 'text-red-ribbon')]");
    private final By COMMENT_PAGE_TITLE = By.xpath(".//h1[@class = 'article-title']/a");
    private final By ARTICLE2_PAGE_TITLE = By.xpath(".//h1[contains (@class, ' d-inline')]");
    private final By COMMENT_COUNT_NEW = By.xpath(".//a[(@class, 'text-red-ribbon')]");
    private final By COMMENT_COUNT_NEW_2 = By.xpath(".//span[contains (@class,'type-cnt')]");

    private WebDriver driver;
    @Test

    public void articleTitleCheck() {
        //Set driver path-GDE DRIVER
        System.setProperty("webdriver.chrome.driver", "c:/chromedriver.exe");

        //Open Browser
         driver= new ChromeDriver();

        //Full screen
        driver.manage().window().maximize();

        //Open Home Page
        driver.get(URL);

        //1 Find first article title
        WebElement homePageTitle = driver.findElement(TITLE);
        //WebElement- variable

        //Save to String
        String homePageTitleTxt = driver.findElement(TITLE).getText();

        //Click on article
        driver.findElement(TITLE).click();

        // 2 Find Title
        WebElement articlePageTitle = driver.findElement(ARTICLE_PAGE_TITLE);

        //Save to string
        String articlePageTitleTxt = articlePageTitle.getText();

        //Check article title
       // Assertions.assertEquals(homePageTitle, articlePageTitleTxt, "Wrong article page title!");

        //3 Find comment count
        WebElement commentCount = driver.findElement(COMMENT_COUNT);

        //Click on comment count
        commentCount.click();

        //4 Find title
        String commentPageTitle = driver.findElement(COMMENT_PAGE_TITLE).getText();

        //Check title -COMPARE
        Assertions.assertEquals(homePageTitle, commentPageTitle, "Wrong comment page title!");


        //NEW TASK
        // 5 Find comment !!!comment count on the article page
        WebElement commentCountNew  =driver.findElement(COMMENT_COUNT_NEW);

        //Save to string
        String commentCountNewTxt = commentCountNew.getText();

        //Click COMMENT COUNT ON THE ARTICLE PAGE
        commentCountNew.click();

        //6 Find comment COMMENT_COUNT_NEW_2
        WebElement commentCountNew2 = driver.findElement(COMMENT_COUNT_NEW_2);

        //Save to string
        String commentCountNew2Txt = commentCountNew2.getText();

        //Check title -COMPARE
        Assertions.assertEquals(commentCountNew, commentCountNew2, "Wrong comment count!"  );



    }
    //Close browser
    @AfterEach// eta stroka ukazivaet chto browser zakrivajetsja posle kazhdogo TESTA
    public void closeBrowser() {
        driver.close();
    }
}
/*
        //NEW TASK
        // 5 Find comment !!!count-article page
        WebElement commentCountNew  =driver.findElement(COMMENT_COUNT_NEW);

        // Save to integer OR SAVE TO STRING
        //int commentCountNewInt =driver.findElement(COMMENT_PAGE_TITLE).get;
        //Click on comment count


        //Find comment !!!count-comment page
        ////Click on comment count
        // Save to integer




        //Close browser


    }
    @AfterEach//eta stroka ukazivaet chto browser zakrivajetsja posle kazhdogo TESTA
    public void closeBrowser(){
        driver.close();



    }
}
*/