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



import ObjectRepository.DashboardPage;
//import ObjectRepository.Orders_1_WorkCompPage;
import ObjectRepository.Orders_2_CivilOrderPage;


import utility.url;


public class Orders_2_CivilOrder 
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
	public void testWorkCompOrder()
	{
		try
		{
			
			driver.get(url.signinurl());
			
			FileInputStream fi = new FileInputStream("C:\\TestData - Orders_Work Comp.xls");
			
			Workbook w = Workbook.getWorkbook(fi);
			
			Sheet S= w.getSheet(0);
			
			while( row<S.getRows())
			{	
		
				app.SignIn.SigninMethod(S,driver, row);	
				DashboardPage.PlaceOrder(driver).click();
				DashboardPage.NewCivilOrder(driver).click();
				S= w.getSheet(7);
				app.Plaintiff_Case_Info.AddApplicant(driver,row,S);
				Orders_2_CivilOrderPage.BtnClaimantProceedbutton(driver).click();
				//BtnClaimantProceedbutton(driver).click();
//				S= w.getSheet(2);
//				app.OrderInfoTab.OrderInfo(driver, row, S);
//				Orders_WorkCompPage.BtnOrderInfoProceedbutton(driver).click();
				Thread.sleep(2000);
				S= w.getSheet(3);
				app.CarrierOrAttorneyTab.CarrierOrAttorney(driver, row, S);
				Orders_2_CivilOrderPage.BtnCivil_CarrierProceedbutton(driver).click();
				S= w.getSheet(4);
				app.Orders_2_CivilOrderLocations.LocationTab(driver, row, S);
				Orders_2_CivilOrderPage.BtnCivil_LocationsProceedbutton(driver).click();
				S= w.getSheet(5);
				app.Orders_2_CivilOrder_ShipmentAndBilling.ShipmentBillingTab(driver, row, S);
				Orders_2_CivilOrderPage.BtnCivil_ShipmentProceedbutton(driver).click();
				S= w.getSheet(6);
				app.Attachments.AttachmentsTab(driver, row, S);
				Orders_2_CivilOrderPage.BtnCivil_AttachmentsProceedbutton(driver).click();

				
				Thread.sleep(5000);
				Orders_2_CivilOrderPage.BtnPlaceOrder(driver).click();
				Thread.sleep(3000);
				//assertEquals("Thank you! Your order has been successfully placed . ",driver.findElement(By.xpath("/html/body/div[1]/section/div[1]/div/div[2]/div/div/div/h4[1]")).getText());
				assertEquals("Thank you! Your order has been successfully placed . ",driver.findElement(By.xpath("/html/body/div[1]/section/div[1]/div/div[2]/div/div/div/h4[1]")).getText());
			
				
				Thread.sleep(3000);
			}
			row++;
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
