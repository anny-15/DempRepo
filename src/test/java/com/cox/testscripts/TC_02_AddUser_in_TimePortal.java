package com.cox.testscripts;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.cox.Base.FunctionalClass_Actitime;
import com.cox.pages.LoginPage;
import com.cox.pages.ManageUserpage;

public class TC_02_AddUser_in_TimePortal extends FunctionalClass_Actitime{
	
	
	
	@Test
	public void Actitime_ManageUSer() throws InterruptedException
	{
		
		
		ManageUserpage Mnuser = new ManageUserpage();
		Mnuser.ManageUser_portal();
	}

	

	

}
