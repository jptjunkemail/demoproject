/**
 * 
 */
package com.selenium.demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

/**
 * @author home
 *
 */
public class MyClass {
	
	private WebDriver driver = null;


	@Test
	@Parameters({ "myURL", "myTitle" })
	public void testEasy(String myURL, String myTitle) {
		driver.get(myURL);
	}

	@BeforeTest
	public void beforeTest() throws Exception {
		System.setProperty("webdriver.chrome.driver", "/home/home/Downloads/chromedriver_linux64/chromedriver");
		driver = new ChromeDriver();
	}

	@AfterTest
	public void afterTest() {
		driver.quit();
	}

}
