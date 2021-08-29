package enums;

public enum City {

    ISTANBUL("Istan"),
    KYOTO("Kyot"),
    DUBAI("Duba");

    private final String cityName;

    City(String cityName) {
        this.cityName = cityName;
    }

    public String getCityName() {
        return cityName;
    }
}
