import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * Created by matssamuelson on 2017-02-23.
 */
public class LoggedInPage {

    private WebDriver driver;
    private WebDriverWait wait;


    public LoggedInPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(this.driver, 10);
    }

    public ReportTimePage ClickLogTime() {

        //Klickar på logTime i navigering och verifierar klick

        this.wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.id("logTime"))
        );
        this.driver.findElement(By.id("logTime")).click();
        String verifyLogTimeClick = driver.findElement(By.id("logTime")).getText();
        Assert.assertEquals("Log time", verifyLogTimeClick);
        return new ReportTimePage(this.driver);

    }

    public LoggedInPage LogOut() {

        //Logout and verify
        this.wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.id("logOut"))
        );
        String verifyLogOut = driver.findElement(By.id("logOut")).getText();
        Assert.assertEquals("Log out", verifyLogOut);
        this.driver.findElement(By.id("logOut")).click();

        return this;
    }

    public LandingPage ClickYesPopUp() {
        this.wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.cssSelector("[class='modal-content']")));
        this.driver.findElement(By.xpath("//*[@id='logout-modal']/div/div/div[2]/a")).click();
       // this.driver.findElement(By.cssSelector("[href='/authentication/logout/']")).click();
        return new LandingPage(this.driver);

    }

}
