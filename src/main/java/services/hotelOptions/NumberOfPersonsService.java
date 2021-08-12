package services.hotelOptions;

import pages.hotelOptions.AgodaPage;
import utils.Logger;

public class NumberOfPersonsService {

    private final AgodaPage agodaPage = new AgodaPage();

    public void clickNumberOfPersons() {
        Logger.info("Click number of persons on the AgodaPage");
        agodaPage.getNumberOfPersons().click();
    }

    public void clickGroup() {
        Logger.info("Click group on the AgodaPage");
        agodaPage.getTravelGroup().click();
    }

    public void clickRoom() {
        Logger.info("Click room on the AgodaPage");
        agodaPage.getRoom().click();
    }

    public void clickInputChild() {
        Logger.info("Click Input child on the AgodaPage");
        agodaPage.getChildren().click();
        agodaPage.getChildAge().click();
        agodaPage.getChildAge16().click();
    }

    public void clickAdult() {
        Logger.info("Click adult on the AgodaPage");
        agodaPage.getAdult().doubleClick();
    }

    public void checkboxFamilyRoom(final boolean familyApartment) {
        Logger.info("Checkbox family room on the AgodaPage");
        if (familyApartment) {
            agodaPage.getFamilyApartment().check();
        }
    }

    public boolean numberOfPeopleIsVisible() {
        Logger.info("Number of people is visible on the AgodaPage");
        return agodaPage.getIsNumberOfPeople().isVisible();
    }
}

