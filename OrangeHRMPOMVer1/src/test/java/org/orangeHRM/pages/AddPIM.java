package org.orangeHRM.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.orangeHRM.base.ProjectSpecificMethods;

public class AddPIM extends ProjectSpecificMethods {
	
	
	
	public AddPIM navPIM() {
		driver.findElement(By.xpath("//*[text()='PIM'][1]")).click();
        boolean displayed = driver.findElement(By.xpath("//*[text()='Employee Information']")).isDisplayed();
        System.out.println(" IN ADD USER PIM");
	    System.out.println("displayed : " + displayed);
		 System.out.println("Session ID" + driver);
	    return this;
	}
	
	public AddPIM pimLink() {
		 WebElement pimLink = driver.findElementByLinkText("PIM");
			pimLink.click();
			
			return this;
	}

	public AddPIM addEmp() {
		
		WebElement addEmp = driver.findElementByLinkText("Add Employee");
		addEmp.click();
		return this;
	}
	
	public AddPIM fName() {
		
		WebElement addFstName = driver.findElementByName("firstName");
		addFstName.sendKeys("Anita");
		return this;
	}
	
	public AddPIM mName() {
		WebElement addMddName = driver.findElementByName("middleName");
		addMddName.sendKeys("S");
		return this;
	}
	
	public AddPIM lName() {
		WebElement addLstName = driver.findElementByName("lastName");
		addLstName.sendKeys("Gandham");
		return this;
	}
	
	public AddPIM empID() {
		WebElement empID = driver.findElement(By.xpath("(//input[@class='oxd-input oxd-input--active'])[2]"));
		String strID = empID.getAttribute("value");
		System.out.println("Employee ID: " + strID);
		return this;
	}
	
	public ViewHRMUserDetails clickcreateButton() {
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		System.out.println("Created PIM User");	
		
		return new ViewHRMUserDetails();
	}
}
