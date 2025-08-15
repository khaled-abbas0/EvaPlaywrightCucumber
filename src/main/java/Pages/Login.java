package Pages;

import com.microsoft.playwright.Page;
import org.testng.Assert;

public class Login {
    Page page;
    String UserNameTextBox = "input[name='username']";
    String PasswordTextBox = "input[name='password']";
    String LoginButton = "//button[@type=\"submit\"]";

    public Login(Page page) {
        this.page = page;
    }

    public void UserLogin(){
        page.fill(UserNameTextBox,"Admin");
        page.fill(PasswordTextBox,"admin123");
        page.click(LoginButton);
    }
    public void UserLoginVerify(){
        Assert.assertTrue(page.waitForSelector("//p[@class=\"oxd-userdropdown-name\"]").isVisible());
    }
}
