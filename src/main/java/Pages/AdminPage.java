package Pages;

import com.microsoft.playwright.Page;

public class AdminPage {
    Page page;
    String AdminButton = "//*[@id=\"app\"]/div[1]/div[1]/aside/nav/div[2]/ul/li[1]/a";
    String NumberOfRecord = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[2]/div[2]/div/span";
    String AddButton = "xpath=/html/body/div/div[1]/div[2]/div[2]/div/div[2]/div[1]/button";
    String SystemUserNameSearch = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[1]/div/div[2]/input";
    String SearchSaveButton = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[2]/button[2]";
    String DeleteButton = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[2]/div[3]/div/div[2]/div/div/div[6]/div/button[1]";
    String DeleteConfirmationButton = "//*[@id=\"app\"]/div[3]/div/div/div/div[3]/button[2]";
    String ResetButton = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[2]/button[1]";

    public AdminPage(Page page) {
        this.page = page;
    }

    public void ClickAdminButton() {
        page.click(AdminButton);
    }

    public int GetNumberOfRecord() {
        return Integer.parseInt(page.innerText(NumberOfRecord).replaceAll("[^0-9]", ""));
    }

    public void ClickAddButton() {
        page.click(AddButton);
    }

    public void SearchByUserName(String username) {
        page.fill(SystemUserNameSearch, username);
        page.click(SearchSaveButton);
        page.click(DeleteButton);
        page.click(DeleteConfirmationButton);
        page.click(ResetButton);
    }
}
