package models;

public class User {

    private String email;
    private String password;
    private String typeOfUsers;


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

    public String getTypeOfUsers() {
        return typeOfUsers;
    }

    public void setTypeOfUsers(String typeOfUsers) {
        this.typeOfUsers = typeOfUsers;
    }

    @Override
    public String toString() {
        return String.format("email %s password %s typeOfUsers %s \n", email, password, typeOfUsers);
//                "User{" +
//                "email='" + email + '\'' +
//                ", password='" + password + '\'' +
//                ", typeOfUsers=" + typeOfUsers +
//                '}';
    }

    //    public void setTypeOfUsers(String variable) {
//
//    }
}
