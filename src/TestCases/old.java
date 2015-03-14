package TestCases;

import java.io.FileInputStream;
import java.util.concurrent.TimeUnit;

import jxl.Sheet;
import jxl.Workbook;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.w3c.dom.events.EventException;


import ObjectRepository.DashboardPage;

import utility.url;


public class old 
{
	private WebDriver driver;
	int row = 2 ;
	
	@Before
	
	public void setUp() throws EventException {
		  
		  driver = new FirefoxDriver();
		  driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	  }
	
	@Test
	public void testSignin()
	{
		try
		{
			
			driver.get(url.signinurl());
			
			FileInputStream fi = new FileInputStream("C:\\TestData.xls");
			
			Workbook w = Workbook.getWorkbook(fi);
			
			Sheet S= w.getSheet(1);
			
			while( row<S.getRows())
			{	
		
			app.SignIn.SigninMethod(S,driver, row++);	
			DashboardPage.PlaceOrder(driver).click();
			DashboardPage.NewWorkCompOrder(driver).click();
			
			Thread.sleep(3000);
			}
			
		}
	
		catch(Exception ex)
			{
			
			ex.getMessage();
		
			}
			finally
				{
				driver.close();
				driver.quit();
				}
			}

		}
