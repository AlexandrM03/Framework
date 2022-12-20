package test;

import org.testng.Assert;
import org.testng.annotations.Test;
import page.MainPage;

public class ShopTest extends CommonConditions {
    @Test
    public void isShopOpen() {
        String shopUrl = new MainPage(driver)
                .open()
                .openShopPage()
                .getUrl();
        Assert.assertEquals("https://shop.tesla.com/", shopUrl);
    }
}
