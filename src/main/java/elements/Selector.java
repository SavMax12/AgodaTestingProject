package elements;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

public class Selector extends BaseElement {

    public Selector(By by) {
        super(by);
    }

    public Selector(SelenideElement wrappedElement) {
        super(wrappedElement);
    }

    public void select(String option) {
        this.logAction("Select" + option);
        this.getWrappedElement().sendKeys(option);
    }
}
