package models;

import services.*;
import services.CustomerImplementation;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.Scanner;

public class UserApp {
    private String email;
    private String password;
    Scanner scanner = new Scanner(System.in);

    //TODO
    // Metoda uruchomieniowa ogólna public void run(){} wywołująca jedną z dwóch metod
    // rejestracja lub logowanie

    public void loginUser() throws InvalidEmailException, InvalidPasswordException, IOException {
        System.out.println("Podaj maila");
        email = scanner.nextLine();
        BufferedReader in = new BufferedReader(new FileReader("serviceAccount.output.txt"));
        List<String> lines = Files.readAllLines(Paths.get("C:\\Users\\HP\\Documents\\PierwszeKrokiZJava\\TheBestReservationProgram\\serviceAccount.output.txt"));
        for (String line : lines) {
            if (line.contains(email) /*|| line.contains("USER")*/) {
                                runAdminProgram();
            } else if (line.contains(email) /*|| line.contains("ADMIN")*/) {
                runCustomerProgram();
            } else if (line.contains(email) || line.contains("SERVICE")) {
                runServiceProgram();
            }

        }
    }

    private void runServiceProgram() throws InvalidPasswordException, IOException, InvalidEmailException {
        AssistantImplementation assistantImplementation = new AssistantImplementation();
        assistantImplementation.runAssistantProgram();
    }

    private void runAdminProgram() throws InvalidPasswordException, IOException, InvalidEmailException {
        AdminImplementation adminImplementation = new AdminImplementation();
        adminImplementation.runAdminProgram();
    }

    private void runCustomerProgram() {
        CustomerImplementation customerImplementation = new CustomerImplementation();
        customerImplementation.runCustomerProgram();
    }
}




