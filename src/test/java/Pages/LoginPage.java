package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static org.openqa.selenium.support.ui.ExpectedConditions.visibilityOf;

public class LoginPage {
    WebDriver driver;

    @FindBy(xpath ="//*[@id=\"login-heading\"]/span")
    WebElement loginHeading_xpath;

    @FindBy(id = "login-email")
    WebElement loginEmail_id;

    @FindBy(id = "login-password")
    WebElement loginPassword_id;

    @FindBy(id = "login-submit")
    WebElement loginSubmitButton_id;


    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public void verifyLoginPageIsDisplayed() {
        new WebDriverWait(driver, Duration.ofSeconds(15)).until(visibilityOf(loginHeading_xpath));
        loginHeading_xpath.isDisplayed();
    }

    public void enterEmail(String email) {
        new WebDriverWait(driver, Duration.ofSeconds(15)).until(visibilityOf(loginEmail_id));
        loginEmail_id.sendKeys(email);
    }

    public void enterPassword(String password) {
        new WebDriverWait(driver, Duration.ofSeconds(15)).until(visibilityOf(loginPassword_id));
        loginPassword_id.sendKeys(password);
    }

    public void loginSubmitButton() {
        new WebDriverWait(driver, Duration.ofSeconds(15)).until(visibilityOf(loginPassword_id));
        loginSubmitButton_id.click();
    }


}
