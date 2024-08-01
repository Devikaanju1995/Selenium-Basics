package classworks;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Frames_Program
{
public void verifyframetutorial()
{
	WebDriver driver =new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.hyrtutorials.com/p/frames-practice.html");
	List<WebElement> iframess=driver.findElements(By.id("iframe"));
	int listallframes=iframess.size();
    System.out.println("list the number of frames : "+listallframes);

   WebElement getframe=driver.findElement(By.id("frm1"));
   driver.switchTo().frame(getframe);
   WebElement cousedropdown=driver.findElement(By.id("course"));
   Select select=new Select(cousedropdown);
   select.selectByVisibleText("Python");
   
   WebElement getframe2=driver.findElement(By.id("frm2"));
   driver.switchTo().frame(getframe2);
   WebElement firstnamefield=driver.findElement(By.id("firstName"));
   firstnamefield.sendKeys("Anju");
   
   

}
	





public static void main(String[] args)
	{
		Frames_Program obj=new Frames_Program();
		obj.verifyframetutorial();

	}

}
