package services.hotelOptions;

import enums.City;
import pages.hotelOptions.AgodaPage;
import utils.Logger;

public class SearchLineService {

    private final AgodaPage agodaPage = new AgodaPage();

    public void selectorSearch(final City location) {
        Logger.info("Selector search on the AgodaPage");
        agodaPage.getLocation().select(location.getCityName());
    }

    public void clickChooseFirst() {
        Logger.info("Click choose first on the AgodaPage");
        agodaPage.getChooseTheFirst().click();
    }

    public void searchShouldNotHave() {
        Logger.info("Search should not have on the AgodaPage");
        agodaPage.getLocation().shouldNotHave(City.ISTANBUL.getCityName());
    }
}
