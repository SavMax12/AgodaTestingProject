package stepdefs.pages;

import enums.Email;
import enums.RequestsRoom;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import services.hotelOptions.HotelReservationService;

import static org.testng.Assert.assertTrue;

public class HotelReservationPageStepDefs {

    private final HotelReservationService hotelReservationService = new HotelReservationService();

    @And("fill in the fields Contact details: " +
            "Full name={string}, {string}, {string}, Phone number = {}, Country or region of residence={string}," +
            " booking for someone else or not")
    public void fillInTheFieldsContactDetailsFullNamePhoneNumberCountryOrRegionOfResidenceBookingForSomeoneElseOrNot(
            String fullName, String email, String retypeEmail, Long phoneNumber, String countryOrRegion
    ) {
        hotelReservationService.fillAllRequiredFieldsContactDetails(
                fullName,
                Email.YANDEX.getEmail(),
                Email.YANDEX.getEmail(),
                phoneNumber,
                countryOrRegion,
                false
        );
    }

    @And("specify room preferences")
    public void specifyRoomPreferences() {
        hotelReservationService.radioRequestsOfRoom(RequestsRoom.LARGE_BED);
    }

    @And("specify arrival date")
    public void specifyArrivalDate() {
        hotelReservationService.inputArrivalTime("13:00 - 14:00");
    }

    @Then("check that the card filling page or the hotel selection page is displayed")
    public void checkThatAllFieldsAreFilledIn() {
        assertTrue(hotelReservationService.cardPageOrListOfHotelsPagesIsVisible());
    }

    @And("click on the Next page button")
    public void clickOnTheNextPageButton() {
        hotelReservationService.clickNextPage();
    }
}
