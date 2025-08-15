package Pages;

import com.microsoft.playwright.Page;

public class AddUserPage {
    Page page;
    String UserRoleDropDown ="//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div[1]/div/div[2]/div/div/div[2]/i";
    String AdminRoleOption = "//div[@role='option']//span[text()='Admin']";
    String EmployeeName = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div[2]/div/div[2]/div/div/input";
    String EmployeeNameSuggestion = "//div[@role='option']//span[contains(text(),'')]";
    String StatusDropDown = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div[3]/div/div[2]/div/div/div[2]/i";
    String EnabledStatus = "//div[@role='option']//span[text()='Enabled']";
    String UserName = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div[4]/div/div[2]/input";
    String Password = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[2]/div/div[1]/div/div[2]/input";
    String ConfirmPassword = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[2]/div/div[2]/div/div[2]/input";
    String SaveButton = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[3]/button[2]";


    public AddUserPage(Page page) {
        this.page = page;
    }

    public void AddNewUser(){
        page.click(UserRoleDropDown);
        page.click(AdminRoleOption);
        page.fill(EmployeeName, "a");
        page.click(EmployeeNameSuggestion);
        page.click(StatusDropDown);
        page.click(EnabledStatus);
        page.fill(UserName,"KhaledAbbas");
        page.fill(Password,"khaledAbbas1");
        page.fill(ConfirmPassword,"khaledAbbas1");
        page.click(SaveButton);
    }
}

