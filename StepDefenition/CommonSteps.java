package StepDefenition;

import org.openqa.selenium.By;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CommonSteps extends BaseClass{

	@Given("Enter the {string} {string}")
	public void enterValues(String name1, String value1) {
		driver.findElement(By.id(name1)).sendKeys(value1);
	}
	@When("Click on submit button")
	public void clickSubmit() {
		driver.findElement(By.name("submitButton")).click();
	}
	@Then("{string} page should be displayed")
	public void pageDisplayed(String val) {
		System.out.println(val + " is displayed");

	}
	@When("Click on the submit button")
	public void submit() {
		driver.findElement(By.className("decorativeSubmit")).click();

	}
	@When("Click on the {string} link")
	public void clickLink(String linkVal) {
		driver.findElement(By.linkText(linkVal)).click();
	}

}
