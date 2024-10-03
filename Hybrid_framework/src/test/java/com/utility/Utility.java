package com.utility;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Utility {

	public static String getscreenShot(WebDriver driver,String testName) throws IOException
	{
		TakesScreenshot ts=(TakesScreenshot)driver;
		String path=".\\ScreenShot";
		File destination= new File(path,testName+".png");
		
		File source = ts.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(source, destination);
		
		String actualPath=destination.getAbsolutePath();
		return actualPath;
		
	}
	
	
	
}
