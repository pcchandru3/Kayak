package pccraft.kayak.page.objects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import pccraft.kayak.common.page.KayakPage;

public class SearchResults extends KayakPage {

	protected WebDriver driver;
	
	public SearchResults(WebDriver driver){
		this.driver = driver;
	}
	
	
	public WebElement getSelectItienery(int n){
		
		List<WebElement> l = driver.findElements(By.xpath(".//*[@class='inner']//div[@class='vmb-btn']//a"));
		
		return l.get(n);
		
		
	}
	
	
	
	
	
	public WebElement getOriginAirport(int n) {
		
		List<WebElement> l = driver.findElements(By.xpath(".//div[@class='singleleg singleleg0']//div[@class='airport'][1]"));
				
		return l.get(n);
		
	}
	

	
	public WebElement getDestinationAirport(int n) {
		
		List<WebElement> l = driver.findElements(By.xpath(".//div[@class='singleleg singleleg0']//div[@class='airport'][2]"));
						
		return l.get(n);
		
	}
	
	
}
