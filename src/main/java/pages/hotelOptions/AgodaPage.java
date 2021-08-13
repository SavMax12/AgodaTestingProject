package pages.hotelOptions;

import elements.Button;
import elements.Checkbox;
import elements.Selector;
import org.openqa.selenium.By;
import pages.navigation.NavBar;

public class AgodaPage {

    private final NavBar navBar = new NavBar();

    private final Button numberOfPersons = new Button(By.xpath("//*[@data-selenium='adultValue']"));
    private final Button travelGroup = new Button(By.xpath("//*[@data-selenium='traveler-group']"));
    private final Button room = new Button(By.xpath("//span[@data-selenium='plus']"));
    private final Button adult = new Button(By.xpath("//*[@id='SearchBoxContainer']/div[1]/div/div[2]/div/div/div[5]/div/div/div/div[2]/div/div[2]/span[4]"));
    private final Button children = new Button(By.xpath("//*[@id='SearchBoxContainer']/div[1]/div/div[2]/div/div/div[5]/div/div/div/div[2]/div/div[3]/span[4]"));
    private final Button childAge = new Button(By.xpath("//select[@class='DropdownInput__box']"));
    private final Button childAge16 = new Button(By.xpath("//option[@value='16']"));
    private final Checkbox familyApartment = new Checkbox(By.xpath("//*[@class='CheckboxContainer-Checkbox Medium']"));
    private final Selector location = new Selector(By.xpath("//*[@data-selenium='textInput']"));
    private final Button chooseTheFirst = new Button(By.xpath("//*[@class='Suggestion Suggestion__categoryName']"));
    private final Button dataIn = new Button(By.xpath("//*[@data-selenium='checkInText']"));
    private final Button clickDataDeparture = new Button(By.xpath("//*[@aria-label='Wed Aug 25 2021']"));
    private final Button clickDataArrival = new Button(By.xpath("//*[@aria-label='Fri Sep 10 2021']"));
    private final Button isText = new Button(By.xpath("//*[@data-element-name='cardNumber-span']"));
    private final Button mainPage = new Button(By.xpath("//*[@class='HomeReactContainer']"));
    private final Button isNumberOfPeople = new Button(By.xpath("//*[@class='Popup SegmentsOccupancy SegmentsOccupancy--small']"));

    public Button getIsNumberOfPeople() {
        return isNumberOfPeople;
    }

    public Button getMainPage() {
        return mainPage;
    }

    public Button getIsText() {
        return isText;
    }

    public NavBar getNavBar() {
        return navBar;
    }

    public Button getDataIn() {
        return dataIn;
    }

    public Button getClickDataDeparture() {
        return clickDataDeparture;
    }

    public Button getClickDataArrival() {
        return clickDataArrival;
    }

    public Selector getLocation() {
        return location;
    }

    public Button getChooseTheFirst() {
        return chooseTheFirst;
    }

    public Button getChildAge16() {
        return childAge16;
    }

    public Button getNumberOfPersons() {
        return numberOfPersons;
    }

    public Button getTravelGroup() {
        return travelGroup;
    }

    public Button getRoom() {
        return room;
    }

    public Button getAdult() {
        return adult;
    }

    public Button getChildren() {
        return children;
    }

    public Button getChildAge() {
        return childAge;
    }

    public Checkbox getFamilyApartment() {
        return familyApartment;
    }
}
