package ObjectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
	private static WebElement element = null;

	public static WebElement txt_UserName(WebDriver driver) {
		// TODO Auto-generated method stub
		element = driver.findElement(By.name("UserName"));
        return element;
	}
	public static WebElement txt_Password(WebDriver driver) {
		// TODO Auto-generated method stub
		element = driver.findElement(By.id("Password"));
        return element;
	}
	public static WebElement btn_Signin(WebDriver driver) {
		// TODO Auto-generated method stub
		element = driver.findElement(By.id("loginbutton"));
        return element;
	}
	public static WebElement linkForgotUsername(WebDriver driver)
	{
		element=driver.findElement(By.xpath("/html/body/div[1]/section/div[1]/div[2]/div/div/div[2]/div/form/div[6]/a"));
		return element;
	}
	public static WebElement linkForgotPassword(WebDriver driver)
	{
		element=driver.findElement(By.xpath("/html/body/div[1]/section/div[1]/div[2]/div/div/div[2]/div/form/div[13]/a"));
		return element;
	}
	public static WebElement btnRegister(WebDriver driver)
	{
		element=driver.findElement(By.xpath("/html/body/div[1]/section/div[1]/div[2]/div/div/div[2]/div/form/div[16]/a"));
		return element;
	}
	
	
}
