package week6.day2_TestNGGrps;

import org.testng.Assert;

public class HardAssert {

	public static void main(String[] args) {
		String str1="Krishna";
		String str2="Bharathi";
		Assert.assertNotEquals(str1, str2);
		//Assert.assertEquals(str1, str2);
		//Assert.assertTrue(false, "both are notequals");
		//Assert.assertFalse(true, "error to be displayed");
		System.out.println("hello world");

	}

}
