import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AboutPage {

  WebDriver driver;

  public AboutPage(WebDriver driver) {
    this.driver = driver;
  }

  private By headingAbout = By.xpath("//div[@class='widget-title']/h2[text()='ABOUT SPIRITED GIFTS']");



  public String getHeadingAboutText(){
    return driver.findElement(headingAbout).getText();
  }

}
