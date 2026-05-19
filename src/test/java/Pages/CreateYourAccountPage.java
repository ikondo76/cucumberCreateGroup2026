package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class CreateYourAccountPage {
    WebDriver driver;

    @FindBy(xpath = "//*[@id=\"registration-heading\"]")
    WebElement registrationHeading;

    @FindBy(id ="register-group")
    WebElement groupName_id;

    public CreateYourAccountPage(WebDriver driver) {
        this.driver = driver;
    }

    public void verifyCreateYourAccountPageIsDisplayed() {
        registrationHeading.isDisplayed();
    }

    public void clickGroupDropdown(){
        groupName_id.click();
    }


    public boolean isGroupPresent(String groupName) {
            Select groupDropdown = new Select(driver.findElement(By.id("register-group")));
            return groupDropdown.getOptions()
                    .stream()
                    .anyMatch(option -> option.getText().equals(groupName));
        }
    }

