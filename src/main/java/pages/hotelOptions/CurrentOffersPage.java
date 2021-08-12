package pages.hotelOptions;

import elements.Button;
import org.openqa.selenium.By;

public class CurrentOffersPage {

    private final Button clickCoupon = new Button(By.xpath("//*[@data-selenium='coupon-activate-button']"));
    private final Button promoCopy = new Button(By.xpath("//*[@class='promo-copy']"));

    public Button getClickCoupon() {
        return clickCoupon;
    }

    public Button getPromoCopy() {
        return promoCopy;
    }
}
