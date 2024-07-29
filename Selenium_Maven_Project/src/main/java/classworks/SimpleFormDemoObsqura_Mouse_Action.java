package classworks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SimpleFormDemoObsqura_Mouse_Action 
{
public void mouseactiondragout()
{
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://selenium.qabible.in/drag-drop.php");
	WebElement dragfield1=driver.findElement(By.xpath("//span[text()='Draggable n°1']"));
    WebElement dropfield1=driver.findElement(By.id("mydropzone"));
	Actions action=new Actions(driver);
	action.dragAndDrop(dragfield1, dropfield1).build().perform();
	
	
  WebElement dragfield2=driver.findElement(By.xpath("//span[text()='Draggable n°2']"));
  WebElement dropfield2=driver.findElement(By.id("mydropzone"));
  Actions action1=new Actions(driver);
   action1.dragAndDrop(dragfield2, dropfield2).build().perform();
	
   
   WebElement dragfield3=driver.findElement(By.xpath("//span[text()='Draggable n°3']"));
   WebElement dropfield3=driver.findElement(By.id("mydropzone"));
   Actions action2=new Actions(driver);
    action2.dragAndDrop(dragfield3, dropfield3).build().perform();
	
    WebElement dragfield4=driver.findElement(By.xpath("//span[text()='Draggable n°4']"));
	WebElement dropfield4=driver.findElement(By.id("mydropzone"));
	   Actions action3=new Actions(driver);
	    action3.dragAndDrop(dragfield4, dropfield4).build().perform();
	
	
}
	public static void main(String[] args) 
	{
		SimpleFormDemoObsqura_Mouse_Action  obj=new SimpleFormDemoObsqura_Mouse_Action ();
		obj.mouseactiondragout();

	}

}
