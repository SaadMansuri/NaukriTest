package TestNg.TestNg1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
public class NaukriTest{

		public static WebDriver driver;

	
		@Test(priority=1) 	
	        void setup() throws InterruptedException{
		    System.setProperty("webdriver.chrome.driver","C:\\Setup\\chrome\\chromedriver.exe");
		    driver =new ChromeDriver();
		    driver.manage().window().maximize();		
			driver.get("https://www.naukri.com/nlogin/login");
			Thread.sleep(2000);
	        }
	        
	        
		@Test(priority=2) 
	        void test1() throws InterruptedException {
	        	
	        	driver.findElement(By.id("usernameField")).sendKeys("***********");

			driver.findElement(By.id("passwordField")).sendKeys("*******");
  
			driver.findElement(By.cssSelector("#loginForm > div.action.row.mb0 > div > button")).click();


 			Thread.sleep(2000);
 			driver.findElement(By.id("qsb-keyskill-sugg")).sendKeys("devops");
 			driver.findElement(By.id("qsb-location-sugg")).sendKeys("pune");
 			driver.findElement(By.id("expDroope-experienceFor")).sendKeys("2");
 			driver.findElement(By.xpath("//*[@id=\'search-jobs\']/button")).click();    
		}
	        
 	       
 	        }

			
			
					
			

		

		
		
		
		
