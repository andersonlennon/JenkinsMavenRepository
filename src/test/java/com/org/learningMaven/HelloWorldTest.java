package com.org.learningMaven;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class HelloWorldTest {

	@Test
	public void Login() throws InterruptedException{		
		WebDriver driver = new FirefoxDriver();
		driver.get("http://google.com");
		if(driver.findElement(By.id("lst-ib")).isDisplayed()){
			System.out.println("Elemento encontrado");
			driver.findElement(By.id("lst-ib")).sendKeys("Testando");
			System.out.println("Texto enviado");
		}
		else{
			System.out.println("Elemento não encontrado");
		}
		Thread.sleep(3000);
		driver.quit();
	}
}
