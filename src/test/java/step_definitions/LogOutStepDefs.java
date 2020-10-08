package step_definitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.SignInPage;
import utilities.ConfigurationReader;
import utilities.Driver;

public class LogOutStepDefs {

    @Given("I login as a manager")
    public void i_login_as_a_manager() {
        new SignInPage().SignIn(ConfigurationReader.getConfPropCredentials("manager_username"),
                ConfigurationReader.getConfPropCredentials("password"));
    }

    @When("I LogOut from app")
    public void i_LogOut_from_app() {
        WebDriverWait wait=new WebDriverWait(Driver.getDriver(), 25);
        wait.until(ExpectedConditions.elementToBeClickable(new SignInPage().avatar));
        new SignInPage().avatar.click();
        new SignInPage().LogOut.isSelected();

    }

    @Then("I able to view SignIn page")
    public void i_able_to_view_SignIn_page() {
        Assert.assertEquals("Cybrary", Driver.getDriver().getTitle());

    }
}
