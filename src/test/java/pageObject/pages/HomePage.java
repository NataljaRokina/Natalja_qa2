package pageObject.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class HomePage {
    //constructor dolzhen poluchitj baseFunc
    private BaseFunc baseFunc;
    private final By ARTICLE_TITLE = By.xpath(".//h1[contains(@class, 'text-mine-shaft')]");

    public HomePage(BaseFunc baseFunc) {
        this.baseFunc = baseFunc;

    }


        public void openArticleByIndex ( int i){

        List<WebElement> titles = baseFunc.getElements (ARTICLE_TITLE);
        titles.get(i).click();

    }

