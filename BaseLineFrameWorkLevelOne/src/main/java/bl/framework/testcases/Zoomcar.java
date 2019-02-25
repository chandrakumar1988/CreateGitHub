package bl.framework.testcases;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.collections4.Get;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;



public class Zoomcar {
	
	public static void main(String[] args) throws InterruptedException {
		
		//Lunch browser
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		// Lunch the URL
		driver.get("https://www.zoomcar.com/chennai");
		
		//Click on the Start your wonderful journey link

		driver.findElementByXPath("//a[text()='Start your wonderful journey']").click();
		
		// In the Search page, Click on the any of the pick up point under POPULAR PICK-UP POINTS
		
		/*Set<String> handles = driver.getWindowHandles();
		List<String> ls= new ArrayList<>(handles);
		ls.addAll(handles);
		//switch to window
		driver.switchTo().window(ls.get(1));
		System.out.println("Window Tilte---->:"+driver.getTitle());*/
		
		//Enter city
	
		
		// start point 
		//WebElement startpoint=driver.findElementByXPath("//input[@placeholder='Tell us your Starting point in Chennai']");
		//startpoint.sendKeys("kodambakkam");
		
		//start point
		
		WebElement startpoint=driver.findElementByXPath("//div[@class='items'][2]");
		startpoint.click();
		//Click on the Next button

			driver.findElementByXPath("//button[@class='proceed']").click();
			//Specify the Start Date as tomorrow Date

			// Get the current date
						
			Date date = new Date();		
			DateFormat sdf = new SimpleDateFormat("dd");				
			String today = sdf.format(date);		 
			int tomorrow = Integer.parseInt(today)+2;				
			driver.findElementByXPath("//div[contains(text(),"+tomorrow+")]").click();
				
			
		/*	List<WebElement> dateclick = driver.findElementsByXPath(" //div[@class ='days']");
			dateclick.get(2).click();*/
			driver.findElementByXPath(" //button[text() ='Next']").click();
			driver.findElementByXPath("//button[text()='Done']").click();
			/*Thread.sleep(3000);
			driver.findElementByXPath("//label[text()='Sort by:']//following::div[1]").click();
			*/
			WebElement carlist = driver.findElementByXPath("//div[@class='car-list-layout']");
			
			carlist.findElements(By.xpath("//div[@class='car-listing']"));
			
		List<WebElement>	carprices=carlist.findElements(By.xpath("//div[@class='price']"));
		List<Integer> lsprices =new ArrayList<>();
			for (WebElement eachcarprice : carprices) {
				String prices=eachcarprice.getText();
				String outputprice = prices.replaceAll("\\D","" ).trim();
				
				
				int intprice = Integer.parseInt(outputprice);
				lsprices.add(intprice);
		
			
			
				
			}
			Collections.sort(lsprices);
			
			//System.out.print(lsprices);
		Integer output = lsprices.get(lsprices.size()-1);
		//String stringout = output.toString();
		System.out.println(output);
			
			String text = driver.findElementByXPath("//div[contains(text(),'"+514+"')]/preceding::h3[1]").getText();
			System.out.println(text+"---_>------>"+output);
		
			
			
			
			
			
		

		
		
		
	}

}
