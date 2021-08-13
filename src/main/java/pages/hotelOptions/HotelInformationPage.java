package pages.hotelOptions;

import elements.Button;
import org.openqa.selenium.By;
import pages.navigation.NavBar;

public class HotelInformationPage {

    private final NavBar navBar = new NavBar();

    private final Button allPhotos = new Button(By.xpath("//*[@class='SeeMorePhotosOverlay__Text']"));
    private final Button nextPhoto = new Button(By.xpath("//*[@class='ficon ficon-32 ficon-nav-right-bold']"));
    private final Button previousPhoto = new Button(By.xpath("//*[@class='ficon ficon-32 ficon-nav-left-bold']"));
    private final Button closePhotos = new Button(By.xpath("//*[@class='close-area-icon ficon ficon-24 ficon-x-icon']"));
    private final Button map = new Button(By.xpath("//*[@class='MapCompact__Overlay']"));
    private final Button entertainmentList = new Button(By.xpath("//*[@class='HotelMap-poiItem-header']"));
    private final Button firstEntertainment = new Button(By.xpath("//*[@class='HotelMap-poiItem']"));
    private final Button zoomIn = new Button(By.xpath("//*[@class='leaflet-control-zoom-in']"));
    private final Button zoomOut = new Button(By.xpath("//*[@class='leaflet-control-zoom-out']"));
    private final Button back = new Button(By.xpath("//*[@class='HotelMap-poiDetail-header-button']"));
    private final Button image = new Button(By.xpath("//*[@class='image']"));
    private final Button closeMap = new Button(By.xpath("//*[@class='HotelMap-modal-closeIcon ficon ficon-24 ficon-x-icon']"));
    private final Button isPage = new Button(By.xpath("//*[@class='property-app not-single-room']"));

    public Button getIsPage() {
        return isPage;
    }

    public Button getCloseMap() {
        return closeMap;
    }

    public Button getImage() {
        return image;
    }

    public Button getBack() {
        return back;
    }

    public NavBar getNavBar() {
        return navBar;
    }

    public Button getMap() {
        return map;
    }

    public Button getEntertainmentList() {
        return entertainmentList;
    }

    public Button getFirstEntertainment() {
        return firstEntertainment;
    }

    public Button getZoomIn() {
        return zoomIn;
    }

    public Button getZoomOut() {
        return zoomOut;
    }

    public Button getAllPhotos() {
        return allPhotos;
    }

    public Button getNextPhoto() {
        return nextPhoto;
    }

    public Button getPreviousPhoto() {
        return previousPhoto;
    }

    public Button getClosePhotos() {
        return closePhotos;
    }
}
