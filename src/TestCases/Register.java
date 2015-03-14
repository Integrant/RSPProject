package TestCases;

import static org.junit.Assert.assertEquals;

import java.io.FileInputStream;
import java.util.concurrent.TimeUnit;

import jxl.Sheet;
import jxl.Workbook;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.w3c.dom.events.EventException;

import ObjectRepository.HomePage;
import ObjectRepository.RegisterPage;
import app.register;
import utility.url;

public class Register 
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
	public void testRegister()
	{
		try
		{
			
			driver.get(url.baseurl());
			
			FileInputStream fi = new FileInputStream("C:\\TestData.xls");
			
			Workbook w = Workbook.getWorkbook(fi);
			
			Sheet S=w.getSheet(0);
			
			
			while( row<S.getRows() )
			{
				
			register.registerMethod(driver);
			
		//	assertEquals("Thank you for your registration",driver.findElement(By.xpath(".//*[@id='ConfirmationModal']/div[1]/div/div[2]/label[1]")).getText());
			
			RegisterPage.placeorderOnline(driver).click();
			
			RegisterPage.SelectWorkComp(driver).click();
			
			//assertEquals("* Indicates a required field.	",driver.findElement(By.xpath("..//*[@id='ordertypesDiv']/div[1]/span")).getText());
			
			RegisterPage.Continue(driver).click();
			
			assertEquals("Work Comp Order Form",driver.findElement(By.xpath(".//*[@id='page-title']/div/h1")).getText());
			
			
			
			HomePage.btnRegister(driver).click();
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
