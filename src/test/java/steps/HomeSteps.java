package steps;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.List;

public class HomeSteps {

    @Given("User open application")
    public void user_open_application() {
        System.out.println("user open application");
    }
    @When("user on welcome screen")
    public void user_on_welcome_screen() {
        System.out.println("user on welcome screen");
    }

    @Then("I login with {string} and {string}")
    public void i_login_with_and(String username, String password) {
        System.out.println("I entered my username:: "+ username +" I entered my password :: "+password);
    }


    @Given("I entered my credentials")
    public void i_entered_my_credentials(DataTable dataTable) {
        List<List<String>> list = dataTable.asLists(String.class);
        System.out.println(list.get(0).get(0));
        System.out.println(list.get(0).get(1));
        System.out.println(list.get(0).get(2));
    }
    @Then("verify login failed")
    public void verify_login_failed() {
        System.out.println("verify login failed");
    }


}
