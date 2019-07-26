package TestNGSuite;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.testng.annotations.BeforeMethod;


public class ChangeEmailSuite extends MainClass {
	
  @Test
		  
  public void main() throws InterruptedException{
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
				if(driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[4]/div/div[2]/div/div/div/button")).isEnabled()==true)	
				{
				driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[4]/div/div[2]/div/div/div/button")).click();
				 System.out.println("The new Email is updated successfuly");
				}
				else { System.out.println("An error occured");}
		

  }
  @BeforeMethod
  public void beforeMethod() {
	  System.setProperty("webdriver.gecko.driver", "C:\\Users\\user\\Desktop\\geckodriver.exe");
	  driver.navigate().to("https://trello.com/login");
	  driver.findElement(By.xpath(".//*[@id=\"user\"]")).sendKeys("nour150168@bue.edu.eg");
		driver.findElement(By.xpath(".//*[@id=\"password\"]")).sendKeys("1234567890");
		driver.findElement(By.xpath(".//*[@id=\"login\"]")).click();
  }
 
  
  

}
