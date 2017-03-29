import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;


/**
 * Created by matssamuelson on 2017-02-23.
 */
public class NewsFeedPage {

    private WebDriver driver;
    private WebDriverWait wait;

    public NewsFeedPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(this.driver, 10);
    }

    public ReportTimePage PressNewsFeed() {

        this.driver.findElement(By.id("news")).click();
        return new ReportTimePage(this.driver);
    }

}
