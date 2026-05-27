package Pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

import static org.openqa.selenium.support.ui.ExpectedConditions.visibilityOf;

public class DashboardPage {
    WebDriver driver;

    @FindBy(xpath = "//section//h2/span[1]")
    WebElement dashboardHeading_xpath;

    @FindBy(xpath = "//nav//button//span[contains(text(), 'Menu')]")
    WebElement userMenuButton_xpath;

    @FindBy(xpath = "//nav//button//span[contains(text(), 'Admin Panel')]")
    WebElement adminMenuButton_xpath;

    @FindBy(xpath = "//span[contains(text(), 'Logout')]")
    WebElement logoutButton_xpath;

    @FindBy(xpath ="//nav//button[contains(text(), 'Groups')]")
    WebElement groupsMenu_xpath;

    @FindBy(xpath ="//button[contains(text(), 'Create New Group')]")
    WebElement createNewGroupButton_xpath;

    @FindBy(xpath = "//div[contains(text(), 'Group created successfully')]")
    WebElement successToastMessage_xpath;


    @FindBy(xpath = "//*[contains(text(), 'Back to Website')]")
    WebElement backToWebsiteButton_xpath;





    public DashboardPage(WebDriver driver) {
        this.driver = driver;
    }

    public void verifyDashboardPageIsDisplayed() {
        new WebDriverWait(driver, Duration.ofSeconds(15)).until(visibilityOf(dashboardHeading_xpath));
        dashboardHeading_xpath.isDisplayed();
    }

    public void clickUserMenuButton_xpath() {
        new WebDriverWait(driver, Duration.ofSeconds(15)).until(visibilityOf(userMenuButton_xpath));
        userMenuButton_xpath.click();
    }


    public void clickAdminMenuButton_xpath() {
        new WebDriverWait(driver, Duration.ofSeconds(15)).until(visibilityOf(adminMenuButton_xpath));
        adminMenuButton_xpath.click();
    }

    public void clickLogoutButton_xpath() {
        new WebDriverWait(driver, Duration.ofSeconds(15)).until(visibilityOf(logoutButton_xpath));
        logoutButton_xpath.click();
    }

    public void  clickOnAdminPanelGroups_xpath() {
        groupsMenu_xpath.click();
    }

    public void clickOnCreateNewGroupButton_xpath() {
        new WebDriverWait(driver, Duration.ofSeconds(15)).until(visibilityOf(createNewGroupButton_xpath));
        createNewGroupButton_xpath.click();
    }

    public void verifySuccessToastMessageIsDisplayed(String expectedMessage) {
        new WebDriverWait(driver, Duration.ofSeconds(15)).until(visibilityOf(successToastMessage_xpath));
        successToastMessage_xpath.isDisplayed();
    }

    public void clickOnBackToWebsiteButton_xpath() {
        backToWebsiteButton_xpath.click();
    }

    public void verifyLogoutAlertIsDisplayed() {
        new WebDriverWait(driver, Duration.ofSeconds(15)).until(ExpectedConditions.alertIsPresent());
        Alert alert = driver.switchTo().alert();
        String alertText = alert.getText();
        Assert.assertEquals(alertText, "Are you sure you want to logout?");
    }

    public void acceptAlert() {
        new WebDriverWait(driver, Duration.ofSeconds(30)).until(ExpectedConditions.alertIsPresent());
        driver.switchTo().alert().accept();
    }
}

