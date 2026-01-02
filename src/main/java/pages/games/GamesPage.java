package pages.games;

import com.microsoft.playwright.Page;

public class GamesPage {

    private final Page page;

    public GamesPage(Page page) {
        this.page = page;
    }

    public void open() {
        System.out.println("Browsing GAMES page https://gamesjclient.barryonweb.com/ ...");
        page.navigate("https://gamesjclient.barryonweb.com/");
        System.out.println("... Test passed!");
    }

    
}
