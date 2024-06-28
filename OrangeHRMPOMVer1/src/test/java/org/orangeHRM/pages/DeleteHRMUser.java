package org.orangeHRM.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.orangeHRM.base.ProjectSpecificMethods;

public class DeleteHRMUser extends ProjectSpecificMethods {
	
	public DeleteHRMUser pimLinkDel() {
		
		 driver.findElement(By.xpath("//a[@href='/web/index.php/pim/viewPimModule']")).click();
			driver.findElement(By.linkText("PIM")).click();
			
			return this;
	}
public DeleteHRMUser serchFName(String fname) throws InterruptedException {
			WebElement employeeIdElement = driver
					.findElement(By.xpath("//label[text()='Employee Name']/../following-sibling::div//input"));
			
			employeeIdElement.sendKeys(fname);
			Thread.sleep(1000);
	employeeIdElement.sendKeys(Keys.DOWN,Keys.ENTER);
	//	employeeIdElement.sendKeys("0375");
		return this;
	}

public HomePage clickSearchButton() throws InterruptedException {
		driver.findElement(By.xpath("//button[text()=' Search ']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//i[@class='oxd-icon bi-trash']")).click();
		driver.findElement(By.xpath("//button[text()=' Yes, Delete ']")).click();
		return new HomePage();
}
}
 