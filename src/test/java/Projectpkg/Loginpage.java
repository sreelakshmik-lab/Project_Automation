package Projectpkg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Loginpage {
	WebDriver driver;
	By demoacnt=By.xpath("//*[@id=\"account\"]");
	By demouser=By.xpath("//*[@id=\"username\"]");
	By demopwd=By.xpath("//*[@id=\"password\"]");
	By demologin=By.xpath("//*[@id=\"btnLogin\"]");
	
	
	public Loginpage(WebDriver driver)
	{
		this.driver=driver;
	}
	public void setvalues(String account,String user,String password)
	{
		driver.findElement(demoacnt).sendKeys(account);
		driver.findElement(demouser).sendKeys(user);
		driver.findElement(demopwd).sendKeys(password);
		
	}
	public void login()
	{
	
		driver.findElement(demologin).click();
	}


}
