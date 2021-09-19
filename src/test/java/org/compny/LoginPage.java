package org.compny;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BaseClass {

	public LoginPage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="username")
	private WebElement txtUsername;
	
	
	@FindBy(xpath="//input[@type='password']")
	private WebElement txtPassword;
	
	
	@FindBy(id="login")
	private WebElement loginBtn;


	public WebElement getTxtUsername() {
		return txtUsername;
	}
	public WebElement getTxtPassword() {
		return txtPassword;
	}


	public WebElement getLoginBtn() {
		return loginBtn;
	}
	
	
	
	
	
	
	
}
