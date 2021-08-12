package stepdefs.pages;

import enums.Email;
import enums.Password;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import services.logInLogOutRegister.SignUpService;
import services.logInLogOutRegister.SignUpWithMobileService;

public class SignUpPageStepDefs {

    private final SignUpService signUpService = new SignUpService();
    private final SignUpWithMobileService signUpWithMobileService = new SignUpWithMobileService();

    @When("fill in the fields: " +
            "First name={string}, Last name = {string}, {string}, {string}, {string}," +
            " remove the filter Email me exclusive Agoda promotions. I can opt out later as stated in the Privacy Policy.")
    public void fillInTheFieldsFirstNameLastNameRemoveTheFilterEmailMeExclusiveAgodaPromotionsICanOptOutLaterAsStatedInThePrivacyPolicy(
            String firstName, String lastName, String email, String password, String confirmPassword
    ) {
        signUpService.fillAllRequiredFieldsSignUp(
                firstName,
                lastName,
                Email.YANDEX,
                Password.PASSWORD,
                Password.PASSWORD,
                true
        );
    }

    @And("click Sign up button")
    public void clickSignUpButton() {
        signUpService.clickSignUp();
    }

    @When("go to the page Mobile")
    public void goToThePageMobile() {
        signUpService.clickSignUpWithMobile();
    }

    @And("fill in the fields: Country={string}, Number = {}, {string}, add a filter Send me special offers and promotions")
    public void fillInTheFieldsCountryNumberAddAFilterSendMeSpecialOffersAndPromotions(String country, Long number, String password) {
        signUpWithMobileService.fillAllRequiredFieldsSignUpWithMobile(
                country,
                number,
                Password.PASSWORD,
                true
        );
    }

    @And("click Send OTP button")
    public void clickSendOTPButton() {
        signUpWithMobileService.clickSendOTP();
    }

    @Then("check that the inscription has appeared Please perform a CAPTCHA check under the captcha in sign up page")
    public void checkThatTheInscriptionHasAppearedPleasePerformACAPTCHACheckUnderTheCaptchaInSignUpPage() {
        signUpService.signUpShouldHave();
    }

    @Then("check that the inscription has appeared Please perform a CAPTCHA check under the captcha in mobile sign up page")
    public void checkThatTheInscriptionHasAppearedPleasePerformACAPTCHACheckUnderTheCaptchaInMobileSignUpPage() {
        signUpWithMobileService.signUpShouldHave();
    }
}
