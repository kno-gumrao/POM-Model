package Utilities;

import java.io.IOException;

import org.testng.annotations.DataProvider;

public class DataProvider1 {
	@DataProvider(name="TestData")
public String[][] getData() throws IOException
{
	String p="E://Eclipse//POMFramework//TestData//Opencart_LoginData.xlsx";
	ExcelUtility xl=new ExcelUtility(p);
	int r=xl.getRowCount("Sheet1");
	int c=xl.getCellCount("Sheet1",0);
	String[][] str=new String[r][c];
	for(int i=1;i<=r;i++)
	{
		for(int j=0;j<c;j++)
		{
			str[i-1][j]=xl.getCellData("Sheet1",i,j);
		}
	}
	return str;
	
}
}
