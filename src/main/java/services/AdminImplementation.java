package services;

import models.Flight;
import services.interfaces.ProcessCommand;


import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;

public class AdminImplementation extends PasswordValidator implements ProcessCommand {
    Scanner scanner = new Scanner(System.in);
    private boolean done = false;



    static Map<String, String> serviceAccounts = new HashMap<>();


    //    @Override
//

    public void runAdmin() {
        while (!done) {

            System.out.println("Enter command (1 - Login)");

            int cmd = scanner.nextInt();
            processCommand(cmd);
        }
    }

    @Override
    public void processCommand(int cmd) {

    }

    public void newServiceAccount() throws InvalidEmailException, IOException, InvalidPasswordException {

        String email;

        System.out.println("You entry new Account for Service Customer, please entry an email: ");
        emailValidate(email = scanner.nextLine());

        if (email == null || email.isEmpty() || !emailValidate(email)) {
            throw new InvalidEmailException("Invalid email");

        }
        System.out.println("Entry password for Customer Service account: ");
        System.out.println("Your password schould have min. 8 chars, one digit, one lower alpha char and one upper alpha char, \n one char within a set of special chars (@#%$^ etc.),Does not contain space, tab, etc");
        String password;

        passwordValidate(password = scanner.nextLine());

        if (!passwordValidate(password)) {
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

        List<String> lines = Files.readAllLines(Paths.get("C:\\Users\\HP\\Documents\\PierwszeKrokiZJava\\TheBestReservationProgram\\serviceAccount.output.txt"));
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










