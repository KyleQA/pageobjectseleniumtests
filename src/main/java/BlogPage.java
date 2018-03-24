import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BlogPage {

  private WebDriver driver;

  public BlogPage(WebDriver driver){
    this.driver = driver;
  }

  private By postBloodOath = By.xpath("//a[text()='Blood Oath Pact #3 Released!']");
  private By headingPostBloodOath = By.xpath("//div[@class='page-title post-title']/h1[text()='Blood Oath Pact #3 Released!']");


  public BlogPage selectPost(){
    driver.findElement(postBloodOath).click();
    return new BlogPage(driver);
  }

  public String getHeadingContactText() {
    return driver.findElement(headingPostBloodOath).getText();
  }





}
