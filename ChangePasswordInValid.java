package TestNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ChangePasswordInValid {
	
	//create a private instance of a webdriver
	 private WebDriver driver;
	 //Change Password Invalid TestCase
	 
	 //Change Password inValid TestCase
	  @Test(  alwaysRun = true, priority=2)
	  public void Main() throws InterruptedException  {
		  getDriver();
			//press the image icon
			driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[1]/div[5]/a[4]/span/span[1]")).click();
			//press settings
			driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[4]/div/div[2]/div/div/div/ul[1]/li[3]/a")).click();
		Thread.sleep(1000);
		
		//press change password
			driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[3]/div/div[3]/div[2]/div[1]/a[3]/span")).click();
		
			//enter old password wrong
			driver.findElement(By.xpath(".//*[@id=\"o_password\"]")).sendKeys("1761997nour");
			//enter new password
			driver.findElement(By.xpath(".//*[@id=\"password1\"]")).sendKeys("1234567890");
			//enter new password again
			driver.findElement(By.xpath(".//*[@id=\"password2\"]")).sendKeys("1234567890");
			//press save button
			driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[4]/div/div[2]/div/div/div/form/input[4]")).click();
			
			Thread.sleep(1000);
			
			String errormessage= driver.findElement(By.xpath(".//*[@id=\"password-error\"]")).getText();
			//check if the password was updated or not by getting the text that appears on the webpage after pressing the save button
					if(errormessage.equals("The old password was incorrect"))	
					{
					
					 System.out.println("The old password is incorrect,please try again!");
					}
					else { System.out.println("An error occured");}  }
	  


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
