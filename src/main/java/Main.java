import models.Flight;
import models.UserApp;
import services.AdminImplementation;
import services.InvalidEmailException;
import services.InvalidPasswordException;
import services.ServiceImplementation;

import java.io.IOException;
import java.io.Serializable;
import java.util.List;

public class Main implements Serializable {
    public static void main(String[] args) throws InvalidEmailException, IOException, ClassNotFoundException, InvalidPasswordException {



        AdminImplementation adminImplementation = new AdminImplementation();
        ServiceImplementation serviceImplementation = new ServiceImplementation();

            //adminImplementation.addFlightToDatabase();
        List<Flight> allFlight = serviceImplementation.findAllFlight();
        System.out.println(allFlight);

//        UserApp userApp = new UserApp();
//        userApp.loginUser();




    }
}
