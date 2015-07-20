package pccraft.kayak.page.objects;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import pccraft.kayak.common.framework.Util;
import pccraft.kayak.common.page.KayakPage;

public class HomePage extends KayakPage {

	protected WebDriver driver;
	
	public HomePage(WebDriver driver){
		this.driver = driver;
	}
	
	public WebElement getTxtOrigin() {
	 return driver.findElement(By.cssSelector("#origin"));
	}
	
	public WebElement getTxtDestination () {
		return driver.findElement(By.cssSelector("#destination"));

	}
	
	
	public WebElement getTxtFromDate() {
	return  driver.findElement(By.cssSelector("#travel_dates-start"));
	}
	
	public WebElement getTxtToDate() {
	return  driver.findElement(By.cssSelector("#travel_dates-end"));
	}
	
	
	public WebElement getTxtClass() {
	return  driver.findElement(By.cssSelector(".r9-dropdownDialog-label"));
	}
	
	
	public WebElement getTxtCbin() {
	return driver.findElement(By.cssSelector("#cabin"));
	}
	
	public WebElement getBtnSearch() {
	return driver.findElement(By.cssSelector("#fdimgbutton"));
	}
	
	
	public WebElement getLnkFlights(){
		return driver.findElement(By.cssSelector("#headermaintabs>#flights-link"));
	}
	
	public WebElement getFromDate(){
		return driver.findElement(By.cssSelector("#travel_dates-start-display"));
	}
	
	public WebElement getToDate(){
		return driver.findElement(By.cssSelector("#travel_dates-end-display"));
	}
	
	
	
	
	public WebElement getDDOrigin(){
		return driver.findElement(By.xpath(".//*[@id='smartbox']//li[@class='ap selected']"));
	}
	
	public WebElement getDDDestination() {
		return driver.findElement(By.xpath(".//*[@id='smartbox']//li[@class='ap selected']"));
	}
	
	public WebElement getNearByOrigin(){
		return driver.findElement(By.cssSelector("#nearbyO"));
	}
	
	public WebElement getNearByDestination(){
		return driver.findElement(By.cssSelector("#nearbyD"));
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
