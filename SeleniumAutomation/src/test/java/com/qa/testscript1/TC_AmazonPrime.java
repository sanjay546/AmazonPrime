package com.qa.testscript1;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TC_AmazonPrime extends AmazonTestBase
{
	@Test
	public void login()
	{
		prime.getLoginButton().click();
	}
	
	@Test(priority=1)
	public void signin() 
	{
		prime.getemail().sendKeys("sanjaysgowda02456@gmail.com");
		prime.getpassword().sendKeys("Sanjay@1997");
		prime.getsignin().click();
	}
	
	@Test(priority=2,dataProvider="supplyData")  
	public void search(String input1) throws InterruptedException
	{
		
		prime.getsearchBox().sendKeys(input1,Keys.ENTER);
		prime.getsearchBox().click();
		prime.getsearchBox().clear();
		Thread.sleep(5000);
		prime.getMovie().click();
		Thread.sleep(5000);
	 List<WebElement> titleoftheMovie =  prime.getTitleoftheMovie();
		 for( WebElement ele:titleoftheMovie) {
			 String MovieName = ele.getText();
			 if(MovieName.equalsIgnoreCase(input1))
		 {
			//Select the Movie
				ele.click();
				Thread.sleep(5000);
				System.out.println(ele.getText());
		 }
			 }
		 
		prime.getsearchBox().click();
		prime.getsearchBox().clear();
		prime.getsearchBox().sendKeys(input1,Keys.ENTER);
		prime.getMovie().click();
		
	prime.WatchList().click();
		
	prime.getDropDown().click();
		prime.getWatchList().click();
	}

	@DataProvider
public String[][] supplyData() throws IOException
{
	String xlPath = "C:\\Users\\Sanjay\\eclipse-workspace\\SeleniumAutomation\\src\\test\\java\\com\\qa\\TestData22\\TestData222.xlsx";
	String xlSheet = "Sheet4";
	int rowCount =ExcelUtility.getRowCount(xlPath, xlSheet);
	int cellCount = ExcelUtility.getCellCount(xlPath, xlSheet, rowCount);
	String[][] data = new String[rowCount][cellCount];
	for(int i=1;i<=rowCount;i++)
	{
	for(int j=0;j<cellCount;j++)
		{
			data[i-1][j] =ExcelUtility.getCellData(xlPath, xlSheet, i, j);
		}
	}
	return data;
	
}
}

	
	

	