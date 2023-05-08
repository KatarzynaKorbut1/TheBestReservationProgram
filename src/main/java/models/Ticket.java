package models;

import services.interfaces.TicketService;

import java.util.Scanner;

public class Ticket implements TicketService {
    private String ticket;
    private String ticketNumber;
    private String passengerName;
    private String passengerSurname;
    private String passportNumber;
    private int priceOfTicket;
    private String flightNumber;
    private String seatNumber;
    private boolean premiumSeat;
    private boolean priorityCheckIn;
        enum luggageSize{
        LACK(0,0,0),
        SMALL(10, 60, 40),
        LARGE(20, 150, 50);
        private int weight;
        private int length;
        private int width;

        luggageSize(int weight, int length, int width) {
            this.weight = weight;
            this.length = length;
            this.width = width;
        }
    }

    public Ticket(String ticket, String ticketNumber, String passengerName, String passengerSurname, String passportNumber,
                  int priceOfTicket, String flightNumber, String seatNumber, boolean premiumSeat,
                  boolean priorityCheckIn)
    {
        this.ticket = ticket;
        this.ticketNumber = ticketNumber;
        this.passengerName = passengerName;
        this.passengerSurname = passengerSurname;
        this.passportNumber = passportNumber;
        this.priceOfTicket = priceOfTicket;
        this.flightNumber = flightNumber;
        this.seatNumber = seatNumber;
        this.premiumSeat = premiumSeat;
        this.priorityCheckIn = priorityCheckIn;
    }

    public String getTicket() {
        return ticket;
    }

    public void setTicket(String ticket) {
        this.ticket = ticket;
    }
    public String getTicketNumber() {
        return ticketNumber;
    }

    public void setTicketNumber(String ticketNumber) {
        this.ticketNumber = ticketNumber;
    }

    public String getPassengerName() {
        return passengerName;
    }

    public void setPassengerName(String passengerName) {
        this.passengerName = passengerName;
    }

    public String getPassengerSurname() {
        return passengerSurname;
    }

    public void setPassengerSurname(String passengerSurname) {
        this.passengerSurname = passengerSurname;
    }

    public String getPassportNumber() {
        return passportNumber;
    }

    public void setPassportNumber(String passportNumber) {
        this.passportNumber = passportNumber;
    }

    public int getPriceOfTicket() {
        return priceOfTicket;
    }

    public void setPriceOfTicket(int priceOfTicket) {
        this.priceOfTicket = priceOfTicket;
    }

    public String getFlightNumber() {
        return flightNumber;
    }

    public void setFlightNumber(String flightNumber) {
        this.flightNumber = flightNumber;
    }

    public String getSeatNumber() {
        return seatNumber;
    }

    public void setSeatNumber(String seatNumber) {
        this.seatNumber = seatNumber;
    }

    public boolean isPremiumSeat() {
        return premiumSeat;
    }

    public void setPremiumSeat(boolean premiumSeat) {
        this.premiumSeat = premiumSeat;
    }

    public void setPriorityCheckIn(boolean priorityCheckIn) {
        this.priorityCheckIn = priorityCheckIn;
    }
    public boolean isPriorityCheckIn() {
        return priorityCheckIn;
    }
   @Override
   public void adLuggageToTicket() {
        }
    @Override
    public boolean getPremiumSeat() {
        return premiumSeat;
    }
    @Override
    public boolean getPriorityCheckIn() {
        return priorityCheckIn;
    }
}
