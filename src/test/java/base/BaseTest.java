package base;

import com.microsoft.playwright.Page;
import core.PlaywrightFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest {

    protected Page page;

    @BeforeMethod
    public void setup() {
        page = PlaywrightFactory.createPage();
    }

    @AfterMethod
    public void tearDown() {
        PlaywrightFactory.close();
    }
}
