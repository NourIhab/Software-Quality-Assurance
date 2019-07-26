package WebDriver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class EditUserName {

	public static void main(String[] args) throws InterruptedException  {
		

			System.setProperty("webdriver.gecko.driver", "C:\\Users\\user\\Desktop\\geckodriver.exe");
			
			
			WebDriver driver = new FirefoxDriver();
			driver.manage().timeouts().implicitlyWait(300, TimeUnit.SECONDS);
			driver.navigate().to("https://trello.com/login/");
			driver.manage().window().maximize();
			
			driver.findElement(By.xpath(".//*[@id=\"user\"]")).sendKeys("nour150168@bue.edu.eg");
			driver.findElement(By.xpath(".//*[@id=\"password\"]")).sendKeys("1234567890");
			driver.findElement(By.xpath(".//*[@id=\"login\"]")).click();
			
			
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
		
		driver.close();
		driver.quit();

	}

	

	}




