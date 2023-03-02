package Step_Definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Test;
import utilities.Driver;




public class Step_Definitions {
    @Test
    @Given("dnsbac nsdx")
    public void dnsbacNsdx() {
        Driver.getDriver().get("https://www.inps.it/it/it.html");
    }

    @Then("cd xzcnmz")
    public void cdXzcnmz() {
        
    }

    @And("knxk xzc")
    public void knxkXzc() {
    }

    @Given("User should open googlePage and click")
    public void userShouldOpenGooglePageAndClick()
    {


        Driver.getDriver().get("https://www.inps.it/it/it.html");
    }
}
