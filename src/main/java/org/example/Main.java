package org.example;

import models.Customer;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello ouer New Customer");


        Customer customer = new Customer("Jan", "Kowlski",
                "jakkowalski@gmail.com", "+486543798");

        System.out.println(customer);
    }
}