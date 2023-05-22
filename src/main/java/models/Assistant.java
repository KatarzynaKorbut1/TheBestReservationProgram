package models;

public class Assistant {

    private String email;
    private String password;
    TypeOfUsers typeOfUsers = TypeOfUsers.ASSISTANT;

    public Assistant() {
    }
    public Assistant(String password, TypeOfUsers typeOfUsers) {

        this.password = password;
        this.typeOfUsers = typeOfUsers;
    }

    public Assistant(String email, String password, TypeOfUsers typeOfUsers) {
        this.email = email;
        this.password = password;
        this.typeOfUsers = typeOfUsers;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public TypeOfUsers getTypeOfUsers() {
        return typeOfUsers;
    }

    public void setTypeOfUsers(TypeOfUsers typeOfUsers) {
        this.typeOfUsers = typeOfUsers;
    }

    @Override
    public String toString() {
        return String.format("%s",password, getTypeOfUsers());
    }
}
