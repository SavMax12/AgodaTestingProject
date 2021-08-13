package enums;

public enum Email {

    YANDEX("ya.max11122@yandex.by"),
    GMAIL("samaxim352@gmail.com");

    private final String email;

    Email(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }
}
