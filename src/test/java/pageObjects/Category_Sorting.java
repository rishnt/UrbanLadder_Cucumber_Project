package pageObjects;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import factory.BaseClass;

public class Category_Sorting extends BasePage{

	
	public Category_Sorting(WebDriver driver){
		super(driver);
	}
	
	
	@FindBy(xpath="//li[@data-group='category']")
	WebElement category;
	
	@FindBy(xpath="//label[@for='filters_primary_category_Kids_Bookshelves']")
	WebElement option;
	
	@FindBy(xpath="//label[@for='filters_availability_In_Stock_Only']")
	WebElement exculdeOption;
	
	@FindBy(xpath="//*[text()='Recommended']")
	WebElement SortPrice;
	
	@FindBy(xpath="//li[@data-key='price_asc']")
	WebElement priceOrder;
	
	@FindBy(xpath="//span[@itemprop='name']")
	List<WebElement> item;
	
	
	public void selectCategory() {
		Actions act=new Actions(BaseClass.getDriver());
		act.moveToElement(category);
	}
	
	public void selectCategoryOption() {
		option.click();
	}
	
	public void selectStockOption() {
		exculdeOption.click();
	}
	
	public void sortPriceOrder() throws InterruptedException {
		SortPrice.click();
		Thread.sleep(1000);
		priceOrder.click();
	}
	
	public void retrieveItems() {
		System.out.println("Items After Filter is Applied");
		for(int i=0;i<3;i++) {
			System.out.println(item.get(i).getText());
		}
	}
	
	
}
