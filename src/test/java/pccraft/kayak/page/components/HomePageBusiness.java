package pccraft.kayak.page.components;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import pccraft.kayak.common.framework.Util;
import pccraft.kayak.page.objects.HomePage;
import pccraft.kayak.test.data.TestData.FlightSearchData;

public class HomePageBusiness extends HomePage{

	public HomePageBusiness(WebDriver driver, Logger logger) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	
	
	public void searchFlights(FlightSearchData flightSearchData){
		// Click on Flights link
		clickOnElement(getLnkFlights());
		Util.sleep(5000);
		
		// Enter Origin
		setText(getTxtOrigin(), flightSearchData.Origin);
		Util.sleep(5000);
		clickOnElement(getDDOrigin());
		
		// Enter Destination
		setText(getTxtDestination(), flightSearchData.Destination );
		Util.sleep(5000);
		clickOnElement(getDDDestination());
		
		// Enter From Date
		clickOnElement(getTxtFromDate());
		setText(getFromDate(), flightSearchData.StartDate, false);
		
		// Enter To Date
		clickOnElement(getTxtToDate());
		setText(getToDate(), flightSearchData.ReturnDate, false);
		
		if(flightSearchData.OriginNearBy.equalsIgnoreCase("Yes")){
			selectCheckBox(getNearByOrigin(), true);
		}
		if(flightSearchData.DestinationNearBy.equalsIgnoreCase("Yes")){
			selectCheckBox(getNearByDestination(), true);
		}
		
		
		// Click on Search button
		clickOnElement(getBtnSearch());
		
	}

}
