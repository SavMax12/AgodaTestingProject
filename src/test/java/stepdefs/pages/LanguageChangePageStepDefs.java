package stepdefs.pages;

import io.cucumber.java.en.And;
import services.websiteSettings.LanguageChangeService;

public class LanguageChangePageStepDefs {

    private final LanguageChangeService languageChangeService = new LanguageChangeService();

    @And("choose the site language Italian")
    public void chooseTheSiteLanguage() {
        languageChangeService.clickLanguageChange();
    }
}
