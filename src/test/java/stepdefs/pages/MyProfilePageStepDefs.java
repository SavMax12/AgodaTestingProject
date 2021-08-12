package stepdefs.pages;

import enums.Newsletter;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import services.accountSettings.AddCardService;
import services.accountSettings.EditNicknameService;
import services.accountSettings.EmailSubscriptionsService;
import services.navigation.AgodaService;

import static org.testng.Assert.assertTrue;

public class MyProfilePageStepDefs {

    private final AddCardService addCardService = new AddCardService();
    private final EditNicknameService editNicknameService = new EditNicknameService();
    private final AgodaService agodaService = new AgodaService();
    private final EmailSubscriptionsService emailSubscriptionsService = new EmailSubscriptionsService();

    @And("click on add new payment method button")
    public void clickOnAddNewPaymentMethod() {
        addCardService.clickAddPaymentMethod();
    }

    @And("fill in the fields of the card:" +
            " Credit card number={long}, Card holder name={string}, Expiry date={int}, Issuing bank={string}, click on save card button")
    public void fillInTheFieldsOfTheCardCreditCardNumberCardHolderNameExpiryDateIssuingBank(
            Long cardNumber, String holderName, Integer expiryDate, String issuingBank
    ) {
        addCardService.fillAllRequiredFieldsCard(
                cardNumber,
                holderName,
                expiryDate,
                issuingBank
        );
    }

    @And("click on save nickname button")
    public void clickOnSaveNicknameButton() {
        editNicknameService.clickSaveNickname();
    }


    @And("click on the edit name button")
    public void clickOnTheEditNameButton() {
        editNicknameService.clickEditNickname();
    }

    @And("fill in the fields First name={string}, Last name={string}")
    public void fillInTheFields(String firstName, String lastName) {
        editNicknameService.fillAllRequiredFieldsNickname(firstName, lastName);
    }

    @And("click save button")
    public void saveOrNotSaveChanges() {
        editNicknameService.clickSaveNickname();
    }

    @And("set up newsletter")
    public void setUpNewsletter() {
        emailSubscriptionsService.radioNewsletter(Newsletter.TWO_TIMES_A_WEEK);
    }

    @Then("check that the changes have been saved")
    public void checkThatTheChangesHaveBeenSaved() {
        editNicknameService.saveNicknameIsVisible();
    }

    @Then("check that two time a week is visible")
    public void checkThatTwoTimeAWeekIsVisible() {
        emailSubscriptionsService.newsletterIsVisible();
    }

    @When("click on the radio next to the text I would like to receive booking assist reminders")
    public void clickOnTheRadioNextToTheTextIWouldLikeToReceiveBookingAssistReminders() {
        emailSubscriptionsService.checkboxIWouldLikeBookingReminders(true);
    }

    @And("click on the radio next to the text I would like to receive emails about Agoda promotions")
    public void clickOnTheRadioNextToTheTextIWouldLikeToReceiveEmailsAboutAgodaPromotions() {
        emailSubscriptionsService.checkboxIWouldLikeMessagesAboutPromotions(true);
    }

    @And("click on the radio next to the text I would like to know about information and offers related to my upcoming trip")
    public void clickOnTheRadioNextToTheTextIWouldLikeToKnowAboutInformationAndOffersRelatedToMyUpcomingTrip() {
        emailSubscriptionsService.checkboxIWouldLikeInformationAboutOffers(true);
    }

    @Then("check that the text Saved has appeared")
    public void checkThatAllButtonsIsVisible() {
        emailSubscriptionsService.iWouldLikeTextShouldHave();
    }

    @Then("to check that the inscription appears, Please enter a valid credit card number under the Credit or debit card number field")
    public void toCheckThatTheInscriptionAppearsPleaseEnterAValidCreditCardNumberUnderTheCreditOrDebitCardNumberField() {
        addCardService.numberCardNotValidShouldHave();
    }

    @Then("check that the name editing field is displayed")
    public void makeSureThatTheProfileSettingsPageIsDisplayed() {
        assertTrue(editNicknameService.saveNicknameIsVisible());
    }

    @And("click on save card button")
    public void clickOnSaveCardButton() {
        addCardService.clickSaveCard();
    }
}
