package pages.rentOutHousing;

import elements.Button;
import elements.Radio;
import org.openqa.selenium.By;

public class RentOutHousingPage {

    private final Button placeHousing = new Button(By.id("startHostingBtn"));
    private final Button privateHousing = new Button(By.xpath("//*[@data-element-name='property-wizard-property-type-select-button']"));
    private final Radio apartments = new Radio(By.xpath("//*[@id='root']/div/div/div/div/div/form/div[1]/div/div/div/div/div[1]/label/div/span"));
    private final Radio villa = new Radio(By.xpath("//*[@id='root']/div/div/div/div/div/form/div[1]/div/div/div/div/div[2]/label/div/span"));
    private final Radio botel = new Radio(By.xpath("//*[@id='root']/div/div/div/div/div/form/div[1]/div/div/div/div/div[3]/label/div/span"));
    private final Radio chalet = new Radio(By.xpath("//*[@id='root']/div/div/div/div/div/form/div[1]/div/div/div/div/div[4]/label/div/span"));
    private final Radio vacationHome = new Radio(By.xpath("//*[@id='root']/div/div/div/div/div/form/div[1]/div/div/div/div/div[5]/label/div/span"));
    private final Radio familyHotel = new Radio(By.xpath("//*[@id='root']/div/div/div/div/div/form/div[1]/div/div/div/div/div[6]/label/div/span"));
    private final Button numberOfObjects = new Button(By.id("plus-button-noOfProperties"));
    private final Radio oneAddress = new Radio(By.xpath("//*[@value='SAME']"));
    private final Radio differentAddresses = new Radio(By.xpath("//*[@value='DIFFERENT']"));
    private final Button submit = new Button(By.xpath("//*[@type='submit']"));
    private final Button createAccount = new Button(By.xpath("//*[@class='modal-content']"));


    public Button getCreateAccount() {
        return createAccount;
    }

    public Button getPlaceHousing() {
        return placeHousing;
    }

    public Button getPrivateHousing() {
        return privateHousing;
    }

    public Radio getApartments() {
        return apartments;
    }

    public Radio getVilla() {
        return villa;
    }

    public Radio getBotel() {
        return botel;
    }

    public Radio getChalet() {
        return chalet;
    }

    public Radio getVacationHome() {
        return vacationHome;
    }

    public Radio getFamilyHotel() {
        return familyHotel;
    }

    public Button getNumberOfObjects() {
        return numberOfObjects;
    }

    public Radio getOneAddress() {
        return oneAddress;
    }

    public Radio getDifferentAddresses() {
        return differentAddresses;
    }

    public Button getSubmit() {
        return submit;
    }
}
