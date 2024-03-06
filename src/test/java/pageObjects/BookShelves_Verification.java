package pageObjects;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import factory.BaseClass;

public class BookShelves_Verification extends BasePage{
	
	  public BookShelves_Verification(WebDriver driver){
		super(driver);
	}
	  
	  
	  @FindBy(id="search")
	  WebElement searchBar;
	  
	  @FindBy(xpath="//a[@data-gaaction='popup.auth.close']")
	  WebElement closePopUp;
	  
	  @FindBy(xpath="//h2[@class='withsubtext']")
	  WebElement VerifyPage;
	  
	  
	  public void search_BookShelves(String searchText) throws InterruptedException {
		  searchBar.sendKeys(searchText);
		  Actions act=new Actions(BaseClass.getDriver());
		    act.keyDown(Keys.ENTER).keyUp(Keys.ENTER).perform();
		    Thread.sleep(2000);
		  
	  }
	  
	  public void closePopup() {
		  closePopUp.click();
	  }
	  
	  public boolean VerifyPage(String Original_text) {
		  boolean result=false;
		  String Verify_text=VerifyPage.getText();
		  if(Verify_text.contains(Original_text)) {
			  result=true;
			  return result;
		  }
		  
		  return result;
	  }

}
