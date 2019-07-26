package TestNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;


public class Testing {
	//create a private instance of a webdriver
	 private WebDriver driver;
	
	//Edit username TestCase
  @Test(/*dataProvider="getCreateData",*/ alwaysRun = true,priority=1 )
  public void EditUserName() throws InterruptedException {
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
  
 
 
  //Change Password Invalid TestCase
  @Test( alwaysRun = true,  priority=2)
  public void ChangePasswordInValid() throws InterruptedException  {
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
  
  //Change Password Valid TestCase
  @Test(  alwaysRun = true, priority=3)
  public void ChangePasswordValid() throws InterruptedException  {
	  getDriver();

		//press the image icon
		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[1]/div[5]/a[4]/span/span[1]")).click();
		//press settings
		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[4]/div/div[2]/div/div/div/ul[1]/li[3]/a")).click();
		Thread.sleep(1000);
		//press change password
		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[3]/div/div[3]/div[2]/div[1]/a[3]/span")).click();
		
		//enter old password correctly
		driver.findElement(By.xpath(".//*[@id=\"o_password\"]")).sendKeys("1234567890");
		//enter new password
		driver.findElement(By.xpath(".//*[@id=\"password1\"]")).sendKeys("1234567890");
		//enter new password again correctly
		driver.findElement(By.xpath(".//*[@id=\"password2\"]")).sendKeys("1234567890");
		
		//press save button
		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[4]/div/div[2]/div/div/div/form/input[4]")).click();
		
		//get the text entered in the new password textfiled
		String newpassword= driver.findElement(By.xpath(".//*[@id=\"password1\"]")).getText();
		//get the text entered in the new password again textfiled
		 String newpasswordagain= driver.findElement(By.xpath(".//*[@id=\"password2\"]")).getText();
		Thread.sleep(1000);
		// check whether the new password match the re-entered password
				if(newpassword.equals(newpasswordagain))	
				{
				 System.out.println("The new password is updated Successfuly");
				}
				else { System.out.println("The new password do not match the re-entered password");}
				
					  
  }
  
  //Change Email TestCase
  @Test( alwaysRun = true, priority=4)
  public void ChangeEmail() throws InterruptedException  {
	  getDriver();
	//press the image
		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[1]/div[5]/a[4]/span/span[1]")).click();
		//press settings
		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[4]/div/div[2]/div/div/div/ul[1]/li[3]/a")).click();
		Thread.sleep(1000);
	//press change email
		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[3]/div/div[3]/div[2]/div[1]/a[4]/span")).click();
	//enter the new email
		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[4]/div/div[2]/div/div/div/label[2]/input")).sendKeys("nourihabmohamed22@yahoo.com");
	
		Thread.sleep(1000);
		// press save button 
		//check whether it is enabled or not
				if(driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[4]/div/div[2]/div/div/div/button")).isEnabled()==true)	
				{
				driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[4]/div/div[2]/div/div/div/button")).click();
				 System.out.println("The new Email is updated successfuly");
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
