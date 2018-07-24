package com.cox.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.cox.Base.FunctionalClass_Actitime;

public class ManageUserpage  extends FunctionalClass_Actitime{
	
	
	public ManageUserpage()
	{
		PageFactory.initElements(driver,this);
	}

	@FindBy(xpath="//a/div[text()='USERS']")
	public WebElement Users;
	
	@FindBy(xpath="//div[text()='Add Users']")
	public WebElement AddUser_Click;
	
	@FindBy(xpath="//div[text()='Configure new user profile']")
	public WebElement ConfigureneSUser_Profile_Click;
	
	
	public void ManageUser_portal() throws InterruptedException
	{
		Users.click();
		Thread.sleep(5000);
		AddUser_Click.click();
		Thread.sleep(5000);
		ConfigureneSUser_Profile_Click.click();
		
	}

}
