package services.logInLogOutRegister;

import enums.Email;
import enums.Password;
import pages.logInLogOutRegister.SignInPage;
import services.navigation.AgodaService;
import utils.Logger;

public class SignInService {

    private final SignInPage signInPage = new SignInPage();
    private final AgodaService agodaService = new AgodaService();

    public void selectorSignInAccount(final Email email, final Password password) {
        Logger.info("Selector sign in account on the SignInPage");
        signInPage.getEmail().clearAndType(email.getEmail());
        signInPage.getPassword().clearAndType(password.getPassword());
    }

    public void clickEnter() {
        Logger.info("Click enter on the SignInPage");
        signInPage.getEnter().click();
    }

    public boolean buttonSignInIsVisible() {
        Logger.info("Click enter on the AgodaService");
        return agodaService.buttonSignInAccountIsVisible();
    }
}
