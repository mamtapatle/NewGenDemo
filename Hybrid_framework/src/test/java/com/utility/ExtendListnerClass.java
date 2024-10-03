package com.utility;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import com.baseclass.BaseClass;

public class ExtendListnerClass  extends BaseClass implements ITestListener{
	
	ExtentSparkReporter spark;
	ExtentReports reports;
	ExtentTest test;
	public void extendReportingStart()
	{
		String timestamp=new SimpleDateFormat("yyyy.mm.dd hh.mm.ss").format(new Date());
		String reportName="OrangeHRM"+timestamp+".html";
		spark=new ExtentSparkReporter(System.getProperty("user.dir")+"//Reports//"+ reportName);
				reports = new ExtentReports();
		reports.attachReporter(spark);
		reports.setSystemInfo("username", "mamta");
		
		spark.config().setDocumentTitle("This is my document");
		spark.config().setReportName(reportName);
		spark.config().setTheme(Theme.DARK);
	}
	
	@Override
	public void onTestStart(ITestResult result) {
		
		extendReportingStart();
	}

	@Override
	public void onTestFailure(ITestResult result) {
		WebDriver driver = null;
		test=reports.createTest(result.getName());
		String dateName = new SimpleDateFormat("yyyy.MM.dd hh.mm.ss").format(new Date());
		System.out.println("Name of the failed test: "+result.getName());
		test.log(Status.INFO, result.getThrowable());
		test.log(Status.FAIL, MarkupHelper.createLabel("Name of the failed testcase is: "+result.getName(),ExtentColor.RED));
		
		
		try {
			driver=(WebDriver)result.getTestClass().getRealClass().getField("driver").get(result.getInstance());
		} catch (IllegalArgumentException | IllegalAccessException | NoSuchFieldException | SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		String testCaseName = result.getMethod().getMethodName();
		String filePath=null;
		try {
			filePath = Utility.getscreenShot(driver, testCaseName);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		test.addScreenCaptureFromPath(filePath,result.getMethod().getMethodName());
		
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		System.out.println("Name of the skipped test"+result.getName());
		test=reports.createTest(result.getName());
		test.log(Status.SKIP, MarkupHelper.createLabel("Name of the skipped testcase is: "+result.getName(),ExtentColor.BLUE));
	}

	@Override
	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		ITestListener.super.onStart(context);
	}

	
	@Override
	public void onFinish(ITestContext context) {
		reports.flush();
	}

}
