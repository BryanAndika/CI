package stepdef;

import io.cucumber.java.PendingException;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import pages.HomePage;
import pages.LoginPage;

import static helper.Utility.webDriver;

public class LoginStepDef {
    private static final Logger log = LoggerFactory.getLogger(LoginStepDef.class);

    @Given("User is on login page")
    public void userIsOnLoginPage() {
        LoginPage loginPage = new LoginPage();
        Assert.assertTrue(loginPage.isPageDisplayed());

    }

    @When("user input username with {string}")
    public void userInputUsernameWith(String username) {
        LoginPage loginPage = new LoginPage();
        loginPage.setInputUsername(username);
    }

    @And("user input password with {string}")
    public void userInputPasswordWith(String password) {
        LoginPage loginPage = new LoginPage();
        loginPage.setGetInputPassword(password);
    }

    @And("user click login button")
    public void userClickLoginButton() {

    }

    @Then("user will redirected to home page")
    public void userWillRedirectedToHomePage() {
        HomePage homePage = new HomePage();
        Assert.assertTrue(homePage.verifyPageIsDisplayed());

    }

    @Then("user will see error message {string}")
    public void userWillSeeErrorMessage(String expectedMessage) {
        // Lokasi element error pakai attribute data-test
        String actualMessage = webDriver.findElement(By.cssSelector("[data-test='error']")).getText();
        // Assert
        Assert.assertEquals(expectedMessage, actualMessage);
    }
}