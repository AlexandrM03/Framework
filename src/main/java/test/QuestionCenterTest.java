package test;

import org.testng.Assert;
import org.testng.annotations.Test;
import page.MainPage;

public class QuestionCenterTest extends CommonConditions {
    @Test
    public void isChatOpen() {
        boolean isChatOpen = new MainPage(driver)
                .open()
                .openModelSPage()
                .isChatOpen();
        Assert.assertTrue(isChatOpen);
    }
}
