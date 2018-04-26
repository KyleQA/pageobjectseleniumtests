import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import java.util.concurrent.TimeUnit;

public class LoginPageTest {

    private WebDriver driver;
    private LoginPage loginPage;

    @Before
    public void setUpC(){
        System.setProperty("webdriver.chrome.driver", "c:\\Tools\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("https://spiritedgifts.com/customer/account/login/");
        loginPage = new LoginPage(driver);
    }


    @Test
    public void loginWithInvalidCredsTestL(){
       LoginPage newLoginPage = loginPage.loginWithInvalidCreds("kirillqatest11@gmail.com","123456");
       String error = newLoginPage.getErrorText();
       Assert.assertEquals("Invalid login or password.", error);
    }

    @Test
    public void loginWithInvalidCredsTestP(){
        LoginPage newLoginPage = loginPage.loginWithInvalidCreds("kirillqatest1@gmail.com","1234567");
        String error = newLoginPage.getErrorText();
        Assert.assertEquals("Invalid login or password.", error);
    }

    @Test
    public void loginWithInvalidCredsTestLoginEmpty(){
        LoginPage newLoginPage = loginPage.loginWithInvalidCreds("","123456");
        String errorET = newLoginPage.getErrorEmailText();
        Assert.assertEquals("This is a required field.", errorET);
    }

    @Test
    public void loginWithInvalidCredsTestPasswordEmpty(){
        LoginPage newLoginPage = loginPage.loginWithInvalidCreds("kirillqatest1@gmail.com","");
        String errorPT = newLoginPage.getErrorPassText();
        Assert.assertEquals("This is a required field.", errorPT);
    }

    @Test
    public void loginWithValidCredsTest(){
        LoginPage newLoginPage = loginPage.loginWithValidCreds("kirillqatest1@gmail.com","123456");
        String errorAccountTitle = loginPage.getHeadingMyAccountTitleText();
        Assert.assertEquals("Hello, Test AWS!", errorAccountTitle);
    }

    @Test
    public void loginWithInvalidCredsTestLoginError(){
        LoginPage newLoginPage = loginPage.loginWithInvalidCreds("kirill@gmail","123456");
        String errorEET = newLoginPage.getErrorEmailEmailText();
        Assert.assertEquals("Please enter a valid email address. For example johndoe@domain.com.", errorEET);
    }

    @Test
    public void loginWithInvalidCredsTestPasswordError(){
        LoginPage newLoginPage = loginPage.loginWithInvalidCreds("kirillqatest1@gmail.com","12345");
        String errorPPT = newLoginPage.getErrorPassPassText();
        Assert.assertEquals("Please enter 6 or more characters without leading or trailing spaces.", errorPPT);
    }


    @Test
    public void clickForgotPasswordLink(){
        LoginPage newLoginPage = loginPage.clickForgotPassword();
        String headingForgotPas = loginPage.getHeadingForgotPasswordText();
        Assert.assertEquals("FORGOT YOUR PASSWORD?", headingForgotPas);
    }




    @After
    public  void tearDown(){
        driver.quit();
    }

}
