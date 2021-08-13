package services.logInLogOutRegister;

import enums.Password;
import pages.logInLogOutRegister.SignUpPage;
import utils.Logger;

public class SignUpWithMobileService {

    private final SignUpPage signUpPage = new SignUpPage();

    public void fillAllRequiredFieldsSignUpWithMobile(
            final String country,
            final long number,
            final Password password,
            final boolean informationAboutDiscounts
    ) {
        Logger.info("Fill all required fields sign up with mobile on the SignUpPage");
        signUpPage.getCountryMobile().select(country);
        signUpPage.getNumberMobile().clearAndType(String.valueOf(number));
        signUpPage.getClickSome().click();
        signUpPage.getPasswordMobile().clearAndType(password.getPassword());
        if (informationAboutDiscounts) {
            signUpPage.getInformationAboutDiscounts().check();
        }
        signUpPage.getClickSendOTP().click();
    }

    public void clickSendOTP() {
        Logger.info("Click send OTP on the SignUpPage");
        signUpPage.getClickSendOTP().click();
    }

    public void signUpShouldHave() {
        Logger.info("Sign up should have on the SignUpPage");
        signUpPage.getCaptchaErrorText().shouldHave("Пожалуйста, выполните проверку CAPTCHA");
    }
}
