import services.AdminImplementation;
import services.InvalidEmailException;
import services.InvalidPasswordException;

import java.io.IOException;
import java.io.Serializable;

public class Main implements Serializable {
    public static void main(String[] args) throws InvalidEmailException, IOException, ClassNotFoundException, InvalidPasswordException {


        AdminImplementation adminImplementation = new AdminImplementation();

        adminImplementation.newServiceAccount();




    }
}
