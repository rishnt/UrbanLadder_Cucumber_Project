package stepDefinitions;

import factory.BaseClass;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.BookShelves_Verification;
import pageObjects.Sorting_price;

public class Sorting_bookShelves {

	BookShelves_Verification bv;
	Sorting_price sp;
	@When("the user search\\(searchText: {string})")
	public void the_user_search_search_text(String string) throws InterruptedException {
		BaseClass.getLogger().info(" Search ---> BookShelves ");
	   bv=new BookShelves_Verification(BaseClass.getDriver());
	   bv.search_BookShelves(string);
	   bv.closePopup();
	}

	@When("the user select the price under {int}")
	public void the_user_select_the_price_under(Integer int1) throws InterruptedException {
		BaseClass.getLogger().info(" ********Price selected******* ");
		sp=new Sorting_price(BaseClass.getDriver());
		sp.selectPrice();
	}

	@Then("retrieve the list of BookShelves")
	public void retrieve_the_list_of_book_shelves() throws InterruptedException {
		BaseClass.getLogger().info("******List Of Bookshelves Retrieved******* ");
	   sp.retrieve_BookShelves();
	}
}
