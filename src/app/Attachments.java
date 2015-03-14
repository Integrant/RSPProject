package app;


import java.io.IOException;

import jxl.Sheet;

import jxl.read.biff.BiffException;
import org.openqa.selenium.WebDriver;
import ObjectRepository.Orders_1_WorkCompPage;

public class Attachments {
	static String FilePath;
	
		public static void AttachmentsTab (WebDriver driver,int row, Sheet S)  throws InterruptedException, BiffException, IOException
				{
					try
					{

								FilePath=S.getCell(0, row).getContents();
								Orders_1_WorkCompPage.Btnfileupload(driver).sendKeys(FilePath);
									
									Thread.sleep(2000);
									
								}
			
					catch(Exception ex)
					{
						ex.getMessage();
		  
					}
	  
				}
		}
