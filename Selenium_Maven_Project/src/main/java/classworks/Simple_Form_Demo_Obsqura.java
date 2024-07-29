package classworks;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Simple_Form_Demo_Obsqura 
{

	
public void verifySimpleFormDemo()
{
	WebDriver driver=new ChromeDriver();
	boolean ischeckboxfield2;
	boolean isradiobutn;
	boolean isradiobutton;
	boolean isradiobutton1;
	driver.manage().window().maximize();
	driver.get("https://selenium.qabible.in/simple-form-demo.php");
	//WebElement inputformbuttn=driver.findElement(By.xpath("//a[text()='Input Form']"));
	//inputformbuttn.click();
	
	WebElement entermsgfield=driver.findElement(By.id("single-input-field"));
	entermsgfield.sendKeys("Hello Obsqura");
	
	WebElement showmsgbutn=driver.findElement(By.id("button-one"));
	showmsgbutn.click();
	
	WebElement entervalueafield =driver.findElement(By.xpath("//input[@id='value-a' and @type='text']"));
	entervalueafield.sendKeys("25");
	
	WebElement entervaluebfield=driver.findElement(By.id("value-b"));
	entervaluebfield.sendKeys("26");
	
	WebElement showtot=driver.findElement(By.id("button-two"));
	showtot.click();
	

	WebElement checkboxbutn=driver.findElement(By.xpath("//a[text()='Checkbox Demo']"));
	checkboxbutn.click();
	
	WebElement checkboxx=driver.findElement(By.xpath("//input[starts-with(@class,'form-check-input')]"));
	ischeckboxfield2=checkboxx.isSelected();
	System.out.println("checkbox is before selected :" +ischeckboxfield2);
	checkboxx.click();
	ischeckboxfield2=checkboxx.isSelected();
	System.out.println("checkbox is after selected :" +ischeckboxfield2);
	
	WebElement checkall=driver.findElement(By.id("button-two"));
	checkall.click();
	
	WebElement radiobuttondemoo=driver.findElement(By.xpath("//a[text()='Radio Buttons Demo']"));
	radiobuttondemoo.click();
	
	WebElement genderbutn=driver.findElement(By.xpath("//input[@id='inlineRadio2' and @name='inlineRadioOptions']"));
	isradiobutn=genderbutn.isSelected();
	System.out.println("Radio button before checked : "+isradiobutn);
	genderbutn.click();
	isradiobutn=genderbutn.isSelected();
	System.out.println("Radio button is after  checked : "+isradiobutn);
	
	WebElement showselectvaluebutn=driver.findElement(By.cssSelector("button#button-one"));
	showselectvaluebutn.click();
	System.out.println("Radio button female is checked");
	
	
	WebElement patientgenderradiobutton=driver.findElement(By.cssSelector("input#inlineRadio21"));
	isradiobutton=patientgenderradiobutton.isSelected();
	System.out.println("radiopbutton before checked :" +isradiobutton);
	patientgenderradiobutton.click();
	isradiobutton=patientgenderradiobutton.isSelected();
	System.out.println("radiopbutton before checked :" +isradiobutton);
	
	WebElement patientageradiobutton=driver.findElement(By.cssSelector("input#inlineRadio23"));
	isradiobutton1=patientageradiobutton.isSelected();
	System.out.println("radiopbutton before checked :" +isradiobutton1);
	patientageradiobutton.click();
	isradiobutton1=patientageradiobutton.isSelected();
	System.out.println("radiopbutton before checked :" +isradiobutton1);
	
	WebElement getresultbut=driver.findElement(By.xpath("//button[@id='button-two']"));
	getresultbut.click();
	
	WebElement selectinput=driver.findElement(By.xpath("//a[text()='Select Input']"));
	selectinput.click();
	
	WebElement select_option=driver.findElement(By.id("single-input-field"));
	Select select=new Select(select_option);
	select.selectByVisibleText("Green");
	
	//WebElement getfirstselectfield=driver.findElement(By.xpath("//button[text()='Get First Selected']"));
	//Select select1=new Select(getfirstselectfield);
	//List<WebElement>droplist=select1.getOptions();
	//select1.getFirstSelectedOption();
	//getfirstselectfield.click();
	
	
	
}
	


public static void main(String[] args) 
	{
		Simple_Form_Demo_Obsqura obj=new Simple_Form_Demo_Obsqura();	
         obj.verifySimpleFormDemo();
	}

}
