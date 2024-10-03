package testNG;

import org.testng.annotations.Test;

public class Class1 {
	
	
	@Test(dependsOnMethods = "launchUrl")
	public void test1()
	{
		//orangeHrm
	}

}
