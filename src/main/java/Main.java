import services.AdminImplementation;
import services.InvalidEmailException;


import java.io.IOException;
import java.io.Serializable;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main implements Serializable {
    public static void main(String[] args) throws InvalidEmailException, IOException, ClassNotFoundException {


        AdminImplementation adminImplementation = new AdminImplementation();

        adminImplementation.newServiceAccount();




    }
}
