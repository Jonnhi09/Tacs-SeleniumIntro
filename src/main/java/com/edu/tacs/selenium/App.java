package com.edu.tacs.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class App {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", ".\\driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("http://newtours.demoaut.com/");

		WebElement register = driver.findElement(By.xpath("//a[text()='REGISTER']"));

		register.click();

		driver.findElement(By.id("email")).sendKeys("jonathan@mail.com");

		driver.findElement(By.name("password")).sendKeys("tacs2019");
		driver.findElement(By.name("confirmPassword")).sendKeys("tacs2019");

		driver.findElement(By.name("register")).click();

	}
}
