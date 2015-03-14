package app;


import java.io.IOException;

import jxl.Sheet;

import jxl.read.biff.BiffException;
import org.openqa.selenium.WebDriver;
import ObjectRepository.Orders_1_WorkCompPage;

public class Orders_1_WorkCompLocations {
	
	static String LocationName;
	
	static String Name;

	static String StreetAddress;

	static String ZipCode;							

	static String City;
	
	static String State;							

	static String PhoneNumber;
	
	static String Ext;

	static String FaxNumber;

	static String RecordTypeID1;
	static String RecordTypeID2;
	static String RecordTypeID3;
	static String RecordTypeID4;
	static String RecordTypeID5;
	static String RecordTypeID6;
	static String RecordTypeID7;
	static String RecordTypeID8;
	
	//Sheet S;
	

		public static void LocationTab (WebDriver driver,int row,Sheet S)  throws InterruptedException, BiffException, IOException
				{
					try
					{
					
								LocationName=S.getCell(0, row).getContents();
								Orders_1_WorkCompPage.LocationName(driver).selectByVisibleText(LocationName);
								
								Name = S.getCell(1, row).getContents();
								Orders_1_WorkCompPage.txtLocationName(driver).sendKeys(Name);
								
								StreetAddress = S.getCell(2, row).getContents();
								Orders_1_WorkCompPage.txtLocationstreetAddress(driver).sendKeys(StreetAddress);
								
								ZipCode = S.getCell(3, row).getContents();
								Orders_1_WorkCompPage.txtLocationZipCode(driver).sendKeys(ZipCode);
								
								City = S.getCell(4, row).getContents();
								Orders_1_WorkCompPage.txtLocationCity(driver).sendKeys(City);
										
								State = S.getCell(5, row).getContents(); 		
								Orders_1_WorkCompPage.Locationstate(driver).selectByVisibleText(State);
								
								PhoneNumber = S.getCell(6, row).getContents(); 
								Orders_1_WorkCompPage.txtphonenumber(driver).sendKeys(PhoneNumber);
								
								Ext = S.getCell(7, row).getContents(); 
								Orders_1_WorkCompPage.txtExt(driver).sendKeys(Ext);
								
								FaxNumber = S.getCell(8, row).getContents(); 
								Orders_1_WorkCompPage.txtfaxnumber(driver).sendKeys(FaxNumber);
								
								RecordTypeID1 = S.getCell(9, row).getContents();
								RecordTypeID2 = S.getCell(10, row).getContents();
								RecordTypeID3 = S.getCell(11, row).getContents();
								RecordTypeID4 = S.getCell(12, row).getContents();
								RecordTypeID5 = S.getCell(13, row).getContents();
								RecordTypeID6 = S.getCell(14, row).getContents();
								RecordTypeID7 = S.getCell(15, row).getContents();
								RecordTypeID8 = S.getCell(16, row).getContents();

									if (RecordTypeID1.equalsIgnoreCase("1"))
									{
										//String SelectWCABSubpoena = "//input[contains(@id,'ObjectRepository.Orders_WorkCompPage.RbtnOrderSubTypeID1') and contains(@value, 1)]";
										ObjectRepository.Orders_1_WorkCompPage.Medical(driver).click();								
									}
									if (RecordTypeID2.equalsIgnoreCase("1"))			
									{
										ObjectRepository.Orders_1_WorkCompPage.Insurance(driver).click();
									}	
									if (RecordTypeID3.equalsIgnoreCase("1"))			
									{
										ObjectRepository.Orders_1_WorkCompPage.Employment(driver).click();
									}
									if (RecordTypeID4.equalsIgnoreCase("1"))			
									{
										ObjectRepository.Orders_1_WorkCompPage.Billing(driver).click();			
									}
									if (RecordTypeID5.equalsIgnoreCase("1"))			
									{
										ObjectRepository.Orders_1_WorkCompPage.XRayReportsOnly(driver).click();			
									}
									if (RecordTypeID6.equalsIgnoreCase("1"))			
									{
										ObjectRepository.Orders_1_WorkCompPage.XRay(driver).click();			
									}
									if (RecordTypeID7.equalsIgnoreCase("1"))			
									{
										ObjectRepository.Orders_1_WorkCompPage.Attorney(driver).click();			
									}
									if (RecordTypeID8.equalsIgnoreCase("1"))			
									{
										ObjectRepository.Orders_1_WorkCompPage.Other(driver).click();	
										String OtherTypesInfo = S.getCell(17, row).getContents();
										ObjectRepository.Orders_1_WorkCompPage.txtOtherAdditionalInfo(driver).sendKeys(OtherTypesInfo);
									}
									
									String AdditionalInfo = S.getCell(18, row).getContents();
									ObjectRepository.Orders_1_WorkCompPage.txtLocationAdditionalInfo(driver).sendKeys(AdditionalInfo);
							
									//////////////************* records summary for this location**********************////////////////////////
									String RecordsSummaryRequested = S.getCell(19, row).getContents(); 
									if (RecordsSummaryRequested.equalsIgnoreCase("true"))
										
									{
										ObjectRepository.Orders_1_WorkCompPage.RecordsSummaryRequestedTrue(driver).click();
									}
									else if (RecordsSummaryRequested.equalsIgnoreCase("false"))
									{
										ObjectRepository.Orders_1_WorkCompPage.RecordsSummaryRequestedFalse(driver).click();
									}
									
									Thread.sleep(2000);
									
								}
			
					catch(Exception ex)
					{
						ex.getMessage();
		  
					}
	  
				}
		}
