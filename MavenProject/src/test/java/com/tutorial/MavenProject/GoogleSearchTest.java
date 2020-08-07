package com.tutorial.MavenProject;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

public class GoogleSearchTest {
	WebDriver driver;
	String baseUrl;

	@BeforeMethod
	public void beforeMethod() {
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		baseUrl= "https://www.google.com";
	}
	
	@Test
	public void f() {
		driver.get(baseUrl);
		driver.findElement(By.name("q")).sendKeys("Harry Potter"+"\n");
	}

	@AfterMethod
	public void afterMethod() throws InterruptedException {
		Thread.sleep(2000);
		driver.quit();
	}

}
