package testBase;

import java.util.Collections;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;
import reusableComponents.PropertiesOperations;

public class TestBase extends ObjectsRepo
{
	public void LaunchBrowser() throws Exception
	{
		
		String browser=PropertiesOperations.getPropertyValueByKey("browser");
		String url=PropertiesOperations.getPropertyValueByKey("url");
		
		if(browser.equalsIgnoreCase("chrome"))
		{
			WebDriverManager.chromedriver().setup();
			ChromeOptions option=new ChromeOptions();
			option.addArguments("--incognito");
			option.setExperimentalOption("excludeSwitches",Collections.singletonList("enable-automation"));
			driver=new ChromeDriver(option);
			System.getProperty("webdriver.chrome.SilentOutput");
		}
		else if(browser.equalsIgnoreCase("firefox"))
		{
			WebDriverManager.firefoxdriver().setup();
			FirefoxOptions foption=new FirefoxOptions();
			foption.addArguments("--private");
			driver=new FirefoxDriver(foption);
		}

		else if(browser.equalsIgnoreCase("ie"))
		{
			WebDriverManager.iedriver().setup();
			driver=new InternetExplorerDriver();	
		}
		
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    		driver.navigate().to(url);
	}

	@BeforeMethod
	public void LaunchApplication() throws Exception 
	{
		LaunchBrowser();

	}

	@AfterMethod
	public void tearDown() {
	 driver.close();
	}

}

