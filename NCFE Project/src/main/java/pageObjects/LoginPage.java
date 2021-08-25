package pageObjects;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import testBase.TestBase;

public class LoginPage extends TestBase
{
	
	@FindBy(id="txtUserNm")
	WebElement txt_username;
	
	@FindBy(id="txtPassword")
	WebElement txt_password;
	
	@FindBy(id="imgBtnLogin")
	WebElement btn_login;
	
	
	public LoginPage() 
	{
		PageFactory.initElements(driver,this);
	}
	
	
	
	/*
	 * Login to Orange HRM
	 */
	
	public void login(String username,String password)
	{
		common.sendKeys_custom(txt_username, "UsernameField", username);
		common.sendKeys_custom(txt_password, "PasswordField", password);
		
		common.click_custom(btn_login,"LoginButton");
	}

}
