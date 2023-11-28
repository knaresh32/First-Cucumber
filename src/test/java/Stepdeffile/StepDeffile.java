import io.cucumber.java.en.*;

public class StepDeffile {

    @Given("I launched chrome browser")
    public void i_launched_chrome_browser() {
        System.out.println("Chrome browser Launched");

    }

    @When("I open OrangeHRM Home Page")
    public void i_open_orange_hrm_home_page() {
        System.out.println("Homepage Launched");
    }

    @Then("I verify that the logo present on page")
    public void i_verify_that_the_logo_present_on_page() {
        System.out.println("logo present on page");
    }

    @Then("I close browser")
    public void i_close_browser() {
        System.out.println("browser closed");
    }

}