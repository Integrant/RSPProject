package app;

import java.io.FileInputStream;
import java.io.IOException;

import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static org.junit.Assert.*;
import ObjectRepository.HomePage;
import ObjectRepository.RegisterPage;

public class register {
	static String  firstname;

	static String Lastname;

	static String Companyname;

	static String JobTitle;

	static String EmailAddress;
	
	static String PhoneNumber;
	
	static String Ext;
	
	static String FaxNumber;

	static String UserName;

	static String password;

	static String confirmPassword;
	
	Sheet s;
	
	static int row=2;
	
	public static void registerMethod(WebDriver driver) throws InterruptedException, BiffException, IOException
	
			{
		
		
		HomePage.btnRegister(driver).click();
		
		Thread.sleep(1000);
		
		assertEquals(" Registration Form Sign Up Today",driver.findElement(By.xpath(".//*[@id='page-title']/div/h1")).getText());
		
		FileInputStream fi = new FileInputStream("C:\\TestData.xls");
		
		Workbook w = Workbook.getWorkbook(fi);
		
		Sheet S=w.getSheet(0);
		
		firstname=S.getCell(0, row).getContents();
		RegisterPage.txtFirstName(driver).sendKeys(firstname);
		
		
		Lastname=S.getCell(1, row).getContents();
		RegisterPage.insertLastName(driver).sendKeys(Lastname);
		
		
		Companyname=S.getCell(2,row).getContents();
		RegisterPage.insertCompanyName(driver).sendKeys(Companyname);
		
		
		JobTitle=S.getCell(3,row).getContents();
		RegisterPage.selectJobTitle(driver).selectByVisibleText(JobTitle);
		
		Thread.sleep(2000);
		EmailAddress=S.getCell(4,row).getContents();
		RegisterPage.insertEmailAddress(driver).sendKeys(EmailAddress);
		
		Thread.sleep(2000);
		PhoneNumber=S.getCell(5,row).getContents();
		RegisterPage.insertEmailAddress(driver).sendKeys(PhoneNumber);
		
		Ext=S.getCell(6,row).getContents();
		RegisterPage.insertUserName(driver).sendKeys(Ext);
		
		FaxNumber=S.getCell(7,row).getContents();
		RegisterPage.insertUserName(driver).sendKeys(FaxNumber);
		
		UserName=S.getCell(8,row).getContents();
		RegisterPage.insertUserName(driver).sendKeys(UserName);
		
		password=S.getCell(9,row).getContents();
		RegisterPage.insertPassword(driver).sendKeys(password);
		
		confirmPassword=S.getCell(10,row).getContents();
		RegisterPage.confirmPassword(driver).sendKeys(confirmPassword);
		
		RegisterPage.AcceptsTerms(driver).click();
		
		RegisterPage.register(driver).click();
		
		/*	RegisterPage.insertFirstName(driver).sendKeys("Mohamed");
			RegisterPage.insertLastName(driver).sendKeys("Mahran");
			RegisterPage.insertCompanyName(driver).sendKeys("Integrant");
			RegisterPage.selectJobTitle(driver).selectByIndex(2);
			RegisterPage.insertEmailAddress(driver).sendKeys("Mohamed_sabry007@yahoo.com");
			RegisterPage.insertUserName(driver).sendKeys("Mohamed_Sabry007");
			RegisterPage.insertPassword(driver).sendKeys("Mazagat_007");
			RegisterPage.confirmPassword(driver).sendKeys("Mazagat_007");
			RegisterPage.AcceptsTerms(driver).click();
			RegisterPage.register(driver).click();
		*/
		Thread.sleep(2000);
		
		row++;
	}
	
	
}
