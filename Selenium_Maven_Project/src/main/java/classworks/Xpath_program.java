package classworks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath_program 
{
	public void usingxpath()
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/newtours/register.php");
		
		WebElement reg_buttn=driver.findElement(By.xpath("//a[text()='REGISTER']"));
		reg_buttn.click();
		
		WebElement firstnamefield=driver.findElement(By.xpath("//input[@name='firstName']"));
		firstnamefield.sendKeys("Satvik");
		
		WebElement lastnamefield=driver.findElement(By.xpath("//input[@name='lastName']"));
		lastnamefield.sendKeys("Vishwanath");
		
		WebElement phonenofield=driver.findElement(By.xpath("//input[contains(@name,'phone')]"));
		 phonenofield.sendKeys("9999955555");
		 
		 WebElement emailfield=driver.findElement(By.xpath("//input[@id='userName']"));
		 emailfield.sendKeys("satvik2021@gmail.com");
		 
		 WebElement addressfield=driver.findElement(By.xpath("//input[@name='address1' and @size='40']"));
		 addressfield.sendKeys("satheesh bhavan");
		 
		 WebElement city_field=driver.findElement(By.xpath("//input[@name='city' and @size='15']"));
		 city_field.sendKeys("TVM");
		 
		 WebElement statefield =driver.findElement(By.xpath("//input[@name='state']"));
		 statefield.sendKeys("Kerala");
		 
		 WebElement postalcodefield=driver.findElement(By.xpath("//input[@name='postalCode']"));
		 postalcodefield.sendKeys("695603");
		 
		 WebElement usernamefield=driver.findElement(By.xpath("//input[@name='email' and @id='email']"));
		 usernamefield.sendKeys("satvik2021@gmail.com");
		 
		 WebElement passwordfield =driver.findElement(By.xpath("//input[@name='password' and @type='password']"));
		 passwordfield.sendKeys("Satvikvishwanath@2021");
		 
		 WebElement confirmpasswordfield =driver.findElement(By.xpath("//input[@name='confirmPassword']"));
		 confirmpasswordfield.sendKeys("Satvikvishwanath@2021");
		 

		 WebElement submitfield =driver.findElement(By.xpath("//input[@name='submit' and @type='submit']"));
		 submitfield.click();
		 
	}

	public static void main(String[] args) 
	{
		Xpath_program obj=new Xpath_program ();
		obj.usingxpath();

	}

}
