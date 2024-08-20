package testscripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import automationCore.Base;

public class RegisterPageTest extends Base
{
	@Test
public void verify_User_Registeration()
{
	
		
	driver.get("https://demowebshop.tricentis.com/register");
	
	
	
	WebElement gender_field=driver.findElement(By.id("gender-female"));
	gender_field.click();
	WebElement  first_name=driver.findElement(By.id("FirstName"));
	first_name.sendKeys("Shynaa");
	WebElement last_name=driver.findElement(By.id("LastName"));
	last_name.sendKeys("Satheesh");
	WebElement email_field=driver.findElement(By.id("Email"));
	email_field.sendKeys("shynasatheesh1011@gmail.com");
	WebElement pass_field=driver.findElement(By.id("Password"));
	pass_field.sendKeys("shynasatheesh1234");
	WebElement confpass_field=driver.findElement(By.id("ConfirmPassword"));
	confpass_field.sendKeys("shynasatheesh1234");
	WebElement reg=driver.findElement(By.id("register-button"));
	reg.click();

	WebElement register_sucess_msg=driver.findElement(By.xpath("//div[@class='result']"));
	String actual_res=register_sucess_msg.getText();
	String expected_res="Your registration completed";
	Assert.assertEquals(actual_res, expected_res,"Registeration not success");
}
}
