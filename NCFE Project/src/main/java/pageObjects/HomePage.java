package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.aventstack.extentreports.Status;

import testBase.ExtentFactory;
import testBase.TestBase;

public class HomePage extends TestBase
{
	@FindBy(id="ctl00_imgBtnLogout")
	WebElement btn_logout;
	
	@FindBy(xpath="//*[@id=\"ctl00_DynMenu_DynamicMenun0\"]/table/tbody/tr/td[1]/a")
	WebElement clm_admin;
	
	@FindBy(xpath="//*[@id=\"ctl00_DynMenu_DynamicMenun1\"]/table/tbody/tr/td[1]/a")
	WebElement clm_annual_return;
	
	@FindBy(xpath="//*[@id=\"ctl00_DynMenu_DynamicMenun2\"]/table/tbody/tr/td[1]/a")
	WebElement clm_authorised_person;
	
	@FindBy(xpath="//*[@id=\"ctl00_DynMenu_DynamicMenun3\"]/table/tbody/tr/td[1]/a")
	WebElement clm_bms;
	
	@FindBy(xpath="//*[@id=\"ctl00_DynMenu_DynamicMenun4\"]/table/tbody/tr/td[1]/a")
	WebElement clm_cm_details;
	
	@FindBy(xpath="//*[@id=\"ctl00_DynMenu_DynamicMenun5\"]/table/tbody/tr/td[1]/a")
	WebElement clm_ctcl;
	
	@FindBy(xpath="//*[@id=\"ctl00_DynMenu_DynamicMenun6\"]/table/tbody/tr/td[1]/a")
	WebElement clm_client;
	
	@FindBy(xpath="//*[@id=\"ctl00_DynMenu_DynamicMenun7\"]/table/tbody/tr/td[1]/a")
	WebElement clm_collaterals;

	
	@FindBy(xpath="//*[@id=\"ctl00_DynMenu_DynamicMenun8\"]/table/tbody/tr/td[1]/a")
	WebElement clm_compliance;

	
	@FindBy(xpath="//*[@id=\"ctl00_DynMenu_DynamicMenun9\"]/table/tbody/tr/td[1]/a")
	WebElement clm_digital_signature;

	
	@FindBy(xpath="//*[@id=\"ctl00_DynMenu_DynamicMenun10\"]/table/tbody/tr/td[1]/a")
	WebElement clm_downloads;

	
	@FindBy(xpath="//*[@id=\"ctl00_DynMenu_DynamicMenun11\"]/table/tbody/tr/td[1]/a")
	WebElement clm_positions_violation;
	
	@FindBy(xpath="//*[@id=\"ctl00_DynMenu_DynamicMenun12\"]/table/tbody/tr/td[1]/a")
	WebElement clm_preferences;

	
	@FindBy(xpath="//*[@id=\"ctl00_DynMenu_DynamicMenun13\"]/table/tbody/tr/td[1]/a")
	WebElement clm_sales_tax;

	
	@FindBy(xpath="//*[@id=\"ctl00_DynMenu_DynamicMenun14\"]/table/tbody/tr/td[1]/a")
	WebElement clm_settlement;
	
	@FindBy(xpath="//*[@id=\"ctl00_DynMenu_DynamicMenun15\"]/table/tbody/tr/td[1]/a")
	WebElement clm_square_off;

	
	@FindBy(xpath="//*[@id=\"ctl00_DynMenu_DynamicMenun16\"]/table/tbody/tr/td[1]/a")
	WebElement clm_trd_member_id;

	
	@FindBy(xpath="//*[@id=\"ctl00_DynMenu_DynamicMenun17\"]/table/tbody/tr/td[1]/a")
	WebElement clm_trades_detail;
	
	@FindBy(id="imgNotification")
	WebElement img_notification;
	
	@FindBy(id="ctl00_imgReportProb")
	WebElement img_report_problems;
	
	@FindBy(xpath="//*[@id=\"ctl00_ContentPlaceHolderCentre_Panel1\"]/table/tbody/tr[1]/td/table/tbody/tr/td[2]/table/tbody/tr/td[2]/div")
	WebElement hdr_dashboard;



	
	
		
	
	public HomePage() 
	{
		PageFactory.initElements(driver,this);	
	}
	
	/*
	 * Click on Logout button
	 */
	
	public void clickOnLogout()
	{
		common.click_custom(btn_logout,"LogoutButton");

	}
	
	/*
	 * Mouse hover on Admin
	 */
	public void Mousehover(WebElement element,String fieldName) throws InterruptedException
	{   
	try
	{
        Actions actions = new Actions(driver);
    	actions.moveToElement(element).perform();
    	ExtentFactory.getInstance().getExtent().log(Status.PASS, fieldName+"==> Mouse hovered Successfully! ");
		Thread.sleep(1000);
	}catch(Exception e)
	{
		ExtentFactory.getInstance().getExtent().log(Status.FAIL, "Unable to hover mouse on field: " +fieldName +" due to exception: "+e);

	}

	}

	
	/*
	 * Mouse hover on Admin
	 */
	public void MousehoverAdmin() throws InterruptedException
	{
		Mousehover(clm_admin,"Admin");    
	}
	
	/*
	 * Mouse hover on Annual Returns
	 */
	public void MousehoverAnnualReturns() throws InterruptedException
	{
		Mousehover(clm_annual_return, "Annual Returns");
	}

	
	/*
	 * Mouse hover on Authorised Person
	 */
	public void MousehoverAuthorisedPerson() throws InterruptedException
	{
		Mousehover(clm_authorised_person, "Authorised Person");
	}

	
	/*
	 * Mouse hover on BMS
	 */
	public void MousehoverBMS() throws InterruptedException
	{
		Mousehover(clm_bms, "BMS");
	}

	
	/*
	 * Mouse hover on CM Details
	 */
	public void MousehoverCMDetails() throws InterruptedException
	{
		Mousehover(clm_cm_details, "CM Details");
	}

	
	/*
	 * Mouse hover on CTCL
	 */
	public void MousehoverCTCL() throws InterruptedException
	{
		Mousehover(clm_ctcl, "CTCL");
	}

	
	/*
	 * Mouse hover on Client
	 */
	public void MousehoverClient() throws InterruptedException
	{
		Mousehover(clm_client, "Admin");
	}

	
	/*
	 * Mouse hover on Collaterls
	 */
	public void MousehoverCollaterls() throws InterruptedException
	{
		Mousehover(clm_collaterals, "Collaterals");
	}

	
	/*
	 * Mouse hover on Complience
	 */
	public void MousehoverCompliance() throws InterruptedException
	{
		Mousehover(clm_compliance, "Compliance");
	}

	
	/*
	 * Mouse hover on Digital Signature
	 */
	public void MousehoverDigitalSignature() throws InterruptedException
	{
		Mousehover(clm_digital_signature, "Digital Signature");
	}

	
	/*
	 * Mouse hover on Downloads
	 */
	public void MousehoverDownloads() throws InterruptedException
	{
		Mousehover(clm_downloads, "Downloads");
	}

	
	/*
	 * Mouse hover on Position Violation
	 */
	public void MousehoverPositionViolation() throws InterruptedException
	{
		Mousehover(clm_positions_violation, "Position Violation");
	}

	
	/*
	 * Mouse hover on Preferences
	 */
	public void MousehoverPreferences() throws InterruptedException
	{
		Mousehover(clm_preferences, "Preferences");
	}

	
	/*
	 * Mouse hover on Sales Tax
	 */
	public void MousehoverSalesTax() throws InterruptedException
	{
		Mousehover(clm_sales_tax, "Sales Tax");
	}

	
	/*
	 * Mouse hover on Settlement
	 */
	public void MousehoverSettlement() throws InterruptedException
	{
		Mousehover(clm_settlement, "Settlement");
	}

	
	/*
	 * Mouse hover on Square Off
	 */
	public void MousehoverSquareOff() throws InterruptedException
	{
		Mousehover(clm_square_off, "Square Off");
	}

	
	/*
	 * Mouse hover on TRD Member ID
	 */
	public void MousehoverTRDMemberId() throws InterruptedException
	{
		Mousehover(clm_trd_member_id, "TRD Member ID");
	}

	
	/*
	 * Mouse hover on Trades Detail
	 */
	public void MousehoverTradesDetail() throws InterruptedException
	{
		Mousehover(clm_trades_detail, "Trades Detail");
	}


}
