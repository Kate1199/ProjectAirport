package academy.belhard.IOdb.reader;

import academy.belhard.Connector;
import academy.belhard.entity.Result;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ResultDbReader {

    private static final String MARK_AND_MODEL = "(SELECT CONCAT(pl.mark, ' ', pl.model))";
    private static final String FULL_NAME = "(SELECT CONCAT(p.last_name, ' ', LEFT(p.first_name, 1), '.'))";
    private static final String KOD_AND_RANG = "(SELECT CONCAT(p.pilot_kod, ' (', p.rang, ')'))";

    private static final String JOIN = "SELECT f.flight_number," +
            " f.date_of_flight," +
            " f.time_of_flight," +
            " pl.tail_number," +
              MARK_AND_MODEL +
            ", pl.passengers," +
              FULL_NAME + ", " +
              KOD_AND_RANG +
            " FROM flights AS f" +
            " JOIN planes AS pl ON pl.id = f.plane_id" +
            " JOIN pilots AS P ON p.id = f.pilot_id";

    public static List<Result> read() {

        List<Result> results= new ArrayList<>();
        Connection connection = Connector.getConnection();
        try(PreparedStatement statement = connection.prepareStatement(JOIN)) {

            ResultSet resultSet = statement.executeQuery();

            while (resultSet.next()) {
                String flightNumber = resultSet.getString("flight_number");
                String date = resultSet.getString("date_of_flight");
                String time = resultSet.getString("time_of_flight");
                String tailNumber = resultSet.getString("tail_number");
                String markAndModel = resultSet.getString(MARK_AND_MODEL);
                int passengers = resultSet.getInt("passengers");
                String fullName = resultSet.getString(FULL_NAME);
                String kodAndRang = resultSet.getString(KOD_AND_RANG);

                Result result = new Result(flightNumber, date, time, tailNumber, markAndModel, passengers, fullName, kodAndRang);
                System.out.println(result);
                results.add(result);
            }
        }
        catch (SQLException e) {
            e.printStackTrace();
        }
        return results;
    }
}
