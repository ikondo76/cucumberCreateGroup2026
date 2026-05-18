package Steps;

import Pages.HomePage;
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

}
