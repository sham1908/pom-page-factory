package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AboutPage extends BasePage {

    //*********Constructor*********
    public AboutPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    @FindBy(css = "a[class='ml16 ta-center py6 px12 bar-md p-ff-source-bold bg-blue-500 fc-white d:fc-black-900 ws-nowrap']")
    public WebElement takeATourButton;

    public TourPage goToTourPage(){
        click(takeATourButton);
        return new TourPage(driver);
        //If you want to chain TourPage's methods, so I return TourPage by initializing its elements
        //TourPage tourPage = PageFactory.initElements( driver, TourPage.class );
    }

}
