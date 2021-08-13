package pages.logInLogOutRegister;

import elements.Button;
import elements.Checkbox;
import elements.Input;
import elements.Selector;
import org.openqa.selenium.By;

public class SignUpPage {

    private final Input firstName = new Input((By.id("firstName")));
    private final Input lastName = new Input(By.id("lastName"));
    private final Selector email = new Selector(By.id("email"));
    private final Selector password = new Selector(By.id("password"));
    private final Selector ConfirmPassword = new Selector(By.id("confirmPassword"));
    private final Checkbox emailMeExclusive = new Checkbox(By.xpath("//span[@class='sc-fznZeY dzZFTs sc-fzoxKX dveGrF']"));
    private final Button registerButton = new Button(By.xpath("//*[@data-cy='signup-button']"));
    private final Button mobileSignUp = new Button(By.xpath("//*[@data-cy='phone_tab']"));
    private final Selector countryMobile = new Selector(By.xpath("//*[@data-cy='country-selector']"));
    private final Button clickSome = new Button(By.xpath("//span[@data-cy='phone_tab']"));
    private final Input numberMobile = new Input(By.id("phone"));
    private final Input passwordMobile = new Input(By.id("password"));
    private final Checkbox informationAboutDiscounts = new Checkbox(By.xpath("//*[@class='sc-fznZeY dzZFTs sc-fzoxKX dveGrF']"));
    private final Button sendClickSendOTP = new Button(By.xpath("//*[@data-cy='sendotp-button']"));
    private final Button captchaErrorText = new Button(By.xpath("//*[@data-cy='captcha-error']"));

    public Button getCaptchaErrorText() {
        return captchaErrorText;
    }

    public Button getRegisterButton() {
        return registerButton;
    }

    public Button getMobileSignUp() {
        return mobileSignUp;
    }

    public Selector getCountryMobile() {
        return countryMobile;
    }

    public Button getClickSome() {
        return clickSome;
    }

    public Input getNumberMobile() {
        return numberMobile;
    }

    public Input getPasswordMobile() {
        return passwordMobile;
    }

    public Checkbox getInformationAboutDiscounts() {
        return informationAboutDiscounts;
    }

    public Button getClickSendOTP() {
        return sendClickSendOTP;
    }

    public Input getFirstName() {
        return firstName;
    }

    public Input getLastName() {
        return lastName;
    }

    public Selector getEmail() {
        return email;
    }

    public Selector getPassword() {
        return password;
    }

    public Checkbox getEmailMeExclusive() {
        return emailMeExclusive;
    }

    public Selector getConfirmPassword() {
        return ConfirmPassword;
    }
}
