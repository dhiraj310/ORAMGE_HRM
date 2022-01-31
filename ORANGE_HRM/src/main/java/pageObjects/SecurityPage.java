package pageObjects;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import testBase.TestBase;

public class SecurityPage extends TestBase
{
	
	@FindBy(id="ctl00_ContentPlaceHolderCentre_txtanswers0")
	WebElement txt_securityinput;
	
	@FindBy(id="ctl00_ContentPlaceHolderCentre_imgBtnSubmit")
	WebElement btn_submit;
	
	@FindBy(id="ctl00_ContentPlaceHolderCentre_ucMemberContactDetails_ImageButton1")
	WebElement btn_askmelater;
	
	
	public SecurityPage() 
	{
		PageFactory.initElements(driver,this);
	}
	
	
	
	/*
	 * Enter Security Answer
	 */
	
	public void entersecurityAnswer(String answer)
	{
		common.sendKeys_custom(txt_securityinput, "SecurityAnswerField", answer);
		
	}
	
	/*
	 * Click on Submit Button
	 */
	public void clickOnSubmit()
	{
		common.click_custom(btn_submit,"SubmitButton");
	}
	
	/*
	 * Click on Ask me later  Button
	 */
	public void clickOnAskMeLater()
	{
		common.click_custom(btn_askmelater,"AskMeLaterButton");
	}


}
