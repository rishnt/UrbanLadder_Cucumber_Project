package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ToAndFromDetails extends BasePage{

	public ToAndFromDetails(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(name="recipient_name")
	WebElement receipentName;

	@FindBy(name="recipient_email")
	WebElement receipentEmail;

	@FindBy(name="recipient_mobile_number")
	WebElement receipentMobile;

	@FindBy(name="customer_name")
	WebElement myName;

	@FindBy(name="customer_email")
	WebElement myEmail;

	@FindBy(name="customer_mobile_number")
	WebElement myPhone;

	@FindBy(name="customer_address")
	WebElement myAddress;

	@FindBy(name="zip")
	WebElement myPincode;

	@FindBy(xpath="//button[@type='submit']")
	WebElement confirm;
	
	@FindBy(xpath="//h2[text()='Confirm the details']")
	WebElement confirmDetails;
	
	@FindBy(xpath="//div[@class='_1HVuH']")
	WebElement errorPincode;

	public void setReceipentName(String string) {
		receipentName.sendKeys(string);
	}

	public void setReceipentEmail(String string) {
		// TODO Auto-generated method stub
		receipentEmail.sendKeys(string);
	}

	public void setReceipentMobile(String string) {
		// TODO Auto-generated method stub
		receipentMobile.sendKeys(string);
	}

	public void setcustomerName(String string) {
		// TODO Auto-generated method stub
		myName.sendKeys(string);
	}

	public void setcustomerEmail(String string) {
		// TODO Auto-generated method stub
		myEmail.sendKeys(string);
	}

	public void setcustomerPhone(String string) {
		// TODO Auto-generated method stub
		myPhone.sendKeys(string);
	}

	public void setcustomerAddress(String string) {
		// TODO Auto-generated method stub
		myAddress.sendKeys(string);
	}

	public void setPincode(String string) {
		// TODO Auto-generated method stub
		myPincode.sendKeys(string);
	}

	public void performClick() {
		// TODO Auto-generated method stub
		confirm.click();
	}
	
	public boolean checkVisibility() {
           boolean isVisible=confirmDetails.isDisplayed();
           return isVisible;
	}
	
	public void printErrorPinCode() {
		String message=errorPincode.getText();
	}
	
	
}


