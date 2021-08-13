package services.accountSettings;

import org.openqa.selenium.By;
import pages.accountSettings.MyProfilePage;
import utils.Logger;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.switchTo;

public class AddCardService {

    private final MyProfilePage addCard = new MyProfilePage();

    public void clickAddPaymentMethod() {
        Logger.info("Click add payment method on the MyProfilePage");
        switchTo().frame($(By.xpath("/html/body/div[15]/div[2]/section[3]/div[2]/iframe")));
        addCard.getAddCard().click();
        switchTo().defaultContent();
    }

    public void fillAllRequiredFieldsCard(
            final long cardNum,
            final String cardHolder,
            final int expiryDate,
            final String issuingBank
    ) {
        Logger.info("Fill all required fields the card on the MyProfilePage");
        switchTo().frame($(By.xpath("/html/body/div[15]/div[2]/section[3]/div[4]/div/div/div/div/iframe")));
        addCard.getCardNum().select(String.valueOf(cardNum));
        addCard.getCardHolder().clearAndType(cardHolder);
        addCard.getExpiryDate().clearAndType(String.valueOf(expiryDate));
        addCard.getIssuingBank().clearAndType(issuingBank);
    }

    public void clickSaveCard() {
        Logger.info("Click save card on the MyProfilePage");
        addCard.getSaveCard().click();
    }

    public void numberCardNotValidShouldHave() {
        Logger.info("Number card not valid should have on the MyProfilePage");
        addCard.getIsSavedTextCard().shouldHave("Пожалуйста, введите действительный номер кредитной карты");
    }
}
