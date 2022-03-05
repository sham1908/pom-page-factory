package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

public class TourPage extends BasePage{

    public TourPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//div[@class='about-intro']//h2[@class='about-title']")
    public WebElement tourPageTitle;

    @FindBy(xpath = "//div[@class='about-qa']//h2[@class='about-title']")
    public WebElement tourPageQATitle;

    //Verify Tour Page Title
    public void verifyTourPageTitle (String expectedText) {
        Assert.assertEquals(readText(tourPageTitle), expectedText);
    }

    //Verify Tour Page QA Title
    public void verifyTourPageQATitle (String expectedText) {
        Assert.assertEquals(readText(tourPageQATitle), expectedText);
    }

    //Verify Tour Page All titles with Soft Assertion
    public void verifyTourPageSoftAssert (String expectedText) {
        SoftAssert soft = new SoftAssert();
        soft.assertEquals(readText(tourPageTitle), expectedText);
        soft.assertEquals(readText(tourPageQATitle), expectedText);
        soft.assertAll();
    }

}
