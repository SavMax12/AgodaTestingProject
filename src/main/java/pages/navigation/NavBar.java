package pages.navigation;

import elements.Button;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.*;

public class NavBar {

    private final Button signInAccount = new Button(By.id("sign-in-btn"));
    private final Button myAccountList = new Button(By.xpath("//*[@data-selenium='login-text']"));
    private final Button myProfile = new Button(By.xpath("//*[@class='profile-menu']"));
    private final Button currencyChange = new Button(By.xpath("//*[@class='currency-trigger__text']"));
    private final Button languageChange = new Button(By.xpath("//*[@class='language-trigger__icon flag flag-18 flag-18-ru']"));
    private final Button rentOutHousing = new Button(By.xpath("//*[@class='sc-dQppl jYKOye ListYourProperty__Btn']"));
    private final Button search = new Button(By.xpath("//*[@data-selenium='searchButton']"));
    private final Button signUp = new Button(By.id("sign-up-btn"));
    private final Button out = new Button(By.id("sign-out-btn"));
    private final Button reservation = new Button(By.xpath("//*[@data-selenium='ChildRoomsList-bookButtonInput']"));
    private final Button chooseRoom = new Button(By.xpath("//*[@class='PropertyCard__HotelName']"));
    private final Button currentOffers = new Button(By.xpath("//*[@data-selenium='header-deals']"));

    public void openSignInAccount() {
        signInAccount.click();
        switchTo().frame($(By.xpath("/html/body/div[15]/div/div/div/div/div/iframe")));
    }

    public boolean openSignInAccountIsVisible() {
        signInAccount.waitUntil();
        return signInAccount.isVisible();
    }

    public void clickProfile() {
        myProfile.click();
    }

    public boolean myProfileIsVisible() {
        return myProfile.isVisible();
    }

    public void openCurrencyChange() {
        currencyChange.click();
    }

    public void openLanguageChange() {
        languageChange.click();
    }

    public void openRentOutHousing() {
        rentOutHousing.click();
        switchTo().window(1);
    }

    public void clickSearch() {
        search.click();
    }

    public void openSignUp() {
        signUp.click();
        switchTo().frame($(By.xpath("/html/body/div[21]/div/div/div[2]/div/div/div[1]/div/div/div/iframe")));
    }

    public void openMyAccountList() {
        myAccountList.click();
    }

    public boolean openMyAccountListIsVisible() {
        myAccountList.waitUntil();
        return myAccountList.isVisible();
    }

    public boolean openSignUpIsVisible() {
        return signUp.isVisible();
    }

    public void clickSignOut() {
        out.click();
    }

    public void reservationHotel() {
        reservation.hover();
        reservation.waitUntil();
        reservation.click();
    }

    public void chooseRoom() {
        chooseRoom.click();
        switchTo().window(1);
    }

    public void openCurrentOffers() {
        currentOffers.click();
        switchTo().window(1);
    }

    public boolean currentOffersIsVisible() {
        while (!currentOffers.isVisible()) {
            closeWindow();
            open("https://www.agoda.com/ru-ru/");
        }
        return currentOffers.isVisible();
    }

    public boolean outAccountIsVisible() {
        return out.isVisible();
    }
}
