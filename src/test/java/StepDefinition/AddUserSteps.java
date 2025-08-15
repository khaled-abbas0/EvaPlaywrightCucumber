package StepDefinition;

import Pages.AddUserPage;
import Utilities.DriverManager;
import com.microsoft.playwright.Page;
import io.cucumber.java.en.And;

public class AddUserSteps {
    Page page = DriverManager.getBrowserPage();
    AddUserPage AddUserObj;

    @And("I add a new admin user")
    public void iAddANewAdminUser() {
        AddUserObj = new AddUserPage(page);
        AddUserObj.AddNewUser();
    }
}

