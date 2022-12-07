package com.google.Maven;

import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeDriverDemo {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\resources\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.google.com");

	}

}
