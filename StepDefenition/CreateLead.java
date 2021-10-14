package StepDefenition;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateLead extends BaseClass {

	/*
	 * @Given("Open the browser and launch the {string}") public void
	 * openBrowse(String url) { WebDriverManager.chromedriver().setup(); driver =
	 * new ChromeDriver(); driver.manage().window().maximize(); driver.get(url);
	 * driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5)); }
	 */

	/*
	 * @And("Enter valid {string} {string}") public void userName(String name,String
	 * value) { driver.findElement(By.id(name)).sendKeys(value); }
	 */


	@Then("New Lead should be created")
	public void createdLead() {
		System.out.println("New lead is created");

	}
}
