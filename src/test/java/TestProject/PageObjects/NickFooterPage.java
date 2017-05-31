package TestProject.PageObjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;

import TestProject.Common.CommonMethods;


public class NickFooterPage {

	CommonMethods method;
	public List <WebElement> footerlinksmain;
	
	
	public NickFooterPage(RemoteWebDriver driver, String url){
		method = new CommonMethods(driver);
		method.openUrl(url);
		
	}
	
	public int footerlinkscount(){
		footerlinksmain =method.getAllElements("footerlinks");
		return footerlinksmain.size();		
	}
	
	public void closeBala(){
		method.getElement("balanotifierclose").click();
	}
	
	
	
}
