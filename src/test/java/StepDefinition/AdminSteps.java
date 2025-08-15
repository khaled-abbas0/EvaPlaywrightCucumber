package StepDefinition;

import Pages.AdminPage;
import Utilities.DriverManager;
import com.microsoft.playwright.Page;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class AdminSteps {

    Page page = DriverManager.getBrowserPage();
    AdminPage AdminPageObj;
    int numberBeforeAddingUser;
    int numberAfterAddingUser;
    int numberAfterDeletingUser;

    @When("I navigate to the Admin page")
    public void iNavigateToTheAdminPage() {
        AdminPageObj = new AdminPage(page);
        AdminPageObj.ClickAdminButton();
    }

    @When ("I get the current number of admin records")
    public void iGetTheCurrentNumberOfAdminRecords() {
        AdminPageObj = new AdminPage(page);
        numberBeforeAddingUser =  AdminPageObj.GetNumberOfRecord();
    }

    @And("I press add button")
    public void iAddANewAdminUser() {
        AdminPageObj = new AdminPage(page);
        AdminPageObj.ClickAddButton();
    }

    @Then("the number of records should increase by 1")
    public void theNumberOfRecordsShouldIncreaseBy(){
        AdminPageObj = new AdminPage(page);
        numberAfterAddingUser = AdminPageObj.GetNumberOfRecord();
        Assert.assertEquals(numberBeforeAddingUser+1,numberAfterAddingUser);
    }

    @When("I search for the admin user and delete the new user")
    public void iSearchForTheAdminUser() {
        AdminPageObj = new AdminPage(page);
        AdminPageObj.SearchByUserName("KhaledAbbas");
    }

    @Then("the number of records should decrease by 1")
    public void theNumberOfRecordsShouldDecreaseBy() {
        AdminPageObj = new AdminPage(page);
        numberAfterDeletingUser = AdminPageObj.GetNumberOfRecord();
        Assert.assertEquals(numberAfterDeletingUser,numberAfterAddingUser-1);
    }
}

