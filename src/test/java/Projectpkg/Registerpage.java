package Projectpkg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
	

	public class Registerpage {
		WebDriver driver;
		By demoname=By.xpath("//*[@id=\"cvent_mrkto_first_name\"]");
		By demoemail=By.xpath("//*[@id=\"cvent_mrkto_email\"]");
		By demoorg=By.xpath("//*[@id=\"cvent_mrkto_company\"]");
		By demophone=By.xpath("//*[@id=\"cvent_mrkto_phone\"]");
		By democheck=By.xpath("//*[@id=\"cvent_mrkto_interestedin_usertype\"]/label[1]");
		By demoagree=By.xpath("//*[@id=\"cvent_marketo_opt\"]/label[1]");
		By demoregister=By.xpath("//*[@id=\"cvent_mrkto_submit\"]");
		
		public Registerpage(WebDriver driver)
		{
			this.driver=driver;
		}
		public void setvalues(String name,String email,String org,String phone)
		{
			driver.findElement(demoname).sendKeys(name);
			driver.findElement(demoemail).sendKeys("abc@gmail.com");
			driver.findElement(demoorg).sendKeys("dfg");
			driver.findElement(demophone).sendKeys("hgf");
			
		}
		public void login()
		{
			driver.findElement(democheck).click();
			driver.findElement(demoagree).click();
			driver.findElement(demoregister).click();
		}
		
	}



