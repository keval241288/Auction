package Live_Test;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.junit.*;
import static org.junit.Assert.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Check extends Keywords {
  private WebDriver driver, driver2;
  private String baseUrl;
  private StringBuffer verificationErrors = new StringBuffer();
  //final static Logger logger = Logger.getLogger(Check.class);
  Logger logger=Logger.getLogger(Check.class);
  
  
  @Before
  public void setUp() throws Exception {
	  
	System.setProperty("webdriver.chrome.driver", "D:\\KevalBackup\\Kevalkumar\\Keval\\Data\\Selenium\\chromedriver_win32\\chromedriver.exe");
	driver =new ChromeDriver();
	baseUrl = "https://acceptatie.autoblox.eu/";
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	//driver2 = new FirefoxDriver();
	//driver2.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  }

  @Test
  public void testUntitled() throws Exception 
  {
	   
	  
/* Chrome login*/  		driver.get(baseUrl);
						logger.info("Chrome browser:-> " + "open browser and open URL");
						basic_scenario.Chrome_loginid(driver);
						logger.info("Chrome browser:-> " + "login done");
	    
/* FireFox login */		/*driver2.get(baseUrl);
	    				logger.info("Firefox browser:-> " + "open browser and open URL");
	    				basic_scenario.Firefox_loginid(driver2);
	    				logger.info("Firefox browser:-> " + "login done");*/
/*Chrome link open*/	   
	    				basic_scenario.open_links(driver,baseUrl);
	    				logger.info("Chrome browser:-> " + "open General setting page");
/*Firefox link open*/		    				
	    				/*basic_scenario.open_links2(driver2,baseUrl);
	    				logger.info("Firefox browser:-> " + "open General setting page");*/
  
  }

  @After
  public void tearDown() throws Exception {
	  //basic_scenario.Quit_Browsers(driver,driver2); 
    String verificationErrorString = verificationErrors.toString();
    if (!"".equals(verificationErrorString)) {
      fail(verificationErrorString);
    }
  }
}
