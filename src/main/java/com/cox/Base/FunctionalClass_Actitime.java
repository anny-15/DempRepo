package com.cox.Base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import com.cox.pages.LoginPage;

public class FunctionalClass_Actitime {

	public static WebDriver driver;
	public static Properties prop;
	public FunctionalClass_Actitime(){
		
		PageFactory.initElements(driver, this);
	}
	
	@BeforeTest
	public   void intitalizePortal() throws FileNotFoundException, IOException{
		
		 prop = new Properties();
		prop.load(new FileInputStream("C:\\Automation\\workspace\\Testng_maven\\src\\main\\java\\com\\cox\\util\\Config.properties"));
	
		String browsername= prop.getProperty("browser");
		if(browsername.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "C:\\Automation\\workspace\\Testng_maven\\chromedriver.exe");
			driver= new ChromeDriver();
			driver.get(prop.getProperty("URL"));
			
			
		}
		
		else if(browsername.equals("firefox"))
		{
			System.setProperty("webdriver.gecko.driver", "");
			driver= new FirefoxDriver();
			driver.get(prop.getProperty("URL"));
		}
		
		
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
	}
	
	@BeforeMethod
	public void loginSetup() throws InterruptedException
	{
		LoginPage lg = new LoginPage();
		lg.loginInPortal();
	}
	
	
	@AfterMethod
	public void closeSetup()
	{
		driver.close();
	}
	

	
	
	
	
}
