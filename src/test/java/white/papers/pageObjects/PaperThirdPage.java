package white.papers.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PaperThirdPage extends BasePage {

    private static final String RIGHT_SCROLL_BUTTON = "[data-reactid='.0.1.1.$=1$/news-and-views/white-papers/digital-transformation-rebirth-of-the-organisation/.0.2']";
    private static final String SUBMIT_BUTTON_CSS = "[data-reactid='.0.1.1.$=1$/news-and-views/white-papers/digital-transformation-rebirth-of-the-organisation/.0.0.3.0.7.0']";

    public PaperThirdPage(WebDriver myDriver) {
        super(myDriver);
        driver = myDriver;
    }

    public void selectRightScrollButtonOnThirdPage() throws Throwable {
        waitForElement(driver, By.cssSelector(RIGHT_SCROLL_BUTTON)).click();
        assertElementExists(SUBMIT_BUTTON_CSS);
    }

}

