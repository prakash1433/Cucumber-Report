package org.utils;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class ReportGenerator {
public static void generateGVMReport(String json) {
	File file=new File("C:\\Users\\home\\eclipse-workspace\\PrakashCucumber\\Report");
	Configuration config=new Configuration(file, "Sample Report");
	config.addClassifications("Platform", "Windows");
	config.addClassifications("Browser","Chrome");
	config.addClassifications("Browser version", "90.08.234");
	config.addClassifications("Environment", "QA");
	config.addClassifications("Sprint No","12345");
	
	List<String> li=new ArrayList<String>();
	li.add(json);
	ReportBuilder builder=new ReportBuilder(li, config);
	builder.generateReports();
		
}
}
