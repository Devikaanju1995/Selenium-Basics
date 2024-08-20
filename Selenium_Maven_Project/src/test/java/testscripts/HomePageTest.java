package testscripts;

import java.util.List;

import javax.management.RuntimeErrorException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import automationCore.Base;

public class HomePageTest extends Base 
{
	@Test
public void verify_Homepage_Title()
{
	driver.get("https://demowebshop.tricentis.com/");
	driver.manage().window().maximize();
	String actualtitle=driver.getTitle();
	//System.out.println("The title is : "+title);
	String expectedtitle="Demo Web Shop";
	Assert.assertEquals(actualtitle, expectedtitle, "invalid title");
	
}

public void verify_Communitypoll_Selection(String buttonclick)
{
	driver.get("https://demowebshop.tricentis.com/");
	
   // List<WebElement> polloptions=driver.findElements(By.className("pollanswers-1"));
   if(buttonclick.equals("Excellent"))
   {
	   WebElement excellentbutton=driver.findElement(By.xpath("//label[text()='Excellent']"));
	   excellentbutton.click();
   }
   else if(buttonclick.equals("Good"))
   {
	   WebElement goodbutton=driver.findElement(By.xpath("//label[text()='Good']"));
	   goodbutton.click();
   }
   
   else if(buttonclick.equals("Poor"))
   {
	   WebElement poorbutton=driver.findElement(By.xpath("//label[text()='Poor']"));
	   poorbutton.click();
   }
   
   else if(buttonclick.equals("Very bad"))
   {
	   WebElement verybadbutton=driver.findElement(By.xpath("//label[text()='Very bad']"));
	   verybadbutton.click();
   }
   else
   {
	   throw new RuntimeException("unclick button");
   }
   
   WebElement submit_bt=driver.findElement(By.id("vote-poll-1"));
   submit_bt.click();
   
  // WebElement msg=driver.findElement(By.xpath("//div[text()='Only registered users can vote.']"));
  // String actual_res=msg.getText();
  // String expected_res="Only registered users can vote.";
   //Assert.assertEquals(actual_res, expected_res,"user cannot  vote");
   
}
	@Test
public void verify_poll()
{
	verify_Communitypoll_Selection("Good");
}
}
     