package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

import static org.openqa.selenium.support.ui.ExpectedConditions.visibilityOf;

public class CreateYourAccountPage {
    WebDriver driver;

    @FindBy(xpath = "//*[@id=\"registration-heading\"]")
    WebElement registrationHeading;

    @FindBy(id = "register-group")
    WebElement groupName_id;

    public CreateYourAccountPage(WebDriver driver) {
        this.driver = driver;
    }

    public void verifyCreateYourAccountPageIsDisplayed() {
        registrationHeading.isDisplayed();
    }

    public void clickGroupDropdown() {
        groupName_id.click();
    }


//    public boolean isGroupPresent(String groupName) {
//        new WebDriverWait(driver, Duration.ofSeconds(15)).until(visibilityOf(groupName_id));
//        Select groupDropdown = new Select(driver.findElement(By.id("register-group")));
//        return groupDropdown.getOptions()
//                .stream()
//                .anyMatch(option -> option.getText().equals(groupName));
//    }

    public void verifyGroupValueExists(String groupName) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        // Open dropdown
        wait.until(ExpectedConditions.elementToBeClickable(groupName_id)).click();

        // Verify option is visible
        WebElement option = wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='" + groupName + "']"))
        );

        Assert.assertTrue(option.isDisplayed(), "Group value NOT found: " + groupName);
    }

}

