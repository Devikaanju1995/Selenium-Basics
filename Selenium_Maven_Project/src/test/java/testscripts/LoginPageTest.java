package testscripts;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import Utilities.Excel_Utilities;
import automationCore.Base;
import dataprovider.Data_Providers;

public class LoginPageTest extends Base
{
	@Test
public void verify_UserLoginwith_Validcredential()
{
	driver.get("https://demowebshop.tricentis.com/login");
	String usermail=Excel_Utilities.get_StringData(0, 0, "Loginpage");
	WebElement emailfield=driver.findElement(By.id("Email"));
	String expected_result=usermail;
	emailfield.sendKeys(expected_result);
	
	String userpassword=Excel_Utilities.get_StringData(0, 1, "Loginpage");
	WebElement passwordfield=driver.findElement(By.id("Password"));
	String pass=userpassword;
	passwordfield.sendKeys(pass);
	
	WebElement loginbuttn=driver.findElement(By.xpath("//input[@class='button-1 login-button']"));
	loginbuttn.click();
	
	WebElement emaillogin=driver.findElement(By.xpath("//a[text()='shynasatheesh1011@gmail.com']"));
	String actual_result=emaillogin.getText();
	Assert.assertEquals(actual_result, expected_result,"Invalid Login");
}
@Test(dataProvider="InvalidCredentials",dataProviderClass=Data_Providers.class)
public void verify_UserLoginwith_InvalidCredentials(String username,String password) throws IOException	
{
	driver.get("https://demowebshop.tricentis.com/login");
	//String email=Excel_Utilities.get_StringData(1, 0, "Loginpage");
	WebElement emailfield=driver.findElement(By.id("Email"));
	//String email2=email;
	emailfield.sendKeys(username);
	
	//String passwords=Excel_Utilities.get_StringData(1, 1, "Loginpage");
	WebElement passwordfield=driver.findElement(By.id("Password"));
	//String passw=passwords;
	passwordfield.sendKeys(password);
	
	WebElement loginbuttn=driver.findElement(By.xpath("//input[@class='button-1 login-button']"));
	loginbuttn.click();
	
	WebElement emailerror=driver.findElement(By.xpath("//span[text()='Login was unsuccessful. Please correct the errors and try again.']"));
	String actualemailmsg=emailerror.getText();
	String expectedemailmsg="Login was unsuccessful. Please correct the errors and try again.";
	Assert.assertEquals(actualemailmsg, expectedemailmsg,"invalid email");
}
/*public void verify_UserLoginwith_Invalidpassword() throws IOException	
{
	driver.get("https://demowebshop.tricentis.com/login");
	String usermail=Excel_Utilities.get_StringData(2, 0, "Loginpage");
	WebElement emailfield=driver.findElement(By.id("Email"));
	//String expected_result=usermail;
	emailfield.sendKeys(usermail);
	
	String userpassword=Excel_Utilities.get_StringData(2, 1, "Loginpage");
	WebElement passwordfield=driver.findElement(By.id("Password"));
	//String pass=userpassword;
	passwordfield.sendKeys(userpassword);
	
	WebElement loginbuttn=driver.findElement(By.xpath("//input[@class='button-1 login-button']"));
	loginbuttn.click();
	
	WebElement passworderror=driver.findElement(By.xpath("//span[text()='Login was unsuccessful. Please correct the errors and try again.']"));
	String actualpassworderror=passworderror.getText();
	String expectedpassworderror="Login was unsuccessful. Please correct the errors and try again.";
	Assert.assertEquals(actualpassworderror, expectedpassworderror,"invalid email");
}
@Test
public void verify_UserLoginwith_Invalidemail_Invalidpassword() throws IOException	
{
	driver.get("https://demowebshop.tricentis.com/login");
	String usermail=Excel_Utilities.get_StringData(3, 0, "Loginpage");
	WebElement emailfield=driver.findElement(By.id("Email"));
	//String email=usermail;
	emailfield.sendKeys(usermail);
	
	String userpassword=Excel_Utilities.get_StringData(3, 1, "Loginpage");
	WebElement passwordfield=driver.findElement(By.id("Password"));
	//String pass=userpassword;
	passwordfield.sendKeys(userpassword);
	
	WebElement loginbuttn=driver.findElement(By.xpath("//input[@class='button-1 login-button']"));
	loginbuttn.click();
	
	WebElement invalid_pass_email=driver.findElement(By.xpath("//li[text()='No customer account found']"));
	String expected=invalid_pass_email.getText();
	String actual="No customer account found";
	Assert.assertEquals(actual, expected,"unsuccess to login");
}*/
}
