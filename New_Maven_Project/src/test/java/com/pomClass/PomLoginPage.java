package com.pomClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PomLoginPage {

	public WebDriver driver;

	public  PomLoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "username")
	WebElement username;

	@FindBy(xpath = "//input[@name=\"password\"]")
	WebElement password;

	@FindBy(xpath = "//button[@id=\"submit\"]")
	WebElement submitBtn;

	@FindBy(xpath = "//a[text()='Log out']")
	WebElement logout;

	public void username(String setUsername) {

	}

	public void password(String setPassword) {

	}

	public void loginButton() {

	}

	public void logOutButton() {

	}
	
	
	

}
