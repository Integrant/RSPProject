package ObjectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Orders_2_CivilOrderPage {
	
	private static WebElement element = null;

	///////////////********************************************************** 1. Claimant/Applicant Information // SH
	public static WebElement txtApplicantFirstName(WebDriver driver)
	{
		element=driver.findElement(By.id("ApplicantFirstName"));
		return element;	
	}
	public static WebElement txtApplicantMiddleName(WebDriver driver)
	{
		element=driver.findElement(By.id("ApplicantMiddleName"));
		return element;	
	}
	
	public static WebElement txtApplicantLastName(WebDriver driver)
	{
		element=driver.findElement(By.id("ApplicantLastName"));
		return element;	
	}
	
	public static WebElement txtApplicantSSN(WebDriver driver)
	{
		element=driver.findElement(By.id("ApplicantSSN"));
		return element;	
	}
	
	public static WebElement CBIsSSNUnknown(WebDriver driver)
	{
		element=driver.findElement(By.id("IsSSNUnknown"));
		return element;	
	}
	
	public static WebElement CBIsDOBUnknown(WebDriver driver)
	{
		element=driver.findElement(By.id("IsDOBUnknown"));
		return element;	
	}
	
	public static WebElement txtApplicantDOB(WebDriver driver)
	{
		element=driver.findElement(By.id("ApplicantDOB"));
		return element;	
	}
	public static WebElement txtApplicantOtherAliases(WebDriver driver)
	{
		element=driver.findElement(By.id("ApplicantOtherAliases"));
		return element;	
	}
	public static WebElement txtApplicantInfo_StreetAddress(WebDriver driver)
	{
		element=driver.findElement(By.id("ApplicantInfo_StreetAddress"));
		return element;	
	}
	
	public static WebElement txtApplicantInfo_ZipCode(WebDriver driver)
	{
		element=driver.findElement(By.id("ApplicantInfo_ZipCode"));
		return element;	
	}
	
	public static WebElement txtApplicantInfo_City(WebDriver driver)
	{
		element=driver.findElement(By.id("ApplicantInfo_City"));
		return element;	
	}
	
	public static  Select DDLApplicantInfo_StateID(WebDriver driver)
	{
		Select stateSelect = new Select (driver.findElement(By.id("ApplicantInfo_StateID")));
		return stateSelect;	
	}
	
	
	public static WebElement txtEmployerDefendent(WebDriver driver)
	{
		element=driver.findElement(By.id("EmployerDefendent"));
		return element;
	}
//////////////
	public static WebElement txtCaseNumber(WebDriver driver)
	{
		element=driver.findElement(By.id("CaseNumber"));
		return element;
	}

///////////////	
	public static WebElement txtClaimFileNo(WebDriver driver)
	{
		element=driver.findElement(By.id("ClaimFileNo"));
		return element;
	}
	
	public static WebElement txtDateOfInjury(WebDriver driver)
	{
		element=driver.findElement(By.id("DateOfInjury"));
		return element;
	}
	
	public static WebElement txtAdditionalInfo(WebDriver driver)
	{
		element=driver.findElement(By.id("AdditionalInfo"));
		return element;
	}
	
	
	
	///////////////********************************************************** 2. Order Info
	
	public static WebElement RbtnOrderSubTypeID1(WebDriver driver)
	{
		element=driver.findElement(By.id("OrderSubTypeID1"));
		return element;	
	}
	public static WebElement txtOrderExtentionInfo_ADJWCABCaseNumber(WebDriver driver)
	{
		element=driver.findElement(By.id("OrderExtentionInfo_ADJWCABCaseNumber"));
		return element;	
	}
	
	public static WebElement RbtnOrderSubTypeID2(WebDriver driver)
	{
		element=driver.findElement(By.id("OrderSubTypeID2"));
		return element;	
	}
	
	public static WebElement RbtnOrderSubTypeID3(WebDriver driver)
	{
		element=driver.findElement(By.id("OrderSubTypeID3"));
		return element;	
	}
	public static WebElement RbtnOrderSubTypeID4(WebDriver driver)
	{
		element=driver.findElement(By.id("OrderSubTypeID4"));
		return element;
	}
	public static WebElement ClaimantAddress(WebDriver driver)
	{
		element=driver.findElement(By.xpath("/html/body/div[1]/section/div[2]/div/form/div[1]/div/div/div/div[2]/div/fieldset[1]/div[2]/div/div[2]/input"));
		return element;
	}


	public static WebElement AppAttorneyAddress(WebDriver driver)
	{
		element=driver.findElement(By.xpath("/html/body/div[1]/section/div[2]/div/form/div[1]/div/div/div/div[2]/div/fieldset[1]/div[2]/div/div[3]/input"));
		return element;	
	}

/*	public static WebElement RbtnOrderExtentionInfo_SignedReleaseSendTo(WebDriver driver)
	{
		element=driver.findElement(By.id("OrderExtentionInfo_SignedReleaseSendTo"));
		return element;	
	}*/
	
	public static WebElement RbtnOrderExtentionInfo_SignedReleaseSendTo(WebDriver driver)
	{
		element=driver.findElement(By.id("OrderExtentionInfo_SignedReleaseSendTo"));
		return element;	
	}
	
	public static WebElement txtOrderExtentionInfo_SignedReleaseSendToStreetAddress(WebDriver driver)
	{
		element=driver.findElement(By.id("OrderExtentionInfo_SignedReleaseSendToStreetAddress"));
		return element;	
	}
	
/*	public static WebElement txtStreetAddress(WebDriver driver)
	{
		element=driver.findElement(By.id("OrderExtentionInfo_SignedReleaseSendToStreetAddress"));
		return element;	
	}*/
	
	public static WebElement txtOrderExtentionInfo_SignedReleaseSendToZipCode(WebDriver driver)
	{
		element=driver.findElement(By.id("OrderExtentionInfo_SignedReleaseSendToZipCode"));
		return element;	
	}
	public static WebElement txtOrderExtentionInfo_SignedReleaseSendToCity(WebDriver driver)
	{
		element=driver.findElement(By.id("OrderExtentionInfo_SignedReleaseSendToCity"));
		return element;	
	}
	
	public static  Select DDLOrderExtentionInfo_SignedReleaseSendToStateId(WebDriver driver)
	{
		Select stateSelect = new Select (driver.findElement(By.id("OrderExtentionInfo_SignedReleaseSendToStateId")));
		return stateSelect;	
	}
	public static  WebElement PersonalApperanceSubtrue(WebDriver driver)
	{
		element=driver.findElement(By.id("IsPersonalApperanceSubpoenatrue"));
		return element;
		
	}
	
	public static  WebElement PersonalApperanceSubfalse(WebDriver driver)
	{
		element=driver.findElement(By.id("IsPersonalApperanceSubpoenafalse"));
		return element;
		
	}

	
	public static WebElement txtNameOfCourt(WebDriver driver)
	{
		element=driver.findElement(By.id("OrderExtentionInfo_NameOfCourt"));
		return element;
	}

	public static WebElement txtAppearDate(WebDriver driver)
	{
		element=driver.findElement(By.id("OrderExtentionInfo_AppearDate"));
		return element;
	}
	
	public static WebElement txtAppearTime(WebDriver driver)
	{
		element=driver.findElement(By.id("OrderExtentionInfo_AppearTimeValue"));
		return element;
	}
	
	public static WebElement txtNameOfPresidingJudge(WebDriver driver)
	{
		element=driver.findElement(By.id("OrderExtentionInfo_NameOfPresidingJudge"));
		return element;
	}
	public static  WebElement  WCABEDEXcheckNo(WebDriver driver)
	{
		element=driver.findElement(By.id("IsWCABEDEXRequestedNo"));
		return element;
		
	}
	public static  WebElement  WCABEDEXcheckYes(WebDriver driver)
	{
		element=driver.findElement(By.id("IsWCABEDEXRequestedYes"));
		return element;
		
	}
	public static  WebElement txtSSN(WebDriver driver)
	{
		element=driver.findElement(By.id("ApplicantSSNWorkdComp"));
		return element;
		
	}
	public static  WebElement ODTAsap(WebDriver driver)
	{
		element=driver.findElement(By.id("RequestedDeliveryTimeFrameTypeID1"));
		return element;
		
	}
	public static  WebElement ODTRush(WebDriver driver)
	{
		element=driver.findElement(By.id("RequestedDeliveryTimeFrameTypeID2"));
		return element;
		
	}
	public static  WebElement ODTOther(WebDriver driver)
	{
		element=driver.findElement(By.id("RequestedDeliveryTimeFrameTypeID3"));
		return element;
		
	}	
	public static  WebElement OrderExtentionInfo_RequestedDeliveryDate(WebDriver driver)
	{
		element=driver.findElement(By.id("OrderExtentionInfo_RequestedDeliveryDate"));
		return element;
		
	}
	
	
	///////////////********************************************************** 3. Carrier/Attorney
	
	public static  Select DDLExistingExaminer(WebDriver driver)
	{
		Select ExaminerOrAdjustorSelect = new Select (driver.findElement(By.id("ExistingExaminer")));
		return ExaminerOrAdjustorSelect;	
	}
	public static WebElement txtExaminerFirstName(WebDriver driver) 
	{

		element = driver.findElement(By.id("ExaminerFirstName"));
        return element;
	}
	
	public static WebElement txtExaminerLastName(WebDriver driver) 
	{

		element = driver.findElement(By.id("ExaminerLastName"));
        return element;
	}
	
	public static WebElement txtExaminerCompanyName(WebDriver driver) 
	{
	
		element = driver.findElement(By.id("ExaminerCompanyName"));
        return element;
	}
	
	
	public static WebElement txtExaminerPhoneNumber(WebDriver driver) 
	{
	
		element = driver.findElement(By.id("ExaminerPhoneNumber"));
        return element;
	}
	
	public static WebElement txtExaminerPhoneNumberExt(WebDriver driver) 
	{

		element = driver.findElement(By.id("ExaminerPhoneNumberExt"));
        return element;
	}
	public static WebElement txtExaminerFaxNumber(WebDriver driver) 
	{

		element = driver.findElement(By.id("ExaminerFaxNumber"));
        return element;
	}
	
	public static WebElement txtExaminerEmailAddress(WebDriver driver) 
	{

		element = driver.findElement(By.id("ExaminerEmailAddress"));
        return element;
	}	
	
	public static WebElement txtExaminerStreetAddress(WebDriver driver) 
	{

		element = driver.findElement(By.id("ExaminerStreetAddress"));
        return element;
	}	
	
	public static WebElement txtExaminerZipCode(WebDriver driver) 
	{

		element = driver.findElement(By.id("ExaminerZipCode"));
        return element;
	}	
	
	public static WebElement txtExaminerCity(WebDriver driver) 
	{

		element = driver.findElement(By.id("ExaminerCity"));
        return element;
	}		
	public static  Select DDLExaminerCompanyInfo_StateId(WebDriver driver)
	{
		Select StateSelect = new Select (driver.findElement(By.id("ExaminerCompanyInfo_StateId")));
		return StateSelect;	
	}
	
	public static WebElement yes_IsDefenseAttorneyAssigned(WebDriver driver) 
	{

		element = driver.findElement(By.id("yes_IsDefenseAttorneyAssigned"));
        return element;
	}
	public static WebElement no_IsDefenseAttorneyAssigned(WebDriver driver) 
	{

		element = driver.findElement(By.id("no_IsDefenseAttorneyAssigned"));
        return element;
	}
	
	public static  Select DDLExistingDefeneseAttorney(WebDriver driver)
	{
		Select DefeneseAttorneyName = new Select (driver.findElement(By.id("ExistingDefeneseAttorney")));
		return DefeneseAttorneyName;	
	}
// Case There is a Defense attorney	
	public static WebElement txtDefenseAttorneyFirstName(WebDriver driver) 
	{

		element = driver.findElement(By.id("DefenseAttorneyFirstName"));
        return element;
	}	
	
	public static WebElement txtDefenseAttorneyLastName(WebDriver driver) 
	{

		element = driver.findElement(By.id("DefenseAttorneyLastName"));
        return element;
	}	
	
	public static WebElement txtDefenseAttorneyCompanyName(WebDriver driver) 
	{

		element = driver.findElement(By.id("DefenseAttorneyCompanyName"));
        return element;
	}	
	
	public static WebElement txtDefenseAttorneyPhoneNumber(WebDriver driver) 
	{

		element = driver.findElement(By.id("DefenseAttorneyPhoneNumber"));
        return element;
	}	
	
	public static WebElement txtDefenseAttorneyPhoneNumberExt(WebDriver driver) 
	{

		element = driver.findElement(By.id("DefenseAttorneyPhoneNumberExt"));
        return element;
	}	
	
	public static WebElement txtDefenseAttorneyFaxNumber(WebDriver driver) 
	{

		element = driver.findElement(By.id("DefenseAttorneyFaxNumber"));
        return element;
	}	
	
	public static WebElement txtDefenseAttorneyEmailAddress(WebDriver driver) 
	{

		element = driver.findElement(By.id("DefenseAttorneyEmailAddress"));
        return element;
	}	
	
	public static WebElement txtDefenseAttorneyStreetAddress(WebDriver driver) 
	{

		element = driver.findElement(By.id("DefenseAttorneyStreetAddress"));
        return element;
	}	
	
	public static WebElement txtDefenseAttorneyZipCode(WebDriver driver) 
	{

		element = driver.findElement(By.id("DefenseAttorneyZipCode"));
        return element;
	}	
	
	public static WebElement txtDefenseAttorneyCity(WebDriver driver) 
	{

		element = driver.findElement(By.id("DefenseAttorneyCity"));
        return element;
	}	
	
	public static Select txtDefenseAttorneyCompanyInfo_StateId(WebDriver driver) 
	{
		Select DefenseAttorneyCompanyInfo_StateId = new Select (driver.findElement(By.id("DefenseAttorneyCompanyInfo_StateId")));
		return DefenseAttorneyCompanyInfo_StateId;	
	}	

	// Case There is a Applicant attorney	
	public static WebElement yes_IsApplicantAttorneyAssigned(WebDriver driver) 
	{

		element = driver.findElement(By.id("yes_IsApplicantAttorneyAssigned"));
        return element;
	}	
	
	public static WebElement no_IsApplicantAttorneyAssigned(WebDriver driver) 
	{

		element = driver.findElement(By.id("no_IsApplicantAttorneyAssigned"));
        return element;
	}	
	
	public static  Select DDLExistingApplicantAttorney(WebDriver driver)
	{
		Select ApplicantAttorneyName = new Select (driver.findElement(By.id("ExistingApplicantAttorney")));
		return ApplicantAttorneyName;	
	}
	public static WebElement txtApplicantAttorneyFirstName(WebDriver driver) 
	{

		element = driver.findElement(By.id("ApplicantAttorneyFirstName"));
        return element;
	}	
	
	public static WebElement txtApplicantAttorneyLastName(WebDriver driver) 
	{
		
		element = driver.findElement(By.id("ApplicantAttorneyLastName"));
        return element;
	}		
	
	public static WebElement txtApplicantAttorneyCompanyName(WebDriver driver) 
	{
	
		element = driver.findElement(By.id("ApplicantAttorneyCompanyName"));
        return element;
	}	
	
	public static WebElement txtApplicantAttorneyPhoneNumber(WebDriver driver) 
	{

		element = driver.findElement(By.id("ApplicantAttorneyPhoneNumber"));
        return element;
	}	
	
	public static WebElement txtApplicantAttorneyPhoneNumberExt(WebDriver driver) 
	{

		element = driver.findElement(By.id("ApplicantAttorneyPhoneNumberExt"));
        return element;
	}	
	
	public static WebElement txtApplicantAttorneyFaxNumber(WebDriver driver) 
	{

		element = driver.findElement(By.id("ApplicantAttorneyFaxNumber"));
        return element;
	}	
	
	public static WebElement txtApplicantAttorneyEmailAddress(WebDriver driver) 
	{

		element = driver.findElement(By.id("ApplicantAttorneyEmailAddress"));
        return element;
	}	
	
	public static WebElement txtApplicantAttorneyStreetAddress(WebDriver driver) 
	{

		element = driver.findElement(By.id("ApplicantAttorneyStreetAddress"));
        return element;
	}	
	
	public static WebElement txtApplicantAttorneyZipCode(WebDriver driver) 
	{

		element = driver.findElement(By.id("ApplicantAttorneyZipCode"));
        return element;
	}	
	
	public static WebElement txtApplicantAttorneyCity(WebDriver driver) 
	{

		element = driver.findElement(By.id("ApplicantAttorneyCity"));
        return element;
	}	
	
	public static Select DDLApplicantAttorneyCompanyInfo_StateId(WebDriver driver) 
	{
		Select ApplicantAttorneyCompanyInfo_StateId = new Select (driver.findElement(By.id("ApplicantAttorneyCompanyInfo_StateId")));
		return ApplicantAttorneyCompanyInfo_StateId;	
	}	
	
	
	///////////////********************************************************** 4. Locations
	

	public static  Select LocationName(WebDriver driver)
	{
		Select LocationSelect = new Select (driver.findElement(By.xpath("/html/body/div[1]/section/div[2]/div/form/div[1]/div/div/div/div[3]/div/div[2]/div[1]/div[2]/fieldset/div[1]/div[1]/div[2]/select")));
		return LocationSelect;	
	}
	public static WebElement txtLocationName(WebDriver driver)
	{
		element=driver.findElement(By.xpath("/html/body/div[1]/section/div[2]/div/form/div[1]/div/div/div/div[3]/div/div[2]/div[1]/div[2]/fieldset/div[2]/div[1]/div[2]/input"));
		return element;	
	}
	public static WebElement txtLocationstreetAddress(WebDriver driver)
	{
		element=driver.findElement(By.xpath("/html/body/div[1]/section/div[2]/div/form/div[1]/div/div/div/div[3]/div/div[2]/div[1]/div[2]/fieldset/div[2]/div[2]/div[2]/input"));
		return element;	
	}
	
	public static WebElement txtLocationZipCode(WebDriver driver)
	{
		element=driver.findElement(By.xpath("/html/body/div[1]/section/div[2]/div/form/div[1]/div/div/div/div[3]/div/div[2]/div[1]/div[2]/fieldset/div[2]/div[3]/div[2]/div/input"));
		return element;	
	}
	
	public static WebElement txtLocationCity(WebDriver driver)
	{
		element=driver.findElement(By.xpath("/html/body/div[1]/section/div[2]/div/form/div[1]/div/div/div/div[3]/div/div[2]/div[1]/div[2]/fieldset/div[2]/div[3]/div[3]/div[2]/input"));
		return element;	
	}
	public static  Select Locationstate(WebDriver driver)
	{
		Select LocationstateSelect = new Select (driver.findElement(By.xpath("/html/body/div[1]/section/div[2]/div/form/div[1]/div/div/div/div[3]/div/div[2]/div[1]/div[2]/fieldset/div[2]/div[3]/div[4]/div[2]/select")));
		return LocationstateSelect;	
	}
	public static WebElement txtphonenumber(WebDriver driver)
	{
		element=driver.findElement(By.xpath("/html/body/div[1]/section/div[2]/div/form/div[1]/div/div/div/div[3]/div/div[2]/div[1]/div[2]/fieldset/div[2]/div[4]/div[2]/div[1]/input"));
		return element;
	}
	public static WebElement txtExt(WebDriver driver)
	{
		element=driver.findElement(By.xpath("/html/body/div[1]/section/div[2]/div/form/div[1]/div/div/div/div[3]/div/div[2]/div[1]/div[2]/fieldset/div[2]/div[4]/div[2]/div[2]/div[2]/input"));
		return element;
	}
	public static WebElement txtfaxnumber(WebDriver driver)
	{
		element=driver.findElement(By.xpath("/html/body/div[1]/section/div[2]/div/form/div[1]/div/div/div/div[3]/div/div[2]/div[1]/div[2]/fieldset/div[2]/div[5]/div[2]/input"));
		return element;	
	}
	public static WebElement Medical(WebDriver driver)
	{
		element=driver.findElement(By.xpath("/html/body/div[1]/section/div[2]/div/form/div[1]/div/div/div/div[3]/div/div[2]/div[1]/div[2]/fieldset/div[2]/div[6]/div/table/tbody/tr[1]/td[1]/input"));
		return element;
	}
	public static WebElement Billing(WebDriver driver)
	{
		element=driver.findElement(By.xpath("/html/body/div[1]/section/div[2]/div/form/div[1]/div/div/div/div[3]/div/div[2]/div[1]/div[2]/fieldset/div[2]/div[6]/div/table/tbody/tr[2]/td[1]/input"));
		return element;
	}
	public static WebElement Attorney(WebDriver driver)
	{
		element=driver.findElement(By.xpath("/html/body/div[1]/section/div[2]/div/form/div[1]/div/div/div/div[3]/div/div[2]/div[1]/div[2]/fieldset/div[2]/div[6]/div/table/tbody/tr[3]/td[1]/input"));
		return element;
	}
	public static WebElement Insurance(WebDriver driver)
	{
		element=driver.findElement(By.xpath("/html/body/div[1]/section/div[2]/div/form/div[1]/div/div/div/div[3]/div/div[2]/div[1]/div[2]/fieldset/div[2]/div[6]/div/table/tbody/tr[1]/td[4]/input"));
		return element;
	}
	public static WebElement XRayReportsOnly(WebDriver driver)
	{
		element=driver.findElement(By.xpath("/html/body/div[1]/section/div[2]/div/form/div[1]/div/div/div/div[3]/div/div[2]/div[1]/div[2]/fieldset/div[2]/div[6]/div/table/tbody/tr[2]/td[4]/input"));
		return element;
	}
	public static WebElement Other(WebDriver driver)
	{
		element=driver.findElement(By.xpath("/html/body/div[1]/section/div[2]/div/form/div[1]/div/div/div/div[3]/div/div[2]/div[1]/div[2]/fieldset/div[2]/div[6]/div/table/tbody/tr[3]/td[4]/input"));
		return element;
	}
	public static WebElement Employment(WebDriver driver)
	{
		element=driver.findElement(By.xpath("/html/body/div[1]/section/div[2]/div/form/div[1]/div/div/div/div[3]/div/div[2]/div[1]/div[2]/fieldset/div[2]/div[6]/div/table/tbody/tr[1]/td[7]/input"));
		return element;
	}
	public static WebElement XRay(WebDriver driver)
	{
		element=driver.findElement(By.xpath("/html/body/div[1]/section/div[2]/div/form/div[1]/div/div/div/div[3]/div/div[2]/div[1]/div[2]/fieldset/div[2]/div[6]/div/table/tbody/tr[2]/td[7]/input"));
		return element;
	}
	public static  WebElement txtOtherAdditionalInfo(WebDriver driver)
	{
		element=driver.findElement(By.xpath("/html/body/div[1]/section/div[2]/div/form/div[1]/div/div/div/div[3]/div/div[2]/div[1]/div[2]/fieldset/div[2]/div[6]/div/div/input"));
		return element;
	}
	public static  WebElement txtLocationAdditionalInfo(WebDriver driver)
	{
		element=driver.findElement(By.xpath("/html/body/div[1]/section/div[2]/div/form/div[1]/div/div/div/div[3]/div/div[2]/div[1]/div[2]/fieldset/div[4]/div/textarea"));
		return element;
	}
	public static  WebElement RecordsSummaryRequestedTrue(WebDriver driver)
	{
		element=driver.findElement(By.xpath("/html/body/div[1]/section/div[2]/div/form/div[1]/div/div/div/div[3]/div/div[2]/div[1]/div[2]/fieldset/div[5]/div/div[2]/input"));
		return element;
		
	}
	public static  WebElement RecordsSummaryRequestedFalse(WebDriver driver)
	{
		element=driver.findElement(By.xpath("/html/body/div[1]/section/div[2]/div/form/div[1]/div/div/div/div[3]/div/div[2]/div[1]/div[2]/fieldset/div[5]/div/div[3]/input"));
		return element;
		
	}
	

	
	
	///////////////********************************************************** 5. Shipment & Billing
	
	public static  WebElement ExaminerAdjustor(WebDriver driver)
	{
		element = driver.findElement(By.id("OrderShippingParty_Examiner_Adjustor"));
		return element;	
	}

	
	////////////////////// Shipment 2
	
	public static WebElement DistributionMethodDownloadonly(WebDriver driver)
	{
		element=driver.findElement(By.xpath("/html/body/div[1]/section/div[2]/div/form/div[1]/div/div/div/div[4]/div/fieldset[1]/div[1]/div[3]/div[2]/div[1]/div/div[1]/input"));
		return element;	
	}
	public static WebElement DistributionMethodbyMail(WebDriver driver)
	{
		element=driver.findElement(By.xpath("/html/body/div[1]/section/div[2]/div/form/div[1]/div/div/div/div[4]/div/fieldset[1]/div[1]/div[3]/div[2]/div[1]/div/div[2]/input"));
		return element;	
	}

	
	
	public static  WebElement shippingPaper(WebDriver driver)
	{
		element = driver.findElement(By.id("shippingPartyTypes_dd211730-36c5-41b3-8b93-94f747003451__OrderShippingParty_Paper"));
		return element;	
	}
	public static  WebElement txtshippingNoOfPaperCopies(WebDriver driver)
	{
		element = driver.findElement(By.id("shippingPartyTypes_dd211730-36c5-41b3-8b93-94f747003451__NoOfPaperCopies"));
		return element;	
	}
	public static  WebElement shippingCD(WebDriver driver)
	{
		element = driver.findElement(By.id("shippingPartyTypes_dd211730-36c5-41b3-8b93-94f747003451__OrderShippingParty_CD"));
		return element;	
	}
	public static  WebElement txtshippingNoOfCDCopies(WebDriver driver)
	{
		element = driver.findElement(By.id("shippingPartyTypes_dd211730-36c5-41b3-8b93-94f747003451__NoOfCDCopies"));
		return element;	
	}

	public static  WebElement additionaldistributions(WebDriver driver)
	{
		element = driver.findElement(By.id("OrderShippingParty_additional_distributions"));
		return element;	
	}
	public static  WebElement Paper(WebDriver driver)
	{
		element = driver.findElement(By.id("AdditionalDistributions_66d71714-add7-49f1-86fa-c0267c683676__OrderShippingParty_Paper"));
		return element;	
	}
	public static  WebElement txtNoOfPaperCopies(WebDriver driver)
	{
		element =driver.findElement(By.id("AdditionalDistributions_66d71714-add7-49f1-86fa-c0267c683676__NoOfPaperCopies"));
		return element;	
	}
	public static  WebElement CD(WebDriver driver)
	{
		element = driver.findElement(By.id("AdditionalDistributions_66d71714-add7-49f1-86fa-c0267c683676__OrderShippingParty_CD"));
		return element;	
	}
	public static  WebElement txtNoOfCDCopies(WebDriver driver)
	{
		element = driver.findElement(By.id("AdditionalDistributions_66d71714-add7-49f1-86fa-c0267c683676__NoOfCDCopies"));
		return element;	
	}
	public static WebElement txtname(WebDriver driver)
	{
		element=driver.findElement(By.id("AdditionalDistributions_66d71714-add7-49f1-86fa-c0267c683676__PartyName"));
		return element;	
	}
	public static WebElement txtbusinessname(WebDriver driver)
	{
		element=driver.findElement(By.id("AdditionalDistributions_66d71714-add7-49f1-86fa-c0267c683676__BusinessName"));
		return element;	
	}
	public static WebElement txtstreetaddress(WebDriver driver)
	{
		element=driver.findElement(By.id("AdditionalDistributions_66d71714-add7-49f1-86fa-c0267c683676__StreetAddress"));
		return element;	
	}
	public static WebElement txtShipmentZipCode(WebDriver driver)
	{
		element=driver.findElement(By.id("AdditionalDistributions_66d71714-add7-49f1-86fa-c0267c683676__ZipCode"));
		return element;	
	}
	
	public static WebElement txtShipmentCity(WebDriver driver)
	{
		element=driver.findElement(By.id("AdditionalDistributions_66d71714-add7-49f1-86fa-c0267c683676__City"));
		return element;	
	}
	public static  Select DDLShipmentstate(WebDriver driver)
	{
		Select stateSelect = new Select (driver.findElement(By.id("AdditionalDistributions_66d71714-add7-49f1-86fa-c0267c683676__StateId")));
		return stateSelect;	
	}
	public static WebElement txtShipmentphonenumber(WebDriver driver)
	{
		element=driver.findElement(By.id("AdditionalDistributions_66d71714-add7-49f1-86fa-c0267c683676__PhoneNumber"));
		return element;
	}
	public static WebElement txtShipmentExt(WebDriver driver)
	{
		element=driver.findElement(By.id("AdditionalDistributions_66d71714-add7-49f1-86fa-c0267c683676__PhoneNumberExt"));
		return element;
	}
	public static WebElement txtShipmentfaxnumber(WebDriver driver)
	{
		element=driver.findElement(By.id("AdditionalDistributions_66d71714-add7-49f1-86fa-c0267c683676__FaxNumber"));
		return element;	
	}
/////////////
	
	public static WebElement SendInvoiceYes(WebDriver driver)
	{
		element=driver.findElement(By.xpath("/html/body/div[1]/section/div[2]/div/form/div[1]/div/div/div/div[4]/div/fieldset[2]/div[2]/div/div[1]/input"));
		return element;	
	}
	public static WebElement SendInvoiceNo(WebDriver driver)
	{
		element=driver.findElement(By.xpath("/html/body/div[1]/section/div[2]/div/form/div[1]/div/div/div/div[4]/div/fieldset[2]/div[2]/div/div[2]/input"));
		return element;	
	}
	
//////////////
	public static  WebElement txtfirstname(WebDriver driver)
	{
		element=driver.findElement(By.id("OrderBillingPartyInfo_FirstName"));
		return element;
	}
	public static  WebElement txtLastname(WebDriver driver)
	{
		element=driver.findElement(By.id("OrderBillingPartyInfo_LastName"));
		return element;
	}
	public static  WebElement txtcompanyname(WebDriver driver)
	{
		element=driver.findElement(By.id("OrderBillingPartyInfo_CompanyName"));
		return element;
	}
	public static WebElement txtbillingphonenumber(WebDriver driver)
	{
		element=driver.findElement(By.id("OrderBillingPartyInfo_PhoneNumber"));
		return element;
	}
	public static WebElement txtbillingExt(WebDriver driver)
	{
		element=driver.findElement(By.id("OrderBillingPartyInfo_PhoneNumberExt"));
		return element;
	}
	public static WebElement txtbillingfaxnumber(WebDriver driver)
	{
		element=driver.findElement(By.id("OrderBillingPartyInfo_FaxNumber"));
		return element;	
	}
	public static WebElement txtEmailAddress(WebDriver driver)
	{
		element=driver.findElement(By.id("OrderBillingPartyInfo_EmailAddress"));
		return element;	
	}
	public static WebElement txtbillingstreetaddress(WebDriver driver)
	{
		element=driver.findElement(By.id("OrderBillingPartyInfo_StreetAddress"));
		return element;	
	}
	public static WebElement txtbillingZipCode(WebDriver driver)
	{
		element=driver.findElement(By.id("OrderBillingPartyInfo_ZipCode"));
		return element;	
	}
	
	public static WebElement txtbillingCity(WebDriver driver)
	{
		element=driver.findElement(By.id("CityBilling"));
		return element;	
	}
	public static  Select DLLbillingstate(WebDriver driver)
	{
		Select stateSelect = new Select (driver.findElement(By.id("OrderBillingPartyInfo_StateId")));
		return stateSelect;	
	}
	
	///////////////********************************************************** 6. Attachments
	
	public static WebElement Btnfileupload(WebDriver driver)
	{
		element=driver.findElement(By.id("fileupload"));
		return element;	
	}	
	
	
	///////////////********************************************************** 7. Verify & Submit Order
	
	
	public static WebElement BtnClaimantProceedbutton(WebDriver driver) 
	{

		element = driver.findElement(By.xpath("/html/body/div[1]/section/div[2]/div/form/div[1]/div/div/div/div[1]/div/button[1]"));
        return element;
	}	
	public static WebElement BtnOrderInfoProceedbutton(WebDriver driver) 
	{

		element = driver.findElement(By.xpath("/html/body/div[1]/section/div[2]/div/form/div[1]/div/div/div/div[2]/div/div[3]/button[1]"));
        return element;
	}	
	public static WebElement BtnCarrierProceedbutton(WebDriver driver) 
	{

		element = driver.findElement(By.xpath("/html/body/div[1]/section/div[2]/div/form/div[1]/div/div/div/div[3]/div/button[1]"));
        return element;
	}	
	public static WebElement BtnLocationProceedbutton(WebDriver driver) 
	{

		element = driver.findElement(By.xpath("/html/body/div[1]/section/div[2]/div/form/div[1]/div/div/div/div[4]/div/div[4]/button[1]"));
        return element;
	}	
	public static WebElement BtnShipmentProceedbutton(WebDriver driver) 
	{

		element = driver.findElement(By.xpath("/html/body/div[1]/section/div[2]/div/form/div[1]/div/div/div/div[5]/div/div[2]/button[1]"));
        return element;
	}
	
	
	public static WebElement BtnAttachmentsProceedbutton(WebDriver driver) 
	{

		element = driver.findElement(By.xpath("/html/body/div[1]/section/div[2]/div/form/div[1]/div/div/div/div[6]/div/button[1]"));
        return element;
	}	
	
	public static WebElement BtnSaveToCompleteLateBtn(WebDriver driver) 
	{

		element = driver.findElement(By.id("SaveToCompleteLateBtn"));
        return element;
	}	
	public static WebElement BtnPlaceOrder(WebDriver driver) 
	{

		//element = driver.findElement(By.id("btn btn-inverse"));
		element = driver.findElement(By.xpath("/html/body/div[1]/section/div[2]/div/form/div[1]/div/div/div/div[6]/button[2]"));
		
        return element;
	}
	
	/////////////////////////////////////
	
	public static WebElement BtnCivil_CarrierProceedbutton(WebDriver driver) 
	{

		element = driver.findElement(By.xpath("/html/body/div[1]/section/div[2]/div/form/div[1]/div/div/div/div[2]/div/button[1]"));
        return element;
	}
	public static WebElement BtnCivil_LocationsProceedbutton(WebDriver driver) 
	{

		element = driver.findElement(By.xpath("/html/body/div[1]/section/div[2]/div/form/div[1]/div/div/div/div[3]/div/div[4]/button[1]"));
        return element;
	}
	public static WebElement BtnCivil_ShipmentProceedbutton(WebDriver driver) 
	{

		element = driver.findElement(By.xpath("/html/body/div[1]/section/div[2]/div/form/div[1]/div/div/div/div[4]/div/div[2]/button[1]"));
        return element;
	}
	public static WebElement BtnCivil_AttachmentsProceedbutton(WebDriver driver) 
	{

		element = driver.findElement(By.xpath("/html/body/div[1]/section/div[2]/div/form/div[1]/div/div/div/div[5]/div/button[1]"));
        return element;
	}


}
