package step_definitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import pages.SignInPage;
import utilities.ConfigurationReader;
import utilities.Driver;

public class SignInStepDefs {
    @Given("I am on the Login page")
    public void i_am_on_the_Login_page() {
        Driver.getDriver().get(ConfigurationReader.getConfPropCredentials("url"));
    }
    @When("I SignIn as a manager")
    public void i_SignIn_as_a_manager() {
        String username = ConfigurationReader.getConfPropCredentials("manager_username");
        String passwords = ConfigurationReader.getConfPropCredentials("password");
        new SignInPage().SignIn(username,passwords);
    }

    @Then("I am on the Home Page")
    public void i_am_on_the_Home_Page() {
        String expected = "Login | Cybrary";
        Assert.assertEquals(expected, Driver.getDriver().getTitle());
    }

    @When("I SignIn as a student")
    public void i_SignIn_as_a_student() {
        String username = ConfigurationReader.getConfPropCredentials("student_usernamePro");
        String passwords = ConfigurationReader.getConfPropCredentials("password");
        new SignInPage().SignIn(username,passwords);
    }

}
