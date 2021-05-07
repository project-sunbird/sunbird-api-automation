package stepDefinations;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.json.simple.parser.ParseException;
import resources.Utils;

import java.io.IOException;

public class userStepDefinition extends Utils {
    public userStepDefinition() throws IOException, ParseException {
    }

    @Given("Request userCreateAPI with email in payload")
    public void request_userCreateAPI_with_email_in_payload() {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }

    @When("Request with email POST calls")
    public void request_with_email_POST_calls() {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }

    @Then("{string} got created in response body")
    public void got_created_in_response_body(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }

    @Then("SUCCESS is present in response result")
    public void success_is_present_in_response_result() {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }

    @Then("Response header contains {int} as status")
    public void response_header_contains_as_status(Integer int1) {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }

    @Then("responseCode contains OK")
    public void responsecode_contains_OK() {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }

    @Given("Request API with existing user user's {string}")
    public void request_API_with_existing_user_user_s(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }

    @When("Request with post calls")
    public void request_with_post_calls() {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }

    @Then("Status shows as Failed")
    public void status_shows_as_Failed() {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }

    @Then("Return {int} as StatusCode")
    public void return_as_StatusCode(Integer int1) {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }

    @Then("err shows as EMAIL_IN_USE")
    public void err_shows_as_EMAIL_IN_USE() {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }

    @Given("Request API with invalid {string}")
    public void request_API_with_invalid(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }

    @When("Request with post calls with invalid email id")
    public void request_with_post_calls_with_invalid_email_id() {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }

    @Then("Return {int} as StatusCode with invalid email id")
    public void return_as_StatusCode_with_invalid_email_id(Integer int1) {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }

    @Then("err message shows as EMAIL_FORMAT_ERROR")
    public void err_message_shows_as_EMAIL_FORMAT_ERROR() {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }

    @Given("Request API with invalid password {string}")
    public void request_API_with_invalid_password(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }

    @When("Request with post calls  with invalid password")
    public void request_with_post_calls_with_invalid_password() {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }

    @Then("Return {int} as StatusCode  with invalid password")
    public void return_as_StatusCode_with_invalid_password(Integer int1) {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }

    @Then("err message shows as INVALID_PASSWORD")
    public void err_message_shows_as_INVALID_PASSWORD() {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }

    @Given("Update user's {string} for {string} with payload with valid user {string}")
    public void update_user_s_for_with_payload_with_valid_user(String string, String string2, String string3) {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }

    @When("Request udate user with PATCH request call")
    public void request_udate_user_with_PATCH_request_call() {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }

    @Then("User's Name updated successfull and retruns {int}")
    public void user_s_Name_updated_successfull_and_retruns(Integer int1) {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }

    @Then("Update user's API Response shows as SUCCESS")
    public void update_user_s_API_Response_shows_as_SUCCESS() {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }

    @Given("Update User's {string} for blank {string} with valid {string}")
    public void update_User_s_for_blank_with_valid(String string, String string2, String string3) {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }

    @When("Request update user api with PATCH request when userId is blank")
    public void request_update_user_api_with_PATCH_request_when_userId_is_blank() {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }

    @Then("Validate that the resonse return {int} status code")
    public void validate_that_the_resonse_return_status_code(Integer int1) {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }

    @Then("Validate response body returns correct error message for blank userId")
    public void validate_response_body_returns_correct_error_message_for_blank_userId() {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }

    @Given("Update User's {string} without userid in request body with valid {string}")
    public void update_User_s_without_userid_in_request_body_with_valid(String string, String string2) {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }

    @When("Request with PATCH request without userId")
    public void request_with_PATCH_request_without_userId() {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }

    @Then("Return {int} statuscode when requested withour userId")
    public void return_statuscode_when_requested_withour_userId(Integer int1) {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }

    @Then("Correct error message retruns when requested without userId")
    public void correct_error_message_retruns_when_requested_without_userId() {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }

    @Given("Request userReadAPI with payload with valid {string}")
    public void request_userReadAPI_with_payload_with_valid(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }

    @When("Request with {string} in GET call")
    public void request_with_in_GET_call(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }

    @Then("userid available in response")
    public void userid_available_in_response() {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }

    @Then("ResponseCode returns {int} code")
    public void responsecode_returns_code(Integer int1) {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }

    @Then("OrgId is present in responseBody")
    public void orgid_is_present_in_responseBody() {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }

    @Then("user Role field is present in responseBody")
    public void user_Role_field_is_present_in_responseBody() {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }

    @Then("userName is present in responseBody")
    public void username_is_present_in_responseBody() {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }

    @Given("RequestBody with valid user {string}")
    public void requestbody_with_valid_user(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }

    @When("Request with invalid {string}")
    public void request_with_invalid(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }

    @Then("Returns {int} code when requested with invalid userid")
    public void returns_code_when_requested_with_invalid_userid(Integer int1) {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }

    @Then("userNotFound error message displayed")
    public void usernotfound_error_message_displayed() {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }

    @Given("Search user with {string} and valid {string}")
    public void search_user_with_and_valid(String string, String string2) {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }

    @When("Request with POST request call")
    public void request_with_POST_request_call() {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }

    @Then("Search result returns {int} statuscode")
    public void search_result_returns_statuscode(Integer int1) {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }

    @Then("identifier is present in when requested with userName")
    public void identifier_is_present_in_when_requested_with_userName() {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }

    @Given("Search user with {string} userId and valid {string}")
    public void search_user_with_userId_and_valid(String string, String string2) {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }

    @When("Request with POST call with userId")
    public void request_with_POST_call_with_userId() {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }

    @Then("Search result returns {int} statuscode when requested with userId")
    public void search_result_returns_statuscode_when_requested_with_userId(Integer int1) {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }

    @Then("identifier is present in responseBody")
    public void identifier_is_present_in_responseBody() {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }

    @Given("Search user with {string} emailId and valid {string}")
    public void search_user_with_emailId_and_valid(String string, String string2) {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }

    @When("Request with POST request call with emailId")
    public void request_with_POST_request_call_with_emailId() {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }

    @Then("Returns {int} statuscode when requested with emailId")
    public void returns_statuscode_when_requested_with_emailId(Integer int1) {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }

    @Given("Search user with {string} firstName and valid {string}")
    public void search_user_with_firstName_and_valid(String string, String string2) {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }

    @When("Request with POST request call with firstName")
    public void request_with_POST_request_call_with_firstName() {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }

    @Then("Returns {int} statuscode when requested with firstName")
    public void returns_statuscode_when_requested_with_firstName(Integer int1) {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }

    @Then("Showing total no of users count with the given firstName")
    public void showing_total_no_of_users_count_with_the_given_firstName() {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }

    @Given("Search user with {string} createdBy and valid {string}")
    public void search_user_with_createdBy_and_valid(String string, String string2) {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }

    @When("Request with POST request call with createdBy")
    public void request_with_POST_request_call_with_createdBy() {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }

    @Then("Search result returns {int} statuscode when searched with with createdBy")
    public void search_result_returns_statuscode_when_searched_with_with_createdBy(Integer int1) {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }

    @Then("Returns the no of users created by the user")
    public void returns_the_no_of_users_created_by_the_user() {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }

    @Given("Request user exists api with valid emailId")
    public void request_user_exists_api_with_valid_emailId() {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }

    @When("Request with GET api call with valid {string}  emailId")
    public void request_with_GET_api_call_with_valid_emailId(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }

    @Then("User Exists apis returns {int} statuscode")
    public void user_Exists_apis_returns_statuscode(Integer int1) {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }

    @Then("Returns exists value as true")
    public void returns_exists_value_as_true() {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }

    @Given("Request user exists api with invalid emailId")
    public void request_user_exists_api_with_invalid_emailId() {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }

    @When("Request with GET api call with invalid {string}  emailId")
    public void request_with_GET_api_call_with_invalid_emailId(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }

    @Then("User Exists apis returns {int} statuscode when requested with invalid emailId")
    public void user_Exists_apis_returns_statuscode_when_requested_with_invalid_emailId(Integer int1) {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }

    @Then("Returns exists value as false")
    public void returns_exists_value_as_false() {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }

    @Given("Requestbody with valid userId with {string} and with valid {string} , {string} , {string}")
    public void requestbody_with_valid_userId_with_and_with_valid(String string, String string2, String string3, String string4) {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }

    @When("Request with POST call valid userid, consumerId and objectId")
    public void request_with_POST_call_valid_userid_consumerId_and_objectId() {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }

    @Then("Should return status code as {int} with valid userId")
    public void should_return_status_code_as_with_valid_userId(Integer int1) {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }

    @Then("consumerId is present when requested with valid userId")
    public void consumerid_is_present_when_requested_with_valid_userId() {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }

    @Then("consumerType is present when requested with valid userId")
    public void consumertype_is_present_when_requested_with_valid_userId() {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }

    @Then("conscentId is present when requested with valid userId")
    public void conscentid_is_present_when_requested_with_valid_userId() {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }

    @Given("Requestbody with invalid userId with {string} and with valid {string} , {string} , {string}")
    public void requestbody_with_invalid_userId_with_and_with_valid(String string, String string2, String string3, String string4) {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }

    @When("Request with POST call invalid userId")
    public void request_with_POST_call_invalid_userId() {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }

    @Then("Should return status code as {int} with invalid userId")
    public void should_return_status_code_as_with_invalid_userId(Integer int1) {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }

    @Then("Returning correct errormessage when requested with invalid userId")
    public void returning_correct_errormessage_when_requested_with_invalid_userId() {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }

    @Given("Requestbody with invalid consumerId with {string} and with valid {string} , {string} , {string}")
    public void requestbody_with_invalid_consumerId_with_and_with_valid(String string, String string2, String string3, String string4) {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }

    @When("Request with POST call invalid consumerId")
    public void request_with_POST_call_invalid_consumerId() {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }

    @Then("Should return status code as {int} with invalid consumerId")
    public void should_return_status_code_as_with_invalid_consumerId(Integer int1) {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }

    @Then("Returning correct errormessage when requested with invalid consumerId")
    public void returning_correct_errormessage_when_requested_with_invalid_consumerId() {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }

    @Given("Requestbody with invalid objectId with {string} and with valid {string} , {string} , {string}")
    public void requestbody_with_invalid_objectId_with_and_with_valid(String string, String string2, String string3, String string4) {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }

    @When("Request with POST call with invalid objectId")
    public void request_with_POST_call_with_invalid_objectId() {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }

    @Then("Should return status code as {int} with invalid objectId")
    public void should_return_status_code_as_with_invalid_objectId(Integer int1) {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }

    @Then("Returning correct errormessage when requested with invalid objectId")
    public void returning_correct_errormessage_when_requested_with_invalid_objectId() {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }

    @Given("Request user feedRead api")
    public void request_user_feedRead_api() {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }

    @When("Request feedRead api with {string} in pathparam")
    public void request_feedRead_api_with_in_pathparam(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }

    @Then("User feedRead apis returns {int} statuscode")
    public void user_feedRead_apis_returns_statuscode(Integer int1) {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }
}
