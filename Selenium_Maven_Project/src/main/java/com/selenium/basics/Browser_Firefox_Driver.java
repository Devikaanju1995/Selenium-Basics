package com.selenium.basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Browser_Firefox_Driver {

	public static void main(String[] args) 
	{
		WebDriver driver=new FirefoxDriver();
	     driver.manage().window().maximize();
	     driver.get("https://www.selenium.dev/");
	    
	     String t= driver.getTitle();
	    System.out.println("Title  : " +t);
	    
	    String u=driver.getCurrentUrl();
	    System.out.println("Current URL  : " +u);
	    
	    String h=driver.getWindowHandle();//current page id get cheyum
	    System.out.println("Id  : " +h);
	    
	    String s=driver.getPageSource();
	    System.out.println("Source  : " +s);
	   // driver.close();
	    //driver.quit();

	}

}
