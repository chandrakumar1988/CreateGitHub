package testng;


	import org.testng.annotations.Test;

	public class LearnAnnotations {
	  @Test(enabled=false)
	  public void openBrowser() {
		  System.out.println("I am openBrowser");
		  throw new RuntimeException();
	  } 
	  @Test(dependsOnMethods="openBrowser", alwaysRun=true)
	  public void goToUrl() {
		  System.out.println("I am goToUrl");
	  }
	  @Test
	  public void clickGmail() {
		  System.out.println("I am clickGmail");
}
}