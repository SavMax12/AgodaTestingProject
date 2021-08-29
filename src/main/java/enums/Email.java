package enums;

public enum Email {

    YANDEX("wedrwerwe@yandex.by"),
    GMAIL("samaxim352@gmail.com");

    private final String email;

    Email(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }
}
