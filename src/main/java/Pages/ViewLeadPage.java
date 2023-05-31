package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import Hooks.Baseclass;

public class ViewLeadPage extends Baseclass {
	
public ViewLeadPage(ChromeDriver driver) {
		
	}

	
	public ViewLeadPage verifyMyleads() {
		WebElement MyLeads = driver.findElement(By.xpath("//div[@id='sectionHeaderTitle_leads']"));
		String text = MyLeads.getText();
		if (text.equalsIgnoreCase("View Lead")) {
			System.out.println("Lead created");
		} else {
			System.out.println("Lead not created");
		}
		return this;
	}
}