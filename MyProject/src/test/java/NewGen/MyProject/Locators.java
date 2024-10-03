package NewGen.MyProject;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Locators {
	
	
	WebDriver driver=new ChromeDriver();
	String url="https://www.flipkart.com/";
	
	public void testCase()
	{
	
		driver.manage().window().maximize();
		driver.get(url);
		
		
	//	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
		WebElement element=wait.until(ExpectedConditions.visibilityOfElementLocated(By.partialLinkText("Become")));
		(element).click();
	
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		Locators l=new Locators();
	//	l.testCase();
		l.tagNameList();
		l.tagNameList1();
		

	}
	
	
	public void tagNameList()
	{
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
	    List<WebElement> allLinks = driver.findElements(By.tagName("a"));
	    System.out.println(allLinks);
	    
	    
	    for(WebElement webelement:allLinks)
	    {
	    	System.out.println(webelement.getText());
	    }
	    
	
	}
	
	public void tagNameList1()
	{
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
	    List<WebElement> allimg = driver.findElements(By.tagName("img"));
	    System.out.println(allimg);
	    
	    System.out.println("image tag name");
	    for(WebElement webelement:allimg)
	    {
	    	System.out.println(webelement.getText());
	    }
	    
	  driver.quit();
		
	}

}
