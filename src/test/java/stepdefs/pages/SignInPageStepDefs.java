package stepdefs.pages;

import enums.Email;
import enums.Password;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import services.logInLogOutRegister.SignInService;
import services.logInLogOutRegister.SignInWithGoogleService;
import services.navigation.AgodaService;

import static org.testng.Assert.assertTrue;

public class SignInPageStepDefs {

    private final SignInService signInService = new SignInService();
    private final SignInWithGoogleService signInWithGoogleService = new SignInWithGoogleService();
    private final AgodaService agodaService = new AgodaService();

    @When("fill in the fields Email and Password")
    public void fillInTheFieldsEmailAndPassword() {
        signInService.selectorSignInAccount(Email.YANDEX, Password.PASSWORD);
    }

    @And("click Sign in button")
    public void clickSignInButton() {
        signInService.clickEnter();
    }

    @When("click on Google button")
    public void clickOnGoogleButton() {
        signInWithGoogleService.signInWithGoogleAccount();
    }

    @Then("check that the my Account field is displayed")
    public void theMessageYouHaveSuccessfullyLoggedInAppearedOnTheScreenTheLoginToTheAccountWasCompletedSuccessfully() {
        assertTrue(agodaService.buttonMyAccountListIsVisible());
    }

    @Then("check that the Google label is missing on the page")
    public void checkThatTheGoogleAccountLoginPageHasAppeared() {
        signInWithGoogleService.googleShouldNotHave();
    }
}
