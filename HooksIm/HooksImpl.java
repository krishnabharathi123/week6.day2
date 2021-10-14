package HooksIm;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;

import StepDefenition.BaseClass;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.github.bonigarcia.wdm.WebDriverManager;

public class HooksImpl extends BaseClass{

	@Before
	public void openBrowse() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	}
	@After
	public void closeBrowser() {
		driver.close();
	}
	
	
}
