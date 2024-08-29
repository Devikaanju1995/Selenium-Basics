package testscripts;

import java.io.IOException;
import java.util.List;

import javax.management.RuntimeErrorException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import Utilities.Excel_Utilities;
import automationCore.Base;
import listeners.Retry_Analyser;

public class HomePageTest extends Base 
{
@Test(retryAnalyzer=Retry_Analyser.class,groups="sanity")
public void verify_Homepage_Title() 
{
	driver.get("https://demowebshop.tricentis.com/");
	driver.manage().window().maximize();
	String expectedtitle=driver.getTitle();
	
	String actualtitle=Excel_Utilities.get_StringData(0, 0, "Homepage");
	System.out.println("The title is : "+actualtitle);
	Assert.assertEquals(actualtitle, expectedtitle, "invalid title");
	
}
@Test(enabled=true,groups="smoke")
public void verify_Communitypoll_Selection()
{
	driver.get("https://demowebshop.tricentis.com");
	
    List<WebElement> radiooptions=driver.findElements(By.xpath("//li[@class='answer']"));
    
    int sizes=radiooptions.size();
	 for(int i=0;i<sizes;i++)
	 {
		String buttn = radiooptions.get(i).getAttribute("value");
		if(buttn.equals("Good"))
		{
			radiooptions.get(i).click();	
		}
		
		}
	 WebElement clickvote=driver.findElement(By.id("vote-poll-1"));
	 clickvote.click();
}

}
	

     