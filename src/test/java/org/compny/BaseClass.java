package org.compny;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class BaseClass {

	public static  WebDriver driver; 
	public static Select s;
	public static void browserLaunch(String url) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\RAM SARATH KUMAR\\eclipse-workspace\\Adactin\\dri\\chromedriver.exe");
		 driver = new ChromeDriver ();
		driver.get(url);
		driver.manage().window().maximize();	
	}
	
	public  static WebElement findElement(String xpath) {
		WebElement element = driver.findElement(By.xpath(xpath));
		return element;
	}

	public static void enterText(WebElement element, String data) {
		element.sendKeys(data);
	}
	
	public static void selectByIndex(WebElement element, int index) {
		s = new Select(element);
		s.selectByIndex(index);
	}
	
	public static void selectByValue(WebElement element, String value) {
		s = new Select(element);
		s.selectByValue(value);
	}
	
	
	public static void selectByVisibleText(WebElement element, String text) {
		s = new Select(element);
		s.selectByValue(text);
	}
	
	public static void click(WebElement element) {
		element.click();
	}
	
	
}
