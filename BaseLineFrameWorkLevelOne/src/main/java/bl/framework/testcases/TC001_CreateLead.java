package bl.framework.testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import projectMethods.ProjectMethods;



public class TC001_CreateLead extends ProjectMethods{
	
	@BeforeTest
	public void setData() {
		testcaseName = "TC001_CreateLead";
		testDec = "Create a new Lead in leaftaps";
		author = "Gayatri";
		category = "Smoke";
	} 
	@Test
	public void createLead() {
		click(locateElement("link", "Leads"));
		click(locateElement("link", "Create Lead"));
		clearAndType(locateElement("id", "createLeadForm_companyName"), "TL");
		clearAndType(locateElement("id", "createLeadForm_firstName"), "koushik");
		clearAndType(locateElement("id", "createLeadForm_lastName"), "c");
		click(locateElement("name", "submitButton")); 
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
/*//	@Test(priority = 2)
//	@Test(enabled = false)
	public void createLead1() {
		click(locateElement("link", "Leads"));
		click(locateElement("link", "Create Lead"));
		clearAndType(locateElement("id", "createLeadForm_companyName"), "TL");
		clearAndType(locateElement("id", "createLeadForm_firstName"), "Koushik");
		clearAndType(locateElement("id", "createLeadForm_lastName"), "Ch");
		click(locateElement("name", "submitButton")); 
	}*/
	
	
	
}






