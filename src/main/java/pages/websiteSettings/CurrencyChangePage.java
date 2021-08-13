package pages.websiteSettings;

import elements.Button;
import org.openqa.selenium.By;

public class CurrencyChangePage {

    private final Button rub = new Button(By.xpath("//*[@data-value='RUB']"));

    public Button getRub() {
        return rub;
    }
}
