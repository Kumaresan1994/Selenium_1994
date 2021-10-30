package selenium_1994;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.Googlesearchpage;

public class Test {
		private static WebDriver driver = null;
		
		public static void main(String[] args) {
			searchtest();
		}
		public static void searchtest() {
			
			System.setProperty("webdriver.chrome.driver","F:/Java/Drivers/ChromeDriver.exe");
			driver = new ChromeDriver();
			
			driver.manage().window().maximize();
			driver.get("https://google.com");
			//driver.findElement(By.name("q")).sendKeys("Selenium java");
			Googlesearchpage.textbox_search(driver).sendKeys("Selenium java");
			
			Googlesearchpage.button_seach(driver).sendKeys(Keys.RETURN);
			//driver.findElement(By.name("btnK")).sendKeys(Keys.RETURN);
			driver.close();
			
			System.out.println("Test completed");		
		}
	}

