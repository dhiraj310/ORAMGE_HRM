package testScripts;

import java.io.File;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

import pageObjects.HomePage;
import pageObjects.LoginPage;
import pageObjects.SecurityPage;
import reusableComponents.CompareExcelFiles;
import reusableComponents.Excel_Reader;
import reusableComponents.PropertiesOperations;
import testBase.AppScreenshot;
import testBase.ExtentFactory;
import testBase.ExtentReportNG;
import testBase.TestBase;

public class LoginTest extends TestBase {
	AppScreenshot extentreport;
	String filePath = System.getProperty("user.dir") + PropertiesOperations.getPropertyValueByKey("testDataLocation");
	String username =PropertiesOperations.getPropertyValueByKey("Username");
	String password =PropertiesOperations.getPropertyValueByKey("Password");

	String data = System.getProperty("user.dir") + PropertiesOperations.getPropertyValueByKey("DataLocation");

	@Test(priority=1,enabled=true,groups= {"Regression"})
	public void loginA() throws Exception {
		LoginPage loginpage = new LoginPage();
		SecurityPage sp = new SecurityPage();
		HomePage homepage = new HomePage();
		Excel_Reader exceldata = new Excel_Reader(filePath);
		ExtentReports  reports= ExtentReportNG.get();
        String desc="Login to Orange HRM page and validate";
        ExtentTest test=reports.createTest(desc);
		ExtentFactory.getInstance().setExtent(test);
		
        //Enter Username and Password 
	    loginpage.login(username, password);
	    
	    //Get total number of link
	    loginpage.getTotalLink();
	    //Click on Welcome button
	    loginpage.clickOnWelcome();
	    //Click on Logout
	    loginpage.clickOnLogout();
	    System.out.println("First Test Case Passed");
	    
	}
	    

}
