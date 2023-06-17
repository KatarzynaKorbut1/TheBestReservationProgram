package models;

import services.*;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class UserApp {
    private String email;
    private String password;
    Scanner scanner = new Scanner(System.in);
    private String typeOfUsers;
    private boolean done = false;
    //public User user1;

    //TODO
    // Metoda uruchomieniowa ogólna public void run(){} wywołująca jedną z dwóch metod
    // rejestracja lub logowanie

    public void loginUser() throws InvalidEmailException, InvalidPasswordException, IOException {


        BufferedReader in = new BufferedReader(new FileReader("serviceAccount.output.txt"));
        List<User> usersList = new ArrayList<>();
        List<String> lines = Files.readAllLines(Paths.get("C:\\Users\\HP\\Documents\\PierwszeKrokiZJava\\TheBestReservationProgram\\serviceAccount.output.txt"));
        for (String line : lines) {
            User user = new User();
            String[] variables = line.split(" ");
            user.setEmail(variables[0]);
            user.setPassword(variables[1]);
            user.setTypeOfUsers(variables[2]);
            usersList.add(user);
        }
//            System.out.println(usersList);

        while (!done) {
            System.out.println("Enter email");
            email = scanner.nextLine();
            System.out.println("Enter hasło");
            password = scanner.nextLine();


            for (User user1 : usersList) {
                if (user1.getEmail().contains(email) & user1.getPassword().equals(password)) {
                    done = true;
                    if (user1.getTypeOfUsers().equals("ADMIN"))
                        runAdminProgram();
                    else if (user1.getTypeOfUsers().equals("ASSISTANT"))
                        runServiceProgram();
                    else if (user1.getTypeOfUsers().equals("CUSTOMER"))
                        runCustomerProgram();

                }

            }
            if (!done)
                System.out.println("Wrong email or password, try again!");

        }
    }


//            if (usersList.contains(email)) (
//                    usersList.
//                            line.contains(email) || line.contains("ADMIN")) {
//                runAdminProgram();
//            } else if (line.contains(email) || line.contains("CUSTOMER")) {
//                runCustomerProgram();
//            } else if (line.contains(email) || line.contains("ASSISTANT")) {
//                runServiceProgram();
//            }

//            public List<Book> findByAuthor(Author author) {
//                List<Book> result = new ArrayList<>();
//                for (Book book : books) {
//                    if (book.getAuthors().contains(author)) {
//                        result.add(book);
//                    }


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





