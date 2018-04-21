import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class RegisterPageTest {

   private WebDriver driver;
   private RegisterPage registerPage;

   @Before
   public void setUpC(){
       System.setProperty("webdriver.chrome.driver", "c:\\Tools\\chromedriver.exe");
       driver = new ChromeDriver();
       driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
       driver.manage().window().maximize();
       driver.get("https://spiritedgifts.com/customer/account/create///");
       registerPage = new RegisterPage(driver);
   }

   @Test
   public void registerWithErrorEmail(){
       RegisterPage newRegisterPage = registerPage.registerWithInvalidCreds("","", "qwerty@", "", "");
       String eError = newRegisterPage.getEmailErrorText();
       Assert.assertEquals("Please enter a valid email address. For example johndoe@domain.com.", eError);
   }














    @After
    public  void tearDown(){
        driver.quit();
    }


   }
