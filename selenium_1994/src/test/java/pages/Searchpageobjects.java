package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Searchpageobjects {
	
	WebDriver driver = null;
	
	By textbox_search = By.name("q");
	By button_search = By.name("btnK");
	By clicklink = By.xpath("//h3[contains(text(),'Selenium & Java Tutorial : How to run Automated Test')]");
	//By developersdropdown = By.xpath("//header/div[1]/div[1]/div[1]/nav[1]/ul[1]/li[2]/button[1]/span[1]");
	
	public Searchpageobjects(WebDriver driver) {
		this.driver = driver;
	}
	public void searchboxtext(String text) {
		driver.findElement(textbox_search).sendKeys(text);
	}
	public void clicksearchbutton() {
		driver.findElement(button_search).submit();
}
	public void clicklink() {
		driver.findElement(clicklink).click();
		
	}
}