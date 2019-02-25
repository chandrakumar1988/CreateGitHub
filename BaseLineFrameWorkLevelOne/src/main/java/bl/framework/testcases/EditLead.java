package bl.framework.testcases;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;


import projectMethods.ProjectMethods;

public class EditLead extends ProjectMethods {
	@Test
	public void leadedit()
	{
		//login();
		
		locateElement("link", "CRM/SFA").click(); 
		
		locateElement("link", "Create Lead").click();
		// Enter company name
		locateElement("id", "createLeadForm_companyName").sendKeys("wipro");
		// Enter the company name
		locateElement("id", "createLeadForm_firstName").sendKeys("raj");
		// Enter the lastName
		locateElement("id", "createLeadForm_lastName").sendKeys("kiran");
		
		locateElement("xpath","//input[@value ='Create Lead']").click();
		
		locateElement("xpath","//a[text() ='Edit']").click();
		locateElement("id", "updateLeadForm_companyName").clear();
		locateElement("id", "updateLeadForm_companyName").sendKeys("Mr copper");
			locateElement("xpath","//input[@value ='Update']").click();
		
	
		
		
	}

}
