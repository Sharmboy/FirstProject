package org.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SampleProgram {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\ASUS\\eclipse-workspace\\SeleniumProject\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		WebElement txtUserName = driver.findElement(By.id("email"));
		txtUserName.sendKeys("sharmboy");
		WebElement txtPassword = driver.findElement(By.id("pass"));
		txtPassword.sendKeys("sharm");
		driver.quit();

	}

}
