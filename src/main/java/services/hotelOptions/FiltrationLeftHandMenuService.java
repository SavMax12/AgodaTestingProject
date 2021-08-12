package services.hotelOptions;

import enums.LocationEstimates;
import pages.hotelOptions.ListOfHotelsPage;
import utils.Logger;

public class FiltrationLeftHandMenuService {

    private final ListOfHotelsPage listOfHotelsPage = new ListOfHotelsPage();

    public void checkboxDistanceToCenter(final boolean inCenter, final boolean twoFiveKM, final boolean moreTenKM) {
        Logger.info("Checkbox distance to center on the ListOfHotelsPage");
        if (inCenter) {
            listOfHotelsPage.getInCenter().check();
        }
        if (twoFiveKM) {
            listOfHotelsPage.getTwoFiveKM().check();
        }
        if (moreTenKM) {
            listOfHotelsPage.getMoreTenKM().check();
        }
    }

    public void checkboxLocationRating(final LocationEstimates locationEstimates) {
        Logger.info("Checkbox location rating on the ListOfHotelsPage");
        switch (locationEstimates) {
            case NINE: {
                listOfHotelsPage.getNine().check();
                break;
            }
            case EIGHT: {
                listOfHotelsPage.getEight().check();
                break;
            }
            case SEVEN: {
                listOfHotelsPage.getSeven().check();
                break;
            }
        }
    }

    public void clickCheckboxNeighborhood(final boolean neighborhood) {
        Logger.info("Click Checkbox neighborhood on the ListOfHotelsPage");
        listOfHotelsPage.getShowMore().click();
        if (neighborhood) {
            listOfHotelsPage.getNeighborhood().check();
        }
    }

    public boolean distanceToCenterIsVisible() {
        Logger.info("Distance to center is visible on the ListOfHotelsPage");
        return listOfHotelsPage.getInCenter().isVisible();
    }
}

