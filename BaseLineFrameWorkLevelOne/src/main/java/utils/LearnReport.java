package utils;

import java.io.IOException;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;


public class LearnReport {
	//below three are class
	ExtentHtmlReporter html;
	ExtentReports extent;
	ExtentTest test;
	//calling the class into object
	@Test
	public void runReport() {
		html = new ExtentHtmlReporter("./Report/extentreport.html");
		//to edit that normal flat file
		extent = new ExtentReports();
		
		//appened the file
		html.setAppendExisting(true);
		//which file you want to edit
		extent.attachReporter(html);
		
		test=extent.createTest("TC001_LoginAndLogout", "Login into Application");
		//who did the testing
		test.assignAuthor("Chandra");
	//what tpye of testing
		test.assignCategory("Sanity");
		
		//test status- mediabuilder attach the screen shot +build -> concantinate string +img
		try {
			test.fail("UserName DemoSalesManager entered sucessfully",MediaEntityBuilder.createScreenCaptureFromPath("./../snaps/img1.png").build() );
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		// load the report from temp to memory
		extent.flush();
		
		
		
		
		
}
}
