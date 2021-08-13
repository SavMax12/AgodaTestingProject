package services.hotelOptions;

import pages.hotelOptions.AgodaPage;
import utils.Logger;

public class TravelDataService {

    private final AgodaPage agodaPage = new AgodaPage();

    public void clickData() {
        Logger.info("Click data on the AgodaPage");
        agodaPage.getDataIn().click();
    }

    public void clickDataPicker() {
        Logger.info("Click data picker on the AgodaPage");
        agodaPage.getClickDataDeparture().click();
        agodaPage.getClickDataArrival().click();
    }
}
