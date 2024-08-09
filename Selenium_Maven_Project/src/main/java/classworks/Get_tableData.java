package classworks;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Get_tableData 
{
public void verifythetabledata()
{
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://money.rediff.com/indices/nse");
WebElement tables=driver.findElement(By.xpath("//table[@id='dataTable']"));

WebElement takeonerow=driver.findElement(By.xpath("//table[@id='dataTable']/tbody/tr[4]"));
System.out.println(takeonerow.getText());

List<WebElement> rows=tables.findElements(By.tagName("tr"));
int rowcount=rows.size();
for(int i=0;i<rowcount;i++)
{
	List<WebElement> columns=rows.get(i).findElements(By.tagName("td"));
	int columncount=columns.size();
	for(int j=0;j<columncount;j++)
	{
		String celldata=columns.get(j).getText();
		if(celldata.equals("NIFTY IT"))
		{
			System.out.println("the value is :"+columns.get(3).getText());
		}
	}
}

driver.close();
}


public static void main(String[] args) 
	{
	Get_tableData  obj=new Get_tableData();
	obj.verifythetabledata();

	}

}
