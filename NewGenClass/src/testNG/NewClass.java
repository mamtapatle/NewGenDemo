package testNG;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class NewClass {

	
	int a;
	int b;
	int c;
	SoftAssert sa =new SoftAssert();
	@Test
	public void TC_1() {

		a=5;
		b=5;
		c=a+b;
		System.out.println("this is TC 1 "+c);
		
		sa.assertEquals(c, 16);
	//	sa.assertAll("data not matching");
	}

	@Test
	public void TC_2() {

		a=5;
		b=6;
		c=a+b;
		int d=11;
		System.out.println("this is TC 2 "+c);
		sa.assertEquals(c, d);
	//	sa.assertAll("data not matching");
	}

	@Test
	public void TC_3() {

	
		System.out.println("this is TC 3 ");
		String actualS="Mamta";
		String expectedS="Mamta";
		sa.assertEquals(actualS, expectedS);
	//	sa.assertAll("data not matching");
	}

	@Test
	public void TC_4() {

		a=1;
		b=5;
		c=a+b;
		System.out.println("this is TC 4 "+c);
		sa.assertEquals(c, 6);
		sa.assertAll();
		
	}

}
