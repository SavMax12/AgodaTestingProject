package services.logInLogOutRegister;

import enums.Email;
import enums.Password;
import pages.logInLogOutRegister.SignUpPage;
import utils.Logger;

public class SignUpService {

    private final SignUpPage signUpPage = new SignUpPage();

    public void fillAllRequiredFieldsSignUp(
            final String firstName,
            final String lastName,
            final Email email,
            final Password password,
            final Password confirmPassword,
            final boolean emailMeExclusive
    ) {
        Logger.info("Fill all required fields sign up on the SignUpPage");
        signUpPage.getFirstName().clearAndType(firstName);
        signUpPage.getLastName().clearAndType(lastName);
        signUpPage.getEmail().select(email.getEmail());
        signUpPage.getPassword().select(password.getPassword());
        signUpPage.getConfirmPassword().select(confirmPassword.getPassword());
        if (emailMeExclusive) {
            signUpPage.getEmailMeExclusive().check();

        }
    }

    public void clickSignUp() {
        Logger.info("Click sign up on the SignUpPage");
        signUpPage.getRegisterButton().click();
    }

    public void clickSignUpWithMobile() {
        Logger.info("Click sign up with mobile on the SignUpPage");
        signUpPage.getMobileSignUp().click();
    }

    public void signUpShouldHave() {
        Logger.info("Sign up should have on the SignUpPage");
        signUpPage.getCaptchaErrorText().shouldHave("Пожалуйста, выполните проверку CAPTCHA");
    }
}
