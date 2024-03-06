package stepDefinitions;

import factory.BaseClass;
import io.cucumber.java.en.Then;
import pageObjects.gift_Card;

public class custom_GiftCard {

	gift_Card gC;
	

	@Then("the user clicks on the Birthday\\/Anniversary Occassion")
	public void the_user_clicks_on_the_birthday_anniversary_occassion() {
		  gC=new gift_Card(BaseClass.getDriver());
		  gC.selectOccassion();
	}
	
	@Then("the user Enter the Amount")
	public void the_user_enter_the_amount() throws InterruptedException {
	   gC.setAmount();
	   Thread.sleep(1000);
	}

	@Then("the user select the month and the date")
	public void the_user_select_the_month_and_the_date() throws InterruptedException {
	    gC.setMonth();
	    Thread.sleep(1000);
	    gC.setDate();
	}

	@Then("the user clicks on the next button")
	public void the_user_clicks_on_the_next_button() {
	   gC.selectNext();
	}
}
