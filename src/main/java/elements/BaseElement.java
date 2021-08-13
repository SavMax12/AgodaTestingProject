package elements;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import utils.Logger;

import static com.codeborne.selenide.Selenide.$;

public class BaseElement {

    private final SelenideElement wrappedElement;

    public BaseElement(By by) {
        this.wrappedElement = $(by);
    }

    public BaseElement(SelenideElement wrappedElement) {
        this.wrappedElement = wrappedElement;
    }

    protected SelenideElement getWrappedElement() {
        return wrappedElement;
    }

    public boolean isVisible() {
        this.logAction("Is visible");
        return getWrappedElement().isDisplayed();
    }

    protected void logAction(String action) {
        Logger.trace(String.format("[%s] %s - %s",
                this.getClass().getSimpleName(),
                action,
                this.getWrappedElement().getSearchCriteria())
        );
    }

    public void shouldHave(String text) {
        this.logAction("Should have" + text);
        this.getWrappedElement().shouldHave(Condition.text(text));
    }

    public void shouldNotHave(String text) {
        this.logAction("Should not have" + text);
        this.getWrappedElement().shouldNotHave(Condition.text(text));
    }

    public void waitUntil() {
        this.logAction("Wait until");
        this.getWrappedElement().waitUntil(Condition.visible, 2500);
    }

    public void isImage() {
        this.logAction("Is image");
        this.getWrappedElement().isImage();
    }

    public void scroll() {
        this.logAction("Scroll to");
        this.getWrappedElement().scrollTo();
    }
}
