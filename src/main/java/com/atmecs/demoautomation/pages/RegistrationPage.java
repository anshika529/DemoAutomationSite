package com.atmecs.demoautomation.pages;

import java.util.Properties;
import java.util.concurrent.TimeUnit;
import com.atmecs.demoautomation.constants.Constants;
import com.atmecs.demoautomation.helpers.ElementHelpers;
import com.atmecs.demoautomation.testsuit.BaseTest;
import com.atmecs.demoautomation.utils.PropertyReader;

public class RegistrationPage extends BaseTest {
	Properties Loc_path;
	Properties Data_path;

	public void registrationactions() {
		Loc_path = PropertyReader.readProperties(Constants.Locator_file);
		Data_path = PropertyReader.readProperties(Constants.TestData_file);
		ElementHelpers.sendkeys(driver, Loc_path.getProperty("FirstName"), Data_path.getProperty("FirstName"));
		ElementHelpers.sendkeys(driver, Loc_path.getProperty("LastName"), Data_path.getProperty("LastName"));
		ElementHelpers.sendkeys(driver, Loc_path.getProperty("Address"), Data_path.getProperty("Address"));
		ElementHelpers.sendkeys(driver, Loc_path.getProperty("Email"), Data_path.getProperty("Email"));
		ElementHelpers.sendkeys(driver, Loc_path.getProperty("Phone"), Data_path.getProperty("PhoneNo"));
		ElementHelpers.clickElement(driver, Loc_path.getProperty("Gender"));
		ElementHelpers.clickElement(driver, Loc_path.getProperty("Hobbies"));
		ElementHelpers.clickElement(driver, Loc_path.getProperty("Language"));
		ElementHelpers.clickElement(driver, Loc_path.getProperty("English"));

		ElementHelpers.selectfromdropdown(driver, Loc_path.getProperty("Skills"), Data_path.getProperty("SkillsValue"));
		ElementHelpers.selectfromdropdown(driver, Loc_path.getProperty("Countries"), Data_path.getProperty("CountryValue"));
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		ElementHelpers.selectfromdropdown(driver, Loc_path.getProperty("SelectCountry"), Data_path.getProperty("SelectedValue"));
		ElementHelpers.selectfromdropdown(driver, Loc_path.getProperty("Year"), Data_path.getProperty("SelectedYear"));
		ElementHelpers.selectfromdropdown(driver, Loc_path.getProperty("Month"), Data_path.getProperty("SelectedMonth"));
		ElementHelpers.selectfromdropdown(driver, Loc_path.getProperty("Day"), Data_path.getProperty("SelectedDay"));
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		ElementHelpers.sendkeys(driver, Loc_path.getProperty("Password"), Data_path.getProperty("Password"));
		ElementHelpers.sendkeys(driver, Loc_path.getProperty("Confirmpassword"),
				Data_path.getProperty("ConfirmPassword"));

		ElementHelpers.clickElement(driver, Loc_path.getProperty("SubmitButton"));

	}
}
