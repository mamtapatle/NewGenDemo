package pageObjcets;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import baseClassPKG.BaseClass;

public class LoginPage extends BaseClass {
	
	public WebDriver driver;
	
	public LoginPage(WebDriver driver)//remote driver
	{
		this.driver=driver;
		PageFactory.initElements(driver,LoginPage.this);
	}
	
	
	@FindBy(xpath="//input[@name='username']")
	WebElement username;
	
	@FindBy(xpath="//input[@name='password']")
	WebElement password;
	
	@FindBy(xpath="//button[@type='submit']")
	WebElement loginBtn;
	
	
	
	public void enterUsername(String uName)
	{
		sendKeysMethod(driver, username, 10, uName);
		
		
	}
	
	public void enterPassword(String pName)
	{
		sendKeysMethod(driver, password, 10, pName);
	}
	
	public void enterLoginBtn()
	{
		clickMethod(driver, loginBtn, 10);
	}

	
	public void sendKeysMethod(WebDriver driver,WebElement element,int time,String value)
	{
		new WebDriverWait(driver, Duration.ofSeconds(time)).until(ExpectedConditions.visibilityOf(element)).sendKeys(value);
	}
	
	public void clickMethod(WebDriver driver,WebElement element, int time)
	{
		new WebDriverWait(driver, Duration.ofSeconds(time)).until(ExpectedConditions.visibilityOf(element)).click();
	}


}
