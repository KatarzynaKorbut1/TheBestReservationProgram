package models;

public class Flight {

    public enum planeModel{
        BOEING737,
       BOEING777,
       BOEING787,
       AIRBUSA380,
        AIRBUSA320,
        AIRBUSA321;
    };
    //private String airportOfArrival;
    //private String airportOfDestination;
    private String timeOfArrival;
    private String timeOfDestination;
    private String numberOfFlight;

    public Flight(String timeOfArrival, String timeOfDestination, String numberOfFlight) {
        this.timeOfArrival = timeOfArrival;
        this.timeOfDestination = timeOfDestination;
        this.numberOfFlight = numberOfFlight;
    }

    public String getTimeOfArrival() {
        return timeOfArrival;
    }

    public void setTimeOfArrival(String timeOfArrival) {
        this.timeOfArrival = timeOfArrival;
    }

    public String getTimeOfDestination() {
        return timeOfDestination;
    }

    public void setTimeOfDestination(String timeOfDestination) {
        this.timeOfDestination = timeOfDestination;
    }

    public String getNumberOfFlight() {
        return numberOfFlight;
    }

    public void setNumberOfFlight(String numberOfFlight) {
        this.numberOfFlight = numberOfFlight;
    }
    }


