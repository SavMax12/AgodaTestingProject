package pages.hotelOptions;

import elements.*;
import org.openqa.selenium.By;

public class HotelReservationPage {

    private final Input firstNameLastName = new Input(By.id("firstName_lastName"));
    private final Input email = new Input(By.id("email"));
    private final Input retypeEmail = new Input(By.id("retypeEmail"));
    private final Input phoneNumber = new Input(By.id("phoneNumber"));
    private final Selector country = new Selector(By.id("countryId"));
    private final Checkbox bookingForAnotherPerson = new Checkbox(By.xpath("//*[@class='sc-AxgMl eLXIsL sc-fzoNJl hZYxRe']"));
    private final Radio nonSmokingRoom = new Radio(By.xpath("//input[@data-element-name='mob-bf-non-smoking-preference']/following-sibling::span"));
    private final Radio smokingRoom = new Radio(By.xpath("//input[@data-element-name='mob-bf-smoking-preference']/following-sibling::span"));
    private final Radio largeBed = new Radio(By.xpath("//input[@data-element-name='mob-bf-king-bed-type-preference']/following-sibling::span"));
    private final Radio twoSingleBeds = new Radio(By.xpath("//input[@data-element-name='mob-bf-twin-bed-type-preference']/following-sibling::span"));
    private final Selector arrivalTime = new Selector(By.id("arrivalTime"));
    private final Button nextPage = new Button(By.xpath("//*[@type='submit']"));
    private final Button isCardPage = new Button(By.xpath("//*[@class='sc-AxjAm dGLvOm']"));

    public Button getIsCardPage() {
        return isCardPage;
    }

    public Button getNextPage() {
        return nextPage;
    }

    public Selector getArrivalTime() {
        return arrivalTime;
    }

    public Input getFirstNameLastName() {
        return firstNameLastName;
    }

    public Input getEmail() {
        return email;
    }

    public Input getRetypeEmail() {
        return retypeEmail;
    }

    public Input getPhoneNumber() {
        return phoneNumber;
    }

    public Selector getCountry() {
        return country;
    }

    public Checkbox getBookingForAnotherPerson() {
        return bookingForAnotherPerson;
    }

    public Radio getNonSmokingRoom() {
        return nonSmokingRoom;
    }

    public Radio getSmokingRoom() {
        return smokingRoom;
    }

    public Radio getLargeBed() {
        return largeBed;
    }

    public Radio getTwoSingleBeds() {
        return twoSingleBeds;
    }
}
