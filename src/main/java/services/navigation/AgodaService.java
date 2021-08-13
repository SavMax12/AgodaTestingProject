package services.navigation;

import pages.hotelOptions.AgodaPage;
import utils.Logger;

public class AgodaService {

    private final AgodaPage agodaPage = new AgodaPage();

    public void openSignInAccount() {
        Logger.info("Open sign in account on the AgodaPage");
        agodaPage.getNavBar().openSignInAccount();
    }

    public boolean buttonSignInAccountIsVisible() {
        Logger.info("Button sign in account is visible on the AgodaPage");
        return agodaPage.getNavBar().openSignInAccountIsVisible();
    }

    public void clickProfile() {
        Logger.info("Click profile on the AgodaPage");
        agodaPage.getNavBar().clickProfile();
    }

    public boolean buttonMyProfileIsVisible() {
        Logger.info("Button my profile is visible on the AgodaPage");
        return agodaPage.getNavBar().myProfileIsVisible();
    }

    public void openMyAccountList() {
        Logger.info("Open my account list on the AgodaPage");
        agodaPage.getNavBar().openMyAccountList();
    }

    public void openCurrencyChange() {
        Logger.info("Open currency change on the AgodaPage");
        agodaPage.getNavBar().openCurrencyChange();
    }

    public void openLanguageChange() {
        Logger.info("Open language change on the AgodaPage");
        agodaPage.getNavBar().openLanguageChange();
    }

    public void openRentOutHousing() {
        Logger.info("Open rent out housing on the AgodaPage");
        agodaPage.getNavBar().openRentOutHousing();
    }

    public void clickSearch() {
        Logger.info("Click search on the AgodaPage");
        agodaPage.getNavBar().clickSearch();
    }

    public boolean buttonMyAccountListIsVisible() {
        Logger.info("Button my account list is visible on the AgodaPage");
        return agodaPage.getNavBar().openMyAccountListIsVisible();
    }

    public boolean signInAccountIsVisible() {
        Logger.info("Sign in account is visible on the AgodaPage");
        agodaPage.getNavBar().openSignInAccountIsVisible();
        return agodaPage.getNavBar().openSignInAccountIsVisible();
    }

    public boolean mainPageIsVisible() {
        Logger.info("Main page is visible on the AgodaPage");
        agodaPage.getMainPage().waitUntil();
        return agodaPage.getMainPage().isVisible();
    }

    public void openSignUpAccount() {
        Logger.info("Open sign up account on the AgodaPage");
        agodaPage.getNavBar().openSignUp();
    }

    public void openCurrentOffers() {
        Logger.info("Open current offers on the AgodaPage");
        agodaPage.getNavBar().openCurrentOffers();

    }

    public void clickSignOut() {
        Logger.info("Click sign out on the AgodaPage");
        agodaPage.getNavBar().clickSignOut();
    }

    public void italianLanguageShouldHave() {
        Logger.info("Italian language should have on the AgodaPage");
        agodaPage.getMainPage().shouldHave("più");
    }
}

