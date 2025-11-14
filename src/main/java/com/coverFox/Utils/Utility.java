package com.coverFox.Utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Utility {

	
		//Screenshot
		//scroll into view
		//wait
		//excel data reading
		
	public static void getScreenshot(WebDriver driver,String screenshotname) throws IOException
	{
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		String Timestamp=new SimpleDateFormat("dd-MM-yyyy-HH-mm-ss").format(new Date());
		File dest=new File("C:\\Users\\admin\\eclipse-workspace\\may31Selenium\\screenshots\\"+screenshotname+Timestamp+".png");
		System.out.println("Taking Screenshot and saving at location  "+dest);
		FileHandler.copy(src, dest);
	}
	public static void scrollIntoView(WebDriver driver,WebElement webElement)
	{
		JavascriptExecutor js = ((JavascriptExecutor)driver);
		js.executeScript("arguments[0].scrollIntoView(true)",webElement);
		System.out.println("Scroll into view upto element "+webElement.getText());
	}
	
	public static void waitForElementExplicitly(WebDriver driver, long waitTime,WebElement webElement)
	{
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofMillis(waitTime));
		wait.until(ExpectedConditions.visibilityOf(webElement));
		System.out.println("waiting for element for "+waitTime);
		
	}
	public static String readDataFromExcel(String sheetname,int row,int cell) throws EncryptedDocumentException, IOException
	{
		FileInputStream myFile=new FileInputStream("C:\\Users\\admin\\Desktop\\sample data.xlsx");
		Sheet mysheet = WorkbookFactory.create(myFile).getSheet(sheetname);
		String testData=mysheet.getRow(row).getCell(cell).getStringCellValue();
		System.out.println("reading data from excel  "+testData);
		return testData;
	}
	public static String ReadDataFromProperties(String key) throws IOException
	{	Properties properties =new Properties();
	FileInputStream myfile=new FileInputStream("C:\\Users\\HP\\eclipse-workspace\\CoverFox\\src\\main\\resources\\config\\config.properties");
	properties.load(myfile);
	
	String data=properties.getProperty(key);
	System.out.println("reading data from properties "+data);
		return data;
		
	}
	public static void handleDropDown(WebElement element,String visibleText) throws EncryptedDocumentException, IOException
	{
		Select select=new Select(element);
		
		select.selectByVisibleText(visibleText);
		System.out.println("Handling Dropdown with value   "+visibleText);
	}
	

}
