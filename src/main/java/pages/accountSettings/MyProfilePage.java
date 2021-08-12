package pages.accountSettings;

import elements.*;
import org.openqa.selenium.By;

public class MyProfilePage {

    private final Button editNickname = new Button(By.id("mmb-name-component-display-edit-label"));
    private final Input firstName = new Input(By.id("mmb-name-component-change-firstname"));
    private final Input lastName = new Input(By.id("mmb-name-component-change-lastname"));
    private final Button saveNickname = new Button(By.id("mmb-name-component-change-save"));
    private final Button paymentMethods = new Button(By.xpath("//*[@data-selenium='mmb-menuitem-paymentmethods-label']"));
    private final Button addCard = new Button(By.xpath("//div[@class='mmb-bf-plus control-component']"));
    private final Selector cardNum = new Selector(By.xpath("//input[@id='mmb-ccof-card-num']"));
    private final Input cardHolder = new Input(By.id("mmb-ccof-card-holder"));
    private final Input expiryDate = new Input(By.id("expiryDate"));
    private final Input issuingBank = new Input(By.id("mmb-ccof-issuing-bank"));
    private final Button saveCard = new Button(By.id("mmb-ccof-cancel-add-card"));
    private final Radio everyDay = new Radio(By.xpath("//*[@id='mmb-newsletter-component-options']/span[1]/input"));
    private final Radio twoTimesAWeek = new Radio(By.xpath("//*[@id='mmb-newsletter-component-options']/span[2]/input"));
    private final Radio everyWeek = new Radio(By.xpath("//*[@id='mmb-newsletter-component-options']/span[3]/input"));
    private final Radio never = new Radio(By.xpath("//*[@id='mmb-newsletter-component-options']/span[4]/input"));
    private final Checkbox bookingReminders = new Checkbox(By.xpath("//*[@id='mmb-reminders-component-toggle']/div/div/span"));
    private final Checkbox messagesAboutPromotions = new Checkbox(By.xpath("//*[@id='mmb-promotions-component-toggle']/div/div/span"));
    private final Checkbox informationAboutOffers = new Checkbox(By.xpath("//*[@id='email-subscriptions']/section[4]/div/div[1]/div/div/span"));
    private final Button isSavedTextCard = new Button(By.xpath("//*[@class='help-block']"));
    private final Button isEditNickname = new Button(By.id("mmb-name-component-display"));
    private final Button isTextSavedIWorldLike = new Button(By.id("mmb-promotions-component-saved"));

    public Button getIsTextSavedIWorldLike() {
        return isTextSavedIWorldLike;
    }

    public Button getIsEditNickname() {
        return isEditNickname;
    }

    public Button getIsSavedTextCard() {
        return isSavedTextCard;
    }

    public Radio getEveryDay() {
        return everyDay;
    }

    public Radio getTwoTimesAWeek() {
        return twoTimesAWeek;
    }

    public Radio getEveryWeek() {
        return everyWeek;
    }

    public Radio getNever() {
        return never;
    }

    public Checkbox getBookingReminders() {
        return bookingReminders;
    }

    public Checkbox getMessagesAboutPromotions() {
        return messagesAboutPromotions;
    }

    public Checkbox getInformationAboutOffers() {
        return informationAboutOffers;
    }

    public Button getPaymentMethods() {
        return paymentMethods;
    }

    public Button getEditNickname() {
        return editNickname;
    }

    public Input getFirstName() {
        return firstName;
    }

    public Input getLastName() {
        return lastName;
    }

    public Button getSaveNickname() {
        return saveNickname;
    }

    public Button getAddCard() {
        return addCard;
    }

    public Selector getCardNum() {
        return cardNum;
    }

    public Input getCardHolder() {
        return cardHolder;
    }

    public Input getExpiryDate() {
        return expiryDate;
    }

    public Input getIssuingBank() {
        return issuingBank;
    }

    public Button getSaveCard() {
        return saveCard;
    }
}

