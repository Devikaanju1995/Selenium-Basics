package dataprovider;

import org.testng.annotations.DataProvider;

public class Data_Providers 
{
@DataProvider(name="InvalidCredentials")
public Object[][] verify_User_Credencial_Data()
{
	Object[][] data=new Object[3][2];
	data[0][0]="Shynasa@gmail.com";
	data[0][1]="shynasatheesh1234";
	
	data[1][0]="shynasatheesh1011@gmail.com";
	data[1][1]="shynass12";
	
	data[2][0]="shynascv@gmail.com";
	data[2][1]="shynawer345";
	return data;
}
}
