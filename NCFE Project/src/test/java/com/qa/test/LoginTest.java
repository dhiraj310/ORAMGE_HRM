package com.qa.test;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

import pageObjects.HomePage;
import pageObjects.LoginPage;
import pageObjects.SecurityPage;
import reusableComponents.PropertiesOperations;
import reusableComponents.ReadExcel;
import testBase.ExtentReportNG;
import testBase.TestBase;

public class LoginTest extends TestBase
{

	String filePath = System.getProperty("user.dir")+PropertiesOperations.getPropertyValueByKey("testDataLocation");
	ReadExcel ex=new ReadExcel(filePath,"LoginPage");


	@Test(enabled =true)
	public void login() throws IOException, InterruptedException
	{
		
		final ExtentReports extReport =ExtentReportNG.get();
		String testcaseDesc="LoginTC1 :Login using Admin credentials and validate ";
		final ExtentTest test=extReport.createTest(testcaseDesc);
		LoginPage loginpage=new LoginPage();
		SecurityPage sp=new SecurityPage();
		HomePage homepage=new HomePage();

		loginpage.login("F00098","ncdex*111");
		sp.entersecurityAnswer("uat");
		sp.clickOnSubmit();
		sp.clickOnAskMeLater();
		homepage.MousehoverAdmin();
		homepage.clickOnLogout();

	}


	//@Test(enabled =false)
	public void HRMlogin() throws Exception 
	{
		//HRMLoginPage hrmlogin=new HRMLoginPage();
		//Map<String, Map<String, String>> excelData =ex.getExcelAsMap();
		//String username=excelData.get("2").get("Username");
		//String password=excelData.get("2").get("Password");
		//hrmlogin.loginHRM("Admin", "admin123");

	}


}
