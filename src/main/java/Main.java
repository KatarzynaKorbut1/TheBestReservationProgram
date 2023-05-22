import models.UserApp;
import services.AdminImplementation;
import services.InvalidEmailException;
import services.InvalidPasswordException;
import services.AssistantImplementation;

import java.io.IOException;
import java.io.Serializable;

public class Main implements Serializable {
    public static void main(String[] args) throws InvalidEmailException, IOException, ClassNotFoundException, InvalidPasswordException {



        AdminImplementation adminImplementation = new AdminImplementation();
        AssistantImplementation assistantImplementation = new AssistantImplementation();

        adminImplementation.newAsystentAccount();
            //adminImplementation.addFlightToDatabase();
        //List<Flight> allFlight = assistantImplementation.findAllFlight();
        //System.out.println(allFlight);

        UserApp userApp = new UserApp();
        userApp.loginUser();




    }
}
