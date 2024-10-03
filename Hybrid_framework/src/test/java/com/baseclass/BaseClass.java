package com.baseclass;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import javax.print.attribute.standard.Destination;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	
	
	public static WebDriver driver;
	public static Properties prop;
	
	@BeforeMethod
	public void launchBrowser() throws FileNotFoundException
	{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		prop=new Properties();
		String filePath=".\\src\\test\\resources\\config.properties";
	//	String fis = System.getProperty("user.dir")+"//src//test//resources//config.properties";
	//	FileInputStream fis=new FileInputStream(("user.dir")+"/src/test/resources/config.properties");
		FileInputStream fis;
		try {
			fis =new FileInputStream(filePath);
			prop.load(fis);
	
		}
		catch(Exception e)
		{
		e.getStackTrace();
		}
		String getUrl=prop.getProperty("Url");
		
		
		
		driver.manage().window().maximize();	
		driver.get(getUrl);
		
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
	
	
	
	

}
