package pages.hotelOptions;

import elements.Button;
import elements.Checkbox;
import elements.Radio;
import org.openqa.selenium.By;
import pages.navigation.NavBar;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.actions;

public class ListOfHotelsPage {

    private final NavBar navBar = new NavBar();

    private final Checkbox inCenter = new Checkbox(By.xpath("//*[@class='filter-item-info CityCenterDistance-0 ']"));
    private final Checkbox twoFiveKM = new Checkbox(By.xpath("//*[@class='filter-item-info CityCenterDistance-2 ']"));
    private final Checkbox moreTenKM = new Checkbox(By.xpath("//*[@class='filter-item-info CityCenterDistance-4 ']"));
    private final Radio nine = new Radio(By.xpath("//*[@class='filter-item-info LocationScore-9 ']"));
    private final Radio eight = new Radio(By.xpath("//*[@class='filter-item-info LocationScore-8 ']"));
    private final Radio seven = new Radio(By.xpath("//*[@class='filter-item-info LocationScore-7 ']"));
    private final Button showMore = new Button(By.xpath("//*[@class='filter-btn more-less-btn']"));
    private final Checkbox neighborhood = new Checkbox(By.xpath("//*[@id='searchPageLeftColumn']/div[2]/div[2]/div[2]/ul/li[7]/span/span[2]/span[1]/span[1]"));
    private final Button price = new Button(By.xpath("//*[@data-component='pill-dropdown-title']"));
    private final Button numberOfStars = new Button(By.xpath("//*[@id='FilterBar']/div[1]/div[2]/button"));
    private final Checkbox fiveStars = new Checkbox(By.xpath("//*[@id='FilterBar']/div[1]/div[2]/div/div/div[2]/ul/li[1]/span/span[1]/span"));
    private final Checkbox threeStars = new Checkbox(By.xpath("//*[@id='FilterBar']/div[1]/div[2]/div/div/div[2]/ul/li[3]/span/span[1]/span"));
    private final Checkbox noStars = new Checkbox(By.xpath("//*[@id='FilterBar']/div[1]/div[2]/div/div/div[2]/ul/li[6]/span/span[1]/span"));
    private final Button more = new Button(By.xpath("//*[@id='FilterBar']/div[1]/div[4]/button"));
    private final Button clearFilters = new Button(By.xpath("//*[@class='btn MoreFilter__Button MoreFilter__Button--noStyle']"));
    private final Button done = new Button(By.xpath("//*[@class='btn MoreFilter__Button MoreFilter__Button--blue']"));
    private final Button isListOfHotelsPage = new Button(By.id("reactSearchPage"));
    private final Button inputPrice = new Button(By.id("price_box_0"));

    public Button getIsListOfHotelsPage() {
        return isListOfHotelsPage;
    }

    public Button getInputPrice() {
        return inputPrice;
    }

    public void priceSet() {
        actions().dragAndDropBy($(By.xpath("//*[@class='rc-slider-handle rc-slider-handle-1']")), 100, 0).build().perform();
        actions().dragAndDropBy($(By.xpath("//*[@class='rc-slider-handle rc-slider-handle-2']")), -50, 0).build().perform();
    }

    public Button getDone() {
        return done;
    }

    public Button getMore() {
        return more;
    }

    public Button getClearFilters() {
        return clearFilters;
    }

    public Button getPrice() {
        return price;
    }

    public Button getNumberOfStars() {
        return numberOfStars;
    }

    public Checkbox getFiveStars() {
        return fiveStars;
    }

    public Checkbox getThreeStars() {
        return threeStars;
    }

    public Checkbox getNoStars() {
        return noStars;
    }

    public NavBar getNavBar() {
        return navBar;
    }

    public Checkbox getInCenter() {
        return inCenter;
    }

    public Checkbox getTwoFiveKM() {
        return twoFiveKM;
    }

    public Checkbox getMoreTenKM() {
        return moreTenKM;
    }

    public Radio getNine() {
        return nine;
    }

    public Radio getEight() {
        return eight;
    }

    public Radio getSeven() {
        return seven;
    }

    public Button getShowMore() {
        return showMore;
    }

    public Checkbox getNeighborhood() {
        return neighborhood;
    }
}
