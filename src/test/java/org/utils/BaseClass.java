package org.utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;



public class BaseClass {
	 public static WebDriver driver;
public static void Browserlaunch() {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\home\\eclipse-workspace\\PrakashCucumber\\Driver\\chromedriver.exe");
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	}
public static void geturl(String data) {
	 driver.get(data);
	
	}
public static void enetertext(WebElement element,String data) {
	element.sendKeys(data);

}
public static void btnclick(WebElement element) {
	element.click();
}
public static String Validating() {
	String string=driver.getCurrentUrl();
	return string;

}public static void select(WebElement element,String data) {
	Select sa=new Select(element);
	sa.selectByVisibleText(data);

}
public static void selectbyvalue(WebElement element,int data) {
	Select se=new Select(element);
	se.selectByIndex(data);

}
}
