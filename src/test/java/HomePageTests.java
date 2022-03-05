import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class HomePageTests {
    protected static final WebDriver driver = new ChromeDriver();

    @BeforeSuite
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", Utils.CHROME_DRIVER_LOCATION);
    }


    @Test(testName = "Verify functionality for Read More Virtual")
    public void VerifyStartReadMoreVirtual () {
        driver.get(Utils.BASE_URL);
        Homepage webForm = new Homepage(driver);
        webForm.ClickOnReadMoreVirtualButton();

        Virtual pageVirtual = new Virtual(driver);
        Assert.assertEquals(pageVirtual.getVirtualHeader(), Constants.VIRTUAL_HEADER);
    }

    @Test(testName = "Verify functionality for Frequently Asked Questions button")
    public void VerifyOpenQuestionsbutton() {
        driver.get(Utils.BASE_URL);
        Homepage webForm = new Homepage(driver);
        webForm.ClickOnQuestionsButton();
        Utils.waitForElementToLoad(2);
        Assert.assertEquals(webForm.GetQuestionHeaderText(), Constants.FAQ_HEADER);
    }

    @Test(testName = "Verify functionality for Instructors button")
    public void VerifyOpenInstructors() {
        driver.get(Utils.BASE_URL);
        Homepage webForm = new Homepage (driver);
        webForm.ClickOnInstructorsButton();
        Utils.waitForElementToLoad(3);
        Assert.assertEquals(webForm.GetInstructorsHeaderText(),Constants.INSTRUCTORS_HEADER);
    }

    @Test(testName = "Verify functionality for Selenium button")
    public void VerifyOpenSelenium() {
        driver.get(Utils.BASE_URL);
        Homepage webForm = new Homepage(driver);
        webForm.ClickOnSeleniumButton();

        Selenium pageSelenium = new Selenium(driver);
        Utils.waitForElementToLoad(3);
        Assert.assertEquals(pageSelenium.getSeleniumHeader(), Constants.SELENIUM_HEADER);
    }

    @Test(testName = "Verify functionality for Hybrid button")
    public void VerifyOpenHybrid() {
        driver.get(Utils.BASE_URL);
        Homepage webform = new Homepage(driver);
        webform.ClickOnReadMoreHybrid();

        Hybrid pageHybrid = new Hybrid(driver);
        Utils.waitForElementToLoad(3);
        Assert.assertEquals(pageHybrid.GetHybridHeader(), Constants.HYBRID_HEADER);
    }

    @Test(testName = "Verify functionality for Learn the Fundamentals button")
    public void VerifyOpenLearnFundamentals () {
        driver.get(Utils.BASE_URL);
        Homepage webform = new Homepage(driver);
        webform.ClickOnReadMoreFundamentalsButton();

        Fundamentals pageFundamentals = new Fundamentals(driver);
        Utils.waitForElementToLoad(1);
        Assert.assertEquals(pageFundamentals.getFundamentalsHeader(), Constants.FUNDAMENTALS_HEADER);

    }
    @Test(testName = "Verify functionality for Sign Up Newsletter Field")
    public void VerifySignUpField () {
        driver.get(Utils.BASE_URL);
        Homepage webForm = new Homepage(driver);
        webForm.WriteinSignUpField();
        Utils.waitForElementToLoad(1);
        webForm.ClickOnSubmitButton();
        Utils.waitForElementToLoad(1);
        driver.switchTo().alert().accept();
        Utils.waitForElementToLoad(1);
    }

    @Test(testName = "Verify functionality for Social Media John Doe")
    public void VerifyTwitterJohnDoe () {
        driver.get(Utils.BASE_URL);
        Homepage webForm = new Homepage (driver);
        webForm.ClickOnTwitterJohnDoe();
        Utils.waitForElementToLoad(1);
        Assert.assertEquals(driver.getTitle(), "Twitter. It’s what’s happening / Twitter");

    }

    @Test(testName = "Verify functionality for Social Media Jane Doe")
    public void VerifyInstagramJaneDoe () {
        driver.get(Utils.BASE_URL);
        Homepage webForm = new Homepage(driver);
        webForm.ClickOnInstagramJaneDoe();
        Utils.waitForElementToLoad(1);
        Assert.assertEquals(driver.getTitle(), "Instagram");
    }

    @AfterSuite
    public static void cleanUp() {
        driver.manage().deleteAllCookies();
        driver.quit();
    }
}
