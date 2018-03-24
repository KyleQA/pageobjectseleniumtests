import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ShippingPage {

  WebDriver driver;

  public ShippingPage(WebDriver driver) {
    this.driver = driver;
  }

  private By headingShip = By.xpath("html/body/div[2]/div/div/div/div[2]/div/div[1]/h2");



  public String getHeadingShipText(){
    return driver.findElement(headingShip).getText();
  }


}
