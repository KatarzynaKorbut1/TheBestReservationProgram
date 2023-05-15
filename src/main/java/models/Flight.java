package models;

public class Flight {

    public enum planeModel {
        BOEING737,
        BOEING777,
        BOEING787,
        AIRBUSA380,
        AIRBUSA320,
        AIRBUSA321;
    }

    ;

    private String airportOfDeparture;
    private String airportOfArrival;
    private String timeOfArrival;
    private String timeOfDeparture;
    private String numberOfFlight;

    public Flight() {
    }

    public Flight(String airportOfDeparture, String airportOfArraival, String timeOfArrival, String timeOfDeparture, String numberOfFlight) {
        this.airportOfDeparture = airportOfDeparture;
        this.airportOfArrival = airportOfArraival;
        this.timeOfArrival = timeOfArrival;
        this.timeOfDeparture = timeOfDeparture;
        this.numberOfFlight = numberOfFlight;
    }


    public String getAirportOfDeparture() {
        return airportOfDeparture;
    }

    public String getAirportOfArrival() {
        return airportOfArrival;
    }

    public String getTimeOfArrival() {
        return timeOfArrival;
    }

    public String getTimeOfDeparture() {
        return timeOfDeparture;
    }

    public String getNumberOfFlight() {
        return numberOfFlight;
    }

    public void setAirportOfDeparture(String airportOfDeparture) {
        this.airportOfDeparture = airportOfDeparture;
    }

    public void setAirportOfArrival(String airportOfArrival) {
        this.airportOfArrival = airportOfArrival;
    }

    public void setTimeOfArrival(String timeOfArrival) {
        this.timeOfArrival = timeOfArrival;
    }

    public void setTimeOfDeparture(String timeOfDeparture) {
        this.timeOfDeparture = timeOfDeparture;
    }

    public void setNumberOfFlight(String numberOfFlight) {
        this.numberOfFlight = numberOfFlight;
    }

    @Override
    public String toString() {
        return "Flight{" +
                "airportOfArrival='" + airportOfDeparture + '\'' +
                ", airportOfDestination='" + airportOfArrival + '\'' +
                ", timeOfArrival='" + timeOfArrival + '\'' +
                ", timeOfDestination='" + timeOfDeparture + '\'' +
                ", numberOfFlight='" + numberOfFlight + '\'' +
                '}';
    }
}


