package services.logInLogOutRegister;

import pages.navigation.NavBar;
import utils.Logger;

public class SignOutService {

    private final NavBar navBar = new NavBar();

    public boolean buttonSignOutIsVisible() {
        Logger.info("Button sign out is visible on the NavBar");
        return navBar.outAccountIsVisible();
    }
}
