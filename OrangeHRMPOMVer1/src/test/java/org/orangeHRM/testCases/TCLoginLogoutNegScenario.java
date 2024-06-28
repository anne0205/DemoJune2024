package org.orangeHRM.testCases;

import org.orangeHRM.base.ProjectSpecificMethods;
import org.orangeHRM.pages.LoginPage;
import org.testng.annotations.Test;

public class TCLoginLogoutNegScenario extends ProjectSpecificMethods{
	
@Test
	//create an object for the starting page
public void LoginLogoutNegScenario() throws InterruptedException{
	
	LoginPage logpageNeg = new LoginPage();
	
	logpageNeg.enterUserName().enterPassword().clickloginButtonNegScenario();
	
}

}
