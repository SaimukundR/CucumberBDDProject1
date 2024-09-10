package page.objects;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import pages.base.BasePage;

public class HomePage extends BasePage{
	public HomePage() {
        super();  // Calls BasePage constructor
        PageFactory.initElements(driver, this);  // Initialize elements using PageFactory
    }
	
	
	public void mouseOverNewCars() {
		
		click("newCarMenu_XPATH");
		
	}
	
	
	public NewCarsPage clickFindNewCars() throws IOException {
		
		click("findNewCars_XPATH");
		
		return new NewCarsPage();
		
	}
	
	
	public void searchCars() {
		
	
		
	}
	
	public void gotoMaps() {
		
		
		
	}
	

}
