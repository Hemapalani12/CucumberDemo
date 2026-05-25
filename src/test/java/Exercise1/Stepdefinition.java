package Exercise1;

import java.util.List;
import java.util.Map;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Stepdefinition {

	@Given("user is on login page")
	public void user_is_on_login_page() {
		
		System.out.println("user is on login page");
	    
	}
	@When("Enters valid credentials")
	public void enters_valid_credentials() {
	 
		System.out.println("Enters valid credentials");
	    
	}
	
	@When("Enters valid username {string} and password {string}")
	public void enters_valid_username_and_password(String string, String string2) {
		
		System.out.println("User logged in with" +string+ "&" +string2);
	 
	}
	
	@When("Enters the details")
	public void enters_the_details(List<String>data) {
		
		System.out.println(data.size());
		for(String res:data)
		{
			System.out.println(res);
		}
	    
	}
	@When("enter the student details")
	public void enter_the_student_details(DataTable data) {
		
		List<Map<String, String>>users=data.asMaps(String.class,String.class);
		for(Map<String,String>user:users)
		{
			System.out.println("name is: "+user.get("Name"));
			System.out.println("email is: "+user.get("Email"));
		}
	    
	}

	@Then("successfully updated")
	public void successfully_updated() {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("successfully updated user details");
	}


	
	@Then("User should able to register")
	public void user_should_able_to_register() {
		
		System.out.println("user registered");
	    
	}
	@Then("User should able to login")
	public void user_should_able_to_login() {
		
		System.out.println("User should able to login");
	    
	}
	@Then("Navigated to the Homepage")
	public void navigated_to_the_homepage() {
		
		System.out.println("Navigated to the Homepage");
	}


}
