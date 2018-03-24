import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ContactPage {
  private WebDriver driver;

  public ContactPage(WebDriver driver){
    this.driver = driver;
  }

  private By headingContact = By.xpath("//div[@class='page-title']/h1[text()='Contact Us']");



  public String getHeadingContactText(){
    return driver.findElement(headingContact).getText();
  }



}
