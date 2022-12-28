package pages;


import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

import org.openqa.selenium.support.PageFactory;
import util.TestBase;

public class LoginPage extends TestBase {
	
	@AndroidFindBy(xpath = "//*[@text='Username']")
	public MobileElement username;
	

	@AndroidFindBy(xpath = "//*[@text='Password']")
	public MobileElement password;
	
	@AndroidFindBy(xpath = "//*[@text='LOGIN']")
	public MobileElement loginButton;
	
	@AndroidFindBy(xpath = "//*[@text='Username and password do not match any user in this service.']")
	public MobileElement errorMesssage;

	public LoginPage(){
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	
	public void receiveData(){
	}

	public void enterPassword(String passwordkey) {
	//	intentionalWait();
		password.click();
		password.sendKeys(passwordkey);
	}
	
	public void enterUsername(String usernamekey) {
		//intentionalWait();
		username.click();
		username.sendKeys(usernamekey);
	}
	
	public void enterProblemUsername(String problemusernamekey) throws InterruptedException{
		intentionalWait();
		username.click();
		username.sendKeys(problemusernamekey);
	}
	
	public void enterProblemPassword(String problempasswordkey) throws InterruptedException{
		intentionalWait();
		password.click();
		password.sendKeys(problempasswordkey);
	}
	
	public void enterInvalidUsername(String invalidusername) throws InterruptedException{
		intentionalWait();
		username.click();
		username.sendKeys(invalidusername);
	}
	
	public void enterInvalidPassword(String invalidpassword) throws InterruptedException{
		intentionalWait();
		password.click();
		password.sendKeys(invalidpassword);
	}
	
	public void clickOnLoginButton() {
		//intentionalWait();
		loginButton.click();
	}
	
	public void verifyErrorForInvalidredentials() throws InterruptedException{
		intentionalWait();
	    String errormessage = errorMesssage.getText();
	    String title = "Username and password do not match any user in this service.";
	   // Assert.assertEquals("Values do not match", title, errormessage);
	}
	
	
	
}
