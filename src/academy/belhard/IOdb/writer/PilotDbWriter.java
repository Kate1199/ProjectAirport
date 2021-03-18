package academy.belhard.IOdb.writer;

import academy.belhard.Connector;
import academy.belhard.entity.Flight;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

public class FlightDbWriter {

    public static final String INSERT = "INSERT INTO flights (id, plane_id, pilot_id, date_of_flight, time_of_flight, flight_number) " +
            "VALUES(?, ?, ?, ?, ?, ?)";

    public static void insert(List<Flight> flights) {

        Connection connection = Connector.getConnection();
        for(Flight flight : flights) {
            try(PreparedStatement statement = connection.prepareStatement(INSERT)) {
                statement.setInt(1, flight.getId());
                statement.setInt(2, flight.getPlaneId());
                statement.setInt(3, flight.getPilotId());
                statement.setString(4, flight.getDateOfFlight());
                statement.setString(5, flight.getTimeOfFlight());
                statement.setString(6, flight.getFlightNumber());

                statement.executeUpdate();
            }
            catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
