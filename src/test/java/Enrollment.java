import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Enrollment extends PageObject {
    @FindBy(xpath = "/html/body/div/div/h2")
    private WebElement startEnrollementHeader;

    @FindBy(xpath = "//*[@id=\"firstName\"]")
    private WebElement FirstNameField;

    @FindBy(xpath = "//*[@id=\"lastName\"]")
    private WebElement LastNameField;

    @FindBy(xpath = "//*[@id=\"username\"]")
    private WebElement UsernameField;

    @FindBy(xpath = "//*[@id=\"password\"]")
    private WebElement PasswordField;

    @FindBy(xpath = "//*[@id=\"cpassword\"]")
    private WebElement ConfirmPassword;

    @FindBy(xpath = "/html/body/div/div/section/div/form/div[1]/button")
    private WebElement NextButton;




    public Enrollment (WebDriver driver) { super(driver); }



    public String getEnrollmentHeader () {return this.startEnrollementHeader.getText();
    }

    public void populateFirstNameField () {this.FirstNameField.sendKeys("Andreea");}

    public void populateLastNameField () {this.LastNameField.sendKeys("Becze");}

    public void populateUsernameField () {this.UsernameField.sendKeys("VIVIVI");}

    public void populatePasswordField () {this.PasswordField.sendKeys("123456");}

    public void populateConfirmPasswordField () {this.ConfirmPassword.sendKeys("123456");}

    public void clickNextButton () {
        Utils.scrollToElement(driver, NextButton);
        this.NextButton.click();
    }

}
