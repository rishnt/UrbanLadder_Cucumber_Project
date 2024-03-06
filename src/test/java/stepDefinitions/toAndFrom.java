package stepDefinitions;



import org.junit.Assert;

import factory.BaseClass;
import io.cucumber.java.en.Then;
import pageObjects.ToAndFromDetails;
import pageObjects.gift_Card;

public class toAndFrom {

	ToAndFromDetails toFrom;
	gift_Card gC;
	@Then("the user Enter the valid Amount, valid month, valid date and cilcks next")
	public void the_user_enter_the_valid_amount_valid_month_valid_date_and_cilcks_next() throws InterruptedException {
		BaseClass.getLogger().info(" User Enters valid Amount, Month, Date and clicks NEXT ");
	   gC=new gift_Card(BaseClass.getDriver());
	   gC.setAmount();
	   gC.setMonth();
	   gC.setDate();
	   Thread.sleep(3000);
	   gC.selectNext();
	   
	}

	@Then("the user sets Receipents name as and Receipents email as and Receipents mobile as \\( name: {string}, email: {string}, mobile: {string})")
	public void the_user_sets_receipents_name_as_and_receipents_email_as_and_receipents_mobile_as_name_email_mobile(String string, String string2, String string3) throws InterruptedException {
		BaseClass.getLogger().info(" User Enters Valid Receipent details");
	  toFrom =new ToAndFromDetails(BaseClass.getDriver());
	  toFrom.setReceipentName(string);
	  toFrom.setReceipentEmail(string2);
	  toFrom.setReceipentMobile(string3);
	  Thread.sleep(3000);
	}

	@Then("the user sets name in From as email as phone as address as pincode as\\( name: {string}, email:{string}, phone:{string},address:{string},pincode:{string})")
	public void the_user_sets_name_in_from_as_email_as_phone_as_address_as_pincode_as_name_email_phone_address_pincode(String string, String string2, String string3, String string4, String string5) throws InterruptedException {
		BaseClass.getLogger().info(" User Enters Valid Customer Details");
		toFrom.setcustomerName(string);
	   toFrom.setcustomerEmail(string2);
	   toFrom.setcustomerPhone(string3);
	   toFrom.setcustomerAddress(string4);
	   toFrom.setPincode(string5);
	   Thread.sleep(2000);
	}

	@Then("the user clicks the confirm button")
	public void the_user_clicks_the_confirm_button() throws InterruptedException {
		BaseClass.getLogger().info(" Clicks Next Button ");
		toFrom.performClick();
	   Thread.sleep(3000);
	}
	
	@Then("the user capture the error message")
	public void the_user_capture_the_error_message() {
	boolean status=toFrom.checkVisibility();
	if(status) {
		BaseClass.getLogger().info(" Details Filled Successfullly ");
		Assert.assertTrue(true);
	}
	else {
		BaseClass.getLogger().info(" Invalid Details Encountered ");
		Assert.assertTrue(false);
	}
	}
}
