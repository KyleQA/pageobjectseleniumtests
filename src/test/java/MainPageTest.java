import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class MainPageTest {

  private WebDriver driver;
  private MainPage mainPage;

  //@Before
  public void setUpG(){
    System.setProperty("webdriver.gecko.driver", "c:\\Tools\\geckodriver.exe");
    driver = new FirefoxDriver();
    driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    driver.manage().window().maximize();
    driver.get("https://spiritedgifts.com");
    mainPage = new MainPage(driver);
  }

  @Before
  public void setUpC(){
    System.setProperty("webdriver.chrome.driver", "c:\\Tools\\chromedriver.exe");
    driver = new ChromeDriver();
    driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    driver.manage().window().maximize();
    driver.get("https://spiritedgifts.com");
    mainPage = new MainPage(driver);
  }





  //@Test
  public void logIn(){
    LoginPage loginPage = mainPage.clickAccButton();
    String heading = loginPage.getHeadingText();
    Assert.assertEquals("LOGIN OR CREATE AN ACCOUNT", heading);
  }


  //@Test
  public void shipping(){
    ShippingPage shippingPage = mainPage.clickShipping();
    String headingShip = shippingPage.getHeadingShipText();
    Assert.assertEquals("SHIPPING & RETURNS", headingShip);
  }

  //@Test
  public void contact(){
    ContactPage contactPage = mainPage.clickContact();
    String headingContact = contactPage.getHeadingContactText();
    Assert.assertEquals("CONTACT US", headingContact);
  }

  //@Test
  public void about(){
    AboutPage aboutPage = mainPage.clickAbout();
    String headingAbout = aboutPage.getHeadingAboutText();
    Assert.assertEquals("ABOUT SPIRITED GIFTS", headingAbout);
  }

  @Test
  public void blog(){
    BlogPage blogPage = mainPage.clickBlog();

    for (String tab : driver.getWindowHandles()){
      driver.switchTo().window(tab);
    }

    driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
    BlogPage blogPost = blogPage.selectPost();
    String headingPostBloodOath = blogPage.getHeadingContactText();
    Assert.assertEquals("Blood Oath Pact #3 Released!", headingPostBloodOath);
  }





  @After
  public  void tearDown(){
    driver.quit();
  }


}
