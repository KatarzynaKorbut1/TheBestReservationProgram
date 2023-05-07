package services;

import models.Flight;
import models.Service;
import services.interfaces.AdminInterface;

import java.io.*;
import java.nio.file.*;
import java.util.*;

public class AdminImplementation  {
    Scanner scanner = new Scanner(System.in);

    Map<String, String> serviceAccounts = new HashMap<>();


//    @Override
//
    public void newServiceAccount() throws InvalidEmailException {
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
        }
            System.out.println(serviceAccounts.entrySet());


        }
public void writeToFile () throws IOException {



    BufferedReader input = new BufferedReader(new FileReader("cars.txt"));
    BufferedWriter output = new BufferedWriter(new FileWriter("cars_output.txt"));

    String line;
    while ((line = input.readLine()) != null){
        output.write(line);
        System.out.println(line);
        System.out.println(line.hashCode());
    }
    input.close();
    output.close();
}




//    try {
//
//
//        FileOutputStream fos = new FileOutputStream("serviceAccount.output.txt");
//        ObjectOutputStream oos = new ObjectOutputStream(fos);
//        oos.writeObject(serviceAccounts);
//        fos.close();
//        oos.close();
//
//
//    } catch (FileNotFoundException e) {
//        throw new RuntimeException(e);
//    } catch (IOException e) {
//        throw new RuntimeException(e);
//    }



//        @Override
    public void addFlightToDatabase(Flight flight) {

    }

    public void printDet() {

        serviceAccounts.entrySet().forEach(System.out::println);
    }
}










