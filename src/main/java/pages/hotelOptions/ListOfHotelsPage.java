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
    private final Checkbox neighborhood = new Checkbox(By.xpath("//span[@data-component='search-filter-hotelareaid']//span[@class='checkbox-icon']"));
    private final Button price = new Button(By.xpath("//span[text()='Цена' or text()='Your budget']"));
    private final Button numberOfStars = new Button(By.xpath("//span[text()='Количество звезд' or text()='Stars']"));
    private final Checkbox fiveStars = new Checkbox(By.xpath("//span[@class='filter-item-info StarRating-5 ']//span[@class='checkbox-icon']"));
    private final Checkbox threeStars = new Checkbox(By.xpath("//span[@class='filter-item-info StarRating-3 ']//span[@class='checkbox-icon']"));
    private final Checkbox noStars = new Checkbox(By.xpath("//span[@class='filter-item-info StarRating-0 ']//span[@class='checkbox-icon']"));
    private final Button more = new Button(By.xpath("//span[text()='Еще' or text()='More' or text()='Типы размещения']"));
    private final Button clearFilters = new Button(By.xpath("//*[@class='btn MoreFilter__Button MoreFilter__Button--noStyle']"));
    private final Button done = new Button(By.xpath("//*[@class='btn MoreFilter__Button MoreFilter__Button--blue']"));
    private final Button isListOfHotelsPage = new Button(By.id("reactSearchPage"));
    private final Button inputPrice = new Button(By.xpath("//input[@value>0]"));

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
