package test;

import org.openqa.selenium.Alert;
import org.testng.annotations.Test;
import pages.AboutPage;
import pages.HomePage;
import pages.TourPage;

import java.lang.reflect.Method;

public class TakeATourTest extends BaseTest{

    @Test
    public void takeATourTest() {

        HomePage homePage = new HomePage(driver);
        AboutPage aboutPage = new AboutPage(driver);
        TourPage tourPage = new TourPage(driver);

        homePage
                .goToStackOverflow()
                .goToAboutPage();
        aboutPage.goToTourPage();
        tourPage.verifyTourPageTitle("Welcome to Stack Overflow");
        tourPage.verifyTourPageQATitle("Ask questions, get answers, no distractions");
    }
}
