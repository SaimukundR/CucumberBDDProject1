package page.objects;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import pages.base.BasePage;

public class ToyotaCarPage  extends BasePage{
	public ToyotaCarPage() throws IOException {
        super();  // Calls BasePage constructor
        PageFactory.initElements(driver, this);  // Initialize elements using PageFactory
    }

}
