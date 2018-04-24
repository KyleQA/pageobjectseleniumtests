import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AccountPage {

    private WebDriver driver;

    public AccountPage(WebDriver driver){
        this.driver = driver;
    }


    private By myAccountTitle = By.xpath(".//*[@id='advice-required-entry-pass']");


    public String getHeadingMyAccountTitleText(){
        return driver.findElement(myAccountTitle).getText();
    }








}
