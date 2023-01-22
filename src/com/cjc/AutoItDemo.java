package com.cjc;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoItDemo
{
public static void main(String[] args) throws InterruptedException, IOException   {
		
		System.setProperty("webdriver.chrome.driver", "E:\\Software\\chrome exe104\\chromedriver_win32\\chromedriver.exe");
		
		System.out.println("open I love pdf");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.ilovepdf.com/pdf_to_word");
		driver.manage().window().maximize();
		
		driver.manage().timeouts().pageLoadTimeout(10,TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//*[@id=\"pickfiles\"]")).click();
		
		
		Thread.sleep(2000);
		
		Runtime.getRuntime().exec("D:\\AutoItExe\\autoit.exe");
		
		
		
}
}
