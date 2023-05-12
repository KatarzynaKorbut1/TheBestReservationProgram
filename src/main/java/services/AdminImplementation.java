package services;

import models.Flight;
import services.interfaces.ProcessCommand;


import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;

public class AdminImplementation {
    Scanner scanner = new Scanner(System.in);
    private boolean done = false;
    Flight flight;

    MailValidator mailValidator = new MailValidator();
    PasswordValidator passwordValidator = new PasswordValidator();


    static Map<String, String> serviceAccounts = new HashMap<>();


    //    @Override
//


    public void runAdminProgram() throws InvalidPasswordException, IOException, InvalidEmailException {
        while (!done) {

            System.out.println("Enter command:\n 1 - new Service Account,\n 2 - add flight to database, \n 3 - quit.");
            int cmd = scanner.nextInt();
            processCommand(cmd);
        }
    }

    private void processCommand(int cmd) throws InvalidPasswordException, IOException, InvalidEmailException {
        if      (cmd == 1) newServiceAccount();
        else if (cmd == 2) addFlightToDatabase(flight);
        else if (cmd == 3) quit();
        else
            System.out.println("Illegal command");

    }

    private void quit() {
        done = true;
        System.out.println("Goodbye!");
    }

    public void newServiceAccount() throws InvalidEmailException, IOException, InvalidPasswordException {
        Scanner scanner = new Scanner(System.in);
        String email;

        System.out.println("You entry new Account for Service Customer, please entry an email: ");

        email = scanner.nextLine();


        if (email == null || email.isEmpty() || !mailValidator.emailValidate(email)) {
            throw new InvalidEmailException("Invalid email");
        }



        System.out.println("Entry password for Customer Service account: ");
        System.out.println("Your password schould have min. 8 chars, one digit, one lower alpha char and one upper alpha char, \n one char within a set of special chars (@#%$^ etc.),Does not contain space, tab, etc");
        String password;

        password = scanner.nextLine();


        if (!passwordValidator.passwordValidate(password)) {
            throw new InvalidPasswordException("Invalid password");
        }
        if (serviceAccounts.containsKey(email)) {
            throw new RuntimeException("Service account exist!");
        } else {
            serviceAccounts.put(email, password);
            writeToFile();
        }
        System.out.println(serviceAccounts.entrySet());

    }

    private static void writeToFile() throws IOException {

        BufferedReader in = new BufferedReader(new FileReader("serviceAccount.output.txt"));

        List<String> lines = Files.readAllLines(Paths.get("C:\\Users\\Michał\\IdeaProjects\\TheBestReservationProgram\\src\\main\\java\\serviceAccount.output.txt"));
//

        BufferedWriter out = new BufferedWriter(new FileWriter("serviceAccount.output.txt"));


        for (String line : lines) {
            out.write(line + "\n");
        }
        for (String email : serviceAccounts.keySet()) {
            String password = serviceAccounts.get(email);
            out.write(email + "=" + password);
        }

        out.close();
    }

    //        @Override
    public void addFlightToDatabase(Flight flight) {

    }

    public void printDet() {

        serviceAccounts.entrySet().forEach(System.out::println);
    }


}










