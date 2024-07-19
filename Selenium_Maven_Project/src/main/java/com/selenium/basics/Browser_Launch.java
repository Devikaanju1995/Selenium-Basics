package com.selenium.basics;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Browser_Launch 
{

	public static void main(String[] args) 
	{
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://mvnrepository.com/artifact/org.seleniumhq.selenium/selenium-java/4.18.1");
        String title =driver.getTitle();
        System.out.println("Title is : " +title);
        String currenturl=driver.getCurrentUrl();
        System.out.println("Url is : " +currenturl);
        String handleid=driver.getWindowHandle();// 
        System.out.println("Handle id is : " +handleid);
        String pgesrc=driver.getPageSource();
        System.out.println("Page source is : " +pgesrc);
      //  driver.close();
       // driver.quit();
        
	}

}
