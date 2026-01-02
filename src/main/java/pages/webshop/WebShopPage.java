package pages.webshop;

import com.microsoft.playwright.Page;

public class WebShopPage {

    private final Page page;

    public WebShopPage(Page page) {
        this.page = page;
    }

    public void open() {
        System.out.println("Browsing page https://webshop.barryonweb.com/ ...");
        page.navigate("https://webshop.barryonweb.com/");
        System.out.println("... Test passed!");
    }

    
}
