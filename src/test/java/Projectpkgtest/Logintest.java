package Projectpkgtest;



	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.testng.annotations.BeforeMethod;
	import org.testng.annotations.BeforeTest;
	import org.testng.annotations.Test;


	import Projectpkg.Loginpage;

	public class Logintest {
		WebDriver driver;
		@BeforeTest
		public void setup()
		{
			driver=new ChromeDriver();
		}
		@BeforeMethod
		public void urlloading()
		{
			driver.get("https://app.cvent.com/subscribers/Login.aspx?ReturnUrl=%2fsubscribers%2fdefault.aspx");
		}
		@Test
		public void test()
		{
			Loginpage ob=new Loginpage(driver);
			ob.setvalues("df", "df", "dfgh");
			
			ob.login();
		}
		
		  
		
		  
	}



