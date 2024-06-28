package org.orangeHRM.pages;

import org.openqa.selenium.By;
import org.orangeHRM.base.ProjectSpecificMethods;

public class ViewHRMUserDetails extends ProjectSpecificMethods{

	
	
	public HomePage viewUserDetails() throws InterruptedException {
		
		Thread.sleep(2000);
		String text = driver.findElement(By.xpath("(//h6)[3]")).getText();
		if(text.equals("Personal Details")) {
			System.out.println("Created PIM User");
		}
		
		return new HomePage();
	}
}
