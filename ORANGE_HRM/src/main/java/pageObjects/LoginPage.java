package pageObjects;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.aventstack.extentreports.Status;

import testBase.AppScreenshot;
import testBase.ExtentFactory;
import testBase.ExtentReportNG;
import testBase.TestBase;

public class LoginPage extends TestBase
{
	AppScreenshot extentreport;
	
	@FindBy(id="txtUsername")
	WebElement txt_username;
	
	@FindBy(id="txtPassword")
	WebElement txt_password;
	
	@FindBy(id="btnLogin")
	WebElement btn_login;
	
	@FindBy(id="welcome")
	WebElement link_welcome;
	
	@FindBy(xpath="//*[@id=\"welcome-menu\"]/ul/li[3]/a")
	WebElement link_logout;
	
	@FindBy(tagName="a")
	List<WebElement> link;
	
	
	public LoginPage() 
	{
		PageFactory.initElements(driver,this);
	}
	
	
	
	/*
	 * Login to Orange HRM
	 */
	
	public void login(String username,String password) throws IOException
	{
		common.sendKeys_custom(txt_username, "UsernameField", username);
		common.sendKeys_custom(txt_password, "PasswordField", password);
		common.click_custom(btn_login,"LoginButton");
	}
	/*
	 * Click on Welcome link
	 */
	public void clickOnWelcome()
	{
	common.click_custom(link_welcome, "Welcome");
	}
	
	/*
	 * Click on Logout link
	 */
	public void clickOnLogout()
	{
		common.click_custom(link_logout, "Logout");
	}
	
	
	public static void drawBorder(WebElement element)
	{
		JavascriptExecutor js=((JavascriptExecutor)driver);
		js.executeScript("arguments[0].style.border='3px solid red' ", element);
	}
	
	
	public static void clickOnElement(WebElement element)
	{
	JavascriptExecutor js=((JavascriptExecutor)driver);
	js.executeScript("arguments[0].click();", element);
	}
	
	public static void refreshBrowser()
	{
		JavascriptExecutor js=((JavascriptExecutor)driver);
		js.executeScript("history.go(0)");
	}
	
	
	public static String getTitle()
	{
		JavascriptExecutor js=((JavascriptExecutor)driver);
		String title=js.executeScript("return document.title;").toString();
		return title;
	}
	
	public static void scrollPageDown()
	{
		JavascriptExecutor js=((JavascriptExecutor)driver);
		js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
	}
	
	public void scrollIntoView(WebElement element)
	{
		JavascriptExecutor js=((JavascriptExecutor)driver);
		js.executeScript("arguments[0].scrollIntoView(true);", element);
	}
	
	
	public static void enterText()
	{
	JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;  
	jsExecutor.executeScript("document.getElementById('firstName').value='testuser'");  
	
	}
	
	public void getTotalLink()
	{
		System.out.println(link.size());
		for(int i=1;i<=link.size();i++)
		{
			System.out.println(link.get(i).getText());
		}
			
	}
	
	
	public void switchToWindow(String windowTitle,List<String> hlist)
	{
		String parent=driver.getWindowHandle();
		Set<String> allwindows=driver.getWindowHandles();
		
		System.out.println(allwindows.size());
		
		for(String child:allwindows)
		{
			if(!parent.equalsIgnoreCase(child))
			{
				driver.switchTo().window(child);
				driver.close();
			}
		}
		
		driver.switchTo().window(parent);
	}
	
	public void readExcel() throws IOException
	{
		String filePath="";
		FileInputStream fis=new FileInputStream(filePath);
		
		XSSFWorkbook workbook=new XSSFWorkbook(fis);
		
		XSSFSheet sheet=workbook.getSheetAt(0);
		
		int rows=sheet.getLastRowNum();
		int cells=sheet.getRow(1).getLastCellNum();
		
		for(int r=0;r<=rows;r++)
		{
			XSSFRow row=sheet.getRow(r);
			for(int c=0;c<=cells;c++)
			{
				XSSFCell cols=row.getCell(c);
				cols.getCellType();
			}
		}
		
	}
}
