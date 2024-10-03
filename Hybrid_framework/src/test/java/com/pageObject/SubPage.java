package com.pageObject;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SubPage {
WebDriver driver;//local driver 
	
	// constructor
	public SubPage(WebDriver driver)//remote driver
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	
	By time=By.xpath("//span[text()='Time']");
	By eName=By.xpath("//input[@placeholder='Type for hints...']");
	By button=By.xpath("//button[@type='submit']");
	
	
	public void clickTime()
	{
		clickMethod(driver, time, 10);
	}
	
	public void enterUsername(String uName)
	{
		sendKeysMethod(driver, eName, 10, uName);
		
		
	}
	
	public void enterSubmitBtn()
	{
		clickMethod(driver, button, 10);
	}
	
	public void sendKeysMethod(WebDriver driver,By element,int time,String value)
	{
		new WebDriverWait(driver, Duration.ofSeconds(time)).until(ExpectedConditions.visibilityOfElementLocated(element)).sendKeys(value);
	}
	
	public void clickMethod(WebDriver driver,By element, int time)
	{
		new WebDriverWait(driver, Duration.ofSeconds(time)).until(ExpectedConditions.visibilityOfElementLocated(element)).click();
	}
	
	
	

}
