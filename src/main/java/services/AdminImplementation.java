package services;

import models.Assistant;
import models.Flight;
import models.TypeOfUsers;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;

public class AdminImplementation {
    Scanner scanner = new Scanner(System.in);
    private boolean done = false;


    MailValidator mailValidator = new MailValidator();
    PasswordValidator passwordValidator = new PasswordValidator();



    static Map<String, Assistant> serviceAccounts = new HashMap<>();
    static List<Flight> flights = new ArrayList<>();




    public void runAdminProgram() throws InvalidPasswordException, IOException, InvalidEmailException {
        while (!done) {

            System.out.println("Enter command:\n 1 - new Service Account,\n 2 - add flight to database, \n 3 - quit.");
            int cmd = scanner.nextInt();
            processCommand(cmd);
        }
    }

    private void processCommand(int cmd) throws InvalidPasswordException, IOException, InvalidEmailException {
        if      (cmd == 1) newAsystentAccount();
        else if (cmd == 2) addFlightToDatabase();
        else if (cmd == 3) quit();
        else
            System.out.println("Illegal command");
    }

    private void quit() {
        done = true;
        System.out.println("Goodbye!");
    }

    public void newAsystentAccount() throws InvalidEmailException, IOException, InvalidPasswordException {

        Scanner scanner = new Scanner(System.in);
        String email;

        System.out.println("You entry new Account for Asystent, please entry an email: ");

        email = scanner.nextLine();

        if (email == null || email.isEmpty() || !mailValidator.emailValidate(email)) {
            throw new InvalidEmailException("Invalid email");
        }

        System.out.println("Entry password for Asystent account: ");
        System.out.println("Your password schould have min. 8 chars, one digit, one lower alpha char and one upper alpha char, \n one char within a set of special chars (@#%$^ etc.),Does not contain space, tab, etc");
        String password;

        password = scanner.nextLine();

        if (!passwordValidator.passwordValidate(password)) {
            throw new InvalidPasswordException("Invalid password");
        }
        if (serviceAccounts.containsKey(email)) {
            throw new RuntimeException("Service account exist!");
        } else {

            serviceAccounts.put(email, new Assistant(password, TypeOfUsers.ASSISTANT));
            writeToFile();
        }
        System.out.println(serviceAccounts.keySet());

    }

    private static void writeToFile() throws IOException {

        //BufferedReader in = new BufferedReader(new FileReader("serviceAccount.output.txt"));

        List<String> lines = Files.readAllLines(Paths.get("C:\\Users\\HP\\Documents\\PierwszeKrokiZJava\\TheBestReservationProgram\\serviceAccount.output.txt"));
//

        BufferedWriter out = new BufferedWriter(new FileWriter("serviceAccount.output.txt"));


        for (String line : lines) {
            out.write(line + "\n");
        }
        for (String email : serviceAccounts.keySet()) {
            Assistant assistant = new Assistant();


            //assistant.getPassword();
            //assistant.getTypeOfUsers();


            //String password = serviceAccounts.get(email);
            out.write(serviceAccounts.keySet() + " " + serviceAccounts.values() + " " + assistant.getTypeOfUsers());
        }

        out.close();
    }

    //        @Override
    public void addFlightToDatabase() throws IOException {
        System.out.println("Enter airport of arrival");
        String airportOfArrival = scanner.nextLine();
        System.out.println("Enter airport of departure");
        String airportOfDeparture = scanner.nextLine();
        System.out.println("Enter time of arrival");
        String timeOfArrival = scanner.nextLine();
        System.out.println("Enter time of departure ");
        String timeOfDeparture = scanner.nextLine();
        System.out.println("Enter number of flight");
        String numberOfFlight = scanner.nextLine();



        flights.add(new Flight(airportOfArrival,airportOfDeparture, timeOfArrival, timeOfDeparture , numberOfFlight));
        writeFlightsToFile();
        System.out.println(flights);
    }
        private static void writeFlightsToFile() throws IOException {

            List<String> lines = Files.readAllLines(Paths.get("C:\\Users\\HP\\Documents\\PierwszeKrokiZJava\\TheBestReservationProgram\\flights.txt"));
//

            BufferedWriter out = new BufferedWriter(new FileWriter("flights.txt"));


            for (String line : lines) {
                out.write(line + "\n");
            }
            for (Flight flight : flights){
                out.write(flight.getAirportOfArrival() + ' ' + flight.getAirportOfDeparture() + " "  + flight.getTimeOfArrival() + " " + flight.getTimeOfDeparture() + " " + flight.getNumberOfFlight() + " " + '\n');

            }

            out.close();
        }


        //List<Flight> flights.txt = Data.getFlights();
//       exportFlightListToJsonWithGson(flights.txt, "C:\\Users\\HP\\Documents\\PierwszeKrokiZJava\\TheBestReservationProgram\\src\\main\\resources\\flights.txt.json");

        //"C:\Users\HP\Documents\PierwszeKrokiZJava\TheBestReservationProgram\src\main\resources\flights.txt.json";
        //String path = "C:\\Users\\HP\\Documents\\PierwszeKrokiZJava\\TheBestReservationProgram\\src\\main\\resources\\flights.txt.json";

//        public static List<Flight> importFlightListFromJsonWithGson(String path) {
//            Type listType = new TypeToken<List<Flight>>() {}.getType();
//            Gson gson = new GsonBuilder().create();
//            Reader reader = new FileReader("flights.txt.json");
//            List<Shape> result = gson.fromJson(reader, listType);
//            return result;
        }

//        public static void exportFlightListToJsonWithGson(List<Flight> listType, String path) throws IOException {
//            Writer writer = new FileWriter(path);
//            Gson gson = new GsonBuilder().create();
//            gson.toJson(listType, writer);
//            writer.close();
//        }
//    Gson gsonB = new GsonBuilder().create();
//    List<Flight> flights.txt = Data.getFlights();
//    //Gson gson = new Gson();
//    //String json = new Gson().toJson(flights.txt);
//    Writer writer = Files.newBufferedWriter(Paths.get("flight.json"));



    // create a writer


    // convert books object to JSON file


    // close writer
//    writer.close();
//
//
//
//} catch (Exception ex) {
//        ex.printStackTrace();
//        }

















