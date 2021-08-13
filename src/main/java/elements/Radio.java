package elements;

import org.openqa.selenium.By;

public class Radio extends BaseElement {

    public Radio(By by) {
        super(by);
    }

    public void check() {
        this.logAction("Check");
        this.getWrappedElement().click();
    }
}
