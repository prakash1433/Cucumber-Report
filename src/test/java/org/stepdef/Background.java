package org.stepdef;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.utils.BaseClass;

import cucumber.api.java.en.*;

public class Background extends BaseClass {
	@Given("User is on adactin page")
	public void user_is_on_adactin_page() {
	    Browserlaunch();
	    geturl("https://adactinhotelapp.com/");
	}

	@When("User enters the username and password")
	public void user_enters_the_username_and_password() {
	    WebElement txtusername=driver.findElement(By.id("username"));
	    WebElement txtpass=driver.findElement(By.id("password"));
	    enetertext(txtusername, "karthi007");
	    enetertext(txtpass, "Karthi@1989");
	}

	@When("user click the login button")
	public void user_click_the_login_button() {
	    WebElement login=driver.findElement(By.id("login"));
	    btnclick(login);
	}

	@When("user is on search page and need to select something")
	public void user_is_on_search_page_and_need_to_select_something() {
	    WebElement location=driver.findElement(By.id("location"));
	    select(location, "Melbourne");
	    WebElement roomno = driver.findElement(By.id("room_nos"));
	    selectbyvalue(roomno, 2);
	    WebElement checkindata=driver.findElement(By.id("datepick_in"));
	    checkindata.sendKeys("24/05/2021");
	    WebElement checkoutdata=driver.findElement(By.id("datepick_out"));
	    checkoutdata.sendKeys("25/05/2021");
	    WebElement adultsperroom=driver.findElement(By.id("adult_room"));
	    selectbyvalue(adultsperroom, 3);
	    WebElement childperroom=driver.findElement(By.id("child_room"));
	    selectbyvalue(childperroom, 2);
	    
	}


	@When("User need to click the login button")
	public void user_need_to_click_the_login_button() throws InterruptedException {
		driver.findElement(By.id("Submit")).click();
		driver.findElement(By.id("radiobutton_1")).click();
		driver.findElement(By.id("continue")).click();
		driver.findElement(By.id("first_name")).sendKeys("prakash");
		driver.findElement(By.id("last_name")).sendKeys("ponnusamy");
		driver.findElement(By.id("address")).sendKeys("chenni-60028");
		driver.findElement(By.id("cc_num")).sendKeys("1234567898765432");
		WebElement cardtype=driver.findElement(By.id("cc_type"));
		select(cardtype, "VISA");
		WebElement expm=driver.findElement(By.id("cc_exp_month"));
		select(expm, "March");
		WebElement expy=driver.findElement(By.id("cc_exp_year"));
		select(expy, "2022");
		driver.findElement(By.id("cc_cvv")).sendKeys("123");
		driver.findElement(By.id("book_now")).click();
		Thread.sleep(7000);
		WebElement orderno= driver.findElement(By.id("order_no"));
	    String string=orderno.getAttribute("value");
		System.out.println(string);
	}

	@When("User is on search page need to select somthing")
	public void user_is_on_search_page_need_to_select_somthing() {
		 WebElement hotels=driver.findElement(By.id("hotels"));
		    select(hotels, "Hotel Sunshine");
		    WebElement roomtype=driver.findElement(By.id("room_type"));
		    select(roomtype, "Deluxe");
		    
	}

	@When("User need to click search button")
	public void user_need_to_click_search_button() {
		driver.findElement(By.id("Submit")).click();
	}

	@Then("User need to validate error message")
	public void user_need_to_validate_error_message() {
	    System.out.println("Page error");
	}
}
