package com.has.generic;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import com.has.pom.AdminDashBoard;
import com.has.pom.LoginPage;

public class BaseClass {
	public static WebDriver driver;
	@BeforeTest
	public void openBrowser() {
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("http://106.51.82.61:9007/");
	}
	
	@AfterTest
	public void closeBrowser() {
		driver.quit();
	}
	
	@BeforeMethod
	public void login() throws EncryptedDocumentException, IOException {
		FileLib f=new FileLib();
		String adminEmail = f.getExceldata("OccupationLoginCredentials", 1, 2);
		String adminPwd = f.getExceldata("OccupationLoginCredentials", 1, 3);
		LoginPage l=new LoginPage(driver);
		l.setLogin(adminEmail, adminPwd);
	}
	
	@AfterMethod
	public void logout() {
		AdminDashBoard adm=new AdminDashBoard(driver);
		adm.setLogout();
	}
	
}
