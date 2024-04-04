package Projectpkgtest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.openqa.selenium.Alert;
import Projectpkg.Homepage;

	

	public class Homepagetest {

		WebDriver driver;
		@BeforeTest
		public void setup()
		{
			driver=new ChromeDriver();
		}
		@BeforeMethod
		public void url()
		{
			driver.get("https://www.cvent.com/");
		}
		@Test
		
		public void handleAlert() {
	        Alert alert = driver.switchTo().alert();
	        alert.dismiss(); 
	    }
		public void test()
		{
			Homepage obje=new Homepage(driver);
			obje.click();
			
			
		}
	}



