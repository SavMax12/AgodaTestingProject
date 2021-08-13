package pages.websiteSettings;

import elements.Button;
import org.openqa.selenium.By;

public class LanguageChangePage {

    private final Button italiano = new Button(By.xpath("//*[@data-value='it-it']"));

    public Button getItaliano() {
        return italiano;
    }
}
