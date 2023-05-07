package services;

import models.Flight;
import services.interfaces.AdminInterface;
import services.interfaces.MailValidator;


import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AdminImplementation extends MailValidator {
    Scanner scanner = new Scanner(System.in);

    static Map<String, String> serviceAccounts = new HashMap<>();



    //    @Override
//
    public void newServiceAccount() throws InvalidEmailException, IOException {
        String email;
        System.out.println("You entry new Account for Service Customer, please entry an email: ");
        validate(email = scanner.nextLine());

//        if(!validate(email)){
//            throw new InvalidEmailException("Invalid regex");
//        }

        if (email == null || email.isEmpty() || !validate(email)) {
            throw new InvalidEmailException("Invalid email");


        }
        System.out.println("Entry password for Customer Service account: ");
        String password = scanner.nextLine();

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










