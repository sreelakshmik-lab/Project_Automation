package Projectpkgtest;


	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.testng.annotations.BeforeMethod;
	import org.testng.annotations.BeforeTest;
	import org.testng.annotations.Test;

	import Projectpkg.Registerpage;

	public class Registertest {
		WebDriver driver;
		@BeforeTest
		public void setup()
		{
			driver=new ChromeDriver();
		}
		@BeforeMethod
		public void urlloading()
		{
			driver.get("https://www.cvent.com/in/request-demo");
		}
		@Test
		public void test()
		{
			Registerpage obj=new Registerpage(driver);
			obj.setvalues("df", "df", "dfg", "dfg");
			obj.login();
		}
		
		


	}


