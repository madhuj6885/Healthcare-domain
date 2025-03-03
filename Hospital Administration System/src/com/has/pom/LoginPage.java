package com.has.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	@FindBy(id = "email")
	private WebElement emailTbx;
	
	@FindBy(id = "password")
	private WebElement pwdTbx;
	
	@FindBy(xpath = "//button[@type='submit']")
	private WebElement lgBtn;
	
	
	
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void setLogin(String un,String pwd) {
		emailTbx.sendKeys(un);
		pwdTbx.sendKeys(pwd);
		lgBtn.click();
	}
}
