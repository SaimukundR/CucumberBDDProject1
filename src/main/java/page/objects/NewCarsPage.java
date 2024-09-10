package page.objects;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import pages.base.BasePage;

public class NewCarsPage  extends BasePage{
	
	public NewCarsPage() throws IOException {
        super();  // Calls BasePage constructor
        PageFactory.initElements(driver, this);  // Initialize elements using PageFactory
    }
	
	public KiaCarPage gotoKia() throws IOException {
		
		click("kia_LINK");
		
		return new KiaCarPage();
		
	}
	
	
	public BMWCarPage gotoBMW() throws IOException {
		
		click("bmw_LINK");
		
		return new BMWCarPage();
		
	}
	
	
	public ToyotaCarPage gotoToyota() throws IOException {
		
	
		
		click("toyota_LINK");
		
		return new ToyotaCarPage();
	}
	
	
	public HondaCarPage gotoHonda() throws IOException {
		
		
		click("honda_LINK");
		return new HondaCarPage();
	}
	
	

}
