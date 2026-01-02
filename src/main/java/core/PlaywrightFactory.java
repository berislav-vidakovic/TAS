package core;

import com.microsoft.playwright.*;

public class PlaywrightFactory {

    private static Playwright playwright;
    private static Browser browser;

    public static Page createPage() {
      playwright = Playwright.create();
      String headlessEnv = System.getenv("HEADLESS"); // CI set HEADLESS=true
      if (headlessEnv == null)  
          headlessEnv = "false"; // fallback 
      boolean isHeadless = Boolean.parseBoolean(headlessEnv);
      browser = playwright.chromium().launch(
              new BrowserType.LaunchOptions()
                .setHeadless(isHeadless) 
      );

      BrowserContext context = browser.newContext();
      return context.newPage();
    }

    public static void close() {
        playwright.close();
    }
}
