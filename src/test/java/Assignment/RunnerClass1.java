package Assignment;



import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class RunnerClass1 extends BaseClass{
	@Test
	public void Ts_1() throws InterruptedException {
		frontPagePOM front = new frontPagePOM(driver);
		homePagePOM home = new homePagePOM(driver);
		savePdfPOM save=new savePdfPOM(driver);
		ExportPOM expt=new ExportPOM(driver);
		
		front.NameTextField("Ningappa");
		Thread.sleep(2000);
		front.SpouseTextField("Sakamma");
		Thread.sleep(2000);
		front.LocationTextField("Davanagere");
		Thread.sleep(2000);
		front.BirthYearTextField("1970");
		Thread.sleep(2000);
		front.PresrntAddTextField("Mittalakatte");
		Thread.sleep(2000);
		front.custom1TextField("abc");
		Thread.sleep(2000);
		front.custom2TextField("def");
		Thread.sleep(2000);
		front.AddBtn();
		Thread.sleep(5000);
		
		
		
		home.AddFamily();
		Thread.sleep(2000);
		front.NameTextField("Sakamma");
		Thread.sleep(2000);
		front.SpouseTextField("NA");
		Thread.sleep(2000);
		front.LocationTextField("Davanagere");
		Thread.sleep(2000);
		front.BirthYearTextField("1980");
		Thread.sleep(2000);
		front.PresrntAddTextField("Mittalakatte");
		Thread.sleep(2000);
		front.custom1TextField("vjhv");
		Thread.sleep(2000);
		front.custom2TextField("hhjkl");
		Thread.sleep(2000);
		front.AddBtn();
		Thread.sleep(5000);
		
		
		
		home.AddFamily();
		Thread.sleep(2000);
		front.NameTextField("Manoj");
		Thread.sleep(2000);
		front.SpouseTextField("NA");
		Thread.sleep(2000);
		front.LocationTextField("Davanagere");
		Thread.sleep(2000);
		front.BirthYearTextField("2000");
		Thread.sleep(2000);
		front.PresrntAddTextField("Mittalakatte");
		Thread.sleep(2000);
		front.custom1TextField("hjg");
		Thread.sleep(2000);
		front.custom2TextField("jiuj");
		Thread.sleep(2000);
		front.AddBtn();
		
		Thread.sleep(5000);
		home.printFamTree();
		Thread.sleep(2000);
		save.SavePdfBtn();
		Thread.sleep(5000);
		
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		WebElement exportbtn=driver.findElement(By.xpath("//label[.=\"Export JSON\"]"));
		js.executeScript("arguments[0].click()",exportbtn);
//		Thread.sleep(5000);
//		WebDriverWait wait=new WebDriverWait(driver,3);
//		boolean invisible=wait.until(ExpectedConditions.invisibilityOfElementLocated(By.className("MuiBackdrop-root css-919eu4")));
//		if(invisible==true)
//		{
//			home.ExportJson();
//		}

		
//		Thread.sleep(5000);
//		Alert a = driver.switchTo().alert();
//		String text = a.getText();
//		System.out.println(text);
//		Thread.sleep(2000);
//		 expt.exportButton();
		 
		 Thread.sleep(5000);
		 WebElement importbtn=driver.findElement(By.xpath("//button[.=\"Import JSON\"]"));
			js.executeScript("arguments[0].click()",importbtn);
		// home.ImportJson();
	
		
		
		
		
		
		
		}
	
		
	
	

}
