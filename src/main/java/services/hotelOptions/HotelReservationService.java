package services.hotelOptions;

import enums.RequestsRoom;
import pages.hotelOptions.HotelInformationPage;
import pages.hotelOptions.HotelReservationPage;
import pages.hotelOptions.ListOfHotelsPage;
import utils.Logger;

import static com.codeborne.selenide.Selenide.switchTo;

public class HotelReservationService {

    private final HotelReservationPage hotelReservationPage = new HotelReservationPage();
    private final HotelInformationPage hotelInformationPage = new HotelInformationPage();
    private final ListOfHotelsPage listOfHotelsPage = new ListOfHotelsPage();

    public void clickReservationHotel() {
        Logger.info("Click reservation hotel on the HotelInformationPage");
        hotelInformationPage.getNavBar().reservationHotel();
    }

    public void fillAllRequiredFieldsContactDetails(
            final String firstNameLastName,
            final String email,
            final String retypeEmail,
            final long phoneNumber,
            final String country,
            final boolean bookingForAnotherPerson
    ) {
        Logger.info("Fill all required fields contact details on the HotelReservationPage");
        hotelReservationPage.getFirstNameLastName().clearAndType(firstNameLastName);
        hotelReservationPage.getEmail().clearAndType(email);
        hotelReservationPage.getRetypeEmail().clearAndType(retypeEmail);
        hotelReservationPage.getPhoneNumber().clearAndType(String.valueOf(phoneNumber));
        hotelReservationPage.getCountry().select(country);
        if (bookingForAnotherPerson) {
            hotelReservationPage.getBookingForAnotherPerson().check();
        }
    }

    public void clickNextPage() {
        Logger.info("Click next page on the HotelReservationPage");
        hotelReservationPage.getNextPage().click();
        switchTo().window(0);
    }

    public boolean cardPageOrListOfHotelsPagesIsVisible() {
        Logger.info("Card page or list of hotels pages is visible on the HotelReservationPage and ListOfHotelsPage");
        if (hotelReservationPage.getIsCardPage().isVisible()) {
            return hotelReservationPage.getIsCardPage().isVisible();
        } else {
            return listOfHotelsPage.getPageIsVisible().isVisible();
        }
    }

    public void radioRequestsOfRoom(final RequestsRoom requestsRoom) {
        Logger.info("Radio requests of room on the HotelReservationPage");
        switch (requestsRoom) {
            case NON_SMOKING_ROOM: {
                hotelReservationPage.getNonSmokingRoom().check();
                break;
            }
            case SMOKING_ROOM: {
                hotelReservationPage.getSmokingRoom().check();
                break;

            }
            case LARGE_BED: {
                hotelReservationPage.getLargeBed().check();
                break;
            }

            case TWO_SINGLE_BEDS: {
                hotelReservationPage.getTwoSingleBeds().check();
                break;
            }
        }
    }

    public void inputArrivalTime(final String arrivalTime) {
        Logger.info("Input arrival time on the HotelReservationPage");
        hotelReservationPage.getArrivalTime().select(arrivalTime);
    }
}
