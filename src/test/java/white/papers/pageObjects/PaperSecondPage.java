package white.papers.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PaperSecondPage extends BasePage {

    private static final String RIGHT_SCROLL_BUTTON = "[data-reactid='.0.1.1.$=1$/news-and-views/white-papers/digital-transformation-rebirth-of-the-organisation/.0.2']";
    private static final String RIGHT_CLOSE_BUTTON = "[data-reactid='.0.1.1.$=1$/news-and-views/white-papers/digital-transformation-rebirth-of-the-organisation/.0.3.0']";

    public PaperSecondPage(WebDriver myDriver) {
        super(myDriver);
        driver = myDriver;
    }

    public void selectRightScrollButtonOnSecondPage() throws Throwable {
        waitForElement(driver, By.cssSelector(RIGHT_SCROLL_BUTTON)).click();
        assertElementExists(RIGHT_CLOSE_BUTTON);
    }

}

