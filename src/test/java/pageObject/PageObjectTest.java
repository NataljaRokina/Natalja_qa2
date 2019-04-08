package pageObject;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import pageObject.pages.BaseFunc;
import pageObject.pages.HomePage;

public class PageObjectTest {

    private final String URL ="delfi.lv";

    //kopija objekta
    private BaseFunc baseFunc = new BaseFunc();
    @Test
    public void delfiTest() {
        baseFunc.goToUrl(URL);
        HomePage homePage = new HomePage(baseFunc);//propisan zdes t.k. poka nuzhna tolko v odnom meste
        //homePage.openArticleByIndex(5);


    }
@AfterEach
    public void closeBrowser(){
baseFunc.closeBrowser();


    }
}
