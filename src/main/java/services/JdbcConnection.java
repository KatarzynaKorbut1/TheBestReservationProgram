package services;

import com.mysql.cj.jdbc.result.ResultSetImpl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;


public class JdbcConnection {

        public static void main(String... args) throws Exception {
            Connection con = null;
            while (con == null) {
                try {
                    Class.forName("com.mysql.cj.jdbc.Driver");
                    con = DriverManager.getConnection(
                            "jdbc:mysql://localhost:3306/reservationapp", "root", "mysql");
                } catch (Exception e) {
                    System.out.println("Connection refused. Retrying in 5 seconds ...");
                    Thread.sleep(5000);
                }
            }
            // con != null, do something

            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM flights");



            while (rs.next()) {
                System.out.println("airportOfArrival: " + rs.getString(1) + " " + "airportOfDeparture: " + rs.getString(2));
            }
            con.close();
        }
    }

