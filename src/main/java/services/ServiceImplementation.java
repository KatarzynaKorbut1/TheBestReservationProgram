package services;

import java.io.IOException;
import java.util.Scanner;

public class ServiceImplementation {

    private boolean done = false;
    Scanner scanner = new Scanner(System.in);


    public void runServiceProgram() throws InvalidPasswordException, IOException, InvalidEmailException {
        while (!done) {

            System.out.println("Enter command:\n 1 - new Service Account,\n 2 - add flight to database, \n 3 - quit.");
            int cmd = scanner.nextInt();
            processCommand(cmd);
        }
    }

    private void processCommand(int cmd) throws InvalidPasswordException, IOException, InvalidEmailException {
//        if      (cmd == 1)
//        else if (cmd == 2)
//        else if (cmd == 3)
//        else
            System.out.println("Illegal command");

    }

    private void quit() {
        done = true;
        System.out.println("Goodbye!");
    }


}
