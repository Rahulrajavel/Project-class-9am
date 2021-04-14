package org.rahul.maven;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.Method;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Adactin1 extends BaseClass{
	static WebDriver driver;
@BeforeClass
public static void browser() {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Rahul.R\\eclipse-workspace\\SeleniumRahul\\driver\\chromedriver.exe");
driver=new ChromeDriver();
driver.get("https://adactinhotelapp.com/");
}
@Parameters({"userName","password"})
@Test
public void tc0(String s, String s1) {
 WebElement txtUser = driver.findElement(By.id("username"));
 txtUser.sendKeys(s);
 WebElement txtPass = driver.findElement(By.id("password"));
 txtPass.sendKeys(s1);
 WebElement btnLogin = driver.findElement(By.id("login"));
 btnLogin.click();
 }
@Parameters({"location","Hotel","roomtype","numberofrooms","adult","child"})
@Test
private void tc1(String location, String Hotel,String roomtype,String numberofrooms,String adult,String child) {
	WebElement loc = driver.findElement(By.id("location"));
	loc.sendKeys(location);
	WebElement hotel = driver.findElement(By.id("hotels"));
	hotel.sendKeys(Hotel);
	WebElement room = driver.findElement(By.id("room_type"));
	room.sendKeys(roomtype);
	WebElement num = driver.findElement(By.id("room_nos"));
	num.sendKeys(numberofrooms);
	WebElement adults = driver.findElement(By.id("adult_room"));
	adults.sendKeys(adult);
	WebElement children = driver.findElement(By.id("child_room"));
	children.sendKeys(child);
	WebElement btnSub = driver.findElement(By.id("Submit"));
	btnSub.click();
}
@Test
private void tc2() {
	WebElement btnselect = driver.findElement(By.id("radiobutton_0"));
	btnselect.click();
	WebElement btnCont = driver.findElement(By.id("continue"));
	btnCont.click();
}
@Parameters({"Fname","Lname","BillingAddress","CCnum","CCtype","CCExpMonth","CCExpYear","CVVNum"})
@Test
private void tc3(String Fname,String Lname,String BillingAddress,String CCnum,String CCtype,String CCExpMonth,String CCExpYear,String CVVNum) throws InterruptedException {
	WebElement first = driver.findElement(By.id("first_name"));
	first.sendKeys(Fname);
	WebElement last = driver.findElement(By.id("last_name"));
	last.sendKeys(Lname);
	WebElement address = driver.findElement(By.id("address"));
	address.sendKeys(BillingAddress);
	WebElement ccnum = driver.findElement(By.id("cc_num"));
	ccnum.sendKeys(CCnum);
	WebElement cctype = driver.findElement(By.id("cc_type"));
	cctype.sendKeys(CCtype);
	WebElement ccmon = driver.findElement(By.id("cc_exp_month"));
	ccmon.sendKeys(CCExpMonth);
	WebElement ccyear = driver.findElement(By.id("cc_exp_year"));
	ccyear.sendKeys(CCExpYear);
	WebElement cvv = driver.findElement(By.id("cc_cvv"));
	cvv.sendKeys(CVVNum);
	WebElement btnBook = driver.findElement(By.id("book_now"));
	btnBook.click();
	
	}
@Test
private void ulogout() {
	WebElement btnLog = driver.findElement(By.xpath("//a[text()='Logout']"));
	btnLog.click();
}
@AfterMethod
private void after(Method m) throws IOException {
	screenshot(m.getName());
	}
}




