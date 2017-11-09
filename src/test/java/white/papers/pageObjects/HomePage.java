package white.papers.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends BasePage {

    public static final String CSS_FIRST_PAPER = "[data-reactid='.0.1.1.$=1$/news-and-views/white-papers/.0.1.0.4.$0.0.0'] span";
    public static final String FIRST_PAPER_TITLE = "DIGITAL TRANSFORMATION: REBIRTH OF THE ORGANISATION";

    public HomePage(WebDriver myDriver) {
        super(myDriver);
        driver = myDriver;

    }

    public void selectFirstPaperAtHomePage() throws Throwable {
        waitForElement(driver, By.cssSelector(CSS_FIRST_PAPER)).click();
        assertTitle(FIRST_PAPER_TITLE);
    }

}
