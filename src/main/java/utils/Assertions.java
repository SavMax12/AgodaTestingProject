package utils;

import elements.BaseElement;
import org.assertj.core.api.SoftAssertions;

public class Assertions {

    public static final String IS_VISIBLE = "Check that element %s is visible";

    public static void isVisible(SoftAssertions softAssertions, BaseElement element, String name){
        Logger.info(String.format(IS_VISIBLE, name));

        softAssertions.assertThat(element.isVisible()).as(String.format(IS_VISIBLE, name)).isTrue();
    }
}
