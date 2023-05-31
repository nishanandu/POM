package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import Hooks.Baseclass;

public class CreateLeadPage extends Baseclass {
	
public CreateLeadPage(ChromeDriver driver) {
		
	}

	public CreateLeadPage enterCompanyName() {
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Demo");
		return this;
	}

	public CreateLeadPage enterFirstName() {
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Hari");
		return this;

	}

	public CreateLeadPage enterLastName() {

		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Vishnu");
		return this;
	}

	public CreateLeadPage enterPhonenumber() {
		driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("9875648794");
		return this;
	}

	public ViewLeadPage clickCreateLead() {
		driver.findElement(By.name("submitButton")).click();
		return new ViewLeadPage(driver);

	}

}
