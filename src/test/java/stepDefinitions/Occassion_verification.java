package stepDefinitions;

import org.junit.Assert;

import factory.BaseClass;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.Occassion;
import pageObjects.gift_Card;

public class Occassion_verification {

	Occassion oc;
	gift_Card gC;
	@When("the user clicks on the Gift Cards")
	public void the_user_clicks_on_the_gift_cards() throws InterruptedException {
		BaseClass.getLogger().info("User perform click on GiftCards ");
		oc=new Occassion(BaseClass.getDriver());
		oc.click_GiftCard();

	}

	@Then("the user should see Birthday\\/Anniversary Occasssion")
	public void the_user_should_see_birthday_anniversary_occasssion() {
		BaseClass.getLogger().info("User verifies the visibilty of Birthday/Anniversary Occassion ");
	   boolean status=oc.check_Occassion();
	   if(status) {
		   Assert.assertTrue(true);

	   }
	   else {
		   Assert.assertTrue(false);
	   }
	}
}
