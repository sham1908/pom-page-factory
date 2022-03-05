package pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class HomePage extends BasePage {

    public HomePage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    //*********Page Variables*********
    String baseURL = "https://stackoverflow.com/";

    @FindBy(css = "a[data-ga='[\"top navigation\",\"about menu click\",null,null,null]']")
    public WebElement aboutButton;


    //Go to Homepage: stackoverflow.com
    public HomePage goToStackOverflow() {
        // Log.info("Opening stackoverflow.com Website.");
        driver.get(baseURL);
        return this;
    }

    //Go to About Page
    public AboutPage goToAboutPage() {
        click(aboutButton);
        return new AboutPage(driver);
        /*
        If you want to chain AboutPage's methods, so I return AboutPage by initializing its elements:
        AboutPage aboutPage = PageFactory.initElements(driver, AboutPage.class);
        */
    }

}
