package stepdefs.pages;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import services.hotelOptions.CurrentOffersService;

public class CurrentOffersPageStepDefs {

    private final CurrentOffersService currentOffersService = new CurrentOffersService();

    @When("click on the coupon")
    public void clickOnTheCoupon() {
        currentOffersService.clickCoupon();
    }

    @And("copy the coupon from the offer")
    public void copyTheCouponFromTheOffer() {
        currentOffersService.clickCopyCoupon();
    }

    @Then("check that the Copied label has appeared")
    public void checkThatTheCopiedLabelHasAppeared() {
        currentOffersService.copyCouponShouldHave();
    }
}
