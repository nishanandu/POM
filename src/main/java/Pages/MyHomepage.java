package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import Hooks.Baseclass;
import dev.failsafe.internal.util.Assert;

public class MyHomepage extends Baseclass {
	
public MyHomepage(ChromeDriver driver) {
		
	}

	public MyHomepage verifyHomePage() {
		WebElement homepage = driver.findElement(By.id("sectionHeaderTitle_myHome"));
		String text = homepage.getText();
		System.out.println(text);
		if (text.equalsIgnoreCase("My Home")) {
			System.out.println("homepage displayed");
		} else {
			System.out.println("homepage not displayed");
		}

		return this;
	}

	public CreateLeadPage clickCreateLead() {
		driver.findElement(By.linkText("Create Lead")).click();
		;
		return new CreateLeadPage(driver);
	}
}
