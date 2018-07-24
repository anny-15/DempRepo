package com.cox.Base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import com.beust.jcommander.Parameter;
import com.cox.pages.LoginPage;

public class FunctionalClass_Actitime {

	public static WebDriver driver;
	public static Properties prop;
	public LoginPage lg;
	public FunctionalClass_Actitime(){
		
		PageFactory.initElements(driver, this);
	}
	
	@BeforeMethod
	@Parameters({"browser"})
	public   void intitalizePortal(String browser) throws FileNotFoundException, IOException, InterruptedException{
		
		 prop = new Properties();
		prop.load(new FileInputStream("C:\\Automation\\workspace\\Testng_maven\\src\\main\\java\\com\\cox\\util\\Config.properties"));
	
		 //browsername= prop.getProperty("browser");
		if(browser.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "C:\\Automation\\workspace\\Testng_maven\\chromedriver.exe");
			driver= new ChromeDriver();
			driver.get(prop.getProperty("URL"));
			
			
		}
		
		else if(browser.equals("IE"))
		{
			System.setProperty("webdriver.IE.driver", "C:\\Automation\\workspace\\Testng_maven\\IEDriverServer.exe");
			driver= new InternetExplorerDriver();
			driver.get(prop.getProperty("URL"));
		}
		
		
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		 lg = new LoginPage();
			lg.loginInPortal();
		
	}
	
	
	
	
	@AfterMethod
	public void closeSetup()
	{
		driver.close();
	}
	

	
	
	
	
}
