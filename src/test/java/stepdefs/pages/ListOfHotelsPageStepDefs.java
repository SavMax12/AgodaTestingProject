package stepdefs.pages;

import enums.LocationEstimates;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.navigation.NavBar;
import services.hotelOptions.FiltrationLeftHandMenuService;
import services.hotelOptions.FiltrationTopHandMenuService;

import static org.testng.Assert.assertTrue;

public class ListOfHotelsPageStepDefs {

    private final FiltrationLeftHandMenuService filtrationLeftHandMenuService = new FiltrationLeftHandMenuService();
    private final FiltrationTopHandMenuService filtrationTopHandMenuService = new FiltrationTopHandMenuService();
    private final NavBar navBar = new NavBar();

    @And("filter distance to center")
    public void filterDistanceToCenter() {
        filtrationLeftHandMenuService.checkboxDistanceToCenter(true, false, true);
    }

    @And("filter location rating")
    public void filterLocationRating() {
        filtrationLeftHandMenuService.checkboxLocationRating(LocationEstimates.EIGHT);
    }

    @And("open more filters and select filter")
    public void openMoreFiltersAndSelectFilter() {
        filtrationLeftHandMenuService.clickCheckboxNeighborhood(true);
    }


    @And("set the price by dragging the sliders")
    public void setThePriceByDraggingTheSliders() {
        filtrationTopHandMenuService.priceDragAndDrop();
    }

    @And("click on the Stars button")
    public void clickOnTheStarsButton() {
        filtrationTopHandMenuService.clickStars();
    }

    @And("set the number of stars")
    public void setTheNumberOfStars() {
        filtrationTopHandMenuService.checkboxNumberOfStars(true, true, true);
    }

    @And("click on the More button")
    public void clickOnTheMoreButton() {
        filtrationTopHandMenuService.clickMore();
    }

    @And("click on clear all filters button")
    public void clearAllFilters() {
        filtrationTopHandMenuService.clickCleanFilters();
    }

    @And("click on the Done button")
    public void clickOnTheDoneButton() {
        filtrationTopHandMenuService.clickDone();
    }

    @And("click on the first Select room button")
    public void clickOnTheSelectRoom() {
        navBar.chooseRoom();
    }

    @Then("check that the filter In the center is displayed")
    public void checkThatAllFiltersAreVisible() {
        assertTrue(filtrationLeftHandMenuService.distanceToCenterIsVisible());
    }

    @Then("check that the Three stars filter is displayed")
    public void checkThatTheThreeStarsFilterIsDisplayed() {
        assertTrue(filtrationTopHandMenuService.threeStarsIsVisible());
    }

    @Then("check that the page ListOfHotels is displayed")
    public void checkThatThePageListOfHotelsIsDisplayed() {
        assertTrue(filtrationTopHandMenuService.listOfHotelsPageIsVisible());
    }

    @Then("check that the price value is not exactly null")
    public void checkThatThePriceValueIsNotExactlyNull() {
        filtrationTopHandMenuService.priceShouldNotHave();
    }

    @When("click on the Your budget button")
    public void clickOnTheYourBudgetButton() {
        filtrationTopHandMenuService.clickPrice();
    }
}
