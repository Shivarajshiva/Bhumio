package Assignment;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class InitializationClass {
	public InitializationClass(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
}
