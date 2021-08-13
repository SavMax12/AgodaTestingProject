package services.websiteSettings;

import pages.websiteSettings.CurrencyChangePage;
import utils.Logger;

public class CurrencyChangeService {

    private final CurrencyChangePage currencyChangePage = new CurrencyChangePage();

    public void clickCurrencyChange() {
        Logger.info("Click currency change on the CurrencyChangePage");
        currencyChangePage.getRub().click();
    }
}
