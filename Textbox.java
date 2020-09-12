package com.selenium.textbox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Textbox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D://chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		String baseURL = "https://accounts.google.com/signin/v2/identifier?service=mail&passive=true&rm=false&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&ss=1&scc=1&ltmpl=default&ltmplcache=2&emr=1&osid=1&flowName=GlifWebSignIn&flowEntry=ServiceLogin";
		driver.get(baseURL);
		//ID as a Locator
		//driver.findElement(By.name("identifier")).sendKeys("sushilhande004");
		
		//xpath as a locator
		driver.findElement(By.xpath("//input[@id='identifierId']")).sendKeys("sushilhande004@gmail.com");
		driver.findElement(By.xpath("//span[@class='RveJvd snByac']")).click();
	}

}