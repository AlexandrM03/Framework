package test;

import org.testng.Assert;
import org.testng.annotations.Test;
import page.MainPage;

public class ModelSTest extends CommonConditions {
    @Test
    public void isModelSPageOpened() {
        String url = new MainPage(driver)
                .open()
                .openModelSPage()
                .getUrl();
        Assert.assertEquals("https://www.tesla.com/models", url);
    }
}
