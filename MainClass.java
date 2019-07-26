package TestNGSuite;



import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;


public  class MainClass {
 
	 public static WebDriver driver = new FirefoxDriver();
	 
  @BeforeSuite
	  public void   setup() throws Exception {
	  System.setProperty("webdriver.gecko.driver", "C:\\Users\\user\\Desktop\\geckodriver.exe");
		driver.manage().timeouts().implicitlyWait(300, TimeUnit.SECONDS);
		//This line will going to maximize the Browser window.
		driver.manage().window().maximize();
		driver.get("https://trello.com/login/");		
  }

  @AfterSuite
  public void tearDown() throws Exception{
	  driver.close();
	
  }
  

}
