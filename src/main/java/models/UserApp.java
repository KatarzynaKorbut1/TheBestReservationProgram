package models;

import services.*;
import services.interfaces.CustomerImplementation;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.Scanner;

public class UserApp extends PasswordValidator {
    private String email;
    private String password;
    private boolean done = false;
    FileWriter fileWriter = null;
    Scanner scanner = new Scanner(System.in);

    //TODO
    // Metoda uruchomieniowa ogólna public void run(){} wywołująca jedną z dwóch metod
    // rejestracja lub logowanie
    public void runUserProgram() throws InvalidPasswordException, IOException, InvalidEmailException{
        while (!done){
            System.out.println("Enter commmand:\n 1  log in, \n 2 register ");
            int choice = scanner.nextInt();
choiceCommand(choice);
                    }
    }
    private void choiceCommand(int choice) throws InvalidPasswordException, IOException, InvalidEmailException{
        if (choice == 1) loginUser();
       else if (choice == 2) registerUser();
        else System.out.println("Illegal command");
    }
    public void registerUser() throws InvalidEmailException, IOException, InvalidPasswordException {
        System.out.println("You are Registering to The Best Reservation Program, please entry an email: ");
        String email = scanner.nextLine();
        if (!emailValidate(email)) {
            throw new InvalidEmailException("Invalid email");
        } else try {
            fileWriter.write(email);
        } finally {
            if (fileWriter !=null){
                fileWriter.close();
            }
        }
        System.out.println("You are Registering to The Best Reservation Program, please entry an password: ");
        System.out.println("Your password should have min. 8 chars, one digit, one lower alpha char and one upper alpha char," +
                " \n one char within a set of special chars (@#%$^ etc.),Does not contain space, tab, etc");
        String password = scanner.nextLine();
        if (!passwordValidate(password)) {
            throw new InvalidPasswordException("Invalid password");
                    } else {
            fileWriter.write(password);
        }
    }

    public void loginUser() throws InvalidEmailException, InvalidPasswordException, IOException {
       System.out.println("Podaj maila");
        email = scanner.nextLine();
        BufferedReader in = new BufferedReader(new FileReader("C:\\Users\\Michał\\IdeaProjects\\TheBestReservationProgram\\src\\main\\java\\serviceAccount.output.txt"));
        List<String> lines = Files.readAllLines(Paths.get("C:\\Users\\Michał\\IdeaProjects\\TheBestReservationProgram\\src\\main\\java\\serviceAccount.output.txt"));
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
        ServiceImplementation serviceImplementation = new ServiceImplementation();
        serviceImplementation.runServiceProgram();
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




