package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class gift_Card extends BasePage{

	public gift_Card(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath="//ul[@class='_2sedU']/li[3]")
	WebElement occassion;
	
	@FindBy(id="ip_2251506436")
	WebElement amount;
	
	@FindBy(xpath="//div[@class='_3PNvG']/select[1]")
	WebElement month;
	
	@FindBy(xpath="//div[@class='_3PNvG']/select[2]")
	WebElement date;
	
	@FindBy(xpath="//button[@class='_1IFIb _1fVSi action-button _1gIUf _1XfDi']")
	WebElement nextBtn;
	
	
	public void selectOccassion() {
		occassion.click();
	}
	
	
	public void setAmount() {
		amount.sendKeys("3000");
	}
	
	public void setMonth() {
		Select select=new Select(month);
		select.selectByIndex(2);
		
	}
	
	public void setDate() {
		Select select=new Select(date);
		select.selectByIndex(5);
	}
	
	public void selectNext() {
		nextBtn.click();
	}
	
}
