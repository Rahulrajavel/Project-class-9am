package org.rahul.maven;

	import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;

	public class BaseClass {
		static WebDriver driver;
		public static void screenshot(String name) throws IOException {
			TakesScreenshot screen = (TakesScreenshot)driver;
			File loc = screen.getScreenshotAs(OutputType.FILE);
	        File dest= new File ("C:\\Users\\Rahul.R\\eclipse-workspace\\RahulMaven\\target\""+name+".png");
	        FileUtils.copyFile(loc, dest);
		}
	
	public WebDriver getDriver() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rahul.R\\eclipse-workspace\\SeleniumRahul\\driver\\chromedriver.exe");
	driver=new ChromeDriver();
	return driver;
	}
	public void loadUrl(String url) {
		driver.get(url);
	}
	public void maximize() {
		driver.manage().window().maximize();
	}


	public void type(WebElement element, String data) {
		element.sendKeys(data);
	}
	public void click(WebElement element) {
		element.click();
	}
	public void quit() {
		driver.quit();
	}
	










	}


