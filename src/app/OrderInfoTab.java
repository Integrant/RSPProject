package app;


import java.io.IOException;

import jxl.Sheet;

import jxl.read.biff.BiffException;
import org.openqa.selenium.WebDriver;
import ObjectRepository.Orders_1_WorkCompPage;

public class OrderInfoTab {
	

		public static void OrderInfo (WebDriver driver,int row,Sheet S)  throws InterruptedException, BiffException, IOException
				{
					try
						{	
						Thread.sleep(2000);
						String OrderSubTypeID = S.getCell(0, row).getContents();
									if (OrderSubTypeID.equalsIgnoreCase("1"))
									{
										//String SelectWCABSubpoena = "//input[contains(@id,'ObjectRepository.Orders_WorkCompPage.RbtnOrderSubTypeID1') and contains(@value, 1)]";
										ObjectRepository.Orders_1_WorkCompPage.RbtnOrderSubTypeID1(driver).click();
										String WCAB = S.getCell(1, row).getContents();
										Orders_1_WorkCompPage.txtOrderExtentionInfo_ADJWCABCaseNumber(driver).sendKeys(WCAB);		
									}
									else if (OrderSubTypeID.equalsIgnoreCase("2"))			
									{
										ObjectRepository.Orders_1_WorkCompPage.RbtnOrderSubTypeID2(driver).click();
									}	
									else if (OrderSubTypeID.equalsIgnoreCase("3"))			
									{
										ObjectRepository.Orders_1_WorkCompPage.RbtnOrderSubTypeID3(driver).click();
									}
									else if (OrderSubTypeID.equalsIgnoreCase("4"))			
									{
										String AddressTypeValue = S.getCell(2, row).getContents();
										if (AddressTypeValue.equalsIgnoreCase("1"))
										{
											ObjectRepository.Orders_1_WorkCompPage.ClaimantAddress(driver).click();
											String address = S.getCell(3, row).getContents();
											Orders_1_WorkCompPage.txtOrderExtentionInfo_SignedReleaseSendToStreetAddress(driver).sendKeys(address);
											String ZipCode = S.getCell(4, row).getContents();
											Orders_1_WorkCompPage.txtOrderExtentionInfo_SignedReleaseSendToZipCode(driver).sendKeys(ZipCode);
											String City = S.getCell(5, row).getContents();
											Orders_1_WorkCompPage.txtOrderExtentionInfo_SignedReleaseSendToCity(driver).sendKeys(City);
											String State = S.getCell(6, row).getContents();
											Orders_1_WorkCompPage.DDLOrderExtentionInfo_SignedReleaseSendToStateId(driver).selectByVisibleText(State);
										}
										else if (AddressTypeValue.equalsIgnoreCase("2"))
										{
											ObjectRepository.Orders_1_WorkCompPage.AppAttorneyAddress(driver).click();
											String address = S.getCell(3, row).getContents();
											Orders_1_WorkCompPage.ClaimantAddress(driver).sendKeys(address);
											String ZipCode = S.getCell(4, row).getContents();
											Orders_1_WorkCompPage.txtOrderExtentionInfo_SignedReleaseSendToZipCode(driver).sendKeys(ZipCode);
											String City = S.getCell(5, row).getContents();
											Orders_1_WorkCompPage.txtOrderExtentionInfo_SignedReleaseSendToCity(driver).sendKeys(City);
											String State = S.getCell(6, row).getContents();
											Orders_1_WorkCompPage.DDLOrderExtentionInfo_SignedReleaseSendToStateId(driver).selectByVisibleText(State);
										}
									}
						//////////////*************PersonalAppearanceSubpoena**********************////////////////////////
									String PersonalAppearanceSubpoenaValue = S.getCell(7, row).getContents();
									if (PersonalAppearanceSubpoenaValue.equalsIgnoreCase("true"))
										
									{
										ObjectRepository.Orders_1_WorkCompPage.PersonalApperanceSubtrue(driver).click();
										String CourtName = S.getCell(8, row).getContents();
										Orders_1_WorkCompPage.txtNameOfCourt(driver).sendKeys(CourtName);
										String AppDate = S.getCell(9, row).getContents();
										Orders_1_WorkCompPage.txtAppearDate(driver).sendKeys(AppDate);
										String AppTime = S.getCell(10, row).getContents();
										Orders_1_WorkCompPage.txtAppearTime(driver).sendKeys(AppTime);
										String PresidingJudgeName = S.getCell(11, row).getContents();
										Orders_1_WorkCompPage.txtNameOfPresidingJudge(driver).sendKeys(PresidingJudgeName);
										
									}
									else if (PersonalAppearanceSubpoenaValue.equalsIgnoreCase("false"))
									{
										ObjectRepository.Orders_1_WorkCompPage.PersonalApperanceSubfalse(driver).click();
									}
									//////////////*************WCABEDEXcheck**********************////////////////////////
									String WCABEDEXcheckValue = S.getCell(12, row).getContents(); 
									if (WCABEDEXcheckValue.equalsIgnoreCase("true"))
										
									{
										ObjectRepository.Orders_1_WorkCompPage.WCABEDEXcheckYes(driver).click();
										String SSN = S.getCell(13, row).getContents();
										Orders_1_WorkCompPage.txtSSN(driver).sendKeys(SSN);
										
									}
									else if (WCABEDEXcheckValue.equalsIgnoreCase("false"))
									{
										ObjectRepository.Orders_1_WorkCompPage.WCABEDEXcheckNo(driver).click();
									}
									
									//////////////*************Order Delivery Timeframe**********************////////////////////////
									String OrderDeliveryTimeframeValue = S.getCell(14, row).getContents();
									if (OrderDeliveryTimeframeValue.equalsIgnoreCase("1"))
									{
										ObjectRepository.Orders_1_WorkCompPage.ODTAsap(driver).click();
									}
									else if(OrderDeliveryTimeframeValue.equalsIgnoreCase("2"))
									{
										ObjectRepository.Orders_1_WorkCompPage.ODTRush(driver).click();
									}
									else if(OrderDeliveryTimeframeValue.equalsIgnoreCase("3"))
									{
										ObjectRepository.Orders_1_WorkCompPage.ODTOther(driver).click();
										String Other = S.getCell(15, row).getContents();
										Orders_1_WorkCompPage.OrderExtentionInfo_RequestedDeliveryDate(driver).sendKeys(Other);
										
									}
									Thread.sleep(2000);
									
								}
			
					catch(Exception ex)
					{
						ex.getMessage();
		  
					}
	  
				}
		}
