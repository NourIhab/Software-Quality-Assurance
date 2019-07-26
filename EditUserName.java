package TestNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class EditUserName {
	//create a private instance of a webdriver
	 private WebDriver driver;
	 @Test(/*dataProvider="getCreateData",*/ alwaysRun = true,priority=1 )
	  public void Main() throws InterruptedException {
		  //call the get driver function
		  getDriver();
		  
			// press the image button
			driver.findElement(By.xpath("//*[@id=\"header\"]/div[5]/a[4]/span/span[1]")).click();
		// press settings
			driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[4]/div/div[2]/div/div/div/ul[1]/li[3]/a")).click();
			Thread.sleep(1000);
			//press change name, intilaise , bio
			
			driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[3]/div/div[3]/div[2]/div[1]/a[1]/span")).click();
		
			driver.findElement(By.xpath(".//*[@id=\"username\"]")).clear();
			//Enter the new username
			driver.findElement(By.xpath(".//*[@id=\"username\"]")).sendKeys("Nour1508");
			
			Thread.sleep(1000);

		// press save button
		if(driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[4]/div/div[2]/div/div/div/form/input")).isEnabled()==true)	
		{
		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[4]/div/div[2]/div/div/div/form/input")).click();
		 System.out.println("The username is updated Successfuly");
		}
		else { System.out.println("An error occured");}
		
		
	  }
		@BeforeMethod(alwaysRun = true)
		  public void beforeMethod() {

				System.setProperty("webdriver.gecko.driver", "C:\\Users\\user\\Desktop\\geckodriver.exe");
				 driver = new FirefoxDriver();
			   driver.navigate().to("https://trello.com");
				driver.manage().timeouts().implicitlyWait(300, TimeUnit.SECONDS);
				// will going to maximize the Browser window.
				driver.manage().window().maximize();
				driver.navigate().to("https://trello.com/login/");
				
				driver.findElement(By.xpath(".//*[@id=\"user\"]")).sendKeys("nour150168@bue.edu.eg");
				driver.findElement(By.xpath(".//*[@id=\"password\"]")).sendKeys("1234567890");
				driver.findElement(By.xpath(".//*[@id=\"login\"]")).click();
		  }

		  @AfterMethod(alwaysRun = true)
		  public void afterMethod() {
			  
			  driver.close();

			
			 
		  }
		  public WebDriver getDriver (){
			  
		      return driver;
		  }

}
