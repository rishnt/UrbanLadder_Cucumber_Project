package pageObjects;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import factory.BaseClass;

public class Occassion extends BasePage{

	
	public Occassion(WebDriver driver) {
		super(driver);
	}


	@FindBy(xpath="//ul[@class='featuredLinksBar__linkContainer']//li[3]")
	WebElement Gift_Card;
	
	@FindBy(xpath="//ul[@class='_2sedU']/li[3]")
	WebElement occassion;
	
	
	public void click_GiftCard() throws InterruptedException {
		
		Gift_Card.click();
		Thread.sleep(1000);
	}
	
	public boolean check_Occassion() {
		JavascriptExecutor js=(JavascriptExecutor)BaseClass.getDriver();
		js.executeScript("arguments[0].scrollIntoView();",occassion );
		boolean visible=false;
		if(occassion.isDisplayed()) {
			visible=true;
			return visible;
		}
		return visible;
	}
}
