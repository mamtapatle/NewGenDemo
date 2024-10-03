package baseClassPKG;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	public static WebDriver driver;
	public static Properties prop;
	
	@BeforeMethod
	public static void launchBrowser(String getUrl) throws FileNotFoundException
	{
		
		prop=new Properties();
		File filePath=new File(System.getProperty("user.dir")+"src\\test\\resources\\config.properties");
	
		FileInputStream fis;
		try {
			fis =new FileInputStream(filePath);
			prop.load(fis);
	
		}
		catch(Exception e)
		{
		e.getStackTrace();
		}
		
		String getBrowser=prop.getProperty("Browser");
		
		
		WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
			driver.manage().window().maximize();	
			driver.get(getUrl);
			driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
//		
//			//WebDriverManager.chromedriver().setup();
//			driver=new EdgeDriver();
//			driver.manage().window().maximize();	
//			driver.get(getUrl);
//			driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
//			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		
		
		
	}
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}
	

}
