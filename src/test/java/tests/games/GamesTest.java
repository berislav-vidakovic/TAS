package tests.games;

import base.BaseTest;
import pages.games.GamesPage;

import org.testng.annotations.Test;

public class GamesTest extends BaseTest {

    @Test
    public void validOpenAppTest() {
        GamesPage gPage = new GamesPage(page);
        gPage.open();
    }
}
