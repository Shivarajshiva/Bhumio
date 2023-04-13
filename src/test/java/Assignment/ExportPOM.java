package Assignment;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ExportPOM extends InitializationClass {
	public ExportPOM(WebDriver driver) {
		super(driver);
	}

	@FindBy(xpath = "//button[.=\"Export\"]")
	private WebElement exptbtn;

	@FindBy(xpath = "//button[.=\"Export\"]")
	private WebElement cancelbtn;

	public void exportButton() {
		exptbtn.click();
	}

	public void cancelButton() {
		cancelbtn.click();
	}

}
