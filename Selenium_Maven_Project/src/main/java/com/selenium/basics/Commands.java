package com.selenium.basics;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class Commands
{
public void webelementcommands()
{
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demowebshop.tricentis.com/");
	WebElement register_field= driver.findElement(By.className("ico-register"));
	register_field.click();
	//WebElement  first_name=driver.findElement(By.id("FirstName"));
	//first_name.sendKeys("Devika");
}
public void verifyuserinput()
{
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demowebshop.tricentis.com/");
	WebElement register_field= driver.findElement(By.className("ico-register"));
	register_field.click();
	WebElement gender_field=driver.findElement(By.id("gender-female"));
	gender_field.click();
	WebElement  first_name=driver.findElement(By.id("FirstName"));
	first_name.sendKeys("Devika");
	WebElement last_name=driver.findElement(By.id("LastName"));
	last_name.sendKeys("Satheesh");
	WebElement email_field=driver.findElement(By.id("Email"));
	email_field.sendKeys("devikasatheee10101@gmail.com");
	WebElement pass_field=driver.findElement(By.id("Password"));
	pass_field.sendKeys("devikas1234");
	WebElement confpass_field=driver.findElement(By.id("ConfirmPassword"));
	confpass_field.sendKeys("devikas1234");
	WebElement reg=driver.findElement(By.id("register-button"));
	reg.click();
	
	
}

public void verifyisselected()
{
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demowebshop.tricentis.com/register");
	WebElement genter_button=driver.findElement(By.id("gender-male"));
	 boolean radiomale = genter_button.isSelected();
	System.out.println("Genter element before selected :"+radiomale);
	genter_button.click();
	 boolean radiomale1 = genter_button.isSelected();
	 System.out.println("Genter element after selected :"+radiomale1);
	driver.close();
	}
public void verifyisenable() 
{
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demowebshop.tricentis.com/");
	WebElement suscribebutton=driver.findElement(By.id("newsletter-subscribe-button"));
	boolean issuscribebuttonenable=suscribebutton.isEnabled();
	System.out.println("susscribe element is enable : "+issuscribebuttonenable);
	driver.close();
}
public void verifyisdisplayed()
{
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demowebshop.tricentis.com/");
	WebElement votebutton=driver.findElement(By.id("vote-poll-1"));
	boolean isvotedisplayed=votebutton.isDisplayed();
	System.out.println("vote element is displayed : "+isvotedisplayed);
	driver.close();
}


public void verifyValuesFromDropDown()
{
	WebDriver driver =new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demo.guru99.com/test/newtours/register.php");
	WebElement countryfield=driver.findElement(By.xpath("//select[@name='country']"));
	Select select=new Select(countryfield);
	select.selectByVisibleText("ARUBA");
}
public void getTotalDropDownValue()
{
	WebDriver driver =new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demo.guru99.com/test/newtours/register.php");
	WebElement countryfield=driver.findElement(By.xpath("//select[@name='country']"));
	Select select=new Select(countryfield);
	List <WebElement> dropdownlist=select.getOptions();
	System.out.println(dropdownlist.size());
	driver.close();
}
	
public static void main(String[] args) 
	{
		Commands obj=new Commands();
		//obj.webelementcommands();
		//obj.verifyisselected();
		//obj.verifyuserinput();
        //obj.verifyisenable();
		//obj.verifyisdisplayed();
		//obj.verifyValuesFromDropDown();
		obj.getTotalDropDownValue();
		
	}

}
