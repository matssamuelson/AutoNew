import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * Created by matssamuelson on 2017-02-23.
 */
public class ReportTimePage {

    private WebDriver driver;
    private WebDriverWait wait;

    public ReportTimePage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(this.driver, 10);
    }


    public ReportTimePage ChooseStartDropDown() {

        //Choose what to report - Starting
        wait.until(ExpectedConditions.visibilityOf(this.driver.findElement(By.id("action"))));
        Select dropDown = new Select(this.driver.findElement(By.id("action")));
        dropDown.selectByIndex(0);
        return this;
    }

    public ReportTimePage ChooseGoingForLunch() {

        //Choose what to report - Going For Lunch
        wait.until(ExpectedConditions.visibilityOf(this.driver.findElement(By.id("action"))));
        Select dropDown = new Select(this.driver.findElement(By.id("action")));
        dropDown.selectByIndex(1);
        return this;
    }
    public ReportTimePage ChooseBackFromLunch() {

        //Choose what to report - Back from Lunch
        wait.until(ExpectedConditions.visibilityOf(this.driver.findElement(By.id("action"))));
        Select dropDown = new Select(this.driver.findElement(By.id("action")));
        dropDown.selectByIndex(2);
        return this;
    }
    public ReportTimePage ChooseFinishedForTheDay() {

        //Choose what to report - Finished for the day
        wait.until(ExpectedConditions.visibilityOf(this.driver.findElement(By.id("action"))));
        Select dropDown = new Select(this.driver.findElement(By.id("action")));
        dropDown.selectByValue("quit");
        return this;
    }
    public ReportTimePage ChooseVacation() {

        //Choose what to report - Vacation
        wait.until(ExpectedConditions.visibilityOf(this.driver.findElement(By.id("action"))));
        Select dropDown = new Select(this.driver.findElement(By.id("action")));
        dropDown.selectByVisibleText("Vacation");
        return this;
    }

    public ReportTimePage PressSave() {
        //Press Save button
        wait.until(ExpectedConditions.visibilityOf(this.driver.findElement(By.id("submit"))));
        this.driver.findElement(By.id("submit")).click();
        this.driver.findElement(By.cssSelector("[class = 'label label-success']"));
        try {
            Thread.sleep(500);
        }catch (Exception e){

        }
        return this;
    }

    public LoggedInPage GoToDashboard() {

        //Gå till Dashboard
        this.wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("dashboard")));
        this.driver.findElement(By.id("dashboard")).click();
        return new LoggedInPage(this.driver);
    }

}
