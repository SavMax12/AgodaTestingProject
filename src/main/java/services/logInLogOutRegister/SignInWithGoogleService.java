package services.logInLogOutRegister;

import pages.logInLogOutRegister.SignInPage;
import utils.Logger;

public class SignInWithGoogleService {

    private final SignInPage signInPage = new SignInPage();

    public void signInWithGoogleAccount() {
        Logger.info("Sign in with google account on the SignInPage");
        signInPage.getSignInGoogle().click();
    }

    public void googleShouldNotHave() {
        Logger.info("Google should not have on the SignInPage");
        signInPage.getIsSignInPage().shouldNotHave("Google");
    }
}
