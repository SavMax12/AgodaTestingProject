package pages.logInLogOutRegister;

import elements.Button;
import elements.Input;
import org.openqa.selenium.By;

public class SignInPage {

    private final Input email = new Input(By.id("email"));
    private final Input password = new Input(By.id("password"));
    private final Button enter = new Button(By.xpath("//*[@data-cy='signin-button']"));
    private final Button signInGoogle = new Button(By.xpath("//*[@data-element-name='universal-login-google-button']"));
    private final Button isSignInPage = new Button(By.xpath("//*[@data-cy='login-panel']"));

    public Button getSignInGoogle() {
        return signInGoogle;
    }

    public Button getIsSignInPage() {
        return isSignInPage;
    }

    public Input getEmail() {
        return email;
    }

    public Input getPassword() {
        return password;
    }

    public Button getEnter() {
        return enter;
    }
}
