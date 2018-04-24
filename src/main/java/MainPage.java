
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
  private By searchTitle = By.xpath("//div[@class='page-title']/h1");
  private By shopByMenu = By.xpath(".//*[@id='nav-1']/a");
  private By engravingMenu = By.xpath(".//*[@id='nav-2']/a");
  private By giftsMenu = By.xpath(".//*[@id='nav-3']/a");
  private By occasionMenu = By.xpath(".//*[@id='nav-4']/a");
  private By brandsMenu = By.xpath(".//*[@id='nav-5']/a");
  private By corporateMenu = By.xpath(".//*[@id='nav-6']/a");

  private By titleShopByMenu = By.xpath("//div[@class='page-title category-title']/h1");
  private By titleEngravingMenu = By.xpath("//div[@class='page-title category-title']/h1");
  private By titleGiftsMenu = By.xpath("//div[@class='page-title category-title']/h1");
  private By titleOccasionMenu = By.xpath("//div[@class='page-title category-title']/h1");
  private By titleBrandsMenu = By.xpath("//div[@class='page-title category-title']/h1");
  private By titleCorporateMenu = By.xpath("//div[@class='page-title']/h1");














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

  public String getHeadingSearchText() {
    return driver.findElement(searchTitle).getText();
    }

  public MainPage typeProductName(String productName){
    driver.findElement(searchField).sendKeys(productName);
    return this;
  }

  public MainPage findProductInSearchField(String productName){
    this.typeProductName(productName);
    driver.findElement(searchButton).click();
    return new MainPage(driver);
  }

  public MainPage clickShopByMenu(){
    driver.findElement(shopByMenu).click();
    return new MainPage(driver);
  }
  public String getHeadingShopByMenuText() {
    return driver.findElement(titleShopByMenu).getText();
  }

  public MainPage clickEngravingMenu(){
    driver.findElement(engravingMenu).click();
    return new MainPage(driver);
  }
  public String getHeadingEngravingMenuText() {
    return driver.findElement(titleEngravingMenu).getText();
  }

  public MainPage clickGiftsMenu(){
    driver.findElement(giftsMenu).click();
    return new MainPage(driver);
  }
  public String getHeadingGiftMenuText() {
    return driver.findElement(titleGiftsMenu).getText();
  }

  public MainPage clickOccasionMenu(){
    driver.findElement(occasionMenu).click();
    return new MainPage(driver);
  }
  public String getHeadingOccasionMenuText() {
    return driver.findElement(titleOccasionMenu).getText();
  }

  public MainPage clickBrandsMenu(){
    driver.findElement(brandsMenu).click();
    return new MainPage(driver);
  }
  public String getHeadingBrandsMenuText() {
    return driver.findElement(titleBrandsMenu).getText();
  }

  public MainPage clickCorporateMenu(){
    driver.findElement(corporateMenu).click();
    return new MainPage(driver);
  }
  public String getHeadingCorporateMenuText() {
    return driver.findElement(titleCorporateMenu).getText();
  }





}
