import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CourseOption extends PageObject{
    @FindBy(xpath = "/html/body/div/div/section/div/form/div[3]/h3")
    private WebElement CourseHeader;

    public CourseOption (WebDriver driver) { super(driver); }


    public String CourseHeader () {return this.CourseHeader.getText();}


}
