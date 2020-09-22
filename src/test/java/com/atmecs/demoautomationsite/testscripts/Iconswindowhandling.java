package com.atmecs.demoautomationsite.testscripts;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;
import java.util.Properties;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Iconswindowhandling {

	WebDriver driver;
	Properties Locators;
	@BeforeMethod
	public void settingAndLaunchingDriver() throws IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\anshika.negi\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();

		FileInputStream locator = new FileInputStream(System.getProperty("user.dir") + "\\src\\test\\resources\\Locators\\windowhandling.properties");
		Locators = new Properties();
		Locators.load(locator);
		driver.navigate().to("http://demo.automationtesting.in/Register.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

	@Test
	public void twitter() {
		driver.findElement(By.xpath(Locators.getProperty("TwitterXpath"))).click();
		String parent = driver.getWindowHandle();

		Set<String> s = driver.getWindowHandles();

		Iterator<String> I1 = s.iterator();

		while (I1.hasNext()) {

			String child_window = I1.next();

			if (!parent.equals(child_window)) {
				driver.switchTo().window(child_window);

				System.out.println(driver.switchTo().window(child_window).getTitle());

				driver.close();
			}

		}
		// switch to the parent window
		driver.switchTo().window(parent);

	}
	@Test
	public void facebook() {
		driver.findElement(By.xpath(Locators.getProperty("FaceBookXpath"))).click();
		String parent = driver.getWindowHandle();

		Set<String> s = driver.getWindowHandles();

		// Now iterate using Iterator
		Iterator<String> I1 = s.iterator();

		while (I1.hasNext()) {

			String child_window = I1.next();

			if (!parent.equals(child_window)) {
				driver.switchTo().window(child_window);

				System.out.println(driver.switchTo().window(child_window).getTitle());

				driver.close();
			}

		}

		driver.switchTo().window(parent);
	}

@AfterTest
public void close() {
driver.close();
}

}

