package org.orangeHRM.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.orangeHRM.base.ProjectSpecificMethods;

public class HomePage extends ProjectSpecificMethods {

	public HomePage clickProfile() {
		
		driver.findElement(By.xpath("//img[@alt='profile picture']")).click();
		 System.out.println("Session ID" + driver);
		return this;
	}
	public LoginPage logout() throws InterruptedException {
		
		WebElement logout = driver.findElement(By.xpath("//a[text()='Logout']"));
		Thread.sleep(500);
		
		logout.click();
		System.out.println(" LOGOUT ");
		
		
		return new LoginPage();
	}
}
