package com.selenium.basics;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
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

public void verifyrightclick()
{
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demo.guru99.com/test/simple_context_menu.html");
	WebElement right_click_field=driver.findElement(By.xpath("//span[@class='context-menu-one btn btn-neutral']"));
	Actions action=new Actions(driver);//pass webdriver reference
	action.contextClick(right_click_field).build().perform(); //pass webelement field
	driver.close();
	
}

public void verifydoubleclick()
{
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demo.guru99.com/test/simple_context_menu.html");
	WebElement double_click_field=driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"));
	Actions action=new Actions(driver);
	action.doubleClick(double_click_field).build().perform();
	driver.close();
}
public void verifymouseover()
{
	WebDriver driver=new ChromeDriver();
	driver.get("https://demoqa.com/menu/");
	driver.manage().window().maximize();
	WebElement mainitem2_field=driver.findElement(By.xpath("//a[text()='Main Item 2']"));
	Actions action=new Actions(driver);
	action.moveToElement(mainitem2_field).build().perform();
}

public void verifydraganddrop()
{
	WebDriver driver=new ChromeDriver();
	
	driver.manage().window().maximize();
	driver.get("https://demoqa.com/droppable");
	WebElement dragfield=driver.findElement(By.id("draggable"));
	WebElement dropfield=driver.findElement(By.id("droppable"));
	Actions action=new Actions(driver);
	action.dragAndDrop(dragfield, dropfield).build().perform();
	driver.close();
	
}

public void verifydraganddropusingoffset()
{
WebDriver driver=new ChromeDriver();
	
	driver.manage().window().maximize();
	driver.get("https://demoqa.com/dragabble");
	WebElement dragmefield=driver.findElement(By.id("dragBox"));
	Actions action=new Actions(driver);
	action.dragAndDropBy(dragmefield, 150, 100).build().perform();
}

public void verifykeyboardevent() throws AWTException
{
	WebDriver driver=new ChromeDriver();
	driver.get("https://selenium.qabible.in/simple-form-demo.php");
	driver.manage().window().maximize();
	Robot robot=new Robot();
	robot.keyPress(KeyEvent.VK_CONTROL);
	robot.keyPress(KeyEvent.VK_T);
	robot.keyRelease(KeyEvent.VK_CONTROL);
	robot.keyRelease(KeyEvent.VK_T);
	driver.close();
}
public void verifysimplealert()
{
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demoqa.com/alerts");
	WebElement simpleclickmebutton=driver.findElement(By.id("alertButton"));
	simpleclickmebutton.click();
	Alert alert=driver.switchTo().alert();
	alert.accept();
}
public void verifyconfirmalert()
{
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demoqa.com/alerts");
	WebElement confirmclickmealert=driver.findElement(By.id("confirmButton"));
	confirmclickmealert.click();
	Alert alert=driver.switchTo().alert();
	String message=alert.getText();
	System.out.println("Alert message is "+message);
	alert.dismiss();
	WebElement alertmsg=driver.findElement(By.id("confirmResult"));
	String mmsg=alertmsg.getText();
	System.out.println("Message is" +mmsg);
	driver.close();
}
public void verifypromptalert()
{
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demoqa.com/alerts");
	WebElement confirmclickmealert=driver.findElement(By.id("promtButton"));
	confirmclickmealert.click();
	Alert alert=driver.switchTo().alert();
	alert.sendKeys("Anju");
	alert.accept();
	WebElement entermsg=driver.findElement(By.id("promptResult"));
	String getentermsg=entermsg.getText();
	System.out.println("Message is : " +getentermsg);
	driver.close();
	
}
public void verifyframes()
{
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demoqa.com/frames");
	List<WebElement> iframes=driver.findElements(By.tagName("iframe"));
	int numberoftag=iframes.size();
	System.out.println("Tags are : "+numberoftag);
	//driver.switchTo().frame(0);
	
	//driver.switchTo().frame("frame1");
	WebElement framesget=driver.findElement(By.id("frame1"));
	driver.switchTo().frame(framesget);
	WebElement frametext=driver.findElement(By.id("sampleHeading"));
	String getframetext=frametext.getText();
	System.out.println("text is : " +getframetext);
	//driver.switchTo().defaultContent();
	System.err.println(driver.getTitle());
	driver.close();
}
public void verifymultiplewindowhandling()
{
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demo.guru99.com/popup.php");
	String parentwindowhandleid=driver.getWindowHandle();
	System.out.println("Parent window handle id is : "+parentwindowhandleid);
	WebElement clickherelink=driver.findElement(By.xpath("//a[text()='Click Here']"));
	clickherelink.click();
	//String childwindowhandleid=driver.getWindowHandle();
	//System.out.println("Child window handle id is : "+childwindowhandleid);
	Set<String> handleids=driver.getWindowHandles();
	System.out.println(" window handle id is : "+handleids);
	Iterator<String> values=handleids.iterator();
	while(values.hasNext())
	{
		String currentid=values.next();
		if(!currentid.equals(parentwindowhandleid))
		{
			driver.switchTo().window(currentid);
			WebElement emailidfield=driver.findElement(By.xpath("//input[@name='emailid']"));
			emailidfield.sendKeys("devika.123@gmail.com");
			WebElement submitbutton=driver.findElement(By.xpath("//input[@name='btnLogin']"));
			submitbutton.click();
		}
	}
}

public void verifydynamictable()
{
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://money.rediff.com/indices/nse");
	WebElement showmorelink=driver.findElement(By.id("showMoreLess"));
	 showmorelink.click();
	
	 WebElement fulltable=driver.findElement(By.xpath("//table[@id='dataTable']"));
	//System.out.println(fulltable.getText());  //full table
	 
	 WebElement tableonerow=driver.findElement(By.xpath("//table[@id='dataTable']/tbody/tr[2]"));
	 System.out.println(tableonerow.getText()); //get particular row
	 
	 List<WebElement> rows=fulltable.findElements(By.tagName("tr"));
	 int rowcount=rows.size();
	 for(int i=0;i<rowcount;i++)
	 {
		 List<WebElement>columns=rows.get(i).findElements(By.tagName("td"));
		 int columncount=columns.size();
		 for(int j=0;j<columncount;j++)
		 {
			 String celldata=columns.get(j).getText();
			 if(celldata.equals("NIFTY BANK"))
			 {
				 System.out.println("value is :" +columns.get(1).getText());
			 }
		 }
	 }
	 driver.close();
}
public void verifyfileupload()
{
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demo.guru99.com/test/upload/");
	WebElement choosefileoption=driver.findElement(By.xpath("//input[@id='uploadfile_0']"));
	choosefileoption.sendKeys("C:\\Users\\Sathish\\git\\Selenium-Basics\\Selenium_Maven_Project\\src\\main\\resources");
	WebElement checkboxtick=driver.findElement(By.id("terms"));
	checkboxtick.click();
	WebElement submitfilebutton=driver.findElement(By.id("submitbutton"));
	submitfilebutton.click();
}
public static void main(String[] args) throws AWTException 
	{
		Commands obj=new Commands();
		//obj.webelementcommands();
		//obj.verifyisselected();
		//obj.verifyuserinput();
        //obj.verifyisenable();
		//obj.verifyisdisplayed();
		//obj.verifyValuesFromDropDown();
		//obj.getTotalDropDownValue();
		//obj.verifyrightclick();
		//obj.verifydoubleclick();
		//obj.verifymouseover();
		//obj.verifydraganddrop();
		//obj.verifydraganddropusingoffset();
		//obj.verifykeyboardevent();
		//obj.verifysimplealert();
		//obj.verifyconfirmalert();
		//obj.verifypromptalert();
		//obj.verifyframes();
		//obj.verifymultiplewindowhandling();
		//obj.verifydynamictable();
		obj.verifyfileupload();
	}

}
