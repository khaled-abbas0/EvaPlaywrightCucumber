package StepDefinition;

import Pages.Login;
import Utilities.DriverManager;
import io.cucumber.java.en.*;
import com.microsoft.playwright.*;

public class LoginSteps {

    Page page = DriverManager.getBrowserPage();
    Login loginObj;

    @Given("I login as an Admin with username and password")
    public void iLoginAsAnAdminWithUsernameAndPassword() {
        page.navigate("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        loginObj = new Login(page);
        loginObj.UserLogin();
    }


    @Then("verify that user is logged")
    public void verifyThatUserIsLogged(){
        loginObj = new Login(page);
        loginObj.UserLoginVerify();
    }
}
