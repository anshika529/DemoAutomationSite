package com.atmecs.demoautomationsite.testscripts;

import org.testng.annotations.Test;

import com.atmecs.demoautomation.pages.RegistrationPage;
import com.atmecs.demoautomation.testsuit.BaseTest;

public class RegistrationformTest extends BaseTest {

	@Test
	public void register() {
		RegistrationPage rp = new RegistrationPage();
		rp.registrationactions();
	}
}