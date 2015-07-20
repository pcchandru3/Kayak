package pccraft.kayak.testsuite.testscenario1;


import java.util.List;
import java.util.Map;

import org.apache.log4j.Logger;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pccraft.kayak.common.framework.BaseTest;
import pccraft.kayak.common.framework.Util;
import pccraft.kayak.page.components.HomePageBusiness;
import pccraft.kayak.page.components.SearchResultsBusiness;
import pccraft.kayak.page.objects.HomePage;
import pccraft.kayak.test.data.TestData;

public class EndToEndFlow extends BaseTest{
	
	
	@BeforeMethod(alwaysRun = true)
	
	protected void beforeMethod(Object[] params){
		
		super.beforeMethod(params);
		System.out.println("In side before method");
	}
	
	@AfterMethod
	protected void afterMethod(){
		super.afterMethod();
		
	}
	
	@Test(dataProvider = "TestDataXLS")
	@TestDataXLS(fileName = "src/test/resources/TestDataInput.xls", sheetName="TestExecution")
	public void EndToEndFlowTest(List<TestData> lstTestData, String sBrowser, String sSite ) {
		
		int count = 0;
		
		logger.info("************************************ Test Scenario : EndToEndFlow ***************************************************************");
		for(int i=0;i<lstTestData.size(); i++){
			
			count++;
			
			logger.info("=============== Start : Test Iteration "+ count + "============== ");
			System.out.println("In side main test");
			
			TestData testData = lstTestData.get(i);
			
			HomePageBusiness homePage = new HomePageBusiness(driver, logger);
			SearchResultsBusiness searchResults = new SearchResultsBusiness(driver, logger);
			
			//Search for a flight
			logger.info("Search for Flights");
			homePage.searchFlights(testData.flightSearchData);
			Util.sleep(10000);
			
			// Validate Search Results
			if(searchResults.getOriginAirport(0).getText().equalsIgnoreCase(testData.flightSearchData.Origin))
				logger.info("Origin matches in search results page");
			
			if(searchResults.getDestinationAirport(0).getText().equalsIgnoreCase(testData.flightSearchData.Destination))
				logger.info("Destination matches in search results page");
			
			// Select an iteinery
			logger.info("Select the Iteinery");
			searchResults.selectIteinery(0);
			
			logger.info("=============== End : Test Iteration "+ count + "============== ");
			
		
		
		}
		
		
		logger.info("***************************************************************************************************************");
		
	}
	
	
	
	
	
	/*
	
	Use Case to Automate

	Go to Kayak.com
	Enter Origin and Destination Cities
	Select Departure and Return Dates
	Select Near by airports for both origin and destination - this is optional - if the data is provided, you will select, if not you will not select
	Click Search
	On search results page, select the search result N, where N is the input data
	Assert the Origin and Destination Details are same as the one entered in the main screen
	Log all critical information of the selected flight option, for the reporting purpose
	Things to consider

	Parameterize the test input as much as possible
	Possible to iterate multiple test inputs - script should be running for at least 3 iterations
	Any specific design pattern
	Minimal impact of object property changes - eg. if the ID / XPath of any object changes, it should be changeable in one place
	Reporting

	Detailed Log Messages
	Assertion messages
	
	
	*/

}
