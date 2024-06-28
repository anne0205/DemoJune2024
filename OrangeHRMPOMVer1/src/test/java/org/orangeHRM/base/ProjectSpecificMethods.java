package org.orangeHRM.base;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ProjectSpecificMethods {

	public static RemoteWebDriver driver;
	
	@BeforeMethod
	public void startUp() {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		// maximize the screen
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	}
	
	@AfterMethod
	public void tearDown() {
		driver.close();
	}
	
}
