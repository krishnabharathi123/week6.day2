package StepDefenition;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class DeleteLead extends BaseClass{


	@Given("Click on the {string} tab")
	public void click_on_the_tab(String ph) {
		driver.findElement(By.xpath("//span[text()='"+ph+"']")).click();
	}

	@Given("Click on {string} as {string}")
	public void click_on_phone_number_as(String phAtt, String phNo) {
		driver.findElement(By.xpath("//input[@name='"+phAtt+"']")).sendKeys(phNo);
	}

	@When("Click on Find Leads tab")
	public void click_on_find_leads_tab() {
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
	}

	@Then("Get the firest filtered lead id")
	public void get_the_firest_filtered_lead_id() throws InterruptedException {
		Thread.sleep(2000);
		String leadID = driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a"))
				.getText();
	}

	@Given("Click on the filtered lead id")
	public void click_on_the_filtered_lead_id() {
		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
	}
}
