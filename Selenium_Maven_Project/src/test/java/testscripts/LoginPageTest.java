package testscripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import automationCore.Base;

public class LoginPageTest extends Base
{
	@Test
public void verify_UserLoginwith_Validcredential()
{
	driver.get("https://demowebshop.tricentis.com/login");
	WebElement emailfield=driver.findElement(By.id("Email"));
	String expected_result="shynasatheesh1011@gmail.com";
	emailfield.sendKeys(expected_result);
	
	WebElement passwordfield=driver.findElement(By.id("Password"));
	passwordfield.sendKeys("shynasatheesh1234");
	
	WebElement loginbuttn=driver.findElement(By.xpath("//input[@class='button-1 login-button']"));
	loginbuttn.click();
	
	WebElement emaillogin=driver.findElement(By.xpath("//a[text()='shynasatheesh1011@gmail.com']"));
	String actual_result=emaillogin.getText();
	Assert.assertEquals(actual_result, expected_result,"Invalid Login");
}
	@Test
public void verify_UserLoginwith_Invalidemail()	
{
	driver.get("https://demowebshop.tricentis.com/login");
	WebElement emailfield=driver.findElement(By.id("Email"));
	emailfield.sendKeys("shyn@gmail.com");
	
	WebElement passwordfield=driver.findElement(By.id("Password"));
	passwordfield.sendKeys("shynasatheesh1234");
	
	WebElement loginbuttn=driver.findElement(By.xpath("//input[@class='button-1 login-button']"));
	loginbuttn.click();
	
	WebElement emailerror=driver.findElement(By.xpath("//span[text()='Login was unsuccessful. Please correct the errors and try again.']"));
	String actualemailmsg=emailerror.getText();
	String expectedemailmsg="Login was unsuccessful. Please correct the errors and try again.";
	Assert.assertEquals(actualemailmsg, expectedemailmsg,"invalid email");
}
@Test
public void verify_UserLoginwith_Invalidpassword()	
{
	driver.get("https://demowebshop.tricentis.com/login");
	WebElement emailfield=driver.findElement(By.id("Email"));
	String expected_result="shynasatheesh1011@gmail.com";
	emailfield.sendKeys(expected_result);
	
	WebElement passwordfield=driver.findElement(By.id("Password"));
	passwordfield.sendKeys("shynasatheesh00");
	
	WebElement loginbuttn=driver.findElement(By.xpath("//input[@class='button-1 login-button']"));
	loginbuttn.click();
	
	WebElement passworderror=driver.findElement(By.xpath("//span[text()='Login was unsuccessful. Please correct the errors and try again.']"));
	String actualpassworderror=passworderror.getText();
	String expectedpassworderror="Login was unsuccessful. Please correct the errors and try again.";
	Assert.assertEquals(actualpassworderror, expectedpassworderror,"invalid email");
}
@Test
public void verify_UserLoginwith_Invalidemail_Invalidpassword()	
{
	driver.get("https://demowebshop.tricentis.com/login");
	WebElement emailfield=driver.findElement(By.id("Email"));
	
	emailfield.sendKeys("shynasvvvv12@gmail.com");
	
	WebElement passwordfield=driver.findElement(By.id("Password"));
	passwordfield.sendKeys("shyns2345");
	
	WebElement loginbuttn=driver.findElement(By.xpath("//input[@class='button-1 login-button']"));
	loginbuttn.click();
	
	WebElement invalid_pass_email=driver.findElement(By.xpath("//li[text()='No customer account found']"));
	String actual=invalid_pass_email.getText();
	String expected="No customer account found";
	Assert.assertEquals(actual, expected,"unsuccess to login");
}
}
