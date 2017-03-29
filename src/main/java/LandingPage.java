import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * Created by matssamuelson on 2017-02-23.
 */
public class LandingPage {

    private WebDriver driver;
    private WebDriverWait wait;


    public LandingPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(this.driver, 10);
    }

    public LandingPage ClickLoginButton() {
        this.driver.get("http://dev.tabofa.se/");
        this.wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.id("login"))
        );
        this.driver.findElement(By.id("login")).click();
        return this;

    }

    public LandingPage EnterUserName() {

        //Enter user name and verify username
        this.wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("user")));
        this.driver.findElement(By.name("user")).sendKeys("user1");
        String searchValue = driver.findElement(By.name("user")).getAttribute("value");
        Assert.assertEquals("user1", searchValue);
        return this;
    }

    public LandingPage EnterPassword(){

        //Enter Password and verify password
        this.wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("psw")));
        this.driver.findElement(By.id("psw")).sendKeys("pass1234");
        String searchValue2 = driver.findElement(By.id("psw")).getAttribute("value");
        Assert.assertEquals("pass1234", searchValue2);
        return this;
    }

    public LoggedInPage SubmitUserLogin() {

        //Submit and verify user

        this.wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("submit")));
        this.driver.findElement(By.id("submit")).click();
        String verifyUser = driver.findElement(By.id("profile")).getText();
        Assert.assertEquals("User 1", verifyUser);
        return new LoggedInPage(this.driver);
    }


    public LandingPage VerifyLandingPage() {
        this.wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("login")));
        this.driver.findElement(By.id("login"));
        return this;
    }


}
