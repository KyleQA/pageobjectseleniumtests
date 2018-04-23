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











    //@After
    public  void tearDown(){
        driver.quit();
    }

}
