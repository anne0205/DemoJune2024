package org.orangeHRM.pages;

import org.openqa.selenium.By;
import org.orangeHRM.base.ProjectSpecificMethods;

public class LoginPage extends ProjectSpecificMethods {

	public LoginPage enterUserName() {
		
		driver.findElement(By.name("username")).sendKeys("Admin");
		return this;
	}
	public LoginPage enterPassword() {
		
		driver.findElement(By.name("password")).sendKeys("admin123");
		 System.out.println("Session ID" + driver);
		return this;
	}
	
	public HomePage clickloginButton() {
		
		driver.findElement(By.xpath("//button[text()=' Login ']")).click();
		String title = driver.getTitle();
		System.out.println(" Title of the Login page :" + title );
	
		//After this method the page should redirect to homepage
	/*	HomePage homePage = new HomePage();
		return homePage;*/
		
		return new HomePage();
		
	}
	
	public LoginPage clickloginButtonNegScenario() {
		driver.findElement(By.xpath("//button[text()=' Login ']")).click();
		
		return this;
	}
	
}
