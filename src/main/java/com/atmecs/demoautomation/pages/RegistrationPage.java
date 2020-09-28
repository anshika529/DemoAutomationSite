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
		