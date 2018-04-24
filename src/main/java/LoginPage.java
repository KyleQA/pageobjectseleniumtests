import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

    private WebDriver driver;


    public LoginPage(WebDriver driver){
    this.driver = driver;
    }

    private By loginField = By.xpath(".//*[@id='email']");
    private By passwordField = By.xpath(".//*[@id='pass']");
    private By loginButton = By.xpath(".//*[@id='send2']");
    private By heading = By.xpath(".//*[@id='login-form']/h2");
    private By error = By.xpath("//div[@class='container main-content']//li[@class='error-msg']");
    private By errorEmail = By.xpath(".//*[@id='advice-required-entry-email']");
    private By errorPass = By.xpath(".//*[@id='advice-required-entry-pass']");
    private By createAccLink = By.xpath("//div[@class='btn btn-info validation-passed']");

    private By myAccountTitle = By.xpath("//div[@class='welcome-msg']/p[@class='hello']");

    private By forgotPasswordLink = By.xpath(".//*[@id='login-form']/div/div[1]/div/div/div/div[2]/div[4]/a");
    private By forgotPasswordTitle = By.xpath("//h1[@class='h2']");

    private By errorEmailEmail = By.xpath(".//*[@id='advice-validate-email-email']");
    private By errorPassPass = By.xpath(".//*[@id='advice-validate-password-pass']");


    public LoginPage typeUsername(String username){
      driver.findElement(loginField).sendKeys(username);
      return this;
    }

    public LoginPage typePassword(String password){
      driver.findElement(passwordField).sendKeys(password);
      return this;
    }


    public LoginPage loginWithInvalidCreds(String username, String password){
      this.typeUsername(username);
      this.typePassword(password);
      driver.findElement(loginButton).click();
      return new LoginPage(driver);
    }

    public LoginPage loginWithValidCreds(String username, String password){
        this.typeUsername(username);
        this.typePassword(password);
        driver.findElement(loginButton).click();
        return new LoginPage(driver);
    }
    public LoginPage loginWithInwalidEmail(String username, String password){
        this.typeUsername(username);
        this.typePassword(password);
        driver.findElement(loginButton).click();
        return new LoginPage(driver);
    }

    public LoginPage loginWithInwalidPass(String username, String password){
        this.typeUsername(username);
        this.typePassword(password);
        driver.findElement(loginButton).click();
        return new LoginPage(driver);
    }


    public LoginPage clickForgotPassword(){
        driver.findElement(forgotPasswordLink).click();
        return new LoginPage(driver);
    }

    public String getHeadingForgotPasswordText(){
        return driver.findElement(forgotPasswordTitle).getText();
    }

    public String getErrorText(){
      return driver.findElement(error).getText();
    }

    public String getErrorEmailText(){
      return driver.findElement(errorEmail).getText();
    }

    public String getHeadingText(){
      return driver.findElement(heading).getText();
    }

    public String getErrorPassText(){
      return driver.findElement(errorPass).getText();
    }

    public String getHeadingMyAccountTitleText(){
        return driver.findElement(myAccountTitle).getText();
    }

    public String getErrorEmailEmailText(){
        return driver.findElement(errorEmailEmail).getText();
    }

    public String getErrorPassPassText(){
        return driver.findElement(errorPassPass).getText();
    }


    }
