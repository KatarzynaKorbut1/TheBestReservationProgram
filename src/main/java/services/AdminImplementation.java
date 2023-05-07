package services;

import models.Flight;
import services.interfaces.AdminInterface;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;

public class AdminImplementation  {
    Scanner scanner = new Scanner(System.in);

    static Map<String, String> serviceAccounts = new HashMap<>();


//    @Override
//
    public void newServiceAccount() throws InvalidEmailException, IOException {
        System.out.println("You entry new Account for Service Customer, please entry an email: ");
        String email = scanner.nextLine();
        if (email == null || email.isEmpty()) {
            throw new InvalidEmailException("Invalid email");


        }
        System.out.println("Entry password for Customer Service account: ");
        String password = scanner.nextLine();

        if (serviceAccounts.containsKey(email)) {
            throw new RuntimeException("Service account exist!");
        }else {
            serviceAccounts.put(email, password);
           writeToFile();
        }
            System.out.println(serviceAccounts.entrySet());


        }
private static void writeToFile() throws IOException {

    BufferedReader in = new BufferedReader(new FileReader("serviceAccount.output.txt"));

    List<String> file = Files.readAllLines(Paths.get("C:\\Users\\HP\\Documents\\PierwszeKrokiZJava\\TheBestReservationProgram\\serviceAccount.output.txt"));
//

    BufferedWriter out = new BufferedWriter(new FileWriter("serviceAccount.output.txt"));


    Set<Map.Entry<String, String>> serviceAccounsDatas = serviceAccounts.entrySet();


        out.write(file.toString() + "\n");
        out.write(serviceAccounsDatas + "\n");

        out.close();
    }



//        @Override
    public void addFlightToDatabase(Flight flight) {

    }

    public void printDet() {

        serviceAccounts.entrySet().forEach(System.out::println);
    }
}










