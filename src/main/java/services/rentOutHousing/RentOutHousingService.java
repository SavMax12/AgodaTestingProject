package services.rentOutHousing;

import enums.LocationAddresses;
import enums.PropertyCategory;
import pages.rentOutHousing.RentOutHousingPage;
import services.navigation.AgodaService;
import utils.Logger;

import static com.codeborne.selenide.Selenide.switchTo;

public class RentOutHousingService {

    private final RentOutHousingPage rentOutHousingPage = new RentOutHousingPage();
    private final AgodaService agodaService = new AgodaService();

    public void clickPlaceHousing() {
        Logger.info("Click place housing on the RentOutHousingPage");
        rentOutHousingPage.getPlaceHousing().click();
    }

    public void clickPropertyType() {
        Logger.info("Click property type on the RentOutHousingPage");
        rentOutHousingPage.getPrivateHousing().click();
    }

    public void selectorPropertiesCategory(final PropertyCategory propertyCategory) {
        Logger.info("Selector properties category on the RentOutHousingPage");
        switch (propertyCategory) {
            case APARTMENTS: {
                rentOutHousingPage.getApartments().check();
                break;
            }
            case VILLA: {
                rentOutHousingPage.getVilla().check();
                break;
            }
            case BOTEL: {
                rentOutHousingPage.getBotel().check();
                break;
            }
            case CHALET: {
                rentOutHousingPage.getChalet().check();
                break;
            }
            case VACATION_HOME: {
                rentOutHousingPage.getVacationHome().check();
                break;
            }
            case FAMILY_HOTEL: {
                rentOutHousingPage.getFamilyHotel().check();
                break;
            }
        }
    }

    public void doubleClickSelectorNumberOfProperties(final LocationAddresses locationAddresses) {
        Logger.info("Double click selector number of properties on the RentOutHousingPage");
        rentOutHousingPage.getNumberOfObjects().doubleClick();
        rentOutHousingPage.getNumberOfObjects().doubleClick();

        switch (locationAddresses) {
            case ONE_ADDRESS: {
                rentOutHousingPage.getOneAddress().check();
                break;
            }
            case DIFFERENT_ADDRESS: {
                rentOutHousingPage.getDifferentAddresses().check();
                break;
            }
        }
    }

    public void clickNext() {
        Logger.info("Click next on the RentOutHousingPage");
        rentOutHousingPage.getSubmit().click();
    }

    public boolean createAccountOrMainPageIsVisible() {
        Logger.info("Create account or mainPage is visible on the RentOutHousingPage and AgodaService");
        if (rentOutHousingPage.getCreateAccount().isVisible()) {
            return rentOutHousingPage.getCreateAccount().isVisible();
        } else {
            switchTo().window(0);
            return agodaService.mainPageIsVisible();
        }
    }
}
