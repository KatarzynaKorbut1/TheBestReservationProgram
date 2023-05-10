package models;

import services.InvalidEmailException;
import services.InvalidPasswordException;
import services.MailValidator;

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

    public void loginUser(String email, String password) throws InvalidEmailException, InvalidPasswordException, IOException {
        System.out.println("Podaj maila");
        email = scanner.nextLine();
        BufferedReader in = new BufferedReader(new FileReader("serviceAccount.output.txt"));
        List<String> lines = Files.readAllLines(Paths.get("C:\\Users\\HP\\Documents\\PierwszeKrokiZJava\\TheBestReservationProgram\\serviceAccount.output.txt"));
        for (String line : lines) {
            if (line.contains(email) || line.contains("USER")) {
                runUserProgram();
            } else if (line.contains(email) || line.contains("ADMIN")) {
                runAdminProgram();
            } else if (line.contains(email) || line.contains("SERVICE")) {
                runServiceProgram();
            }
            // if (email == null || email.isEmpty() || this.email != email) {
            //    throw new InvalidEmailException("Invalid email");
//        } else {
//            System.out.println("Podaj hasło");
//            password = scanner.nextLine();
//            if (password == null || password.isEmpty() || this.password != password) {
//                throw new InvalidPasswordException("Invalid password");
//            } else {


        }
    }

    private void runServiceProgram() {
    }

    private void runAdminProgram() {
    }

    private void runUserProgram() {
    }
}




