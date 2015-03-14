package app;


import java.io.IOException;

import jxl.Sheet;

import jxl.read.biff.BiffException;
import org.openqa.selenium.WebDriver;
//import ObjectRepository.Orders_WorkCompPage;

public class Orders_1_WorkCompShipmentAndBilling {

	static String ExaminerOrAdjuster;
	static String AdditionalDist;
	static String ShipmentTypeID;
	static String BillingInfoID ;

		public static void ShipmentBillingTab (WebDriver driver,int row, Sheet S, int attorney_councel_Flag)  throws InterruptedException, BiffException, IOException
				{

				
					try
						{			
						
						ExaminerOrAdjuster = S.getCell(0, row).getContents();
						AdditionalDist  = S.getCell(1, row).getContents();	
						
									if (ExaminerOrAdjuster.equalsIgnoreCase("1"))
									{
							
										ObjectRepository.Orders_1_WorkCompPage.ExaminerAdjustor(driver).click();
										String ExOrAdjShipType = S.getCell(2, row).getContents();
										Thread.sleep(2000);
										if (ExOrAdjShipType.equalsIgnoreCase("0"))
										{
											ObjectRepository.Orders_1_WorkCompPage.DistributionMethodDownloadonly(driver).click();
											
										}
										else if (ExOrAdjShipType.equalsIgnoreCase("1"))
										{
											ObjectRepository.Orders_1_WorkCompPage.DistributionMethodbyMail(driver).click();
											String ExPaper = S.getCell(3, row).getContents();
											String ExCD = S.getCell(5, row).getContents();
											if (ExPaper.equalsIgnoreCase("1"))
											{
												ObjectRepository.Orders_1_WorkCompPage.shippingPaper(driver).click();
												String ExPaperCopyNo = S.getCell(4, row).getContents();
												ObjectRepository.Orders_1_WorkCompPage.txtshippingNoOfPaperCopies(driver).sendKeys(ExPaperCopyNo);
											}
											if (ExCD.equalsIgnoreCase("1"))
											{
												ObjectRepository.Orders_1_WorkCompPage.shippingCD(driver).click();
												String ExCDCopyNo = S.getCell(6, row).getContents();
												ObjectRepository.Orders_1_WorkCompPage.txtshippingNoOfCDCopies(driver).sendKeys(ExCDCopyNo);
											}
										}
									}
									
									
						/////////////////////// Case Attorney Defense
									if (attorney_councel_Flag == 1 || attorney_councel_Flag == 3)
									{
										String DefenseAttorney = S.getCell(7, row).getContents();
									
										if (DefenseAttorney.equalsIgnoreCase("1"))
										{
								
											ObjectRepository.Orders_1_WorkCompPage.CBDefenseAttorney(driver).click();
											String ExOrAdjShipType = S.getCell(8, row).getContents();
											Thread.sleep(2000);
											if (ExOrAdjShipType.equalsIgnoreCase("0"))
											{
												ObjectRepository.Orders_1_WorkCompPage.RbtnDefenseAttorneyDownloadonly(driver).click();
									
											}
											else if (ExOrAdjShipType.equalsIgnoreCase("1"))
											{
												ObjectRepository.Orders_1_WorkCompPage.RbtnDefenseAttorneybyMail(driver).click();
												String ExPaper = S.getCell(9, row).getContents();
												
												if (ExPaper.equalsIgnoreCase("1"))
												{
													ObjectRepository.Orders_1_WorkCompPage.CBDefenseAttorneyshippingPaper(driver).click();
													String ExPaperCopyNo = S.getCell(10, row).getContents();
													ObjectRepository.Orders_1_WorkCompPage.txtDefenseAttorneyshippingNoOfPaperCopies(driver).sendKeys(ExPaperCopyNo);
												}
												String ExCD = S.getCell(11, row).getContents();
												if (ExCD.equalsIgnoreCase("1"))
												{
													ObjectRepository.Orders_1_WorkCompPage.CBDefenseAttorneyshippingCD(driver).click();
													String ExCDCopyNo = S.getCell(12, row).getContents();
													ObjectRepository.Orders_1_WorkCompPage.txtDefenseAttorneyshippingNoOfCDCopies(driver).sendKeys(ExCDCopyNo);
												}
											}
										}	
									}
									/////////////////////// Case OpposingCounsel
									if (attorney_councel_Flag == 2 || attorney_councel_Flag == 3)
									{
										String DefenseAttorney = S.getCell(13, row).getContents();
									
										if (DefenseAttorney.equalsIgnoreCase("1"))
										{
								
											ObjectRepository.Orders_1_WorkCompPage.CBOpposingCounsel(driver).click();
											String ExOrAdjShipType = S.getCell(14, row).getContents();
											Thread.sleep(2000);
											if (ExOrAdjShipType.equalsIgnoreCase("1"))
											{
												ObjectRepository.Orders_1_WorkCompPage.RbtnOpposingCounselbyMail(driver).click();
												String ExPaper = S.getCell(15, row).getContents();
												
												if (ExPaper.equalsIgnoreCase("1"))
												{
													ObjectRepository.Orders_1_WorkCompPage.CBOpposingCounselshippingPaper(driver).click();
												}
												String ExCD = S.getCell(16, row).getContents();
												if (ExCD.equalsIgnoreCase("1"))
												{
													ObjectRepository.Orders_1_WorkCompPage.CBOpposingCounselshippingCD(driver).click();
												}
											}
										}	
									}									
						//////////////////////
									
									
									if (AdditionalDist.equalsIgnoreCase("1"))
									{
										ObjectRepository.Orders_1_WorkCompPage.additionaldistributions(driver).click();
										String AddPaper = S.getCell(17, row).getContents();
										String AddCD = S.getCell(19, row).getContents();
										if (AddPaper.equalsIgnoreCase("1"))
										{
											ObjectRepository.Orders_1_WorkCompPage.Paper(driver).click();
											
											String AddPaperCopyNo = S.getCell(18, row).getContents();
											ObjectRepository.Orders_1_WorkCompPage.txtNoOfPaperCopies(driver).sendKeys(AddPaperCopyNo);
										}
										if (AddCD.equalsIgnoreCase("1"))
										{
											ObjectRepository.Orders_1_WorkCompPage.CD(driver).click();
											String AddCDCopyNo = S.getCell(20, row).getContents();
											ObjectRepository.Orders_1_WorkCompPage.txtNoOfCDCopies(driver).sendKeys(AddCDCopyNo);
										}
										String AddName = S.getCell(21, row).getContents();
										ObjectRepository.Orders_1_WorkCompPage.txtname(driver).sendKeys(AddName);
										String AddBusinessName = S.getCell(22, row).getContents();
										ObjectRepository.Orders_1_WorkCompPage.txtbusinessname(driver).sendKeys(AddBusinessName);
										String AddStreetAddress = S.getCell(23, row).getContents();
										ObjectRepository.Orders_1_WorkCompPage.txtstreetaddress(driver).sendKeys(AddStreetAddress);
										String AddZipCode = S.getCell(24, row).getContents();
										ObjectRepository.Orders_1_WorkCompPage.txtShipmentZipCode(driver).sendKeys(AddZipCode);
										String AddCity = S.getCell(25, row).getContents();
										ObjectRepository.Orders_1_WorkCompPage.txtShipmentCity(driver).sendKeys(AddCity);
										String AddState = S.getCell(26, row).getContents();
										ObjectRepository.Orders_1_WorkCompPage.DDLShipmentstate(driver).selectByVisibleText(AddState);
										String AddPhoneNumber = S.getCell(27, row).getContents();
										ObjectRepository.Orders_1_WorkCompPage.txtShipmentphonenumber(driver).sendKeys(AddPhoneNumber);
										String AddExt = S.getCell(28, row).getContents();
										ObjectRepository.Orders_1_WorkCompPage.txtShipmentExt(driver).sendKeys(AddExt);
										String AddFaxNumber = S.getCell(29, row).getContents();
										ObjectRepository.Orders_1_WorkCompPage.txtShipmentfaxnumber(driver).sendKeys(AddFaxNumber);
										
									}
									Thread.sleep(2000);
								BillingInfoID = S.getCell(30, row).getContents();	
								if (BillingInfoID.equalsIgnoreCase("1"))
								{
									ObjectRepository.Orders_1_WorkCompPage.SendInvoiceYes(driver).click();
								}
								else if (BillingInfoID.equalsIgnoreCase("0"))
								{
									ObjectRepository.Orders_1_WorkCompPage.SendInvoiceNo(driver).click();
									String BillingFirstName = S.getCell(31, row).getContents();
									ObjectRepository.Orders_1_WorkCompPage.txtfirstname(driver).sendKeys(BillingFirstName);
									String BillingLastName = S.getCell(32, row).getContents();
									ObjectRepository.Orders_1_WorkCompPage.txtLastname(driver).sendKeys(BillingLastName);
									String BillingCompanyName = S.getCell(33, row).getContents();
									ObjectRepository.Orders_1_WorkCompPage.txtcompanyname(driver).sendKeys(BillingCompanyName);
									String BillingPhoneNumber = S.getCell(34, row).getContents();
									ObjectRepository.Orders_1_WorkCompPage.txtbillingphonenumber(driver).sendKeys(BillingPhoneNumber);
									String BillingExt = S.getCell(35, row).getContents();
									ObjectRepository.Orders_1_WorkCompPage.txtbillingExt(driver).sendKeys(BillingExt);
									String BillingFaxNumber = S.getCell(36, row).getContents();
									ObjectRepository.Orders_1_WorkCompPage.txtbillingfaxnumber(driver).sendKeys(BillingFaxNumber);
									String BillingEmailAddress = S.getCell(37, row).getContents();
									ObjectRepository.Orders_1_WorkCompPage.txtEmailAddress(driver).sendKeys(BillingEmailAddress);
									String BillingStreetAddress = S.getCell(38, row).getContents();
									ObjectRepository.Orders_1_WorkCompPage.txtbillingstreetaddress(driver).sendKeys(BillingStreetAddress);
									String BillingZipCode = S.getCell(39, row).getContents();
									ObjectRepository.Orders_1_WorkCompPage.txtbillingZipCode(driver).sendKeys(BillingZipCode);
									String BillingCity = S.getCell(40, row).getContents();
									ObjectRepository.Orders_1_WorkCompPage.txtbillingCity(driver).sendKeys(BillingCity);
									String BillingState = S.getCell(41, row).getContents();
									ObjectRepository.Orders_1_WorkCompPage.DLLbillingstate(driver).selectByVisibleText(BillingState);												
								}
									
						}
			
					catch(Exception ex)
					{
						ex.getMessage();
		  
					}
			
				}
		}
