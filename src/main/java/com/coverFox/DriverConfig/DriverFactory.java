package com.coverFox.DriverConfig;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;

import com.coverFox.Utils.Utility;

public class DriverFactory {
	static WebDriver driver;
	
	
	public static WebDriver initBrowser(String browserName) throws IOException {
		if(browserName.equalsIgnoreCase("Chrome"))
		{
			driver= new ChromeDriver();
			Reporter.log("setting Browser As"+browserName);
		}
		else if(browserName.equalsIgnoreCase("firefox"))
		{
			 driver= new FirefoxDriver();
			 Reporter.log("setting Browser As"+browserName);
		}
		else if(browserName.equalsIgnoreCase("edge"))
		{
			driver= new EdgeDriver();
			 Reporter.log("setting Browser As"+browserName);
		}
		
		driver.manage().window().maximize();
		driver.get(Utility.ReadDataFromProperties("Url"));
		return driver;
		
		
	}
	public static WebDriver getDriver()
	{
		return driver;
	}
	

}
