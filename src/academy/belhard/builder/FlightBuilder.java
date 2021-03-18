package academy.belhard.builder;

import academy.belhard.entity.Flight;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class FlightBuilder {

    public static Flight build(String str) {
        String[] line = str.split(CsvDelimetr.DELIMETR);

        int id = Integer.parseInt(line[0]);
        int planeId = Integer.parseInt(line[1]);
        int pilotId = Integer.parseInt(line[2]);
        String dateOfFlight = line[3];
        String timeOfFlight = line[4];
        String flightNumber = line[5];

        Flight flight = new Flight(id, planeId, pilotId, dateOfFlight, timeOfFlight, flightNumber);
        return flight;
    }
}
