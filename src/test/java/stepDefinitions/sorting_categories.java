package stepDefinitions;

import factory.BaseClass;
import io.cucumber.java.en.Then;
import pageObjects.Category_Sorting;

public class sorting_categories {

	Category_Sorting cs;
	
	@Then("the user selects from the category items\\(item: {string})")
	public void the_user_selects_from_the_category_items_item(String string) throws InterruptedException {
		BaseClass.getLogger().info(" *******Category Selected *****");
		cs=new Category_Sorting(BaseClass.getDriver());
	   cs.selectCategory();
	   Thread.sleep(1000);
	}

	@Then("the user selects exclude out of stock option")
	public void the_user_selects_exclude_out_of_stock_option() {
		BaseClass.getLogger().info("****** Stock Option Selected******* ");
	   cs.selectStockOption();
	}

	@Then("Sort the price from Low to High")
	public void sort_the_price_from_low_to_high() throws InterruptedException {
		BaseClass.getLogger().info("*****Price Filter Applied******* ");
	   cs.sortPriceOrder();
	}

	@Then("retrieve the first three items")
	public void retrieve_the_first_three_items() {
		BaseClass.getLogger().info("******items displayed****** ");
	    cs.retrieveItems();
	}
	
}
