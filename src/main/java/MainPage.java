
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MainPage {
  private WebDriver driver;

  public MainPage(WebDriver driver){
    this.driver = driver;
  }

  private By accButton = By.xpath("//li/a[@class='my-account']");
  private By shippingPage = By.xpath("//div[@class='additional-links']/ul/li/a");
  private By aboutPage = By.xpath("//div[@class='additional-links']/ul/li/a[text()='About']");
  private By blogPage = By.xpath("//div[@class='additional-links']/ul/li/a[text()='Blog']");
  private By contactPage = By.xpath("//div[@class='additional-links']//a[text()='Contact']");
  private By searchField = By.xpath(".//*[@id='UI-SEARCH']/div[1]/div/div[1]/div/input");
  private By searchButton = By.xpath(".//*[@id='UI-SEARCH']/div[1]/span/button");



  public LoginPage clickAccButton(){
    driver.findElement(accButton).click();
    return new LoginPage(driver);
  }

  public ShippingPage clickShipping(){
    driver.findElement(shippingPage).click();
    return new ShippingPage(driver);
  }

  public AboutPage clickAbout(){
    driver.findElement(aboutPage).click();
    return new AboutPage(driver);
  }

  public BlogPage clickBlog(){
    driver.findElement(blogPage).click();
    return new BlogPage(driver);
  }

  public ContactPage clickContact(){
    driver.findElement(contactPage).click();
    return new ContactPage(driver);
  }

  public MainPage searchProduct(String productName){
    driver.findElement(searchField).sendKeys(productName);
    return this;
  }

  public MainPage clickSearchButton(){
    driver.findElement(searchButton).click();
    return this;
  }






}
