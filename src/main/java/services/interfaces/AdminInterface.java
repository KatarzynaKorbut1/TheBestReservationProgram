package services.interfaces;

import models.Customer;
import models.Flight;
import models.Service;
import services.InvalidEmailException;

import java.io.FileNotFoundException;
import java.io.IOException;

public interface AdminInterface {



    public void newServiceAccount() throws InvalidEmailException;

    void addFlightToDatabase (Flight flight);




}
