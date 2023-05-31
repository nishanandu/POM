package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import Hooks.Baseclass;

public class Homepage extends Baseclass{
	
public Homepage(ChromeDriver driver) {
		
	}

	public MyHomepage clickCrmSfa() {
		
		driver.findElement(By.linkText("CRM/SFA")).click();
		return  new MyHomepage(driver);

	}
}
