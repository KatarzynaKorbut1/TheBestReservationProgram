import services.AdminImplementation;
import services.InvalidEmailException;
import services.interfaces.CustomerImplementation;

import java.io.IOException;
import java.io.Serializable;

public class Main implements Serializable {
    public static void main(String[] args) throws InvalidEmailException, IOException, ClassNotFoundException {
        AdminImplementation adminImplementation = new AdminImplementation();
        adminImplementation.newServiceAccount();

        CustomerImplementation customerImplementation = new CustomerImplementation();
        customerImplementation.newCustomerAccount();
    }
}
