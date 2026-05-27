package Steps;

import Pages.CreateNewGroupPage;
import io.cucumber.java.PendingException;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.time.Year;

import static org.openqa.selenium.support.ui.ExpectedConditions.visibilityOf;

public class stepsDef extends Base {
    @Given("i am on the login page")
    public void i_am_on_the_login_page() {
        homePage.clickLoginButton();
        loginPage.verifyLoginPageIsDisplayed();
    }

    @And("I enter email (.*)$")
    public void I_enter_email(String email) {
        loginPage.enterEmail(email);

    }
    @And("I enter password (.*)$")
    public void I_enter_password(String password) {
        loginPage.enterPassword(password);

    }
    @When("I click login button")
    public void I_click_login_button() {
        loginPage.loginSubmitButton();
    }

    @Then("i should be logged in successfully")
    public void i_should_be_logged_in_successfully() {
        dashboardPage.verifyDashboardPageIsDisplayed();
    }

    @And("I click on the logged in user")
    public void iClickOnTheLoggedInUser() {
        dashboardPage.clickUserMenuButton_xpath();
    }

    @And("I click on the admin panel")
    public void iClickOnTheAdminPanel() {
        dashboardPage.clickAdminMenuButton_xpath();
    }

    @And("I click on the groups tab")
    public void iClickOnTheGroupsTab() {
     dashboardPage.clickOnAdminPanelGroups_xpath();
    }

    @And("I click on the create new group button")
    public void iClickOnTheCreateNewGroupButton() {
        dashboardPage.clickOnCreateNewGroupButton_xpath();
    }


//    @And("I should verify that the create group page is displayed")
//    public void iShouldVerifyThatTheCreateGroupPageIsDisplayed() {
//        createYourAccountPage.verifyCreateNewGroupPageIsDisplayed();
//
//    }

    @And("I enter group name (.*)$")
    public void iEnterGroupName(String groupName) {
        createNewGroupPage.enterGroupName(groupName);
    }

    @And("I enter group description (.*)$")
    public void iEnterGroupDescriptionGroupDescription(String  groupDescription ) {
        createNewGroupPage.enterGroupDescription(groupDescription);
    }

    @And("I enter year (.*)$")
    public void iEnterYear(String theYear) {
        createNewGroupPage.enterYear(theYear);
    }

    @And("I enter max capacity (.*)$")
    public void iEnterMaxCapacityMaxCapacity(String maxCapacity) {
        createNewGroupPage.enterMaxCapacity(maxCapacity);

    }

    @And("I enter start date (.*)$")
    public void iEnterStartDateStartDate(String startDate) throws InterruptedException {
        createNewGroupPage.enterStartDate(startDate);
    }

    @And("I enter end date (.*)$")
    public void iEnterEndDateEndDate(String endDate) {
        createNewGroupPage.enterEndDate(endDate);

    }

    @When("I click on the create group button")
    public void iClickOnTheCreateGroupButton() {
       createNewGroupPage.clickOnCreateGroupButton();
    }

    @Then("I should see the success message {string}")
    public void iShouldSeeTheSuccessMessage(String arg0) {
        dashboardPage.verifySuccessToastMessageIsDisplayed(arg0);
    }


    @And("I click on Back to Website button")
    public void iClickOnBackToWebsiteButton() {
        dashboardPage.clickOnBackToWebsiteButton_xpath();
    }


    @And("Dashboard page should be displayed")
    public void dashboardPageShouldBeDisplayed() {
        dashboardPage.verifyDashboardPageIsDisplayed();
    }


    @And("I click on the logged in user again")
    public void iClickOnTheLoggedInUserAgain() {
       dashboardPage.clickUserMenuButton_xpath();
    }


    @And("I click on logout button")
    public void iClickOnLogoutButton() {
        dashboardPage.clickLogoutButton_xpath();
    }


    @And("logout confirmation alert should be displayed")
    public void logoutConfirmationAlertShouldBeDisplayed() {
        dashboardPage.verifyLogoutAlertIsDisplayed();
    }


    @And("I click on Ok button to confirm logout")
    public void iClickOnOkButtonToConfirmLogout() {
        dashboardPage.acceptAlert();
    }


    @And("Home page should be displayed again")
    public void homePageShouldBeDisplayedAgain() {

        homePage.verifyHomePageIsDisplayed();
    }


    @And("I click on the login button again")
    public void iClickOnTheLoginButtonAgain() {
        homePage.clickLoginButton();
    }


    @And("Login page should be displayed again")
    public void loginPageShouldBeDisplayedAgain() {
        loginPage.verifyLoginPageIsDisplayed();
    }


    @And("I click on Sign Up here link")
    public void iClickOnSignUpHereLink() {
        loginPage.clickSignUpHereLink();
    }

    @And("Create Your Account page should be displayed")
    public void createYourAccountPageIsBeDisplayed() {
        createYourAccountPage.verifyCreateYourAccountPageIsDisplayed();
    }

    @And("I click on Select Your group dropdown")
    public void iClickOnSelectYourGroupDropdown() {
        createYourAccountPage.clickGroupDropdown();
    }


   @And("I should see that the group was created successfully")
    public void iShouldSeeThatTheGroupWasCreatedSuccessfully() {
        createYourAccountPage.verifyGroupValueExists("Just Another Group 31");

    }

    @Then("I should close the browser")
   public void iShouldCloseTheBrowser() {
        driver.quit();
    }


}
