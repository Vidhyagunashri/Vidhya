package org.test.Mavenexp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Testclass {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Desktop\\Mavenexp\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://snapdeal.com");
		
		WebElement m = driver.findElement(By.id("id"));
		m.click();
		
		driver.getWindowHandle()
		driver.switchTo().window(x);
		
		driver.switchTo().frame("xxxx");
		WebElement c = driver.findElement(By.xpath("//input[text()='text']"));
		c.sendKeys("vidhya");
		
		
	}

}
