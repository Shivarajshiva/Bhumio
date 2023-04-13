package Assignment;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class homePagePOM extends InitializationClass {
	public homePagePOM(WebDriver driver) {
		super(driver);
	}

	@FindBy(xpath = "//input[@placeholder='Search Family Member']")
	private WebElement searchtxt;

	@FindBy(xpath = "//label[.=\"Add Family\"]")
	private WebElement addfambtn;

	@FindBy(xpath = "//label[.=\"Print Family Tree\"]")
	private WebElement prntfamtree;

	@FindBy(xpath = "//button[.=\"Import JSON\"]")
	private WebElement impjson;

	@FindBy(xpath = "//label[.=\"Export JSON\"]")
	private WebElement exptjson;

	public void Searchtft(String any) {
		searchtxt.sendKeys(any);
	}

	public void AddFamily() {
		addfambtn.click();
	}

	public void printFamTree() {
		prntfamtree.click();
	}

	public void ImportJson() {
		impjson.click();
	}

//	public void ExportJson() {
//		exptjson.click();
//	}

}
