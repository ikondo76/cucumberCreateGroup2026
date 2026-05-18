package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CreateNewGroupPage {
    WebDriver driver;

    @FindBy(xpath ="//*[@id=\"app-root\"]/div/div[3]/div/div[4]/div/h3")
    WebElement createNewGroupHeading_xpath;

    @FindBy(xpath ="//*[@id=\"app-root\"]/div/div[3]/div/div[4]/div/form/div[1]/input")
    WebElement enterGroupName_xpath;

    @FindBy(xpath ="//*[@id=\"app-root\"]/div/div[3]/div/div[4]/div/form/div[2]/textarea")
    WebElement enterGroupDescription_xpath;

    @FindBy(xpath ="//*[@id=\"app-root\"]/div/div[3]/div/div[4]/div/form/div[3]/div[1]/input")
    WebElement enterYear_xpath;

    @FindBy(xpath ="//*[@id=\"app-root\"]/div/div[3]/div/div[4]/div/form/div[3]/div[2]/input")
    WebElement enterMaxCapacity_xpath;

    @FindBy(xpath ="//*[@id=\"app-root\"]/div/div[3]/div/div[4]/div/form/div[4]/div[1]/input")
    WebElement enterStartDate_xpath;

    @FindBy(xpath ="//*[@id=\"app-root\"]/div/div[3]/div/div[4]/div/form/div[4]/div[2]/input")
    WebElement enterEndDate_xpath;

    @FindBy(xpath ="//*[@id=\"app-root\"]/div/div[3]/div/div[4]/div/form/div[5]/button[1]")
    WebElement createGroup_xpath;


    public CreateNewGroupPage(WebDriver driver) {
        this.driver = driver;
    }

    public void verifyCreateNewGroupPageIsDisplayed() {
        createNewGroupHeading_xpath.isDisplayed();
    }
    public void enterGroupName(String groupName) {
        enterGroupName_xpath.sendKeys(groupName);
    }

    public void enterGroupDescription(String groupDescription) {
        enterGroupDescription_xpath.sendKeys(groupDescription);
    }

    public void enterYear(String year) {
        enterYear_xpath.sendKeys(year);
    }

    public void enterMaxCapacity(String maxCapacity) {
        enterMaxCapacity_xpath.sendKeys(maxCapacity);
    }

    public void enterStartDate(String startDate) {
        enterStartDate_xpath.sendKeys(startDate);
    }

    public void enterEndDate(String endDate) {
        enterEndDate_xpath.sendKeys(endDate);
    }

    public void clickOnCreateNewGroupButton() {
        createNewGroupHeading_xpath.click();
    }
}
