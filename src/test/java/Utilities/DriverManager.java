package Utilities;

import com.microsoft.playwright.*;

public class DriverManager {
    static Browser browser;
    static BrowserContext context;
    static Page page;

    public static void initBrowserPage() {
        browser = Playwright.create().chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
        context = browser.newContext();
        page = context.newPage();
    }

    public static Page getBrowserPage() {
        return page;
    }

    public static void quitBrowserPage() {
        page.close();
        context.close();
        browser.close();
    }
}
