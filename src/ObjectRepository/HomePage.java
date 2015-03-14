package ObjectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {

	private static WebElement element = null;

	public static WebElement btnSignIn(WebDriver driver) {
		// TODO Auto-generated method stub
		element = driver.findElement(By.xpath("html/body/header/div/div[1]/div/div[1]/ul/li[3]/a/i"));
        return element;
	}
	
	public static WebElement btnRegister(WebDriver driver)
	{
		element=driver.findElement(By.xpath(".//*[@id='top-menu']/ul/li[4]/a"));
		return element;
	}
	
}
