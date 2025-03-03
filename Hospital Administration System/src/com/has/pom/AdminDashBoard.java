package com.has.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Reporter;

public class AdminDashBoard {
	
	@FindBy(linkText = "Doctor")
	private WebElement doctorMenu;
	
	@FindBy(xpath = "//button[@class='btn btn-primary pull-right']")
	private WebElement addDoctorBtn;
	
	@FindBy(xpath = "//input[@name='name']")
	private WebElement dName;
	@FindBy(xpath = "//input[@name='email']")
	private WebElement dMalil;
	@FindBy(xpath = "//input[@name='password']")
	private WebElement dPwd;
	@FindBy(xpath = "//textarea[@name='address']")
	private WebElement dAddress;
	@FindBy(xpath = "//input[@name='phone']")
	private WebElement dPhone;
	@FindBy(xpath = "//select[@name='department_id']")
	private WebElement deptDropdown;
	@FindBy(xpath = "//input[@class='btn btn-success']")
	private WebElement subBtn;
	
	
	@FindBy(partialLinkText ="Log Out")
	private WebElement logoutBtn;
	
	public AdminDashBoard(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	public void setLogout() {
		logoutBtn.click();
	}
	
	public void setAdminDashBoard() {
		doctorMenu.click();
		addDoctorBtn.click();
		dName.sendKeys("Dr.Harish");
		dMalil.sendKeys("harish@gmail.com");
		dPwd.sendKeys("hari@123");
		dAddress.sendKeys("Basavangudi Bengalore");
		dPhone.sendKeys("9874561230");
		Select dept=new Select(deptDropdown);
		dept.selectByIndex(0);
		subBtn.submit();
		Reporter.log("Doctor created Successfully",true);
	}
}
