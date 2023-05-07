package models;

public class Service {

    private String email;
    private String password;

    public Service(String email) {
        this.email = email;
//        this.password = password;


    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return String.format("Service email: %s", email);
    }
}
