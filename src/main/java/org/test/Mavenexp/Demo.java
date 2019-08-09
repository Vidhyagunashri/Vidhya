package org.test.Mavenexp;

import java.util.Date;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Demo {
	static Actions acc;
@BeforeClass
public static void launch()
{
	
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Desktop\\Mavenexp\\driver\\chromedriver.exe");
WebDriver d=new ChromeDriver();
d.get("http://greenstech.in/selenium-course-content.html");
}
	
	@Before
	public void startTime(){
		Date d1=new Date();
		System.out.println(d1);
	}
	
	
	@After
	public void endTime(){
		Date d2=new Date();
		System.out.println(d2);
	}
	@Test
	public void logic()
	{
		System.out.println("hi");
	}
	
	
	
	
}
