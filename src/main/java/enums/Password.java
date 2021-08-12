package enums;

public enum Password {

    PASSWORD("423423423");

    private final String password;

    Password(String password) {
        this.password = password;
    }

    public String getPassword() {
        return password;
    }
}
