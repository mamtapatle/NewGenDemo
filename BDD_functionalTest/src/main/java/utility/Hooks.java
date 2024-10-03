package utility;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import baseClassPKG.BaseClass;
import io.cucumber.java.After;
import io.cucumber.java.Scenario;

public class Hooks extends BaseClass {

	@After
	public void takeScreenShot(Scenario scenario)
	{
		if(scenario.isFailed())
		{
			TakesScreenshot ts=(TakesScreenshot)driver;
			byte[] src=ts.getScreenshotAs(OutputType.BYTES);
			scenario.attach(src, "image.png", "Screenshot");
		}
		else
		{
			TakesScreenshot ts=(TakesScreenshot)driver;
			byte[] src=ts.getScreenshotAs(OutputType.BYTES);
			scenario.attach(src, "image.png", "Screenshot");
		}
	}
}
