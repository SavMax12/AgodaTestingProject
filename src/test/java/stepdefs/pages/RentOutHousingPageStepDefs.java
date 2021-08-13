package stepdefs.pages;

import enums.LocationAddresses;
import enums.PropertyCategory;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import services.rentOutHousing.RentOutHousingService;

import static org.testng.Assert.assertTrue;

public class RentOutHousingPageStepDefs {

    private final RentOutHousingService rentOutHousingService = new RentOutHousingService();

    @When("click list your place now button")
    public void clickLisYourPlaceNowButton() {
        rentOutHousingService.clickPlaceHousing();
    }

    @And("click property type Homes")
    public void clickPropertyTypeHomes() {
        rentOutHousingService.clickPropertyType();
    }

    @And("choose properties category Vacation home")
    public void choosePropertiesCategory() {
        rentOutHousingService.selectorPropertiesCategory(PropertyCategory.VACATION_HOME);
    }

    @And("click Next button")
    public void clickNextButton() {
        rentOutHousingService.clickNext();
    }

    @And("increase Number of properties or units to five and choose Different addresses")
    public void increaseNumberOfPropertiesOrUnitsToFiveAndChooseDifferentAddresses() {
        rentOutHousingService.doubleClickSelectorNumberOfProperties(LocationAddresses.DIFFERENT_ADDRESS);
    }

    @And("click Confirm button")
    public void clickConfirmButton() {
        rentOutHousingService.clickNext();
    }

    @Then("check that the account creation page or main page is displayed")
    public void checkThatTheAccountCreationPageIsDisplayed() {
        assertTrue(rentOutHousingService.createAccountOrMainPageIsVisible());
    }
}
