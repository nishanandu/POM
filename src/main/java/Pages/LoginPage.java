package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import Hooks.Baseclass;

public class LoginPage extends Baseclass {

	public LoginPage(ChromeDriver driver) {
		this.driver= driver;
	}
	public LoginPage  enterUsername() {
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		return this;
	}
	public LoginPage enterPassword() {
		
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		return this;
	}
	public Homepage clickLogin() {
		
		driver.findElement(By.className("decorativeSubmit")).click();
		
		return new Homepage(driver);
	}
	
}
