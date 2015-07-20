package pccraft.kayak.common.framework;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.DataProvider;

import pccraft.kayak.common.utils.XLSData;
import pccraft.kayak.test.data.TestData;

public class BaseTest {
	
	public WebDriver driver;
	public Logger logger;
	//public String sBrowser = "";
	//public String sSite = "";
	
	
	
	
	
	
	@DataProvider(name="TestDataXLS")
	public Object[][] testDataProvider() {
		System.out.println("In side data provider");
		List<String> l = new ArrayList<String>();
		l.add("One");
		l.add("Two");
		l.add("Three");
		
		
		
		Map<String,String> map = new HashMap<String,String>();
		map.put("1",  "One");
		map.put("2",  "Two");
		map.put("3",  "Three");
		
		
		
		
		
		List<TestData> testData = XLSData.readTestData("/Users/cpanag/01WorkingFolder/My-GitHub/Kayak/kayak/src/test/resources/TestDataInput.xls", "TestExecution");
		
		Object[][] o = {{testData, "Firefox", "http://kayak.com/"}};
		
		
		
		
		
		
		
		
		return o;
		
	}

	protected void beforeMethod(Object[] params) {
		// TODO Auto-generated method stub
		
		
		String sBrowser = (String) params[1];
		String sSite = (String) params[2];
		logger = Logger.getLogger("rootLogger");
		
		
		if(sBrowser.equalsIgnoreCase("Firefox"))
			this.driver = Driver.getWebDriver(DeviceBrowsers.Firefox);
		else if(sBrowser.equalsIgnoreCase("Chrome"))
			this.driver = Driver.getWebDriver(DeviceBrowsers.Chrome);
		else if(sBrowser.equalsIgnoreCase("InternetExplorer"))
			this.driver = Driver.getWebDriver(DeviceBrowsers.InternetExplorer);
		
		
		driver.get(sSite);
		
		
		logger.info("Browser has been launched successfully !!!");
		
	}

	protected void afterMethod() {
		// TODO Auto-generated method stub
		
		
		driver.quit();
		
	}

}
