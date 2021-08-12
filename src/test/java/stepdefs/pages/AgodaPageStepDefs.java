package stepdefs.pages;

import enums.City;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.navigation.NavBar;
import services.hotelOptions.NumberOfPersonsService;
import services.hotelOptions.SearchLineService;
import services.hotelOptions.TravelDataService;
import services.navigation.AgodaService;

import static org.testng.AssertJUnit.assertTrue;

public class AgodaPageStepDefs {

    private final AgodaService agodaService = new AgodaService();
    private final NumberOfPersonsService numberOfPersonsService = new NumberOfPersonsService();
    private final SearchLineService searchLineService = new SearchLineService();
    private final TravelDataService travelDataService = new TravelDataService();
    private final NavBar navBar = new NavBar();

    @Given("click on the calendar icon located on the left under the search bar")
    public void clickOnTheCalendarIcon() {
        travelDataService.clickData();
    }

    @When("select the departure date twenty-fifth of August and the arrival date tenth of September")
    public void selectTheDepartureDateAndTheArrivalDate() {
        travelDataService.clickDataPicker();
    }

    @And("enter the name of the locality in the search")
    public void enterTheNameOfTheLocalityInTheSearch() {
        searchLineService.selectorSearch(City.ISTANBUL);
    }

    @When("select the first option from the drop-down list")
    public void selectAnOptionFromTheDropDownList() {
        searchLineService.clickChooseFirst();
    }

    @When("account settings is open")
    public void accountSettingsIsOpen() {
        agodaService.clickProfile();
    }

    @When("page currency change is open")
    public void pageCurrencyChangeIsOpen() {
        agodaService.openCurrencyChange();
    }

    @Given("the current offers page is open")
    public void theCurrentOffersPageIsOpen() {
        agodaService.openCurrentOffers();
    }

    @When("page Language change is open")
    public void pageLanguageChangeIsOpen() {
        agodaService.openLanguageChange();
    }

    @Given("click on the icon with the people")
    public void clickOnTheIconWithThePeople() {
        numberOfPersonsService.clickNumberOfPersons();
    }

    @Given("page List your place is open")
    public void pageListYourPlaceIsOpen() {
        agodaService.openRentOutHousing();
    }

    @Given("page Sign in is open")
    public void pageSignInIsOpen() {
        agodaService.openSignInAccount();
    }

    @And("open My account list by clicking on the profile icon")
    public void openMyAccountByClickingOnTheProfileIcon() {
        agodaService.openMyAccountList();
    }

    @And("click Sign out button")
    public void clickSignOutButton() {
        agodaService.clickSignOut();
    }

    @Given("page Create account is open")
    public void pageCreateAccountIsOpen() {
        agodaService.openSignUpAccount();
    }

    @Then("check that the entered value in the string does not match the entered value")
    public void checkThatTheEnteredValueInTheStringCorrespondsToTheEnteredValue() {
        searchLineService.searchShouldNotHave();
    }

    @Given("enter the incomplete name of the locality in the search field: {string}")
    public void enterTheIncompleteNameOfTheLocalityInTheSearchField(String city) {
        searchLineService.selectorSearch(City.ISTANBUL);
    }

    @Then("check that the main page is displayed")
    public void checkThatTheMainPageIsDisplayed() {
        assertTrue(agodaService.buttonSignInAccountIsVisible());
    }

    @Then("check that the text in the Italian language has appeared on the main page")
    public void checkThatTheTextInTheItalianLanguageHasAppearedOnTheMainPage() {
        agodaService.italianLanguageShouldHave();
    }

    @Then("check that the Login button is displayed on the main page")
    public void makeSureThatTheProfileSettingsPageIsDisplayed() {
        assertTrue(agodaService.buttonSignInAccountIsVisible());
    }

    @Then("the current offers page is visible")
    public void theCurrentOffersPageIsVisible() {
        assertTrue(navBar.currentOffersIsVisible());
    }

    @When("select a group of Group travelers")
    public void selectAGroupOfGroupTravelers() {
        numberOfPersonsService.clickGroup();
    }

    @And("add the number of rooms by clicking one time on + opposite Room")
    public void addTheNumberOfRoomsByClickingOneTimeOnOppositeRoom() {
        numberOfPersonsService.clickRoom();
    }

    @And("add the number of adults two times on + opposite Adult")
    public void addTheNumberOfAdultsTwoTimesOnOppositeAdult() {
        numberOfPersonsService.clickAdult();
    }

    @And("add the number of child by clicking one time on + opposite Child and select the age of the child in the drop-down lis")
    public void addTheNumberOfChildByClickingOneTimeOnOppositeChildAndSelectTheAgeOfTheChildInTheDropDownLis() {
        numberOfPersonsService.clickInputChild();
    }

    @And("click on I need prefer a family room")
    public void clickOnINeedPreferAFamilyRoom() {
        numberOfPersonsService.checkboxFamilyRoom(true);
    }

    @Then("check that the field for selecting the number of people is displayed")
    public void checkThatTheFieldForSelectingTheNumberOfPeopleIsDisplayed() {
        assertTrue(numberOfPersonsService.numberOfPeopleIsVisible());
    }

    @And("click Profile button on My account list")
    public void clickProfileButtonOnMyAccountList() {
        agodaService.clickProfile();
    }

    @And("click on the Search button")
    public void clickOnTheSearchButton() {
        agodaService.clickSearch();
    }
}
