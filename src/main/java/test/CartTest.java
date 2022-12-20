package test;

import org.testng.Assert;
import org.testng.annotations.Test;
import page.ProductPage;

public class CartTest extends CommonConditions {
    @Test
    public void isCartNotEmpty() {
        boolean isCartEmpty = new ProductPage(driver)
                .open()
                .addToCart()
                .goToCart()
                .isCartEmpty();
        Assert.assertFalse(isCartEmpty);
    }

    @Test
    public void removeCartEmpty() {
        boolean isCartEmpty = new ProductPage(driver)
                .open()
                .addToCart()
                .goToCart()
                .removeProduct()
                .isCartEmpty();
        Assert.assertFalse(isCartEmpty);
    }

    @Test
    public void isCartEmpty() {
        boolean isCartEmpty = new ProductPage(driver)
                .open()
                .goToCart()
                .isCartEmpty();
        Assert.assertTrue(isCartEmpty);
    }

    @Test
    public void cartPageOpened() {
        String cartUrl = new ProductPage(driver)
                .open()
                .goToCart()
                .getCartUrl();
        Assert.assertEquals("https://shop.tesla.com/cart", cartUrl);
    }

    @Test
    public void logoClickTest() {
        String url = new ProductPage(driver)
                .open()
                .goToMainPage()
                .getUrl();
        Assert.assertEquals("https://www.tesla.com/?redirect=no", url);
    }
}
