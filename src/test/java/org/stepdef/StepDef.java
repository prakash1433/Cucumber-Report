package org.stepdef;

import static org.junit.Assert.assertTrue;

import org.junit.Assert;
import org.pom.LoginPage;
import org.utils.BaseClass;

import cucumber.api.java.en.*;

public class StepDef extends BaseClass {
	@Given("User launch the browser and navigate to fb home page")
	public void user_launch_the_browser_and_navigate_to_fb_home_page() throws InterruptedException {
	    Browserlaunch();
	    geturl("https://www.facebook.com/");
	}

	@When("User enters the url")
	public void user_enters_the_url() {
	    	}

	@When("User enters the Username and password")
	public void user_enters_the_Username_and_password() {
	    LoginPage l=new LoginPage();
	    enetertext(l.getTxtusername(),"hai");
	    enetertext(l.getTxtpassword(), "hei");
	    		
	}

	@When("User click the login button")
	public void user_click_the_login_button() throws InterruptedException {
		LoginPage l=new LoginPage();
		btnclick(l.getLogin());
		Thread.sleep(3000);
	}

	@Then("User validate the homepage")
	public void user_validate_the_homepage() {
	   String currenturl=Validating();
	   System.out.println(currenturl);
	   Assert.assertTrue("user not see the home page",currenturl.contains("login"));
	   
	}
}
