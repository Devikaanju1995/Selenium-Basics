package com.selenium.basics;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
public class Browser_Edge_Driver 
{

	public static void main(String[] args) 
	{
		WebDriver d=new EdgeDriver();
		d.manage().window().maximize();
		d.get("https://www.google.com/search?q=amazon&rlz=1C1AVUC_enIN1061IN1103&oq=&gs_lcrp=EgZjaHJvbWUqCQgBECMYJxjqAjIJCAAQIxgnGOoCMgkIARAjGCcY6gIyCQgCECMYJxjqAjIJCAMQIxgnGOoCMgkIBBAjGCcY6gIyCQgFECMYJxjqAjIJCAYQIxgnGOoCMgkIBxAjGCcY6gLSAQkzMDAzNmowajeoAgiwAgE&sourceid=chrome&ie=UTF-8");
	    String t=d.getTitle();
	    System.out.println("Title : "+t);
	
	    String u=d.getCurrentUrl();
	    System.out.println("Current URL : "+u);
	    
	    String h=d.getWindowHandle();	
	    System.out.println("Handle Id : "+h);
	    
	    String s =d.getPageSource();
	    System.out.println("Source Code : "+s);
	   // d.close();
	   // d.quit();
	}
	

}
