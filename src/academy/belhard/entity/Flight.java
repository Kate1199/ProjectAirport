package academy.belhard.entity;

import java.util.Calendar;

public class Flight {

    private int id;
    private int planeId;
    private int pilotId;
    private String dateOfFlight;
    private String timeOfFlight;
    private String flightNumber;

    public Flight(int id, int planeId, int pilotId, String dateOfFlight, String timeOfFlight, String flightNumber) {
        this.id = id;
        this.planeId = planeId;
        this.pilotId = pilotId;
        this.dateOfFlight = dateOfFlight;
        this.timeOfFlight = timeOfFlight;
        this.flightNumber = flightNumber;
    }

    public int getId() {
        return id;
    }

    public int getPlaneId() {
        return planeId;
    }

    public int getPilotId() {
        return pilotId;
    }

    public String getDateOfFlight() {
        return dateOfFlight;
    }

    public String getTimeOfFlight() {
        return timeOfFlight;
    }

    public String getFlightNumber() {
        return flightNumber;
    }
}
