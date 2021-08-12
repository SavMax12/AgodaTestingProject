package services.websiteSettings;

import pages.websiteSettings.LanguageChangePage;
import utils.Logger;

public class LanguageChangeService {

    private final LanguageChangePage languageChangePage = new LanguageChangePage();

    public void clickLanguageChange() {
        Logger.info("Click language change on the LanguageChangePage");
        languageChangePage.getItaliano().click();
    }
}
