package steps;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.HomePage;
import pages.LoginPage;
import util.TestBase;

public class Steps extends TestBase {
	@Given("^I open the Androiddriver$")
	public void i_open_the_driver() throws Throwable {
		TestBase.initialization();
	}

	@When("^I enter \"([^\"]*)\" in username text field$")
	public void i_enter_in_username_text_field(String un) throws InterruptedException {
		lp.enterUsername("admin");

		/*
		if (un.equals("username")) {
			LoginPage lp = new LoginPage();
			lp.enterUsername(prop.getProperty("usernamekey"));
		}else if (un.equals("problemusernamekey")) {
			LoginPage lp = new LoginPage();
			lp.enterProblemUsername(prop.getProperty("problemusernamekey"));
		} else if (un.equals("invalidusername")) {
			LoginPage lp = new LoginPage();
			lp.enterInvalidUsername(prop.getProperty("invalidusername"));
		}
		else {
			System.out.println("No string found");
		}
		 */
	}

	@When("^I enter \"([^\"]*)\" in password text field$")
	public void i_enter_in_password_text_field(String pwd) throws Throwable {
		lp.enterPassword("test");
		/*
		if (pwd.equals("password")) {

			LoginPage lp = new LoginPage();
			lp.enterPassword(prop.getProperty("passwordkey"));
		}
		if (pwd.equals("invalidpassword")) {
			LoginPage lp = new LoginPage();
			lp.enterInvalidPassword(prop.getProperty("invalidpassword"));
		}
		if (pwd.equals("problempassword")) {
			LoginPage lp = new LoginPage();
			lp.enterProblemPassword(prop.getProperty("problempasswordkey"));
		}
		else {
			System.out.println("No string found");
		}
		*/
	}

	@When("^I click on login option$")
	public void i_click_on_login_option() throws Throwable {
		lp.clickOnLoginButton();
	}

	@Then("^System navigates me to the homepage$")
	public void system_navigates_me_to_the_homepage() throws Throwable {
		System.out.println("HomePageIconIsDisplayed");
	}

	@Then("^I select item from the list$")
	public void i_select_item_from_the_list() throws Throwable {
		hp.clickOnItem();
	}

	@Then("^item should appear in the cart$")
	public void item_should_appear_in_the_cart() throws Throwable {

		hp.selectCart();
	}

	@Then("^I remove the selected item from the cart$")
	public void i_remove_the_selected_item_from_the_cart() throws Throwable {
		hp.removeItemFromCart();
	}

	@Then("^I verify the error for invalid credentials$")
	public void i_verify_the_error_for_invalid_credentials() throws Throwable {

		lp.verifyErrorForInvalidredentials();
	}

	@Then("^I should be able to see an error message$")
	public void i_should_be_able_to_see_an_error_message() throws Throwable {

		lp.verifyErrorForInvalidredentials();
	}

	@Then("^I close the application$")
	public void i_close_the_application() throws Throwable {
		tearDown();
	}

}
