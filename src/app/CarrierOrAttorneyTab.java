package app;


import java.io.IOException;

import jxl.Sheet;

import jxl.read.biff.BiffException;

import org.openqa.selenium.WebDriver;

import ObjectRepository.Orders_1_WorkCompPage;

public class CarrierOrAttorneyTab {
	
	static String ExaminerOrAdjustor;
	
	static String  firstname;

	static String Lastname;

	static String Companyname;
	
	static String PhoneNumber;

	static String Ext;
	
	static String FaxNumber;
	
	static String EmailAddress;

	static String StreetAddress;

	static String ZipCode;
	
	static String City;
	
	static String State;
	
	static String IsDefenseAttorneyAssigned;
	
	static String IsApplicantAttorneyAssigned;

	//Sheet s;
	
	
	
	public static int CarrierOrAttorney(WebDriver driver,int row, Sheet S) throws InterruptedException, BiffException, IOException
	
			{
		
		//////////////*************Insurance Carrier Information**********************////////////////////////

		int attorney_councel_Flag = 0;
		ExaminerOrAdjustor=S.getCell(0, row).getContents();
		Orders_1_WorkCompPage.DDLExistingExaminer(driver).selectByVisibleText(ExaminerOrAdjustor);
		
		firstname=S.getCell(1, row).getContents();
		Orders_1_WorkCompPage.txtExaminerFirstName(driver).sendKeys(firstname);
		
		
		Lastname=S.getCell(2, row).getContents();
		Orders_1_WorkCompPage.txtExaminerLastName(driver).sendKeys(Lastname);
		
		
		Companyname=S.getCell(3,row).getContents();
		Orders_1_WorkCompPage.txtExaminerCompanyName(driver).sendKeys(Companyname);
		
		
		PhoneNumber=S.getCell(4,row).getContents();
		Orders_1_WorkCompPage.txtExaminerPhoneNumber(driver).sendKeys(PhoneNumber);
		
		Ext=S.getCell(5,row).getContents();
		Orders_1_WorkCompPage.txtExaminerPhoneNumberExt(driver).sendKeys(Ext);
		
		FaxNumber=S.getCell(6,row).getContents();
		Orders_1_WorkCompPage.txtExaminerFaxNumber(driver).sendKeys(FaxNumber);
		
		Thread.sleep(2000);
		EmailAddress=S.getCell(7,row).getContents();
		Orders_1_WorkCompPage.txtExaminerEmailAddress(driver).sendKeys(EmailAddress);
		
		StreetAddress=S.getCell(8,row).getContents();
		Orders_1_WorkCompPage.txtExaminerStreetAddress(driver).sendKeys(StreetAddress);
		
		ZipCode=S.getCell(9,row).getContents();
		Orders_1_WorkCompPage.txtExaminerZipCode(driver).sendKeys(ZipCode);
		
		City=S.getCell(10,row).getContents();
		Orders_1_WorkCompPage.txtExaminerCity(driver).sendKeys(City);
		
		State=S.getCell(11, row).getContents();
		Orders_1_WorkCompPage.DDLExaminerCompanyInfo_StateId(driver).selectByVisibleText(State);
		
		
		////////////*************Defense Attorney Information**********************////////////////////////
		
		IsDefenseAttorneyAssigned = S.getCell(12, row).getContents(); 
		if (IsDefenseAttorneyAssigned.equalsIgnoreCase("true"))
			
		{
			attorney_councel_Flag ++;  // Case '1' means only attorney, Case '2' means only councel, Case '3' means both attorney defense and councel
			ObjectRepository.Orders_1_WorkCompPage.yes_IsDefenseAttorneyAssigned(driver).click();
			String DefenseAttorneyName = S.getCell(13, row).getContents();
			Orders_1_WorkCompPage.DDLExistingDefeneseAttorney(driver).selectByVisibleText(DefenseAttorneyName);
			String DefenseAttorneyFirstName = S.getCell(14, row).getContents();
			Orders_1_WorkCompPage.txtDefenseAttorneyFirstName(driver).sendKeys(DefenseAttorneyFirstName);
			String DefenseAttorneyLastName = S.getCell(15, row).getContents();
			Orders_1_WorkCompPage.txtDefenseAttorneyLastName(driver).sendKeys(DefenseAttorneyLastName);
			String DefenseAttorneyCompanyName = S.getCell(16, row).getContents();
			Orders_1_WorkCompPage.txtDefenseAttorneyCompanyName(driver).sendKeys(DefenseAttorneyCompanyName);
			String DefenseAttorneyPhoneNumber = S.getCell(17, row).getContents();
			Orders_1_WorkCompPage.txtDefenseAttorneyPhoneNumber(driver).sendKeys(DefenseAttorneyPhoneNumber);
			String DefenseAttorneyPhoneNumberExt = S.getCell(18, row).getContents();
			Orders_1_WorkCompPage.txtDefenseAttorneyPhoneNumberExt(driver).sendKeys(DefenseAttorneyPhoneNumberExt);
			String DefenseAttorneyFaxNumber = S.getCell(19, row).getContents();
			Orders_1_WorkCompPage.txtDefenseAttorneyFaxNumber(driver).sendKeys(DefenseAttorneyFaxNumber);
			String DefenseAttorneyEmailAddress = S.getCell(20, row).getContents();
			Orders_1_WorkCompPage.txtDefenseAttorneyEmailAddress(driver).sendKeys(DefenseAttorneyEmailAddress);
			String DefenseAttorneyStreetAddress = S.getCell(21, row).getContents();
			Orders_1_WorkCompPage.txtDefenseAttorneyStreetAddress(driver).sendKeys(DefenseAttorneyStreetAddress);
			String DefenseAttorneyZipCode = S.getCell(22, row).getContents();
			Orders_1_WorkCompPage.txtDefenseAttorneyZipCode(driver).sendKeys(DefenseAttorneyZipCode);
			String DefenseAttorneyCity = S.getCell(23, row).getContents();
			Orders_1_WorkCompPage.txtDefenseAttorneyCity(driver).sendKeys(DefenseAttorneyCity);
			String DefenseAttorneyCompanyInfo_StateId = S.getCell(24, row).getContents();
			Orders_1_WorkCompPage.txtDefenseAttorneyCompanyInfo_StateId(driver).selectByVisibleText(DefenseAttorneyCompanyInfo_StateId);
			
		}
		else
		{
			ObjectRepository.Orders_1_WorkCompPage.no_IsDefenseAttorneyAssigned(driver).click();
		}
		
		////////////*************Applicant Attorney Information**********************////////////////////////
		
		IsApplicantAttorneyAssigned = S.getCell(25, row).getContents(); 
		if (IsApplicantAttorneyAssigned.equalsIgnoreCase("true"))
			
		{
			attorney_councel_Flag +=2; // Case '1' means only attorney, Case '2' means only councel, Case '3' means both attorney defense and councel
			ObjectRepository.Orders_1_WorkCompPage.yes_IsApplicantAttorneyAssigned(driver).click();
			String DefenseAttorneyName = S.getCell(26, row).getContents();
			Orders_1_WorkCompPage.DDLExistingDefeneseAttorney(driver).selectByVisibleText(DefenseAttorneyName);
			String ApplicantAttorneyFirstName = S.getCell(27, row).getContents();
			Orders_1_WorkCompPage.txtApplicantAttorneyFirstName(driver).sendKeys(ApplicantAttorneyFirstName);
			String ApplicantAttorneyLastName = S.getCell(28, row).getContents();
			Orders_1_WorkCompPage.txtApplicantAttorneyLastName(driver).sendKeys(ApplicantAttorneyLastName);
			String ApplicantAttorneyCompanyName = S.getCell(29, row).getContents();
			Orders_1_WorkCompPage.txtApplicantAttorneyCompanyName(driver).sendKeys(ApplicantAttorneyCompanyName);
			String ApplicantAttorneyPhoneNumber = S.getCell(30, row).getContents();
			Orders_1_WorkCompPage.txtApplicantAttorneyPhoneNumber(driver).sendKeys(ApplicantAttorneyPhoneNumber);
			String ApplicantAttorneyPhoneNumberExt = S.getCell(31, row).getContents();
			Orders_1_WorkCompPage.txtApplicantAttorneyPhoneNumberExt(driver).sendKeys(ApplicantAttorneyPhoneNumberExt);
			String ApplicantAttorneyFaxNumber = S.getCell(32, row).getContents();
			Orders_1_WorkCompPage.txtApplicantAttorneyFaxNumber(driver).sendKeys(ApplicantAttorneyFaxNumber);
			String ApplicantAttorneyEmailAddress = S.getCell(33, row).getContents();
			Orders_1_WorkCompPage.txtApplicantAttorneyEmailAddress(driver).sendKeys(ApplicantAttorneyEmailAddress);
			String ApplicantAttorneyStreetAddress = S.getCell(34, row).getContents();
			Orders_1_WorkCompPage.txtApplicantAttorneyStreetAddress(driver).sendKeys(ApplicantAttorneyStreetAddress);
			String ApplicantAttorneyZipCode = S.getCell(35, row).getContents();
			Orders_1_WorkCompPage.txtApplicantAttorneyZipCode(driver).sendKeys(ApplicantAttorneyZipCode);
			String ApplicantAttorneyCity = S.getCell(36, row).getContents();
			Orders_1_WorkCompPage.txtApplicantAttorneyCity(driver).sendKeys(ApplicantAttorneyCity);
			String ApplicantAttorneyCompanyInfo_StateId = S.getCell(37, row).getContents();
			Orders_1_WorkCompPage.DDLApplicantAttorneyCompanyInfo_StateId(driver).selectByVisibleText(ApplicantAttorneyCompanyInfo_StateId);
			
		}
		else
		{
			ObjectRepository.Orders_1_WorkCompPage.no_IsApplicantAttorneyAssigned(driver).click();
		}
		
		Thread.sleep(2000);
		
		return attorney_councel_Flag = 0;
	}

	
}
