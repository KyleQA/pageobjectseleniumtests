import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegisterPage {

  private WebDriver driver;

  public RegisterPage(WebDriver driver) {
    this.driver = driver;
  }

  private By heading = By.xpath("//div[@class='widget-title']//h2");
  private By firstNameField = By.xpath(".//*[@id='firstname']");
  private By lastNameField = By.xpath(".//*[@id='lastname']");
  private By emailAddressField = By.xpath(".//*[@id='email_address']");
  private By passwordField = By.xpath(".//*[@id='password']");
  private By passwordConfirmField = By.xpath(".//*[@id='confirmation']");
  private By reCaptcha = By.xpath("//div[5]");
  private By registerButton = By.xpath(".//*[@id='create-account-submit-button']");
  private By emailError = By.xpath(".//*[@id='advice-required-entry-email_address']");
  private By passwordError = By.xpath(".//*[@id='advice-required-entry-email_address']");
  private By passwordConfirmError = By.xpath(".//*[@id='advice-required-entry-email_address']");

  public RegisterPage typeFirstName(String firstName){
    driver.findElement(firstNameField).sendKeys(firstName);
    return this;
  }

  public RegisterPage typeLastName(String lastName){
    driver.findElement(lastNameField).sendKeys(lastName);
    return this;
  }

  public RegisterPage typeEmail(String email){
    driver.findElement(emailAddressField).sendKeys(email);
    return this;
  }

  public RegisterPage typePassword(String password){
    driver.findElement(passwordField).sendKeys(password);
    return this;
  }

  public RegisterPage typePasswordConfirm(String confpassword){
    driver.findElement(passwordConfirmField).sendKeys(confpassword);
    return this;
  }

  public RegisterPage clickReCaptcha(){
    driver.findElement(reCaptcha).click();
    return this;
  }

  public RegisterPage clickRegisterButton(){
    driver.findElement(registerButton).click();
    return this;
  }

  public RegisterPage registerWithInvalidCreds(String firstName, String lastName, String email, String password, String confpassword){
    this.typeFirstName(firstName);
    this.typeLastName(lastName);
    this.typeEmail(email);
    this.typePassword(password);
    this.typePasswordConfirm(confpassword);
    driver.findElement(reCaptcha).click();
    driver.findElement(registerButton).click();
    return new RegisterPage(driver);

  }

  public String getEmailErrorText(){
    return driver.findElement(emailError).getText();
  }

  public String getPasswordErrorText(){
    return driver.findElement(passwordError).getText();
  }

  public String getPasswordConfirmErrorText(){
    return driver.findElement(passwordConfirmError).getText();
  }



}