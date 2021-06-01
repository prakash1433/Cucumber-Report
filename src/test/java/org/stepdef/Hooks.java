package org.stepdef;

import org.utils.BaseClass;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks extends BaseClass{
@Before
public void beforeSecnario() {
	System.out.println("Before Scenario Tag");

}
@Before("@reg")
public void beforeRegTag() {
	System.out.println("Before Reg Tag");
}
@After("@reg")
public void aftersRegTag() {
	System.out.println("After Reg tag");
	

}@Before("@smoke")
public void beforeSmokeTag() {
	System.out.println("Before smoke Tag");
}
@After("@smoke")
public void aftersmokeTag() {
	System.out.println("After smoke tag");
	

}
@After
public void afterSenario() {
	System.out.println("After secnario");
	//driver.close();

}
}
