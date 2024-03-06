package pageObjects;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import factory.BaseClass;
import utility.ExcelUtlis;

public class living_item extends BasePage{

	public living_item(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath="//li[@class='topnav_item livingunit']")
	WebElement livingItem;
	
	
	@FindBy(xpath="//li[@class='topnav_item livingunit']//li[1]//li")
	List<WebElement> livingSubItems;
	
	
	public void clickLivingItem() throws InterruptedException {
		livingItem.click();
		Thread.sleep(1000);
	}
	
	public void printLivingItems() {
		for(int i=0;i<livingSubItems.size();i++) {
			//System.out.println(livingSubItems.get(i).getText());
			String[] item=new String[1];
			item[0]=livingSubItems.get(i).getText();
;			ExcelUtlis.writeRow(item, i+1, "listSubItems.xlsx", "SubItems");
		}
	}
}