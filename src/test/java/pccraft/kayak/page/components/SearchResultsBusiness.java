package pccraft.kayak.page.components;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;

import pccraft.kayak.page.objects.SearchResults;

public class SearchResultsBusiness extends SearchResults{

	
	
	public SearchResultsBusiness(WebDriver driver, Logger logger) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	public void selectIteinery(int n) {
		
		clickOnElement(getSelectItienery(n));
		
	}
	
	
	
	
	
}
