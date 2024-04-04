package Projectpkgtest;


	import java.util.Set;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.testng.annotations.BeforeMethod;
	import org.testng.annotations.BeforeTest;
	import org.testng.annotations.Test;

	public class Windowhndlg {
		WebDriver driver;
		@BeforeTest
		public void setup()
		{
			driver=new ChromeDriver();
		}
		@BeforeMethod
		public void urlloading()
		{
			driver.get("https://www.cvent.com/in");
			driver.manage().window().maximize();
		}
		@Test
		public void test1()
		{
			String parentWindow=driver.getWindowHandle();
			System.out.println("parent window title" +driver.getTitle());
			driver.findElement(By.xpath("//*[@id=\"block-utilitynavigationindia\"]/ul/li[4]/a")).click();
			
			Set<String> allwindowhandles=driver.getWindowHandles();
			for(String handle:allwindowhandles)
			{
				System.out.println(handle);
				if(!handle.equalsIgnoreCase(parentWindow))
				{
					driver.switchTo().window(handle);
					driver.findElement(By.id("account")).sendKeys("dfg");
					driver.close();
				}
				driver.switchTo().window(parentWindow);
			}
		}

	}

