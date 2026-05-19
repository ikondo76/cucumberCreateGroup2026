package Pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static org.openqa.selenium.support.ui.ExpectedConditions.visibilityOf;

public class CreateNewGroupPage {
    WebDriver driver;

    @FindBy(xpath ="//*[@id=\"app-root\"]/div/div[3]/div/div[4]/div/h3")
    WebElement createNewGroupHeading_xpath;

    @FindBy(xpath ="//*[@id=\"app-root\"]/div/div[3]/div/div[4]/div/form/div[1]/input")
    WebElement groupName_xpath;

    @FindBy(xpath ="//*[@id=\"app-root\"]/div/div[3]/div/div[4]/div/form/div[2]/textarea")
    WebElement groupDescription_xpath;

    @FindBy(xpath ="//*[@id=\"app-root\"]/div/div[3]/div/div[4]/div/form/div[3]/div[1]/input")
    WebElement theYear_xpath;

    @FindBy(xpath ="//*[@id=\"app-root\"]/div/div[3]/div/div[4]/div/form/div[3]/div[2]/input")
    WebElement maxCapacity_xpath;

    @FindBy(xpath ="//*[@id=\"app-root\"]/div/div[3]/div/div[4]/div/form/div[4]/div[1]/input")
    WebElement startDate_xpath;

    @FindBy(xpath ="//*[@id=\"app-root\"]/div/div[3]/div/div[4]/div/form/div[4]/div[2]/input")
    WebElement endDate_xpath;

    @FindBy(xpath ="//*[@id=\"app-root\"]/div/div[3]/div/div[4]/div/form/div[5]/button[1]")
    WebElement createGroup_xpath;


    public CreateNewGroupPage(WebDriver driver) {
        this.driver = driver;
    }

    public void verifyCreateNewGroupPageIsDisplayed() {
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

    public void enterStartDate(String date) {
        startDate_xpath.click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        startDate_xpath.sendKeys(Keys.CONTROL + "a");
        startDate_xpath.sendKeys(Keys.DELETE);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        startDate_xpath.sendKeys(date);
    }

    public void enterEndDate(String date) {
        endDate_xpath.sendKeys(date);
    }

    public void clickOnCreateGroupButton() {
        createGroup_xpath.click();
    }
}
