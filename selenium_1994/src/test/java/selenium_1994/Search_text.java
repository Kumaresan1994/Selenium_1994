package selenium_1994;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

 
public class Search_text {
	public static void main(String[] args) {
		searchtest();
	}
	public static void searchtest() {
		
		System.setProperty("webdriver.chrome.driver","F:/Java/Drivers/ChromeDriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://mvnrepository.com/");
		driver.findElement(By.name("q")).sendKeys("Selenium java");
		
		driver.findElement(By.className("button")).click();
		
		//driver.close();
		System.out.println("Test completed");		
	}
}
