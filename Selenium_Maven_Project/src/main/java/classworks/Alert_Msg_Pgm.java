package classworks;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert_Msg_Pgm
{

public void alertandmodelsobsqura()
{
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://selenium.qabible.in/bootstrap-alert.php");
	WebElement autoclosablesucessbutton=driver.findElement(By.id("autoclosable-btn-success"));
	autoclosablesucessbutton.click();
	Alert alert=driver.switchTo().alert();
	alert.accept();
}
public void verifynormalsucess()
{
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://selenium.qabible.in/bootstrap-alert.php");
	WebElement normalsuccessbutton=driver.findElement(By.id("normal-btn-success"));
	normalsuccessbutton.click();
	Alert alert1=driver.switchTo().alert();
	alert1.accept();
	WebElement normalsuccessbutton1=driver.findElement(By.xpath("//div[@class='alert alert-success alert-normal-success']//button[@type='button']"));
	normalsuccessbutton1.click();
	
	
}	
//div[@class='alert alert-success alert-normal-success']//button[@type='button']
	

public static void main(String[] args) 
{
	Alert_Msg_Pgm obj=new Alert_Msg_Pgm();
	//obj.alertandmodelsobsqura();
	obj.verifynormalsucess();
}

}