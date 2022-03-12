import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class Homepage extends PageObject {
    @FindBy(xpath = "/html/body/section[1]/div/div/div/a")
    private WebElement startEnrollmentButton;

    @FindBy(xpath = "/html/body/section[3]/div/div/div[1]/div/div/a")
    private WebElement startReadMoreVirtualButton;
    @FindBy(xpath = "/html/body/section[3]/div/div/div[1]/div/div/h3")
    private WebElement virtualHeader;

    @FindBy(xpath = "/html/body/section[3]/div/div/div[2]/div/div/a")
    private WebElement startReadMoreHybridButton;
    @FindBy(xpath = "/html/body/section[3]/div/div/div[2]/div/div/h3")
    private WebElement hybridHeader;


    @FindBy(xpath = "//*[@id=\"navmenu\"]/ul/li[2]/a")
    private WebElement OpenQuestions;
    @FindBy(xpath = "//*[@id=\"questions\"]/div/h2")
    private WebElement TextFAQ;

    @FindBy(xpath = "//*[@id=\"navmenu\"]/ul/li[3]/a")
    private WebElement OpenInstructors;
    @FindBy(xpath = "//*[@id=\"instructors\"]/div/h2")
    private WebElement TextInstructors;

    @FindBy(xpath = "//*[@id=\"learn-selenium\"]/div/div/div[1]/a")
    private WebElement OpenSelenium;
    @FindBy(xpath = "//*[@id=\"learn-selenium\"]/div/div/div[1]/h2")
    private WebElement TextSelenium;

    @FindBy(xpath = "//*[@id=\"learn-fundamentals\"]/div/div/div[2]/a")
    private WebElement OpenReadMoreLearnFundamentals;
    @FindBy(xpath = "//*[@id=\"learn-fundamentals\"]/div/div/div[2]/h2")
    private WebElement TextLearnFundamentals;

    @FindBy(xpath = "/html/body/section[2]/div/div/div/input")
    private WebElement SignUpField;

    @FindBy(xpath = "/html/body/section[2]/div/div/div/button")
    private WebElement SubmitButton;

    @FindBy(xpath = "//*[@id=\"instructors\"]/div/div/div[1]/div/div/a[1]/i")
    private WebElement OpenTwitterJohnDoe;
    @FindBy(xpath = "//*[@id=\"instructors\"]/div/div/div[1]/div/div/img")
    private WebElement PhotoJohnDoe;

    @FindBy(xpath = "//*[@id=\"instructors\"]/div/div/div[2]/div/div/a[4]/i")
    private WebElement OpenInstagramJaneDoe;
    @FindBy(xpath = "//*[@id=\"instructors\"]/div/div/div[2]/div/div/img")
    private WebElement PhotoJaneDoe;


    public Homepage(WebDriver driver) { super(driver);}


    public void ClickOnEnrollmentButton() {
        this.startEnrollmentButton.click();
    }

    public void ClickOnReadMoreVirtualButton () {
        Utils.scrollToElement(driver, virtualHeader);
        this.startReadMoreVirtualButton.click();}

    public void ClickOnQuestionsButton () {this.OpenQuestions.click();}
    public String GetQuestionHeaderText() {return TextFAQ.getText(); }

    public void ClickOnInstructorsButton () {this.OpenInstructors.click();}
    public String GetInstructorsHeaderText() {return TextInstructors.getText();}

    public void ClickOnSeleniumButton () {
        Utils.scrollToElement(driver,TextSelenium);
        this.OpenSelenium.click();
    }

    public void ClickOnReadMoreHybrid () {
        Utils.scrollToElement(driver, hybridHeader);
        this.startReadMoreHybridButton.click();}

    public void ClickOnReadMoreFundamentalsButton () {
        Utils.scrollToElement(driver, TextLearnFundamentals);
        this.OpenReadMoreLearnFundamentals.click();}

    public void WriteinSignUpField() {this.SignUpField.sendKeys("andreea.c@yahoo.com");}

    public void ClickOnSubmitButton() {
        this.SubmitButton.click();
    }

    public void ClickOnTwitterJohnDoe () {
        Utils.scrollToElement(driver, PhotoJohnDoe);
        this.OpenTwitterJohnDoe.click();}

    public void ClickOnInstagramJaneDoe () {
        Utils.scrollToElement(driver, PhotoJaneDoe);
        this.OpenInstagramJaneDoe.click();}


}
