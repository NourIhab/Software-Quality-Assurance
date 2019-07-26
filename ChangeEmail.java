package WebDriver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ChangeEmail {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\user\\Desktop\\geckodriver.exe");
		
		
		WebDriver driver4 = new FirefoxDriver();
		driver4.manage().timeouts().implicitlyWait(300, TimeUnit.SECONDS);
		driver4.navigate().to("https://trello.com/login");
		driver4.manage().window().maximize();
		
		driver4.findElement(By.xpath(".//*[@id=\"user\"]")).sendKeys("nour150168@bue.edu.eg");
		driver4.findElement(By.xpath(".//*[@id=\"password\"]")).sendKeys("1234567890");
		driver4.findElement(By.xpath(".//*[@id=\"login\"]")).click();
		
		//press the image
			driver4.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[1]/div[5]/a[4]/span/span[1]")).click();
			//press settings
			driver4.findElement(By.xpath("/html/body/div[2]/div[2]/div[4]/div/div[2]/div/div/div/ul[1]/li[3]/a")).click();
			Thread.sleep(1000);
		//press change email
			driver4.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[3]/div/div[3]/div[2]/div[1]/a[4]/span")).click();
		//enter the new email
			driver4.findElement(By.xpath("/html/body/div[2]/div[2]/div[4]/div/div[2]/div/div/div/label[2]/input")).sendKeys("nourihabmohamed22@yahoo.com");
		
			Thread.sleep(1000);
			// press save button
					if(driver4.findElement(By.xpath("/html/body/div[2]/div[2]/div[4]/div/div[2]/div/div/div/button")).isEnabled()==true)	
					{
					driver4.findElement(By.xpath("/html/body/div[2]/div[2]/div[4]/div/div[2]/div/div/div/button")).click();
					 System.out.println("The new Email is updated successfuly");
					}
					else { System.out.println("An error occured");}
			
				driver4.close();
				driver4.quit();

	}

}
