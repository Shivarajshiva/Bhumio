package Assignment;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class frontPagePOM extends InitializationClass {
	public frontPagePOM(WebDriver driver) {
		super(driver);
	}

	@FindBy(xpath = "//input[@name='Name']")
	private WebElement nametxt;

	@FindBy(xpath = "//input[@name='Spouse']")
	private WebElement spousetxt;

	@FindBy(xpath = "//input[@name='Location']")
	private WebElement loctxt;

	@FindBy(xpath = "//input[@name='Birth Year']")
	private WebElement birthtxt;

	@FindBy(xpath = "//input[@name='Present Address']")
	private WebElement addresstxt;

	@FindBy(xpath = "//input[@name='Custom Label1']")
	private WebElement custlbl1;

	@FindBy(xpath = "//input[@name='Custom Label2']")
	private WebElement custlbl2;

	@FindBy(xpath = "//label[.=\"Upload Pictures\"]")
	private WebElement uploadpicbtn;

	@FindBy(xpath = "//button[.=\"Add\"]")
	private WebElement addbtn;

	public void NameTextField(String name) {
		nametxt.sendKeys(name);
		;
	}

	public void SpouseTextField(String spouse) {
		spousetxt.sendKeys(spouse);
	}

	public void LocationTextField(String loc) {
		loctxt.sendKeys(loc);
	}

	public void BirthYearTextField(String year) {
		birthtxt.sendKeys(year);
	}

	public void PresrntAddTextField(String address) {
		addresstxt.sendKeys(address);
	}

	public void custom1TextField(String cust1) {
		custlbl1.sendKeys(cust1);
	}

	public void custom2TextField(String cust2) {
		custlbl2.sendKeys(cust2);
	}

	public void UploadPicBtn() {
		uploadpicbtn.click();
	}

	public void AddBtn() {
		addbtn.click();
	}

}
