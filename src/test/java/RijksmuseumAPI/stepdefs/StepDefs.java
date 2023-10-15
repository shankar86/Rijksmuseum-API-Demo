package RijksmuseumAPI.stepdefs;

import RijksmuseumAPI.page.CollectionAPI;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefs {

	@Given("CollectionAPI resource url")
	public void collectionapi_resource_url(DataTable dataTable) {
		CollectionAPI.getResourceUrl(dataTable);
	}

	@Given("Request headers")
	public void request_headers(DataTable dataTable) {
		CollectionAPI.getRequestHeaders(dataTable);
	}

	@When("I make collection api call")
	public void i_make_collection_api_call() {
		CollectionAPI.collectionAPICall();
	}

	@Then("I verify response status code is {int}")
	public void i_verify_response_status_code_is(int arg1) {
		CollectionAPI.verifyResponseCode(arg1);
	}
	
	@Then("Verify response must have value {string}")
	public void verify_response_must_have_value(String string) {
	    CollectionAPI.verifyResponseBody(string);
	}
	
	@Then("Verify responseBody must have link {string} and objectNumber {string}")
	public void verify_response_body_must_have_link_and_object_number(String string, String string2) {
		CollectionAPI.verifyResponseBodyDetails(string, string2);
	 
	}
}
