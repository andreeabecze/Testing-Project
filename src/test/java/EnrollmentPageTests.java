import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class EnrollmentPageTests {

    protected static final WebDriver driver = new ChromeDriver();

    @BeforeSuite
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", Utils.CHROME_DRIVER_LOCATION);
    }


    @Test(testName = "Verify functionality for Start Enrollment")
    public void VerifyStartEnrollment() {
        driver.get(Utils.BASE_URL);
        Homepage webForm = new Homepage(driver);
        webForm.ClickOnEnrollementButton();

        Enrollment pageEnrol = new Enrollment(driver);
        Assert.assertEquals(pageEnrol.getEnrollmentHeader(), Constants.SIGN_UP_HEADER);
    }


    @Test(testName = "Verify functionality for Contact Information with one empty field")
    public void VerifyContactInformationWithEmptyField () {
        driver.get(Utils.BASE_URL);
        Homepage webForm = new Homepage(driver);
        webForm.ClickOnEnrollementButton();


        Enrollment pageInfo = new Enrollment(driver);
        pageInfo.getEnrollmentHeader();
        pageInfo.populateFirstNameField();
        pageInfo.populateLastNameField();
        pageInfo.populateUsernameField();
        pageInfo.populatePasswordField();
        pageInfo.populateConfirmPasswordField();
        pageInfo.clickNextButton();
        Utils.waitForElementToLoad(1);

        ContactInformation ContactInfo = new ContactInformation(driver);
        Assert.assertEquals(ContactInfo.GetContactInfo(), Constants.CONTACT_INFO_HEADER);

        ContactInfo.populateEmailField();
        ContactInfo.populateCountryField();
        ContactInfo.populateCityField();
        ContactInfo.populatePostCodeField();
        ContactInfo.ClickNextButtonContactInfo();

        Utils.waitForElementToLoad(2);
        Assert.assertEquals(ContactInfo.GetContactInfo(), Constants.CONTACT_INFO_HEADER);
    }



    @Test(testName = "Verify functionality for Contact Information with no empty field")
    public void VerifyContactInformationNoEmptyField () {
        driver.get(Utils.BASE_URL);
        Homepage webForm = new Homepage(driver);
        webForm.ClickOnEnrollementButton();


        Enrollment pageInfo = new Enrollment(driver);
        pageInfo.getEnrollmentHeader();
        pageInfo.populateFirstNameField();
        pageInfo.populateLastNameField();
        pageInfo.populateUsernameField();
        pageInfo.populatePasswordField();
        pageInfo.populateConfirmPasswordField();
        pageInfo.clickNextButton();
        Utils.waitForElementToLoad(1);

        ContactInformation ContactInfo = new ContactInformation(driver);
        Assert.assertEquals(ContactInfo.GetContactInfo(), Constants.CONTACT_INFO_HEADER);

        ContactInfo.populateEmailField();
        ContactInfo.populatePhoneField();
        ContactInfo.populateCountryField();
        ContactInfo.populateCityField();
        ContactInfo.populatePostCodeField();
        ContactInfo.ClickNextButtonContactInfo();

        Utils.waitForElementToLoad(1);
        CourseOption courseOption = new CourseOption(driver);
        Assert.assertEquals(courseOption.CourseHeader(), Constants.COURSE_HEADER);
    }



    @AfterSuite
    public static void cleanUp() {
        driver.manage().deleteAllCookies();
        driver.quit();
    }

}
