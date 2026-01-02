package pages.games;

import com.microsoft.playwright.Page;

public class GamesPage {

    private final Page page;

    public GamesPage(Page page) {
        this.page = page;
    }

    public void open() {
        page.navigate("https://gamesjclient.barryonweb.com/");
    }

    
}
