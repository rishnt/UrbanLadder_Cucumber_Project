package pageObjects;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import factory.BaseClass;

public class Sorting_price extends BasePage{

	public Sorting_price(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath="//li[@data-group='price']")
	WebElement price_btn;
	
	@FindBy(xpath="//div[@class='noUi-handle noUi-handle-upper']")
	WebElement price;
	
	@FindBy(xpath="//div[@class='product-title product-title-sofa-mattresses']")
	List<WebElement> bookshelves_name;
	
	public void selectPrice() throws InterruptedException {
		//price.click();
		Actions act=new Actions(BaseClass.getDriver());
		act.moveToElement(price_btn).perform();
		Thread.sleep(1000);
		 act.dragAndDropBy(price,-212, 0);
		   act.build().perform();
	}
	
	public void retrieve_BookShelves() throws InterruptedException{
		
		for(int i=0;i<3;i++) {
			System.out.println(bookshelves_name.get(i).getText());
		}
	
	}
}
