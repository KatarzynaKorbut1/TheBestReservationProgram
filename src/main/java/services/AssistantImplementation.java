package services;

import models.Flight;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static java.lang.System.out;

public class AssistantImplementation {

    private boolean done = false;
    Scanner scanner = new Scanner(System.in);

    public List<Flight> flightList = new ArrayList<>();


    public void runAssistantProgram() throws InvalidPasswordException, IOException, InvalidEmailException {
        while (!done) {

            out.println("Enter command:\n 1 - ");
            int cmd = scanner.nextInt();
            processCommand(cmd);
        }
    }

    private void processCommand(int cmd) throws InvalidPasswordException, IOException, InvalidEmailException {
//        if      (cmd == 1)
//        else if (cmd == 2)
//        else if (cmd == 3)
//        else
        out.println("Illegal command");

    }

    private void quit() {
        done = true;
        out.println("Goodbye!");
    }


    public List<Flight> findAllFlight() throws IOException {
        List<Flight> flightsList = new ArrayList<>();

        List<String> lines = Files.readAllLines(Paths.get("C:\\Users\\HP\\Documents\\PierwszeKrokiZJava\\TheBestReservationProgram\\flights.txt"));
        for (String line : lines) {
            Flight flight = new Flight();
            String[] variables = line.split(" ");
            flight.setAirportOfArrival(variables[0]);
            flight.setAirportOfDeparture(variables[1]);
            flight.setTimeOfArrival(variables[2]);
            flight.setTimeOfDeparture(variables[3]);
            flight.setNumberOfFlight(variables[4]);
            flightsList.add(flight);

        }

        return flightsList;
    }


}
