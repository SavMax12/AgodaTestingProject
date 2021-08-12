package stepdefs.pages;

import io.cucumber.java.en.And;
import services.websiteSettings.CurrencyChangeService;

public class CurrencyChangePageStepDefs {

    private final CurrencyChangeService currencyChangeService = new CurrencyChangeService();

    @And("choose a currency Russian ruble")
    public void selectLanguageInTheListOfLanguages() {
        currencyChangeService.clickCurrencyChange();
    }
}
