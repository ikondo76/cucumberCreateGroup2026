package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ManageGroupsPage {
    WebDriver driver;

    @FindBy(xpath ="//*[@id=\"app-root\"]/div/div[2]/nav/button[4]")
    WebElement groupsMenu_xpath;

    @FindBy(xpath ="//*[@id=\"app-root\"]/div/div[3]/div/div[2]/button")
    WebElement createNewGroupButton_xpath;



    public ManageGroupsPage(WebDriver driver) {
        this.driver = driver;
    }

    public void  clickOnAdminPanelGroups_xpath() {
        groupsMenu_xpath.click();
    }

    public void clickOnCreateNewGroupButton_xpath() {
        createNewGroupButton_xpath.click();
    }
}
