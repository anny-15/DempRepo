package com.cox.testscripts;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.cox.Base.FunctionalClass_Actitime;
import com.cox.pages.LoginPage;

public class TC_001_Login_in_Time_portal extends FunctionalClass_Actitime{
	
	
	
	
	@Test
	public void Actitime_loginTitlepageTest()
	{
		System.out.println("login into page");
		lg.ActittimeTitleTest();
		
	}

	
	
	
}
