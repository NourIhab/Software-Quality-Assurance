package WebDriver;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
public class ChangePasswordInValid {

	public static void main(String[] args)throws InterruptedException  {
		
System.setProperty("webdriver.gecko.driver", "C:\\Users\\user\\Desktop\\geckodriver.exe");
	
	
	WebDriver driver3 = new FirefoxDriver();
	driver3.manage().timeouts().implicitlyWait(300, TimeUnit.SECONDS);
	driver3.navigate().to("https://trello.com/login");
	driver3.manage().window().maximize();
	
	driver3.findElement(By.xpath(".//*[@id=\"user\"]")).sendKeys("nour150168@bue.edu.eg");
	driver3.findElement(By.xpath(".//*[@id=\"password\"]")).sendKeys("1234567890");
	driver3.findElement(By.xpath(".//*[@id=\"login\"]")).click();
	
	//press the image icon
		driver3.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[1]/div[5]/a[4]/span/span[1]")).click();
		//press settings
		driver3.findElement(By.xpath("/html/body/div[2]/div[2]/div[4]/div/div[2]/div/div/div/ul[1]/li[3]/a")).click();
	Thread.sleep(1000);
	
	//press change password
		driver3.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[3]/div/div[3]/div[2]/div[1]/a[3]/span")).click();
	
		//enter old password wrong
		driver3.findElement(By.xpath(".//*[@id=\"o_password\"]")).sendKeys("1761997nour");
		//enter new password
		driver3.findElement(By.xpath(".//*[@id=\"password1\"]")).sendKeys("1234567890");
		//enter new password again
		driver3.findElement(By.xpath(".//*[@id=\"password2\"]")).sendKeys("1234567890");
		//press save button
		driver3.findElement(By.xpath("/html/body/div[2]/div[2]/div[4]/div/div[2]/div/div/div/form/input[4]")).click();
		
		Thread.sleep(1000);
		
		String errormessage= driver3.findElement(By.xpath(".//*[@id=\"password-error\"]")).getText();
		//check if the password was updated or not by getting the text that appears on the webpage after pressing the save button
				if(errormessage.equals("The old password was incorrect"))	
				{
				
				 System.out.println("The old password is incorrect,please try again!");
				}
				else { System.out.println("An error occured");}
				
				driver3.close();
				driver3.quit();
			

	}
		

	}


