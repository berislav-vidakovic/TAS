package tests.webshop;

import base.BaseTest;
import pages.webshop.WebShopPage;

import org.testng.annotations.Test;

public class WebShopTest extends BaseTest {

    @Test
    public void validOpenAppTest() {
        WebShopPage wsPage = new WebShopPage(page);
        wsPage.open();
    }
}
