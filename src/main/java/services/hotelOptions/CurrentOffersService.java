package services.hotelOptions;

import pages.hotelOptions.CurrentOffersPage;
import utils.Logger;

public class CurrentOffersService {

    private final CurrentOffersPage currentOffersPage = new CurrentOffersPage();

    public void clickCopyCoupon() {
        Logger.info("Click copy coupon on the CurrentOffersPage");
        currentOffersPage.getPromoCopy().click();
    }

    public void clickCoupon() {
        Logger.info("Click coupon on the CurrentOffersPage");
        currentOffersPage.getClickCoupon().click();
    }

    public void copyCouponShouldHave() {
        Logger.info("Copy coupon should have on the CurrentOffersPage");
        currentOffersPage.getPromoCopy().shouldHave("Скопировано");
    }
}
