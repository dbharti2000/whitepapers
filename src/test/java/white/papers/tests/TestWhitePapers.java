package white.papers.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import white.papers.driver.DriverManager;
import white.papers.pageObjects.*;

import java.io.IOException;

public class TestWhitePapers {

    protected WebDriver driver;

    private HomePage homePage;
    private PaperFirstPage firstPage;
    private PaperSecondPage secondPage;
    private PaperThirdPage thirdPage;
    private PaperFormPage formPage;

    //initialising all the page objects in setup
    @BeforeMethod
    public void setUp() throws IOException {
        driver = new DriverManager().getDriver();
        homePage = PageFactory.initElements(driver, HomePage.class);
        firstPage = PageFactory.initElements(driver, PaperFirstPage.class);
        secondPage = PageFactory.initElements(driver, PaperSecondPage.class);
        thirdPage = PageFactory.initElements(driver, PaperThirdPage.class);
        formPage = PageFactory.initElements(driver, PaperFormPage.class);
    }

    @Test(description = "checkPaper")
    public void testWhitePapers() throws Throwable {
        homePage.open();
        homePage.selectFirstPaperAtHomePage();
        firstPage.selectRightScrollButtonOnFirstPage();
        secondPage.selectRightScrollButtonOnSecondPage();
        thirdPage.selectRightScrollButtonOnThirdPage();
        formPage.fillAndSubmitForm();
        formPage.assertFormSubmission();
    }

    @AfterMethod
    public void tearDown() {
        DriverManager.destroyDriver(driver);
        System.out.println("Clean-up after the test execution");
    }
}
