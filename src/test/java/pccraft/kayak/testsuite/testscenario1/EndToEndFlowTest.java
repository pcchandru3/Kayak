package pccraft.kayak.testsuite.testscenario1;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pccraft.kayak.common.framework.BaseTest;
import pccraft.kayak.common.framework.DeviceBrowsers;
import pccraft.kayak.common.framework.Driver;

public class EndToEndFlowTest extends BaseTest{
	
	
	
	
	
	@Test(dataProvider = "TestDataXLS")
	public void EndToEndFlow1(Map<String,String> map, String s, int a, List<String> ll) {
		
		System.out.println("In side main test");
		WebDriver driver = Driver.getWebDriver(DeviceBrowsers.Firefox);
		
		driver.get("http://kayak.com");
		
		
		
		
		
	}
	
	

}
