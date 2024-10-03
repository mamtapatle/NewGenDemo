package com.testclass;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.baseclass.BaseClass;
import com.pageObject.LoginPage;
import com.pageObject.SubPage;
import com.utility.Utility;

public class LoginPageTest extends BaseClass{
	
	//WebDriver driver;//local driver 
	
	//constructor
//	public LoginPageTest(WebDriver driver)
//
//	{
//		this.driver=driver;
//		PageFactory.initElements(driver,this);
//	}
	
    @Test
	public void TC_login() throws IOException, InterruptedException
	{
		String username=prop.getProperty("Username");
		String password=prop.getProperty("Password");
		LoginPage lp=new LoginPage(driver);
		lp.enterUsername(username);
		lp.enterPassword(password);
		lp.enterLoginBtn();
		String testName=lp.getClass().getName();
		Thread.sleep(3000);
		Utility.getscreenShot(driver, testName );
		
	}
	
    
    @Test
    public void TC_SubPage() throws IOException, InterruptedException
    {
    	String username=prop.getProperty("Username");
		String password=prop.getProperty("Password");
		LoginPage lp=new LoginPage(driver);
		lp.enterUsername(username);
		lp.enterPassword(password);
		lp.enterLoginBtn();
    	String name=prop.getProperty("Name");
    	SubPage sp=new SubPage(driver);
    	sp.clickTime();
    	sp.enterUsername(name);
    	sp.enterSubmitBtn();
    	String testName=sp.getClass().getName();
    	Thread.sleep(3000);
    	Utility.getscreenShot(driver, testName );
    }
			
			
}
