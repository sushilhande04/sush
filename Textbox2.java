package com.selenium.textbox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Textbox2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//read , clear from text box
		System.setProperty("webdriver.chrome.driver","D://chromedriver.exe");
		WebDriver drive = new ChromeDriver();
		//To read text "search" in textbox which is by default in hdfcbank.com
		String baseurl = "https://www.hdfcbank.com/";
		drive.get(baseurl);
		drive.manage().window().maximize();
		drive.findElement(By.className("popupCloseButton")).click();
		drive.findElement(By.className("searchbox")).sendKeys("personal loan");
		//drive.findElement(By.className("sf-searchicon")).click();
//		String x = drive.findElement(By.xpath("//input[@placeholder='Search']")).getAttribute("placeholder");
//		
//		System.out.println(x);
//		drive.findElement(By.xpath("//input[@placeholder='Search']")).sendKeys("personal loan");
//		x = drive.findElement(By.xpath("//input[@placeholder='Search']")).getAttribute("placeholder");
//		System.out.println(x);
//		
		
	}

}
