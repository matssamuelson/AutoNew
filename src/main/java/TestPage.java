import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Created by matssamuelson on 2017-02-23.
 */
public class TestPage

{
    private WebDriver driver;
// HÄr är ju sjukt bra att skriva en kommentar på!

    @Before
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "/Users/matssamuelson/Downloads/chromedriver");
        this.driver = new ChromeDriver();

    }

    @After
    public void tearDown() throws Exception {
        Thread.sleep(5000);
        this.driver.quit();
    }

    @Test
    public void driverTest() {

        new LandingPage(this.driver).ClickLoginButton()
                .EnterUserName()
                .EnterPassword()
                .SubmitUserLogin()

                .ClickLogTime()
                .ChooseVacation()
                .PressSave()
                .ChooseFinishedForTheDay()
                .PressSave()
                .ChooseStartDropDown()
                .PressSave()
                .ChooseGoingForLunch()
                .PressSave()
                .ChooseBackFromLunch()
                .PressSave()
                .GoToDashboard()
                .LogOut()
                .ClickYesPopUp()
                .VerifyLandingPage();
    }
//Här är oxå bra



// Och här
}
