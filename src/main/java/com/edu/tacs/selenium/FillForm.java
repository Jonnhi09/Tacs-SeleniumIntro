package com.edu.tacs.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FillForm {

	public static void main(String[] args) {

		// Download driver and set path.
		System.setProperty("webdriver.chrome.driver", ".\\driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.toolsqa.com/automation-practice-form/");

		driver.findElement(By.name("firstname")).sendKeys("Jonathan");
		driver.findElement(By.name("lastname")).sendKeys("Prieto");
		driver.findElement(By.id("sex-0")).click();
		driver.findElement(By.id("exp-0")).click();
		driver.findElement(By.id("datepicker")).sendKeys("2019/04/13");
		driver.findElement(By.id("profession-1")).click();
		driver.findElement(By.id("tool-1")).click();
		new Select(driver.findElement(By.id("continents"))).selectByIndex(4);
		new Select(driver.findElement(By.id("continents"))).selectByIndex(3);

		driver.findElement(By.id("submit")).click();

	}
}
