package pages.chatapp;

import com.microsoft.playwright.Page;

public class ChatAppPage {

    private final Page page;

    public ChatAppPage(Page page) {
        this.page = page;
    }

    public void open() {
        page.navigate("https://chatjnclient.barryonweb.com/");
    }
   
}
