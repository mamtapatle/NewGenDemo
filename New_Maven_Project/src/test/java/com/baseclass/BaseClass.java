package com.baseclass;

import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	
	public WebDriver driver;
	public Properties prop;
	
	@Test
	
	public void launchBrowser() 
	{
		
		WebDriverManager.chromedriver().setup();
		prop=new Properties();
		String filePath=".\\src\\test\\resource\\config.properties";
		FileInputStream fis;
		try {
			fis = new FileInputStream(filePath);
			prop.load(fis);
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
		String getURL=prop.getProperty("url");
		//System.out.println(getURL);
		
		driver=new ChromeDriver();
		driver.manage().window().maximize();	
		driver.get(getURL);
	}

}
