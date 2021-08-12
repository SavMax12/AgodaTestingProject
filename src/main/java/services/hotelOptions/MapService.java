package services.hotelOptions;

import pages.hotelOptions.HotelInformationPage;
import utils.Logger;

public class MapService {

    private final HotelInformationPage hotelInformationPage = new HotelInformationPage();

    public void clickMap() {
        Logger.info("Click map on the HotelInformationPage");
        hotelInformationPage.getMap().waitUntil();
        hotelInformationPage.getMap().click();
    }

    public void clickEntertainmentList() {
        Logger.info("Click entertainment list on the HotelInformationPage");
        hotelInformationPage.getEntertainmentList().click();
        hotelInformationPage.getFirstEntertainment().click();
        hotelInformationPage.getBack().click();
    }

    public void doubleClickZoomMap() {
        Logger.info("Double click zoom map on the HotelInformationPage");
        hotelInformationPage.getZoomIn().doubleClick();
        hotelInformationPage.getZoomIn().doubleClick();
        hotelInformationPage.getZoomOut().doubleClick();
        hotelInformationPage.getZoomOut().doubleClick();
        hotelInformationPage.getZoomOut().doubleClick();

    }

    public boolean hotelInformationPageIsVisible() {
        Logger.info("Hotel information page is visible on the HotelInformationPage");
        return hotelInformationPage.getIsPage().isVisible();
    }
}
