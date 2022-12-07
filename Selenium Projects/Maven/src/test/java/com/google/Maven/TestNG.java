package com.google.Maven;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNG {
	ChromeDriver driver;

	@BeforeTest(groups = "My group")

	public void openUrl() {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\resources\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.navigate().to("https://www.google.com");
	}

	@Test(groups = "My group")

	public void userLogin() {

		System.out.println(driver.getCurrentUrl());
	}

	@Test(groups = "My group")

	public void userLogin2() {

		System.out.println(driver.getCurrentUrl());
	}

	@Test

	public void userLogin3() {

		System.out.println("Excluded");
	}

	@AfterTest

	public void closeBrowser() {
		driver.quit();
	}
}
