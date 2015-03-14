package app;


import java.io.IOException;

import jxl.Sheet;

import jxl.read.biff.BiffException;

import org.openqa.selenium.WebDriver;

import ObjectRepository.Orders_1_WorkCompPage;

public class Claimant_Case_Info {
	

		public static void AddApplicant(WebDriver driver,int row, Sheet S)  throws InterruptedException, BiffException, IOException
				{
					try
						{

									String FirstName = S.getCell(0, row).getContents();
									Orders_1_WorkCompPage.txtApplicantFirstName(driver).sendKeys(FirstName);
					
									String txtMiddleName = S.getCell(1, row).getContents();
									Orders_1_WorkCompPage.txtApplicantMiddleName(driver).sendKeys(txtMiddleName);
					
									String txtLastName = S.getCell(2, row).getContents();
									Orders_1_WorkCompPage.txtApplicantLastName(driver).sendKeys(txtLastName);
				
									String CBIsSSNUnknown = S.getCell(3, row).getContents();
									if(CBIsSSNUnknown.equalsIgnoreCase("True"))
									{
										Orders_1_WorkCompPage.CBIsSSNUnknown(driver).click();
								
									}
									else
									{
										String txtApplicantSSN = S.getCell(4, row).getContents();
										Orders_1_WorkCompPage.txtApplicantSSN(driver).sendKeys(txtApplicantSSN);
									}
									
									String CBIsDOBUnknown = S.getCell(5, row).getContents();
									if(CBIsDOBUnknown.equalsIgnoreCase("True"))
									{
										Orders_1_WorkCompPage.CBIsDOBUnknown(driver).click();
								
									}
									else
									{
										String txtApplicantDOB = S.getCell(6, row).getContents();
										Orders_1_WorkCompPage.txtApplicantDOB(driver).sendKeys(txtApplicantDOB);
									}	
									
									String txtApplicantOtherAliases = S.getCell(7, row).getContents();
									Orders_1_WorkCompPage.txtApplicantOtherAliases(driver).sendKeys(txtApplicantOtherAliases);
									
									String txtApplicantInfo_StreetAddress = S.getCell(8, row).getContents();
									Orders_1_WorkCompPage.txtApplicantInfo_StreetAddress(driver).sendKeys(txtApplicantInfo_StreetAddress);
									
									String txtApplicantInfo_ZipCode = S.getCell(9, row).getContents();
									Orders_1_WorkCompPage.txtApplicantInfo_ZipCode(driver).sendKeys(txtApplicantInfo_ZipCode);
									
									String txtApplicantInfo_City = S.getCell(10, row).getContents();
									Orders_1_WorkCompPage.txtApplicantInfo_City(driver).sendKeys(txtApplicantInfo_City);
								
									String DDLApplicantInfo_StateID = S.getCell(11, row).getContents();
									Orders_1_WorkCompPage.DDLApplicantInfo_StateID(driver).selectByVisibleText(DDLApplicantInfo_StateID);
									
									String txtEmployerDefendent = S.getCell(12, row).getContents();
									Orders_1_WorkCompPage.txtEmployerDefendent(driver).sendKeys(txtEmployerDefendent);
									
									String txtClaimFileNo = S.getCell(13, row).getContents();
									Orders_1_WorkCompPage.txtClaimFileNo(driver).sendKeys(txtClaimFileNo);
									
									String txtDateOfInjury = S.getCell(14, row).getContents();
									Orders_1_WorkCompPage.txtDateOfInjury(driver).sendKeys(txtDateOfInjury);
									
									String txtAdditionalInfo = S.getCell(15, row).getContents();
									Orders_1_WorkCompPage.txtAdditionalInfo(driver).sendKeys(txtAdditionalInfo);
									

									Thread.sleep(2000);
									
								}
			
					catch(Exception ex)
					{
						ex.getMessage();
		  
					}
	  
				}
		}
