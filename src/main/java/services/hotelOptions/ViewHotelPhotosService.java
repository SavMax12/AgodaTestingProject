package services.hotelOptions;

import pages.hotelOptions.HotelInformationPage;
import utils.Logger;

public class ViewHotelPhotosService {

    private final HotelInformationPage hotelInformationPage = new HotelInformationPage();

    public void clickAllPhotos() {
        Logger.info("Click all photos on the HotelInformationPage");
        hotelInformationPage.getAllPhotos().waitUntil();
        hotelInformationPage.getAllPhotos().click();
    }

    public void doubleClickSwitchPhotos() {
        Logger.info("Double click switch photos on the HotelInformationPage");
        hotelInformationPage.getNextPhoto().doubleClick();
        hotelInformationPage.getNextPhoto().doubleClick();
        hotelInformationPage.getPreviousPhoto().doubleClick();
        hotelInformationPage.getPreviousPhoto().doubleClick();
    }

    public void clickClosePhotos() {
        Logger.info("Click close photos on the HotelInformationPage");
        hotelInformationPage.getClosePhotos().click();
    }

    public void isImage() {
        Logger.info("Is image on the HotelInformationPage");
        hotelInformationPage.getImage().isImage();
    }
}
