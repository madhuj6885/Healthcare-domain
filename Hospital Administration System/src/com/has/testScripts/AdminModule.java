package com.has.testScripts;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.has.generic.BaseClass;
import com.has.pom.AdminDashBoard;
import com.has.pom.DoctorPage;
@Listeners(com.has.generic.ListenerImplementation.class)
public class AdminModule extends BaseClass {

	@Test
	public void createAdmin() throws EncryptedDocumentException, IOException {
		AdminDashBoard adm=new AdminDashBoard(driver);
		adm.setAdminDashBoard();
	}
}
