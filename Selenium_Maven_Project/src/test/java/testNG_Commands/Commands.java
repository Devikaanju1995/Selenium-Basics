package testNG_Commands;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
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
		String expected_result="satvikasathee101@gmail.com";
		emailfield.sendKeys(expected_result);
		
		WebElement passwordfield=driver.findElement(By.id("Password"));
		passwordfield.sendKeys("satvikaanju1234");
		
		WebElement loginbuttn=driver.findElement(By.xpath("//input[@class='button-1 login-button']"));
		loginbuttn.click();
		
		WebElement emaillogin=driver.findElement(By.xpath("//a[text()='satvikasathee101@gmail.com']"));
		String actual_result=emaillogin.getText();
		Assert.assertEquals(actual_result, expected_result,"Invalid Login");
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
	first_name.sendKeys("Satheeeshh");
	WebElement last_name=driver.findElement(By.id("LastName"));
	last_name.sendKeys("S");
	WebElement email_field=driver.findElement(By.id("Email"));
	email_field.sendKeys("satvikasatheeh1111@gmail.com");
	WebElement pass_field=driver.findElement(By.id("Password"));
	pass_field.sendKeys("satvikaanju1234");
	WebElement confpass_field=driver.findElement(By.id("ConfirmPassword"));
	confpass_field.sendKeys("satvikaanju1234");
	WebElement reg=driver.findElement(By.id("register-button"));
	reg.click();
	
	WebElement register_sucess_msg=driver.findElement(By.xpath("//div[@class='result']"));
	String actual_result=register_sucess_msg.getText();
	String expected_result="Your registration completed";
	Assert.assertEquals(actual_result, expected_result,"Registeration not success");
	
}
	@Test
	public void getwebsiteTitle()
	{
		driver.get("https://demowebshop.tricentis.com/");
		
		String printtitle=driver.getTitle();
		//System.out.println("Title is :" +printtitle);
		String expected_title="Demo We Shop";
		Assert.assertEquals(printtitle, expected_title,"Invalid title");
	}
	@Test
	public void isselected()
	{
		driver.get("https://demowebshop.tricentis.com/register");
		WebElement genter_button=driver.findElement(By.id("gender-male"));
		 boolean radiomale = genter_button.isSelected();
		Assert.assertFalse(radiomale, "Button already selected");
		
		 genter_button.click();
		 boolean radiomale1 = genter_button.isSelected();
		 Assert.assertTrue(radiomale1, "Button is not selected");
		
	}
	@Test
	public void isenable()
	{
		driver.get("https://demowebshop.tricentis.com/");
		WebElement suscribebutton=driver.findElement(By.id("newsletter-subscribe-button"));
		boolean issuscribebuttonenable=suscribebutton.isEnabled();
		
		Assert.assertTrue(issuscribebuttonenable, "Not enable");
		//String issuscribebuttonenablee="Subscribe";
		//Assert.assertEquals(issuscribebuttonenable, "issuscribebuttonenablee");
		
	}
	@Test
	public void isdisplayed()
	{
		driver.get("https://demowebshop.tricentis.com/");
		WebElement votebutton=driver.findElement(By.id("vote-poll-1"));
		boolean isvotedisplayed=votebutton.isDisplayed();
		//System.out.println("vote element is displayed : "+isvotedisplayed);
		Assert.assertTrue(isvotedisplayed, "vote button not displayed");
	}
	@Test
	public void verify_javascriptexecuter_usingsendkeyandclick()
	{
		driver.get("https://demowebshop.tricentis.com/");
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("document.getElementById(\"newsletter-email\").value='test123@gmail.com'");
		js.executeScript("document.getElementById(\"newsletter-subscribe-button\").click()");
	}
	@Test
	public void verifyverticalscroll()
	{
		driver.get("https://demowebshop.tricentis.com/");
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,500)");
	}
	@Test
	public void verifywaitcommands()
	{
		driver.get("https://demoqa.com/alerts");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));//implicityWait
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("timerAlertButton")));
		WebElement clickmefield=driver.findElement(By.id("timerAlertButton"));
		clickmefield.click();
		wait.until(ExpectedConditions.alertIsPresent());
		Alert alert=driver.switchTo().alert();
		alert.accept();
	}
}
