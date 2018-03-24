import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

  WebDriver driver;

  public LoginPage(WebDriver driver) {
    this.driver = driver;
    }

    private By loginField = By.xpath(".//*[@id='email']");
    private By passwordField = By.xpath(".//*[@id='pass']");
    private By loginButton = By.xpath(".//*[@id='send2']");
    private By heading = By.xpath(".//*[@id='login-form']/h2");
    private By errorEmail = By.xpath(".//*[@id='advice-required-entry-email']//div[@class='validation-advice']");
    private By errorPass = By.xpath(".//*[@id='advice-required-entry-pass']//div[@class='validation-advice']");
    private By createAccLink = By.xpath("//div[@class='btn btn-info validation-passed']");


    public LoginPage typeUsername(String username){
      driver.findElement(loginField).sendKeys(username);
      return this;
    }

    public LoginPage typePassword(String password){
      driver.findElement(passwordField).sendKeys(password);
      return this;
    }

    public LoginPage clickLoginButton(){
      driver.findElement(loginButton).click();
      return new LoginPage(driver);
    }


    public LoginPage loginWithInvalidCreds(String username, String password){
      this.typeUsername(username);
      this.typePassword(password);
      driver.findElement(loginButton).click();
      return new LoginPage(driver);
    }



    public String getErrorEmailText(){
      return driver.findElement(errorEmail).getText();
    }

    public String getHeadingText(){
      return driver.findElement(heading).getText();
    }

    public String getErrorText(){
      return driver.findElement(errorPass).getText();
    }

    public RegisterPage createAccount(){
      driver.findElement(createAccLink).click();
      return new RegisterPage(driver);
    }



  }
