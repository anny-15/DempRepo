package com.cox.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.cox.Base.FunctionalClass_Actitime;

public class LoginPage extends FunctionalClass_Actitime {
	
	public LoginPage()
	{
		PageFactory.initElements(driver,this);
	}

	@FindBy(xpath="//input[@id='username']")
	public WebElement username;
	
	@FindBy(xpath="//input[@type='password']")
	public WebElement password;
	
	@FindBy(xpath="//a[@id='loginButton']")
	public WebElement login_button;
	

	public void loginInPortal() throws InterruptedException
	{
		username.sendKeys(prop.getProperty("username"));
		Thread.sleep(5000);
		password.sendKeys(prop.getProperty("password"));
		Thread.sleep(5000);
		login_button.click();
		
	}
	public void ActittimeTitleTest()
	{
		username.sendKeys(prop.getProperty("username"));
		password.sendKeys(prop.getProperty("password"));
		login_button.click();
		
	}
	 
	
}
