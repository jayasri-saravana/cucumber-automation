package automation.stepdefs;

import automation.pageobjects.HomePage;
import automation.pageobjects.LoginPage;
import automation.pageobjects.SearchPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import static org.hamcrest.MatcherAssert.assertThat;

public class LoginStepDefs {
    HomePage homePage;
    LoginPage loginPage;
    SearchPage searchPage;

    @Given("user is on the home page")
    public void adactinHotelAppHomePage() {
        homePage.open();
    }

    @When("user logins to the portal with username {string} and password {string}")
    public void userLoginsToThePortalWithUsernameAndPassword(String username, String password) {
        loginPage.loginWithUsernameAndPassword(username, password);
    }


    @Then("hotel search page should be displayed")
    public void hotelSearchPageShouldBeDisplayed() {
        assertThat("Search title should be displayed", searchPage.getTitle().equals("Adactin.com - Search Hotel"));
    }

    @Then("invalid user error message should be displayed")
    public void invalidUserErrorMessageShouldBeDisplayed() {
        assertThat("Login Error message is displayed", loginPage.getAuthErrorText()
                .equals("Invalid Login details or Your Password might have expired. Click here to reset your password"));
    }

}
