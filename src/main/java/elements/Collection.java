package elements;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.WebDriverRunner;
import org.openqa.selenium.By;
import utils.Logger;

import java.lang.reflect.InvocationTargetException;

public class Collection<T> extends ElementsCollection {

    private final Class<T> modelClass;

    public Collection(Class<T> modelClass, By selector) {
        super(WebDriverRunner.driver(), selector);
        this.modelClass = modelClass;
    }

    public <E extends T> E getModel(int index) {
        try {
            Logger.trace("Get model " + index);
            return (E) modelClass
                    .getDeclaredConstructor(SelenideElement.class)
                    .newInstance(super.get(index));
        } catch (InstantiationException | IllegalAccessException | InvocationTargetException | NoSuchMethodException e) {
            throw new RuntimeException();
        }
    }
}
