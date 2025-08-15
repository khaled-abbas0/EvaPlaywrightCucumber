package StepDefinition;

import Utilities.DriverManager;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {

    @Before
    public void setUp() {
        DriverManager.initBrowserPage();
    }

    @After
    public void tearDown() {
        DriverManager.quitBrowserPage();
    }
}
