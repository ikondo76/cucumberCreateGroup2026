package Pages;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.Date;

import static org.openqa.selenium.support.ui.ExpectedConditions.visibilityOf;

public class CreateNewGroupPage {
    WebDriver driver;

    @FindBy(xpath = "//span[contains(text(), 'Create New Group')]]")
    WebElement createNewGroupHeading_xpath;

    @FindBy(xpath = "//label[contains(text(), 'Group Name')]/following::input[1]")
    WebElement groupName_xpath;

    @FindBy(xpath = "//label[contains(text(), 'Description')]/following::textarea[1]")
    WebElement groupDescription_xpath;

    @FindBy(xpath = "//label[contains(text(), 'Year')]/following::input[1]")
    WebElement theYear_xpath;

    @FindBy(xpath = "//label[contains(text(), 'Max Capacity')]/following::input[1]")
    WebElement maxCapacity_xpath;

    @FindBy(xpath = "//label[contains(text(), 'Start Date')]/following::input[1]")
    WebElement startDate_xpath;

    @FindBy(xpath = "//label[contains(text(), 'End Date')]/following::input[1]")
    WebElement endDate_xpath;

    @FindBy(xpath = "//button[contains(text(), 'Create Group')]")
    WebElement createGroup_xpath;


    public CreateNewGroupPage(WebDriver driver) {
        this.driver = driver;
    }

    public void verifyCreateNewGroupPageIsDisplayed() {
        new WebDriverWait(driver, Duration.ofSeconds(15)).until(visibilityOf(createNewGroupHeading_xpath));
        createNewGroupHeading_xpath.isDisplayed();
    }


    public void enterGroupName(String groupName) {
        groupName_xpath.sendKeys(groupName);
    }

    public void enterGroupDescription(String description) {
        groupDescription_xpath.sendKeys(description);
    }

    public void enterYear(String year) {
        theYear_xpath.click();
        theYear_xpath.clear();
        theYear_xpath.sendKeys(year);
    }

    public void enterMaxCapacity(String capacity) {
        maxCapacity_xpath.sendKeys(capacity);
    }

    public void enterStartDate(String startDate) throws InterruptedException {
//        startDate_xpath.click();
//        startDate_xpath.clear();
//        startDate_xpath.sendKeys(Keys.chord(Keys.CONTROL + "a"));
//        startDate_xpath.sendKeys(Keys.BACK_SPACE);
//        Thread.sleep(2000);
        startDate_xpath.sendKeys(startDate);
//        Actions actions = new Actions(driver);
//
//        actions.keyDown(Keys.CONTROL)
//                .sendKeys("a")
//                .keyUp(Keys.CONTROL)
//                .sendKeys(Keys.BACK_SPACE)
//                .pause(Duration.ofMillis(300))
//                .sendKeys(startDate)
//                .perform();

//        JavascriptExecutor js = (JavascriptExecutor) driver;
//
//// Set value directly
//        js.executeScript(
//                "arguments[0].value= '"+startDate+"';",
//                startDate_xpath
//        );
//
//// Trigger change event
//        js.executeScript(
//                "arguments[0].dispatchEvent(new Event('change'));",
//                startDate_xpath
//        );
    }


    public void enterEndDate(String date) {
//        endDate_xpath.clear();
        endDate_xpath.sendKeys(date);
    }

    public void clickOnCreateGroupButton() {
        createGroup_xpath.click();
    }
}
