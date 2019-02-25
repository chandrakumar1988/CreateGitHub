package bl.framework.testcases;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.WebElement;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import bl.framework.api.SeleniumBase;

import projectMethods.ProjectMethods;

public class CreatLeadTestCases extends ProjectMethods {


	@Test(dataProvider="getdata")
	// Login the application

	public void loginapp(String cname, String fname,String lname ) {
/*	// Launch the browser
		startApp("Chrome", "http://leaftaps.com/opentaps/control/main");
		// Enter user name and password
		locateElement("id", "username").sendKeys("DemoSalesManager");
		locateElement("id", "password").sendKeys("crmsfa");
		locateElement("class", "decorativeSubmit").click();
		// click on the crm link
*/		
		
		//login();
	//locateElement("link", "CRM/SFA").click();
		// Navigate to create lead page
		locateElement("link", "Create Lead").click();
		// Enter company name
		locateElement("id", "createLeadForm_companyName").sendKeys(cname);
		// Enter the company name
		locateElement("id", "createLeadForm_firstName").sendKeys(fname);
		// Enter the lastName
		locateElement("id", "createLeadForm_lastName").sendKeys(lname);
		
		
		
/*		////input [@value ='Create Lead']

		// Select the drop down ussing visble text
		WebElement dm = locateElement("id", "createLeadForm_dataSourceId");
		selectDropDownUsingValue(dm, "LEAD_CONFERENCE");
		// Select the drop down from index

		WebElement indexval = locateElement("id", "createLeadForm_industryEnumId");
		selectDropDownUsingIndex(indexval, 1);

		// going to parent window
		locateElement("xpath", "//img[@src ='/images/fieldlookup.gif']").click();

		// *****switch to another window***

		// Get the tile of the window

		//switchToWindow(title);
		// open the window
		switchToWindow(0);

		// window handle

		// submitButton
	*/
	

//locateElement("xpath","//input[@value ='Create Lead']").click();
	}
	@DataProvider(name ="getdata")
	public Object[][] fetchdata()
	{
		
		Object [][]  data = new Object[2][3];
		data[0][0] ="Wipro";
		data[0][1] ="chandra";
		data[0][2] ="c";
		
		data[1][0] ="LTI";
		data[1][1] ="kumar";
		data[1][2] ="b";
		return data;
	} 
	@DataProvider(name ="getdata1")
	public Object[][] fetchdata1()
	{
		Object [][]  data = new Object[2][3];
		data[0][0] ="zoho";
		data[0][1] ="chandra";
		data[0][2] ="c";
		
		data[0][0] ="Mr.copper";
		data[0][1] ="kumar";
		data[0][2] ="b";
		return data;
	} 
	


}
