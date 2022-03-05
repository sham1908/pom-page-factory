package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class BasePage{

    public WebDriver driver;
    public WebDriverWait wait;

    public BasePage (WebDriver driver){
        this.driver = driver;
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    //Wait Wrapper Method
    //An expectation for checking that all elements present on the web page that match the locator are visible.
    //Visibility means that the elements are not only displayed but also have a height and width that is greater than 0
    public void waitForVisibility(WebElement element) {
        wait.until(ExpectedConditions.visibilityOf(element));
    }

    //Click Method
    public void click (WebElement element) {
        waitForVisibility(element);
        element.click();
    }

    //Write Text
    public void writeText (WebElement element, String text) {
        waitForVisibility(element);
        element.sendKeys(text);
    }
    //Read Text
    public String readText (WebElement element) {
        waitForVisibility(element);
        return element.getText();
    }

    //Assert
    public void assertEquals (WebElement element, String expectedText) {
        //waitVisibility(element);
        Assert.assertEquals(readText(element), expectedText);
    }
}
