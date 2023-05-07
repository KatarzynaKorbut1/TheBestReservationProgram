package org.example;

import models.Customer;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello ouer New Customer");


        Customer customer = new Customer("Kowalski", "Kowalski", 40,
                 "Jagodowa 3",
                "Polska", 486543798,
                "jankowalski@gmial.com");

        System.out.println(customer);
    }
}