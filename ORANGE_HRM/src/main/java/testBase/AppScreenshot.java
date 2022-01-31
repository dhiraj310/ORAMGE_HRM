package testBase;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;

public class AppScreenshot extends TestBase
{
	static String concatenate=".";

public static String getScreenshot(String screenshotName) throws IOException
{
	File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
	
	String imgPath=System.getProperty("user.dir") +"/Reports/Screenshots/"+screenshotName+".jpeg";
	
	File path = new File(imgPath);
	
	FileUtils.copyFile(src,path);
	
	return imgPath;
			
}

public static Object screenCapture(String logdetails,String imagepath) throws IOException
{
	//report with snapshot
	test.log(Status.INFO,logdetails,MediaEntityBuilder.createScreenCaptureFromPath(imagepath).build());
	return test;
}

public void passFailScreenshot(String name,WebDriver driver) throws IOException
{
String screenshotName=concatenate +AppScreenshot.getScreenshot(name);
screenCapture("testing",screenshotName);

}

}
