package pccraft.kayak.common.page;

import org.openqa.selenium.WebElement;

import pccraft.kayak.common.framework.BaseTest;

public class KayakPage {
	
	
	public boolean setText(WebElement webElement, String sValue){
		
		boolean flag = false;
		
		if(webElement != null){
			if(sValue!=null && !sValue.equals("")){
				//webElement.clear();
				webElement.click();
				webElement.clear();
				webElement.sendKeys(sValue);
				flag=true;
			}
		}
		
		return flag;
		
	}
	

	public boolean setText(WebElement webElement, String sValue, boolean bClear){
		
		boolean flag = false;
		
		if(webElement != null){
			if(sValue!=null && !sValue.equals("")){
				//webElement.clear();
				webElement.click();
				if(bClear)
					webElement.clear();
				webElement.sendKeys(sValue);
				flag=true;
			}
		}
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return flag;
		
	}


	
	
	public void clickOnElement(WebElement webElement){
		if(webElement != null)
			webElement.click();
	}

	
	
	
	
	public boolean selectCheckBox(WebElement webElement, boolean bFlag){
		boolean flag = true;
		
		if(bFlag){
			if(!webElement.isSelected())
				webElement.click();
		}else {
			if(webElement.isSelected())
				webElement.click();
		}
		
		
		
		return flag;
	}
}
