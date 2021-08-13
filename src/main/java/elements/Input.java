package elements;

import org.openqa.selenium.By;

public class Input extends BaseElement {

    public Input(By by) {
        super(by);
    }

    public void clearAndType(String text) {
        this.logAction("Clear and type" + text);
        this.getWrappedElement().clear();
        this.getWrappedElement().sendKeys(text);
    }
}
