package WebDriver;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
public class ChangePasswordValid {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\user\\Desktop\\geckodriver.exe");
		
		//create an instance of the driver
		WebDriver driver4 = new FirefoxDriver();
		//the driver will wait for 300 seconds before throwing an exception
		driver4.manage().timeouts().implicitlyWait(300, TimeUnit.SECONDS);
		//navigate into trello login webpage
		driver4.navigate().to("https://trello.com/login");
		// will going to maximize the Browser window.
		driver4.manage().window().maximize();
		
		//login
		// enter the mail 
		driver4.findElement(By.xpath(".//*[@id=\"user\"]")).sendKeys("nour150168@bue.edu.eg");
	//enter the password
		driver4.findElement(By.xpath(".//*[@id=\"password\"]")).sendKeys("1234567890");
		//click on the login button
		driver4.findElement(By.xpath(".//*[@id=\"login\"]")).click();
		
		//press the image icon
		driver4.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[1]/div[5]/a[4]/span/span[1]")).click();
		//press settings
		driver4.findElement(By.xpath("/html/body/div[2]/div[2]/div[4]/div/div[2]/div/div/div/ul[1]/li[3]/a")).click();
		Thread.sleep(1000);
		//press change password
		driver4.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[3]/div/div[3]/div[2]/div[1]/a[3]/span")).click();
		
		//enter old password correctly
		driver4.findElement(By.xpath(".//*[@id=\"o_password\"]")).sendKeys("1234567890");
		//enter new password
		driver4.findElement(By.xpath(".//*[@id=\"password1\"]")).sendKeys("1234567890");
		//enter new password again correctly
		driver4.findElement(By.xpath(".//*[@id=\"password2\"]")).sendKeys("1234567890");
		
		//press save button
		driver4.findElement(By.xpath("/html/body/div[2]/div[2]/div[4]/div/div[2]/div/div/div/form/input[4]")).click();
		
		//get the text entered in the new password textfiled
		String newpassword= driver4.findElement(By.xpath(".//*[@id=\"password1\"]")).getText();
		//get the text entered in the new password again textfiled
		 String newpasswordagain= driver4.findElement(By.xpath(".//*[@id=\"password2\"]")).getText();
		Thread.sleep(1000);
		// check whether the new password match the re-entered password
				if(newpassword.equals(newpasswordagain))	
				{
				 System.out.println("The new password is updated Successfuly");
				}
				else { System.out.println("The new password do not match the re-entered password");}
				
				driver4.close();
				driver4.quit();
		




	}

}
