package enums;

public enum City {

    ISTANBUL("Стамб"),
    KYOTO("Киото"),
    DUBAI("Дубаи");

    private final String cityName;

    City(String cityName) {
        this.cityName = cityName;
    }

    public String getCityName() {
        return cityName;
    }
}
