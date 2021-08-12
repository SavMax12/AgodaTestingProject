package stepdefs.pages;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import services.hotelOptions.HotelReservationService;
import services.hotelOptions.MapService;
import services.hotelOptions.ViewHotelPhotosService;

import static org.testng.Assert.assertTrue;

public class HotelInformationPageStepDefs {

    private final HotelReservationService hotelReservationService = new HotelReservationService();
    private final MapService mapService = new MapService();
    private final ViewHotelPhotosService viewHotelPhotosService = new ViewHotelPhotosService();

    @When("click on the Reserve button")
    public void clickOnTheReserveButton() {
        hotelReservationService.clickReservationHotel();
    }

    @When("click on the map located near the photos")
    public void clickOnTheMap() {
        mapService.clickMap();
    }

    @And("open the entertainment list to the right of the map")
    public void openTheEntertainmentListToTheRightOfTheMap() {
        mapService.clickEntertainmentList();
    }


    @And("click on + four times and - six times")
    public void clockOnFourTimesAndFiveTimes() {
        mapService.doubleClickZoomMap();
    }

    @And("click on see all photos next to the hotel photos")
    public void clickOnSeeAllPhotosNextToTheHotelPhotos() {
        viewHotelPhotosService.clickAllPhotos();
    }

    @And("switch between the photo four times forward and then four times back")
    public void switchBetweenThePhotoFiveTimesForwardAndThenThreeTimesBack() {
        viewHotelPhotosService.doubleClickSwitchPhotos();
    }

    @And("close the window with photos")
    public void closeTheWindowWithPhotos() {
        viewHotelPhotosService.clickClosePhotos();
    }

    @Then("check that the photo is a image")
    public void checkThatThePhotosHaveAppeared() {
        viewHotelPhotosService.isImage();
    }

    @Then("check that the hotel information page is displayed")
    public void checkThatTheHotelInformationPageIsDisplayed() {
        assertTrue(mapService.hotelInformationPageIsVisible());
    }
}
