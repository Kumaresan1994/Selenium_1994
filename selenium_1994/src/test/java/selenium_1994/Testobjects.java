package selenium_1994;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.Searchpageobjects;

public class Testobjects {
	
	private static WebDriver driver = null ;
	
	public static void main(String[] args) {
		searchtextobjects();
	}
	public static void searchtextobjects() {
		
		System.setProperty("webdriver.chrome.driver","F:/Java/Drivers/ChromeDriver.exe");
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://google.com");
		
		Searchpageobjects Searchpageobj = new Searchpageobjects(driver);
		
		Searchpageobj.searchboxtext("Selenium Java");
		Searchpageobj.clicksearchbutton();
		Searchpageobj.clicklink();
		driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
		//Searchpageobj.developersdropdown();
		driver.close();
		System.out.println("Test completed");
	}
}
