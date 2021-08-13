package services.accountSettings;

import enums.Newsletter;
import pages.accountSettings.MyProfilePage;
import utils.Logger;

public class EmailSubscriptionsService {

    private final MyProfilePage myProfilePage = new MyProfilePage();

    public void radioNewsletter(final Newsletter newsletter) {
        Logger.info("Radio newsletter on the MyProfilePage");
        switch (newsletter) {
            case EVERY_DAY: {
                myProfilePage.getEveryDay().check();
                break;
            }
            case TWO_TIMES_A_WEEK: {
                myProfilePage.getTwoTimesAWeek().check();
                break;

            }
            case EVERY_WEEK: {
                myProfilePage.getEveryWeek().check();
                break;
            }

            case NEVER: {
                myProfilePage.getNever().check();
                break;
            }
        }
    }

    public void checkboxIWouldLikeInformationAboutOffers(final boolean informationAboutOffers) {
        Logger.info("Checkbox i would like information about offers on the MyProfilePage");
        if (informationAboutOffers) {
            myProfilePage.getInformationAboutOffers().check();
        }
    }

    public void checkboxIWouldLikeMessagesAboutPromotions(final boolean messagesAboutPromotions) {
        Logger.info("Checkbox i would like messages about promotions on the MyProfilePage");
        if (messagesAboutPromotions) {
            myProfilePage.getMessagesAboutPromotions().check();
        }
    }

    public void checkboxIWouldLikeBookingReminders(final boolean bookingReminders) {
        Logger.info("Checkbox i would like booking reminders on the MyProfilePage");
        if (bookingReminders) {
            myProfilePage.getBookingReminders().check();
        }
    }

    public void newsletterIsVisible() {
        Logger.info("Newsletter is visible on the MyProfilePage");
        myProfilePage.getTwoTimesAWeek().isVisible();
    }

    public void iWouldLikeTextShouldHave() {
        Logger.info("I would like text should have on the MyProfilePage");
        myProfilePage.getIsTextSavedIWorldLike().shouldHave("Сохранено");
    }
}
