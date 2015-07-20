package pccraft.kayak.common.framework;




import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.safari.SafariDriver;






public class Driver {
	
	String sDevice="";
	

    
    
	
	public static WebDriver getWebDriver(DeviceBrowsers deviceBrowser){
		
		WebDriver driver = null;
		
		DesiredCapabilities capabilities;
		
		switch(deviceBrowser){
			
			case Chrome:
				break;
			case Firefox:
				//driver = new FirefoxDriver();
				
				capabilities = DesiredCapabilities.firefox();
                driver = new FirefoxDriver(capabilities);
				break;
			case InternetExplorer:
				break;
			case Safari:
				//DesiredCapabilities capabilities;
				capabilities = DesiredCapabilities.safari();
                driver = new SafariDriver(capabilities);
				break;
		default:
			break;
		}
		
		return driver;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}


