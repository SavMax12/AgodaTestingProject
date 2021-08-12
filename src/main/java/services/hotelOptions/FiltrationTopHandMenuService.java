package services.hotelOptions;

import pages.hotelOptions.ListOfHotelsPage;
import utils.Logger;

public class FiltrationTopHandMenuService {

    private final ListOfHotelsPage listOfHotelsPage = new ListOfHotelsPage();

    public void clickPrice() {
        Logger.info("Click price on the ListOfHotelsPage");
        listOfHotelsPage.getPrice().click();
    }

    public void priceDragAndDrop() {
        Logger.info("Price drag and drop the ListOfHotelsPage");
        listOfHotelsPage.priceSet();
    }

    public void clickStars() {
        Logger.info("Click stars on the ListOfHotelsPage");
        listOfHotelsPage.getNumberOfStars().click();
    }

    public void checkboxNumberOfStars(final boolean fiveStars, final boolean threeStars, final boolean noStars) {
        Logger.info("Checkbox number of stars on the ListOfHotelsPage");
        if (fiveStars) {
            listOfHotelsPage.getFiveStars().check();
        }
        if (threeStars) {
            listOfHotelsPage.getThreeStars().check();
        }
        if (noStars) {
            listOfHotelsPage.getNoStars().check();
        }
    }

    public void clickMore() {
        Logger.info("Click more on the ListOfHotelsPage");
        listOfHotelsPage.getMore().click();
    }

    public void clickCleanFilters() {
        Logger.info("Click clean filters on the ListOfHotelsPage");
        listOfHotelsPage.getClearFilters().click();
    }

    public void clickDone() {
        Logger.info("Click done on the ListOfHotelsPage");
        listOfHotelsPage.getDone().click();
    }

    public boolean threeStarsIsVisible() {
        Logger.info("Three stars is visible on the ListOfHotelsPage");
        return listOfHotelsPage.getThreeStars().isVisible();
    }

    public boolean listOfHotelsPageIsVisible() {
        Logger.info("List of hotels page is visible on the ListOfHotelsPage");
        return listOfHotelsPage.getPageIsVisible().isVisible();
    }

    public void priceShouldNotHave() {
        Logger.info("Price should not have on the ListOfHotelsPage");
        listOfHotelsPage.getInputPrice().shouldNotHave("0");
    }
}
