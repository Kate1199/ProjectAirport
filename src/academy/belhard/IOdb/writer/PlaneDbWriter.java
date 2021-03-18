package academy.belhard.IOdb.writer;

import academy.belhard.Connector;
import academy.belhard.entity.Flight;
import academy.belhard.entity.Pilot;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

public class PilotDbWriter {

    public static final String INSERT = "INSERT INTO pilots (id, first_name, last_name, rang, pilot_kod) " +
            "VALUES(?, ?, ?, ?, ?)";

    public static void insert(List<Pilot> pilots) {

        Connection connection = Connector.getConnection();
        for(Pilot pilot : pilots) {
            try(PreparedStatement statement = connection.prepareStatement(INSERT)) {
                statement.setInt(1, pilot.getId());
                statement.setString(2, pilot.getFirstName());
                statement.setString(3, pilot.getLastName());
                statement.setString(4, pilot.getRang());
                statement.setString(5, pilot.getPilotKod());

                statement.executeUpdate();
            }
            catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
