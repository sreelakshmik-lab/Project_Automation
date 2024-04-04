package Projectpkg;


	

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;

	public class Homepage {
		WebDriver driver;
		By demoproduct=By.xpath("//*[@id=\"block-themekit-main-menu\"]/ul/li[2]/span/a");
		By demovenue=By.xpath("//*[@id=\"EventMarketing&Management\"]/ul/li[1]/div/ul/li[1]/ul/li[1]/a");
		
		public Homepage(WebDriver driver)
		{
			this.driver=driver;
		}
		public void click()
		{
			driver.findElement(demoproduct).click();
			driver.findElement(demovenue).click();
		}

	}



