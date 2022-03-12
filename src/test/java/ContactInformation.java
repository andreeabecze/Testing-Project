import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ContactInformation extends PageObject {
    @FindBy(xpath = "/html/body/div/div/section/div/form/div[2]/h3")
    private WebElement TextContactInfo;

    @FindBy(xpath = "//*[@id=\"email\"]")
    private WebElement EmailField;

    @FindBy(xpath = "//*[@id=\"phone\"]")
    private WebElement PhoneField;

    @FindBy(xpath = "//*[@id=\"country\"]")
    private WebElement CountryField;

    @FindBy(xpath = "//*[@id=\"city\"]")
    private WebElement CityField;

    @FindBy(xpath = "//*[@id=\"postCode\"]")
    private WebElement PostCodeField;

    @FindBy(xpath = "/html/body/div/div/section/div/form/div[2]/button[2]")
    private WebElement NextButtonContactInfo;



    public ContactInformation (WebDriver driver) {super(driver);}



    public String GetContactInfo () { return this.TextContactInfo.getText();}


    public void populateEmailField () {this.EmailField.sendKeys("andreeab@yahoo.com");}

    public void populatePhoneField () {this.PhoneField.sendKeys("07XXXXXXXX");}

    public void populateCountryField () {this.CountryField.sendKeys("Romania");}

    public void populateCityField () {this.CityField.sendKeys("Brasov");}

    public void populatePostCodeField () {this.PostCodeField.sendKeys("500413");}

    public void ClickNextButtonContactInfo () {this.NextButtonContactInfo.click();}

}

