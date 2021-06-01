package org.testrunner;

import org.junit.AfterClass;
import org.junit.runner.RunWith;
import org.utils.ReportGenerator;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features= {"src\\test\\resources\\Features\\Background.feature"},glue={"org.stepdef"},monochrome=true,plugin= {"pretty","json:C:\\Users\\home\\eclipse-workspace\\PrakashCucumber\\Report\\re.json"})
public class TestRunner {

	@AfterClass
	public static void afterclass() {
		ReportGenerator.generateGVMReport("C:\\Users\\home\\eclipse-workspace\\PrakashCucumber\\Report\\re.json");
		

	}
}
//dryRun=false,monochrome=true,plugin={"pretty","html:C:\\Users\\home\\Desktop\\photos","junit:C:\\Users\\home\\Desktop\\photos\\fg.xml","json:C:\\Users\\home\\Desktop\\photos\\fb.json"},snippets=SnippetType.CAMELCASE,tags= {"@e2e"}