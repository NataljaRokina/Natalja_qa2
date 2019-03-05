import model.Article;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//import java.net.URL;
import java.util.List;

public class CommentCountTest {

    private final String URL = "https://rus.delfi.lv/";
    private final By ARTICLE=By.tagName("article");
    private final By TITLE= By.tagName("h1");
    private final By COMMENT_COUNTER= By.xpath(".//a[contains (@class, 'text-red')]");

    @Test

    public void CommentCountCheck () {

        System.setProperty("webdriver.chrome.driver", "c:/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get(URL);

        List<WebElement> articles = driver.findElements(ARTICLE);
        //articles v mnozhestvennom chisle iz-za List

        Article article = getArticle(articles, 5);
    }

    private Article getArticle(List<WebElement> elements, int i) {
        //Article -object
        //PERVIJ ELEMENT=NULEVOJ
        WebElement article = elements.get(i);


        //rabotajut s kopijej objecta  - SOZDAJEM KOPIJU OBJEKTA
        Article currentArticle = new Article();
        currentArticle.setTitle(article.findElement(TITLE).getText());

        List<WebElement> commentCounters = article.findElements(COMMENT_COUNTER);

        if (commentCounters.isEmpty()) {
            currentArticle.setCommentCount(0);

            //otbrosit skobki naprimer (35)->iz string sdelatj integer
        }else {

            currentArticle.setCommentCount(commentCounters.get(0).getText());//otbrosit skobki t.k.v <ARTICLE> MODEL
            //MI DOBAVILI PRO 'SKOBKI


        }
return currentArticle;

    }
    /*@AfterEach
    public void closeBroser{
        driver.close();
    */}















