import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Created by Mats on 2017-02-22.
 */
public class SeleniumTest{

    private WebDriver driver;


    @Before
    public  void setUp(){
        System.setProperty("webdriver.chrome.driver", "/Users/matssamuelson/Downloads/chromedriver");
        this.driver = new ChromeDriver();

    }

    @After
    public void tearDown()throws Exception {
        Thread.sleep(5000);
        this.driver.quit();
    }

    @Test
    public void driverTest() {



        //Enter user name
        this.driver.findElement(By.name("user")).sendKeys("user1");
        String searchValue = driver.findElement(By.name("user")).getAttribute("value");
        Assert.assertEquals("user1", searchValue);

        //Enter Password
        this.driver.findElement(By.id("psw")).sendKeys("pass1234");
        String searchValue2 = driver.findElement(By.id("psw")).getAttribute("value");
        Assert.assertEquals("pass1234", searchValue2);

        //Submit and verify user
        this.driver.findElement(By.id("submit")).click();
        String verifyUser = driver.findElement(By.id("profile")).getText();
        Assert.assertEquals("User 1", verifyUser);

        //Klickar på logTime i navigering och verifierar klick
        this.driver.findElement(By.id("logTime")).click();
        String verifyLogTimeClick = driver.findElement(By.id("logTime")).getText();
        Assert.assertEquals("Log time", verifyLogTimeClick);

        //Choose what to report
        this.driver.findElement(By.id("action")).click();
        this.driver.findElement(By.id("action")).sendKeys(("s") + Keys.ENTER);


        //Logout and verify
        String verifyLogOut = driver.findElement(By.id("logOut")).getText();
        Assert.assertEquals("Log out", verifyLogOut);
        this.driver.findElement(By.id("logOut")).click();



    }
}

