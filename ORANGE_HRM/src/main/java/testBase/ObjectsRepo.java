package testBase;

import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

import pageObjects.LoginPage;
import reusableComponents.CommonMethods;

public class ObjectsRepo 
{
	public static WebDriver driver;
	public static ExtentReports extent;
	public static ExtentTest test;
	public CommonMethods common = new CommonMethods();
}
