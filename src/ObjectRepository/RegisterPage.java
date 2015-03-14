
package ObjectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class RegisterPage {

	private static WebElement element = null;
			
	public static WebElement txtFirstName(WebDriver driver)
	{
		element=driver.findElement(By.id("FirstName"));
		return element;
		
	}
	
	public static WebElement insertLastName(WebDriver driver)
	{
		element=driver.findElement(By.id("LastName"));
		return element;
		
	}
	
	public static WebElement insertCompanyName(WebDriver driver)
	{
		element=driver.findElement(By.id("CompanyName"));
		return element;
		
	}
	
	public static  Select selectJobTitle(WebDriver driver)
	{
		Select wannabeSelect = new Select (driver.findElement(By.id("ddlUserJobTitle")));
		return wannabeSelect;
		
	}
	
	public static  WebElement insertEmailAddress(WebDriver driver)
	{
		element=driver.findElement(By.id("EmailAddress"));
		return element;
		
	}
	
	public static WebElement insertUserName(WebDriver driver)
	{
		element=driver.findElement(By.id("UserName"));
		return element;
	}

	public static WebElement insertPassword(WebDriver driver)
	{
		element=driver.findElement(By.id("Password"));
		return element;
	}
	
	public static WebElement confirmPassword(WebDriver driver)
	{
		element=driver.findElement(By.id("ConfirmPassword"));
		return element;
	}
	
	public static WebElement AcceptsTerms(WebDriver driver)
	{
		element=driver.findElement(By.id("AcceptsTerms"));
		return element;
	}

	public static WebElement register(WebDriver driver)
	{
		element=driver.findElement(By.id("registerButton"));
		return element;
	}
	
	public static WebElement placeorderOnline(WebDriver driver)
	{
		element=driver.findElement(By.xpath("html/body/div[1]/section/div/div[2]/div[1]/div/button"));
		return element;
	}
	
	public static WebElement NotNow(WebDriver driver)
	{
		element=driver.findElement(By.xpath("html/body/div[1]/section/div/div[2]/div[1]/div/a"));
		return element;
	}
	
	public static WebElement Continue(WebDriver driver)
	{
		element=driver.findElement(By.xpath("html/body/div[1]/section/div/div[2]/div[1]/div/div[3]/div[4]/button"));
		return element;
	}
	
	public static WebElement Cancel(WebDriver driver)
	{
		element=driver.findElement(By.xpath(".//*[@id='ordertypesDiv']/div[4]/a"));
		return element;
	}
	
	public static  WebElement SelectWorkComp (WebDriver driver)
	{
		element=driver.findElement(By.xpath(".//*[@id='ordertypesDiv']/div[3]/input[1]"));
		return element;
		
	}

	

}

