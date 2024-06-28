package org.orangeHRM.testCases;

import org.testng.annotations.Test;
import org.orangeHRM.base.ProjectSpecificMethods;
import org.orangeHRM.pages.AddPIM;
import org.orangeHRM.pages.LoginPage;
import org.orangeHRM.pages.ViewHRMUserDetails;



public class TCLoginLogout extends ProjectSpecificMethods {
	
	@Test
	public void login_logout() throws InterruptedException {
		
		
		//create an object for the starting page
		//Login
		LoginPage logPage = new LoginPage();
		logPage.enterUserName().enterPassword().clickloginButton();
		
		//Add User
		AddPIM addUser = new AddPIM();
		addUser.navPIM().pimLink().addEmp().fName().mName().lName().empID().clickcreateButton();
		
		//View User details
		ViewHRMUserDetails viewDetails = new ViewHRMUserDetails();
		viewDetails.viewUserDetails().clickProfile().logout();
		
		//Delete User 
//		DeleteHRMUser deleUser = new DeleteHRMUser();
//		deleUser.pimLinkDel().serchFName(fname).clickSearchButton().clickProfile().logout();
		
	}
	
	
}
