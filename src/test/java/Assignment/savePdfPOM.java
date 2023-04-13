package Assignment;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class savePdfPOM extends InitializationClass{
	public savePdfPOM(WebDriver driver) {
		super(driver);
		}

	@FindBy(xpath = "//button[.=\"Save PDF\"]")
	private WebElement savepdfbtn;

	public void SavePdfBtn() {
		savepdfbtn.click();
	}
}
