package white.papers.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PaperFirstPage extends BasePage {

    private static final String RIGHT_SCROLL_BUTTON = "[data-reactid='.0.1.1.$=1$/news-and-views/white-papers/digital-transformation-rebirth-of-the-organisation/.1.0.0.1.0.0.1']";
    private static final String RIGHT_CLOSE_BUTTON = "[data-reactid='.0.1.1.$=1$/news-and-views/white-papers/digital-transformation-rebirth-of-the-organisation/.0.3.0']";

    public PaperFirstPage(WebDriver myDriver) {
        super(myDriver);
        driver = myDriver;
    }

    public void selectRightScrollButtonOnFirstPage() throws Throwable {
        waitForElement(driver, By.cssSelector(RIGHT_SCROLL_BUTTON)).click();
        assertElementExists(RIGHT_CLOSE_BUTTON);
    }

}

