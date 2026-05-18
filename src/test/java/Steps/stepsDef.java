package Steps;

import Pages.HomePage;
import Pages.manageGroupsPage;
import io.cucumber.java.PendingException;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class stepsDef extends Base {
    @Given("i am on the login page")
    public void i_am_on_the_login_page() {
        homePage.clickLoginButton();
        loginPage.verifyLoginPageIsDisplayed();
    }

    @Given("i enter email email")
    public void i_enter_email(String email) {
        loginPage.enterEmail(email);

    }
    @Given("i enter password")
    public void i_enter_password(String password) {
        loginPage.enterPassword(password);

    }
    @When("i click login Submit button")
    public void i_click_login_button() {
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
        manageGroupsPage.
    }

    @And("I click on the create new group button")
    public void iClickOnTheCreateNewGroupButton() {

    }



    @And("I enter group name <groupName>")
    public void iEnterGroupNameGroupName() {

    }

    @And("I enter group description <groupDescription>")
    public void iEnterGroupDescriptionGroupDescription() {

    }

    @And("I enter year <year>")
    public void iEnterYearYear() {

    }

    @And("I enter max capacity <maxCapacity>")
    public void iEnterMaxCapacityMaxCapacity() {

    }

    @And("I enter start date <startDate>")
    public void iEnterStartDateStartDate() {

    }


    @When("I click on the create group button")
    public void iClickOnTheCreateGroupButton() {

    }
}
