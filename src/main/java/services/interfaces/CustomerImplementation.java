package services.interfaces;

import models.Flight;
import services.InvalidEmailException;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;



public class CustomerImplementation {
    Scanner scanner = new Scanner(System.in);
    static Map<String, String> customerAccounts = new HashMap<>();

    public void newCustomerAccount() throws InvalidEmailException, IOException {
        System.out.println("You are Registering to The Best Reservation Program, please entry an email: ");
        String email = scanner.nextLine();
        if (email == null || email.isEmpty()) {
            throw new InvalidEmailException("Invalid email");
        }
        System.out.println("Entry password for Customer Service account: ");
        String password = scanner.nextLine();
        if (customerAccounts.containsKey(email)) {
            throw new RuntimeException("Service account exist!");
        } else {
            customerAccounts.put(email, password);
            writeToFile();
        }
        System.out.println(customerAccounts.entrySet());
    }
    public static void writeToFile() throws IOException {

        BufferedReader in = new BufferedReader(new FileReader("customerAccounts.output.txt"));

        List<String> lines = Files.readAllLines(Paths.get("C:\\Users\\RAJ1\\Desktop\\TheBestReservationProgram\\customerAccounts.output.txt"));



        BufferedWriter out = new BufferedWriter(new FileWriter("customerAccounts.output.txt"));


        for (String line : lines) {
            out.write(line + "\n");
        }
        for (String email : customerAccounts.keySet()) {
            String password = customerAccounts.get(email);
            out.write(email + "=" + password);
        }
        out.close();
    }

    //        @Override
    public void addFlightToDatabase(Flight flight) {

    }

    public void printDet() {

        customerAccounts.entrySet().forEach(System.out::println);
    }
}