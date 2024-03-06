package stepDefinitions;

import factory.BaseClass;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.living_item;

public class living_subItems {

	living_item li;
	
	@When("the user hovers to the living element")
	public void the_user_hovers_to_the_living_element() throws InterruptedException {
		BaseClass.getLogger().info("User Opens Living Items");
		li=new living_item(BaseClass.getDriver());
	      li.clickLivingItem();
	      Thread.sleep(2000);
	}

	@Then("the user prints all the subItems from any one list")
	public void the_user_prints_all_the_sub_items_from_any_one_list() {
		
	   li.printLivingItems();
	   
	}
}
