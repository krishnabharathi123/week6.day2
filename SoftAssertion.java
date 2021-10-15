package week6.day2_TestNGGrps;

import org.testng.asserts.SoftAssert;

public class SoftAssertion {

	public static void main(String[] args) {
		String str1="Krishna";
		String str2="Bharathi";
		SoftAssert soft=new SoftAssert();
		soft.assertEquals(str1, str2);
		soft.assertTrue(false);
		soft.assertFalse(true);
		soft.assertNotEquals(str1, str2);
		System.out.println("Tests are failed..though it is moved to next step");
		soft.assertAll();
	}
}
