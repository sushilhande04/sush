package com.selenium.website;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;



public class Website {

	public static void main(String[] args) throws InterruptedException, AWTException {
		System.setProperty("webdriver.chrome.driver", "D://chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://softwaretesting-guru.blogspot.com/p/main-page.html");
		driver.findElement(By.linkText("Selenium Practice page")).click();
		Thread.sleep(6000);
		driver.findElement(By.name("Name")).sendKeys("akjds");
		driver.findElement(By.name("subscribe")).click();
		Select select = new Select(driver.findElement(By.name("countries")));
		select.selectByVisibleText("Afganistain");
		driver.findElement(By.xpath("//option[@value='IBM']")).click();
		driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys("sushil20");
		driver.findElement(By.xpath("//input[@value='bad']")).click();
		driver.findElement(By.xpath("//input[@value='Submit']")).click();
		String s = driver.switchTo().alert().getText();
		System.out.println(s);
		driver.switchTo().alert().accept();
		driver.findElement(By.xpath("//input[@onclick='disp_confirm()']")).click();
		
		String confirmBox = driver.switchTo().alert().getText();
		System.out.println(confirmBox);
		Thread.sleep(4000);
		driver.switchTo().alert().accept();
		driver.findElement(By.name("Name")).sendKeys(Keys.CONTROL+"a");
		driver.findElement(By.name("Name")).sendKeys(Keys.CONTROL+"c");
		driver.findElement(By.name("comments")).sendKeys(Keys.CONTROL+"v");
		//robot class used to dropdown ,enter
		Robot robot = new Robot();//its belong to java.awt.Robot
		robot.keyPress(KeyEvent.VK_PAGE_DOWN);
		Thread.sleep(2000);
		//Actions Class used to Drag and drop
		Actions action =  new Actions(driver);
		WebElement source = driver.findElement(By.linkText("UIPath Online Training"));
		WebElement target = driver.findElement(By.name("comments"));
		
		action.dragAndDrop(source, target).build().perform();
		
		
		
		
	}
}
