package testNG_Commands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import automationCore.Base;

public class Commands extends Base
{
	@Test
public void verifyUserLogin()
{
		driver.get("https://demowebshop.tricentis.com/");
		WebElement loginlink=driver.findElement(By.xpath("//a[@class='ico-login']"));
		loginlink.click();
		
		WebElement emailfield=driver.findElement(By.id("Email"));
		emailfield.sendKeys("satvikasathee101@gmail.com");
		
		WebElement passwordfield=driver.findElement(By.id("Password"));
		passwordfield.sendKeys("satvikaanju1234");
		
		WebElement loginbuttn=driver.findElement(By.xpath("//input[@class='button-1 login-button']"));
		loginbuttn.click();
		
}
	@Test
public void verifyRegister()
{
	
	
	driver.get("https://demowebshop.tricentis.com/");
	WebElement register_field= driver.findElement(By.className("ico-register"));
	register_field.click();
	WebElement gender_field=driver.findElement(By.id("gender-female"));
	gender_field.click();
	WebElement  first_name=driver.findElement(By.id("FirstName"));
	first_name.sendKeys("Satvika");
	WebElement last_name=driver.findElement(By.id("LastName"));
	last_name.sendKeys("S");
	WebElement email_field=driver.findElement(By.id("Email"));
	email_field.sendKeys("satvikasathee101@gmail.com");
	WebElement pass_field=driver.findElement(By.id("Password"));
	pass_field.sendKeys("satvikaanju1234");
	WebElement confpass_field=driver.findElement(By.id("ConfirmPassword"));
	confpass_field.sendKeys("satvikaanju1234");
	WebElement reg=driver.findElement(By.id("register-button"));
	reg.click();
}
	@Test
	public void getwebsiteTitle()
	{
		driver.get("https://demowebshop.tricentis.com/");
		WebElement title=driver.findElement(By.xpath("//h2[@class='topic-html-content-header']"));
		String printtitle=title.getText();
		System.out.println("Title is :" +printtitle);
	}
}
