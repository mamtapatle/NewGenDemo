package NewGen.MyProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class day1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		String url1="https://www.flipkart.com/";
		String url2="https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
		driver.get(url1);
		Thread.sleep(2000);
//		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
//		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");
//		driver.findElement(By.xpath("//button[@type='submit']")).click();
//		
		
		String urlName=driver.getCurrentUrl();
		System.out.println(urlName);
		System.out.println(driver.getTitle());
		
		driver.switchTo().newWindow(WindowType.WINDOW.TAB);
		driver.get(url2);
		String urlName1=driver.getCurrentUrl();
		System.out.println(urlName1);
		System.out.println(driver.getTitle());
		
		Thread.sleep(2000);
		driver.close();
		Thread.sleep(2000);
		driver.quit();
	}

}
