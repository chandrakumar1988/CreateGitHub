package bl.framework.testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import projectMethods.ProjectMethods;



public class TC002_DeleteLead extends ProjectMethods{
	@BeforeTest(groups="common")
	public void setData() {
		testcaseName = "TC002_DeleteLead";
		testDec = "Edit  Lead in leaftaps";
		author = "Gayatri";
		category = "Smoke";
	} 
	@Test(groups="reg") 
	public void deleteLead() throws InterruptedException {
		
		click(locateElement("link", "Leads"));
		click(locateElement("link", "Find Leads"));
		click(locateElement("xpath","//span[text()='Phone']"));
		clearAndType(locateElement("name", "phoneNumber"), "99"); 
	    click(locateElement("xpath","//button[text()='Find Leads']"));
	 /*   Thread.sleep(1000);
	    click(locateElement("xpath", "//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a"));
	    click(locateElement("link", "Edit"));
	    clearAndType(locateElement("id","updateLeadForm_companyName"), "TCS");
	    click(locateElement("name", "submitButton"));*/
	
	
	}
	
	@Test
	public void editLead1() throws InterruptedException {
		
		click(locateElement("link", "Leads"));
		click(locateElement("link", "Find Leads"));
		click(locateElement("xpath","//span[text()='Phone']"));
		clearAndType(locateElement("name", "phoneNumber"), "99"); 
	    click(locateElement("xpath","//button[text()='Find Leads']"));
	 /*   Thread.sleep(1000);
	    click(locateElement("xpath", "//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a"));
	    click(locateElement("link", "Edit"));
	    clearAndType(locateElement("id","updateLeadForm_companyName"), "TCS");
	    click(locateElement("name", "submitButton"));*/
	
	
	}
	
	
}


